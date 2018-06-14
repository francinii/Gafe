package gafe.modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.DOMBuilder;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author HP_810G2
 */
public class LectorFacturasXML {

    public LectorFacturasXML() {

    }

    //String ruta es la ruta del xml
    //private Document crearArbolFactura(String ruta){}
    //public 
    // Creacion de facturas cargando un objeto factura 
    //crearFactura(String ruta){
    //retorna la factura 
    //}
    //Metodo que crear un archivo de tipo Document desde el xml
    private Document crearArbolFactura(String ruta) {
        Document document = null;
        try {
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File(ruta);
            document = (Document) builder.build(xmlFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        } catch (JDOMException ex) {
            System.out.println("Problemas al leer archivo");
        } catch (IOException ex) {
            System.out.println("Error");
        }
        return document;
    }

    public Factura crearFactura(String ruta) {
         //public Factura crearFactura(String ruta) {
         
        Document doc = crearArbolFactura(ruta);
        //Obtener la raiz
        Element nodoPadre = doc.getRootElement();
        String namespace = nodoPadre.getNamespace().getURI();
        String clave = crearElemento("Clave", nodoPadre, namespace);
        String numeroConsecutivo = crearElemento("NumeroConsecutivo", nodoPadre, namespace);
        String fechaEmision = crearElemento("FechaEmision", nodoPadre, namespace);
        String condicionVenta = crearElemento("CondicionVenta", nodoPadre, namespace);
        String plazoCredito = crearElemento("PlazoCredito", nodoPadre, namespace);
        String medioPago = crearElemento("MedioPago", nodoPadre, namespace);
        Emisor emisorObjeto = null;
        Receptor receptorObjeto = null;
        DetalleServicio detalleServicio = null;
        ResumenFactura resumenFactura = null;
        InformacionReferencia informacionReferencia = null;
        Normativa normativa = null;
        //Obtener Nodo de Emisor    
        emisorObjeto = crearEmisor(nodoPadre, namespace); //Emisor corresponde al nodo padre         
        //Obtener nodo de Receptor
        receptorObjeto = crearReceptor(nodoPadre, namespace); //Emisor corresponde al nodo padre 
        //Obtener nodo detalle del servicio
        detalleServicio = crearDetalleServicio(nodoPadre, namespace);
        //Obtener ResumenFactura
        resumenFactura = crearResumenFactura(nodoPadre, namespace);
        //Obtener informacionReferencia
        informacionReferencia = crearInformacionReferencia(nodoPadre, namespace);
        //Obtener normativa
        normativa = crearNormativa(nodoPadre, namespace);

        return new Factura(clave, numeroConsecutivo, fechaEmision, emisorObjeto, receptorObjeto, condicionVenta, plazoCredito, medioPago, detalleServicio, resumenFactura, informacionReferencia, normativa);

    }

    public List<Factura> listarFacturas(File[] rutas) {
        List<Factura> listadoFacturas = new ArrayList<>();
        for (File ruta : rutas) {            
            listadoFacturas.add(crearFactura(ruta.toString()));
        }
        return listadoFacturas;
    }
// <editor-fold defaultstate="collapsed" desc="CREAR OBJETOS DE LA FACTURA">

    private Emisor crearEmisor(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace)) != null) {
            Element nodoEmisor = nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace));
            String nombreEmisor = crearElemento("Nombre", nodoEmisor, namespace);
            String correoElectronico = crearElemento("CorreoElectronico", nodoEmisor, namespace);
            String nombreComercial = crearElemento("NombreComercial", nodoEmisor, namespace);
            Identificacion identificacion = null;
            Telefono telefono = null;
            Ubicacion ubicacion = null;
            identificacion = crearIdentifacion(nodoEmisor, namespace);
            telefono = crearTelefono(nodoEmisor, namespace);
            ubicacion = crearUbicacion(nodoEmisor, namespace);
            //hacer para fax     
            Emisor emisor = new Emisor(nombreEmisor, identificacion, nombreComercial, ubicacion, correoElectronico);
            emisor.agregarTelefono(telefono);
            return emisor;
        }
        return null;
    }

    private Receptor crearReceptor(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Receptor", Namespace.getNamespace(namespace)) != null) {
            Element nodoReceptor = nodoPadre.getChild("Receptor", Namespace.getNamespace(namespace));
            String nombreReceptor = crearElemento("Nombre", nodoReceptor, namespace); //no recuerdo como se llamaba este
            String nombreComercial = crearElemento("NombreComercial", nodoReceptor, namespace);
            String identificacionExtranjero = crearElemento("IdentificacionExtranjero", nodoReceptor, namespace);
            String correoElectronico = crearElemento("CorreoElectronico", nodoReceptor, namespace);
            Identificacion identificacion = null;
            Telefono telefono = null;
            Ubicacion ubicacion = null;
            identificacion = crearIdentifacion(nodoReceptor, namespace);
            telefono = crearTelefono(nodoReceptor, namespace);
            ubicacion = crearUbicacion(nodoReceptor, namespace);
            //  nodosConHijosDelReceptor.add("Fax");
            Receptor receptor = new Receptor(nombreReceptor, identificacion, identificacionExtranjero, nombreComercial, ubicacion, correoElectronico);
            receptor.agregarTelefono(telefono);
            return receptor;
        }
        return null;
    }

    private Exoneracion crearExoneracion(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace)) != null) {
            Element exonera = nodoPadre.getChild("Exoneracion", Namespace.getNamespace(namespace));
            String tipoDocumento = crearElemento("TipoDocumento", exonera, namespace);
            String numeroDocumento = crearElemento("NumeroDocumento", exonera, namespace);
            String nombreInstitucion = crearElemento("NombreInstitucion", exonera, namespace);
            String fechaEmision = crearElemento("FechaEmision", exonera, namespace);
            String montoImpuesto = crearElemento("MontoImpuesto", exonera, namespace);
            String porcentajeCompra = crearElemento("PorcentajeCompra", exonera, namespace);
            return new Exoneracion(tipoDocumento, numeroDocumento, nombreInstitucion, fechaEmision, montoImpuesto, porcentajeCompra);
        }
        return null;
    }

    private Identificacion crearIdentifacion(Element nodoPadreSuperior, String namespace) {
        if (nodoPadreSuperior.getChild("Identificacion", Namespace.getNamespace(namespace)) != null) {
            Element nodoPadre = nodoPadreSuperior.getChild("Identificacion", Namespace.getNamespace(namespace));
            String idenTipo = crearElemento("Tipo", nodoPadre, namespace);
            String idenNumero = crearElemento("Numero", nodoPadre, namespace);
            return new Identificacion(idenTipo, idenNumero);
        }
        return null;
    }

    private Ubicacion crearUbicacion(Element nodoPadreSuperior, String namespace) {
        if (nodoPadreSuperior.getChild("Ubicacion", Namespace.getNamespace(namespace)) != null) {
            Element nodoPadre = nodoPadreSuperior.getChild("Ubicacion", Namespace.getNamespace(namespace));
            String provincia = crearElemento("Provincia", nodoPadre, namespace);
            String canton = crearElemento("Canton", nodoPadre, namespace);
            String distrito = crearElemento("Distrito", nodoPadre, namespace);
            String barrio = crearElemento("Barrio", nodoPadre, namespace);
            String otrasSenas = crearElemento("OtrasSenas", nodoPadre, namespace);
            return new Ubicacion(provincia, canton, distrito, barrio, otrasSenas);
        }
        return null;
    }

    private Telefono crearTelefono(Element nodoPadreSuperior, String namespace) {
        if (nodoPadreSuperior.getChild("Telefono", Namespace.getNamespace(namespace)) != null) {
            Element nodoPadre = nodoPadreSuperior.getChild("Telefono", Namespace.getNamespace(namespace));
            String codigoPais = crearElemento("CodigoPais", nodoPadre, namespace);
            String numTelefono = crearElemento("NumTelefono", nodoPadre, namespace);
            return new Telefono(codigoPais, numTelefono);
        }
        return null;
    }

    private DetalleServicio crearDetalleServicio(Element nodoPadre, String namespace) {
        DetalleServicio listarDetalleServicio = new DetalleServicio();
        if (nodoPadre.getChild("DetalleServicio", Namespace.getNamespace(namespace)) != null) {
            Element detallaServicio = nodoPadre.getChild("DetalleServicio", Namespace.getNamespace(namespace));
            List<Element> detalleServicio = detallaServicio.getChildren();
            for (Element lineaDetalle : detalleServicio) {
                String numeroLinea = crearElemento("NumeroLinea", lineaDetalle, namespace);
                String cantidad = crearElemento("Cantidad", lineaDetalle, namespace);
                String unidadMedida = crearElemento("UnidadMedida", lineaDetalle, namespace);
                String unidadMedidaComercial = crearElemento("UnidadMedidaComercial", lineaDetalle, namespace);
                String detalle = crearElemento("Detalle", lineaDetalle, namespace);
                String precioUnitario = crearElemento("PrecioUnitario", lineaDetalle, namespace);
                String montoTotal = crearElemento("MontoTotal", lineaDetalle, namespace);
                String montoDescuento = crearElemento("MontoDescuento", lineaDetalle, namespace);
                String naturalezaDescuento = crearElemento("NaturalezaDescuento", lineaDetalle, namespace);
                String subTotal = crearElemento("SubTotal", lineaDetalle, namespace);
                String montoTotalLinea = crearElemento("MontoTotalLinea", lineaDetalle, namespace);
                CodigoLineaDetalle codigo = crearCodigo(nodoPadre, namespace);
                Impuesto impuesto = crearImpuesto(nodoPadre, namespace); //POR TERMINAR
                listarDetalleServicio.agregarLinea(new LineaDetalle(numeroLinea, codigo, cantidad, unidadMedida, unidadMedidaComercial, detalle, precioUnitario, montoTotal, montoDescuento, naturalezaDescuento, subTotal, impuesto, montoTotalLinea));
            }
            return listarDetalleServicio;
        }
        return null;
    }

    private CodigoLineaDetalle crearCodigo(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("LineaDetalle", Namespace.getNamespace(namespace)) != null) {
            String tipo = crearElemento("Tipo", nodoPadre, namespace);
            String codigo = crearElemento("Codigo", nodoPadre, namespace);
            return new CodigoLineaDetalle(tipo, codigo);
        }
        return null;
    }

    private Impuesto crearImpuesto(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace)) != null) {
            Element impuesto = nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace));
            String codigo = crearElemento("Codigo", impuesto, namespace);
            String tarifa = crearElemento("Tarifa", impuesto, namespace);
            String monto = crearElemento("Monto", impuesto, namespace);

            Exoneracion exoneracion = crearExoneracion(impuesto, namespace);

            return null; ///por hacer
        }
        return null;
    }

    private String crearElemento(String nombreNodo, Element nodoPadre, String namespace) {
        if (nodoPadre.getChild(nombreNodo, Namespace.getNamespace(namespace)) != null) {
            return nodoPadre.getChildText(nombreNodo, Namespace.getNamespace(namespace));
        }
        return null;
    }

    private ResumenFactura crearResumenFactura(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("ResumenFactura", Namespace.getNamespace(namespace)) != null) {
            Element resumenFactura = nodoPadre.getChild("ResumenFactura", Namespace.getNamespace(namespace));
            String codigoMoneda = crearElemento("CodigoMoneda", resumenFactura, namespace);
            String tipoCambio = crearElemento("TipoCambio", resumenFactura, namespace);
            String totalServiciosGravados = crearElemento("TotalServGravados", resumenFactura, namespace);
            String totalServiciosExcentos = crearElemento("TotalServExentos", resumenFactura, namespace);
            String totalMercanciasGravadas = crearElemento("TotalMercanciasGravadas", resumenFactura, namespace);
            String totalMercanciasExentas = crearElemento("TotalMercanciasExentas", resumenFactura, namespace);
            String totalGravado = crearElemento("TotalGravado", resumenFactura, namespace);
            String totalExcento = crearElemento("TotalExento", resumenFactura, namespace);
            String totalVenta = crearElemento("TotalVenta", resumenFactura, namespace);
            String totalDescuento = crearElemento("TotalDescuento", resumenFactura, namespace);
            String totalVentaNeta = crearElemento("TotalVentaNeta", resumenFactura, namespace);
            String totalImpuesto = crearElemento("TotalImpuesto", resumenFactura, namespace);
            String totalComprobante = crearElemento("TotalComprobante", resumenFactura, namespace);
            return new ResumenFactura(codigoMoneda, tipoCambio, totalServiciosGravados, totalServiciosExcentos, totalMercanciasGravadas, totalMercanciasExentas, totalGravado, totalExcento, totalVenta, totalDescuento, totalVentaNeta, totalImpuesto, totalComprobante);
        }
        return null;
    }

    private InformacionReferencia crearInformacionReferencia(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("InformacionReferencia", Namespace.getNamespace(namespace)) != null) {
            Element informacionReferencia = nodoPadre.getChild("InformacionReferencia", Namespace.getNamespace(namespace));
            String tipoDoc = crearElemento("TipoDoc", informacionReferencia, namespace);
            String numeroDoc = crearElemento("Numero", informacionReferencia, namespace);
            String fechaEmision = crearElemento("FechaEmision", informacionReferencia, namespace);
            String codigo = crearElemento("Codigo", informacionReferencia, namespace);
            String razon = crearElemento("Razon", informacionReferencia, namespace);
            return new InformacionReferencia(tipoDoc, numeroDoc, fechaEmision, codigo, razon);
        }
        return null;
    }

    private Normativa crearNormativa(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Normativa", Namespace.getNamespace(namespace)) != null) {
            Element normativa = nodoPadre.getChild("Normativa", Namespace.getNamespace(namespace));
            String numResolucion = crearElemento("NumeroResolucion", normativa, namespace);
            String fechaResolucion = crearElemento("FechaResolucion", normativa, namespace);
            return new Normativa(numResolucion, fechaResolucion);
        }
        return null;
    }
// </editor-fold>

}
