package gafe.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;

import org.jdom2.input.SAXBuilder;

/**
 *
 * @author HP_810G2
 */
public class LectorFacturasXML {
    
    ArrayList<String> listadoError = new ArrayList<String>();     

    public ArrayList<String> getListadoError() {
        return listadoError;
    }

    public void vaciarListaError(){ 
        listadoError.clear();
    }  
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
        try {
            Document doc = crearArbolFactura(ruta);
            String tipoDocumento = doc.getRootElement().getName();

            if (tipoDocumento.equals("FacturaElectronica") || tipoDocumento.equals("NotaCreditoElectronica") || tipoDocumento.equals("NotaDebitoElectronica")
                    || tipoDocumento.equals("TiqueteElectronico")) {
                //Obtener la raiz
                Element nodoPadre = doc.getRootElement();
                String namespace = nodoPadre.getNamespace().getURI();
                // System.out.println(nodoPadre.getName());
                String categoria = nodoPadre.getName();
                String clave = crearElemento("Clave", nodoPadre, namespace);
                String numeroConsecutivo = crearElemento("NumeroConsecutivo", nodoPadre, namespace);
                String fechaEmision = crearElemento("FechaEmision", nodoPadre, namespace);
                String condicionVenta = crearElemento("CondicionVenta", nodoPadre, namespace);
                String plazoCredito = crearElemento("PlazoCredito", nodoPadre, namespace);
                String medioPago = crearElemento("MedioPago", nodoPadre, namespace);

                //Obtener Nodo de Emisor    
                Emisor emisorObjeto = crearEmisor(nodoPadre, namespace); //Emisor corresponde al nodo padre         
                //Obtener nodo de Receptor
                Receptor receptorObjeto = crearReceptor(nodoPadre, namespace); //Emisor corresponde al nodo padre 
                //Obtener nodo detalle del servicio
                DetalleServicio detalleServicio = crearDetalleServicio(nodoPadre, namespace);
                //Obtener ResumenFactura
                ResumenFactura resumenFactura = crearResumenFactura(nodoPadre, namespace);
                //Obtener informacionReferencia
                InformacionReferencia informacionReferencia = crearInformacionReferencia(nodoPadre, namespace);
                //Obtener normativa
                Normativa normativa = crearNormativa(nodoPadre, namespace);

                return new Factura(categoria, clave, numeroConsecutivo, fechaEmision, emisorObjeto, receptorObjeto, condicionVenta, plazoCredito, medioPago, detalleServicio, resumenFactura, informacionReferencia, normativa);
            } else {
                listadoError.add(ruta);
            }

        } catch (Exception e) {
            listadoError.add(ruta);
        }

        return null;

    }

    public List<Factura> listarFacturas(File[] rutas) {
        List<Factura> listadoFacturas = new ArrayList<>();
        for (File ruta : rutas) {

            Factura fact = crearFactura(ruta.toString());
            if (fact != null) {
                // Verificar si las facturas no corresponden a un proyecto
                String identificacionEmisor = fact.getEmisor().getIdenticacion().getNumeroIdentificacion();
                String identificacionReceptor = fact.getReceptor().getIdenticacion().getNumeroIdentificacion();
                String numFactura = fact.getClave();

                if (identificacionEmisor.equals(RecursosCompartidos.cedulaJuridicaProyecto) || identificacionReceptor.equals(RecursosCompartidos.cedulaJuridicaProyecto)) {                  
                    listadoFacturas.add(fact);
                    //JOptionPane.showMessageDialog(null, "Las facturas han sido cargadas con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    int reply = JOptionPane.showConfirmDialog(null, "La factura " + numFactura + " no coincide con la cédula jurídica del proyecto \n"+ "¿Desea incluirla?", "Advertencia", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        listadoFacturas.add(fact);
                    } else {
                        System.out.println("Factura no incluida");
                    }

                }

            }
        }
        
       //JOptionPane.showMessageDialog(null, "Las facturas han sido cargadas con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

        return listadoFacturas;
    }

    public boolean validarCedulaProyecto(File ruta, String cedula) {
        Document doc = crearArbolFactura(ruta.toString());
        //Obtener la raiz
        Element nodoPadre = doc.getRootElement();
        String namespace = nodoPadre.getNamespace().getURI();
        if (nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace)) != null) {
            Element nodoEmisor = nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace));
            Identificacion identificacion = crearIdentifacion(nodoEmisor, namespace);
            if (identificacion != null && identificacion.getNumeroIdentificacion().equals(cedula)) {
                return true;
            }
        }
        return false;
    }
// <editor-fold defaultstate="collapsed" desc="CREAR OBJETOS DE LA FACTURA">

    private Emisor crearEmisor(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace)) != null) {
            Element nodoEmisor = nodoPadre.getChild("Emisor", Namespace.getNamespace(namespace));
            String nombreEmisor = crearElemento("Nombre", nodoEmisor, namespace);
            String correoElectronico = crearElemento("CorreoElectronico", nodoEmisor, namespace);
            String nombreComercial = crearElemento("NombreComercial", nodoEmisor, namespace);

            Identificacion identificacion = crearIdentifacion(nodoEmisor, namespace);
            Telefono telefono = crearTelefono(nodoEmisor, namespace);
            Ubicacion ubicacion = crearUbicacion(nodoEmisor, namespace);
            //hacer para fax     
            Emisor emisor = new Emisor(nombreEmisor, identificacion, nombreComercial, ubicacion, correoElectronico);
            emisor.agregarTelefono(telefono);
            return emisor;
        }
        return new Emisor();
    }

    private Receptor crearReceptor(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Receptor", Namespace.getNamespace(namespace)) != null) {
            Element nodoReceptor = nodoPadre.getChild("Receptor", Namespace.getNamespace(namespace));
            String nombreReceptor = crearElemento("Nombre", nodoReceptor, namespace); //no recuerdo como se llamaba este
            String nombreComercial = crearElemento("NombreComercial", nodoReceptor, namespace);
            String identificacionExtranjero = crearElemento("IdentificacionExtranjero", nodoReceptor, namespace);
            String correoElectronico = crearElemento("CorreoElectronico", nodoReceptor, namespace);

            Identificacion identificacion = crearIdentifacion(nodoReceptor, namespace);
            Telefono telefono = crearTelefono(nodoReceptor, namespace);
            Ubicacion ubicacion = crearUbicacion(nodoReceptor, namespace);
            //  nodosConHijosDelReceptor.add("Fax");
            Receptor receptor = new Receptor(nombreReceptor, identificacion, identificacionExtranjero, nombreComercial, ubicacion, correoElectronico);
            receptor.agregarTelefono(telefono);
            return receptor;
        }
        return new Receptor();
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
        return new Exoneracion();
    }

    private Identificacion crearIdentifacion(Element nodoPadreSuperior, String namespace) {
        if (nodoPadreSuperior.getChild("Identificacion", Namespace.getNamespace(namespace)) != null) {
            Element nodoPadre = nodoPadreSuperior.getChild("Identificacion", Namespace.getNamespace(namespace));
            String idenTipo = crearElemento("Tipo", nodoPadre, namespace);
            String idenNumero = crearElemento("Numero", nodoPadre, namespace);
            return new Identificacion(idenTipo, idenNumero);
        }
        return new Identificacion();
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
        return new Ubicacion();
    }

    private Telefono crearTelefono(Element nodoPadreSuperior, String namespace) {
        if (nodoPadreSuperior.getChild("Telefono", Namespace.getNamespace(namespace)) != null) {
            Element nodoPadre = nodoPadreSuperior.getChild("Telefono", Namespace.getNamespace(namespace));
            String codigoPais = crearElemento("CodigoPais", nodoPadre, namespace);
            String numTelefono = crearElemento("NumTelefono", nodoPadre, namespace);
            return new Telefono(codigoPais, numTelefono);
        }
        return new Telefono();
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
                CodigoLineaDetalle codigo = crearCodigo(detallaServicio, namespace);
                Impuesto impuesto = crearImpuesto(lineaDetalle, namespace); //POR TERMINAR
                listarDetalleServicio.agregarLinea(new LineaDetalle(numeroLinea, codigo, cantidad, unidadMedida, unidadMedidaComercial, detalle, precioUnitario, montoTotal, montoDescuento, naturalezaDescuento, subTotal, impuesto, montoTotalLinea));
            }
            return listarDetalleServicio;
        }
        return new DetalleServicio();
    }

    private CodigoLineaDetalle crearCodigo(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("LineaDetalle", Namespace.getNamespace(namespace)) != null) {
            String tipo = crearElemento("Tipo", nodoPadre, namespace);
            String codigo = crearElemento("Codigo", nodoPadre, namespace);
            return new CodigoLineaDetalle(tipo, codigo);
        }
        return new CodigoLineaDetalle();
    }

    private Impuesto crearImpuesto(Element nodoPadre, String namespace) {

        if (nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace)) != null) {
            Element impuesto = nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace));
            String codigo = crearElemento("Codigo", impuesto, namespace);
            String tarifa = crearElemento("Tarifa", impuesto, namespace);
            String monto = crearElemento("Monto", impuesto, namespace);
            Exoneracion exoneracion = crearExoneracion(impuesto, namespace);
            return new Impuesto(codigo, tarifa, monto, exoneracion);
        }
        return new Impuesto();
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
        return new ResumenFactura();
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
        return new InformacionReferencia();
    }

    private Normativa crearNormativa(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("Normativa", Namespace.getNamespace(namespace)) != null) {
            Element normativa = nodoPadre.getChild("Normativa", Namespace.getNamespace(namespace));
            String numResolucion = crearElemento("NumeroResolucion", normativa, namespace);
            String fechaResolucion = crearElemento("FechaResolucion", normativa, namespace);
            return new Normativa(numResolucion, fechaResolucion);
        }
        return new Normativa();
    }
// </editor-fold>

}
