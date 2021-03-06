package gafe.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
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
                    || tipoDocumento.equals("TiqueteElectronico") || tipoDocumento.equals("FacturaElectronicaCompra") || tipoDocumento.equals("FacturaElectronicaExportacion") ) {
                //Obtener la raiz
                Element nodoPadre = doc.getRootElement();
                String namespace = nodoPadre.getNamespace().getURI();
                // System.out.println(nodoPadre.getName());
                String categoria = nodoPadre.getName();
                String clave = crearElemento("Clave", nodoPadre, namespace);
                String codigoActividad = crearElemento("CodigoActividad", nodoPadre,namespace);
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
                
                //obtener OtrosCargos
                OtrosCargos otrosCargos = crearOtrosCargos(nodoPadre,namespace);
                
                //Obtener ResumenFactura
                ResumenFactura resumenFactura = crearResumenFactura(nodoPadre, namespace);
                //Obtener informacionReferencia
                InformacionReferencia informacionReferencia = crearInformacionReferencia(nodoPadre, namespace);
                
                //OtrosCargos otrosCargos =    
                Otros otros = crearOtros(nodoPadre, namespace);

                return new Factura(categoria, clave,codigoActividad, numeroConsecutivo, fechaEmision, emisorObjeto, receptorObjeto, condicionVenta, plazoCredito, medioPago, detalleServicio,otrosCargos, resumenFactura, informacionReferencia, otros);
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
        String[] options = {"Si", "Si a todo", "No"}; // Opciones para mensaje 
        Icon icon = null;
        int reply = 0;
        
        
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
                   
                    if(reply != 1){ // cuando se selecciona el SI A TODO
                        reply = JOptionPane.showOptionDialog(null, "La factura " + numFactura + " no coincide con la cédula jurídica del proyecto \n"+ "¿Desea incluirla?", "Advertencia", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
                    }
                                       
                    System.out.println("res"+reply);
                   
                   if (reply == 0) {
                       //si
                        listadoFacturas.add(fact);
                    }else if(reply == 1){
                        //Si a todo
                        listadoFacturas.add(fact);
                    }else {
                        System.out.println("Factura no incluida");
                        //return null;
                    }

                }

            }
            
        }
        reply = 0; // reiniciar variable del cuadro de si a todo
        
        
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
            String nombreReceptor = crearElemento("Nombre", nodoReceptor, namespace); 
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
        if (nodoPadre.getChild("Exoneracion", Namespace.getNamespace(namespace)) != null) {
            Element exonera = nodoPadre.getChild("Exoneracion", Namespace.getNamespace(namespace));
            String tipoDocumento = crearElemento("TipoDocumento", exonera, namespace);
            String numeroDocumento = crearElemento("NumeroDocumento", exonera, namespace);
            String nombreInstitucion = crearElemento("NombreInstitucion", exonera, namespace);
            String fechaEmision = crearElemento("FechaEmision", exonera, namespace);
            String porcentajeExoneracion = crearElemento("PorcentajeExoneracion", exonera, namespace);
            String montoExoneracion = crearElemento("MontoExoneracion", exonera, namespace);
            return new Exoneracion(tipoDocumento, numeroDocumento, nombreInstitucion, fechaEmision, porcentajeExoneracion, montoExoneracion);
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
                String codigo = crearElemento("Codigo", lineaDetalle, namespace);
                CodigoLineaDetalle codigoComercial = crearCodigo(lineaDetalle, namespace);
                String cantidad = crearElemento("Cantidad", lineaDetalle, namespace);
                String unidadMedida = crearElemento("UnidadMedida", lineaDetalle, namespace);
                String unidadMedidaComercial = crearElemento("UnidadMedidaComercial", lineaDetalle, namespace);
                String detalle = crearElemento("Detalle", lineaDetalle, namespace);
                String precioUnitario = crearElemento("PrecioUnitario", lineaDetalle, namespace);
                String montoTotal = crearElemento("MontoTotal", lineaDetalle, namespace);
                
                Descuento descuento = crearDescuento(lineaDetalle, namespace);
                
                String subTotal = crearElemento("SubTotal", lineaDetalle, namespace);
                
                String baseImponible = crearElemento("BaseImponible", lineaDetalle, namespace);
                Impuesto impuesto = crearImpuesto(lineaDetalle, namespace); //POR TERMINAR
                
                
                String impuestoNeto = crearElemento("ImpuestoNeto", lineaDetalle, namespace);
                
                String montoTotalLinea = crearElemento("MontoTotalLinea", lineaDetalle, namespace);
  

                listarDetalleServicio.agregarLinea(new LineaDetalle(numeroLinea, codigo,codigoComercial, cantidad, unidadMedida, unidadMedidaComercial, detalle, precioUnitario, montoTotal, descuento , subTotal,baseImponible, impuesto, impuestoNeto,montoTotalLinea));
            }
            return listarDetalleServicio;
        }
        return new DetalleServicio();
    }
    
    private OtrosCargos crearOtrosCargos(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("OtrosCargos", Namespace.getNamespace(namespace)) != null) {
            Element nodoOtrosCargos = nodoPadre.getChild("OtrosCargos", Namespace.getNamespace(namespace));
            String TipoDocumento = crearElemento("TipoDocumento", nodoOtrosCargos, namespace);
            String NombreIdentidadTerceros = crearElemento("NumeroIdentidadTercero", nodoOtrosCargos, namespace);
            String nombreTercero = crearElemento("NombreTercero", nodoOtrosCargos, namespace);
            String detalle = crearElemento("Detalle", nodoOtrosCargos, namespace);
            String porcentaje = crearElemento("Porcentaje", nodoOtrosCargos, namespace);
            String MontoCargo = crearElemento("MontoCargo", nodoOtrosCargos, namespace);
            
            return new OtrosCargos(TipoDocumento,NombreIdentidadTerceros,nombreTercero,detalle,porcentaje,MontoCargo);
        }
        return new OtrosCargos();
    }
    
    
    
    
    

    private CodigoLineaDetalle crearCodigo(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("CodigoComercial", Namespace.getNamespace(namespace)) != null) {
            Element nodoCodigoComercial = nodoPadre.getChild("CodigoComercial", Namespace.getNamespace(namespace));
            String tipo = crearElemento("Tipo", nodoCodigoComercial, namespace);
            String codigo = crearElemento("Codigo", nodoCodigoComercial, namespace);
            return new CodigoLineaDetalle(tipo, codigo);
        }
        return new CodigoLineaDetalle();
    }

    private Impuesto crearImpuesto(Element nodoPadre, String namespace) {

        if (nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace)) != null) {
            Element impuesto = nodoPadre.getChild("Impuesto", Namespace.getNamespace(namespace));
            String codigo = crearElemento("Codigo", impuesto, namespace);
            String codigoTarifa = crearElemento("CodigoTarifa", impuesto, namespace);
            String tarifa = crearElemento("Tarifa", impuesto, namespace);
            String factorIVA = crearElemento("FactorIVA", impuesto, namespace);
            String monto = crearElemento("Monto", impuesto, namespace);
            Exoneracion exoneracion = crearExoneracion(impuesto, namespace);
            return new Impuesto(codigo, codigoTarifa, tarifa, factorIVA,monto,exoneracion);
        }
        return new Impuesto();
    }
    
    /// Voy por impuestos

    private String crearElemento(String nombreNodo, Element nodoPadre, String namespace) {
        if (nodoPadre.getChild(nombreNodo, Namespace.getNamespace(namespace)) != null) {
            return nodoPadre.getChildText(nombreNodo, Namespace.getNamespace(namespace));
        }
        return null;
    }

    private ResumenFactura crearResumenFactura(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("ResumenFactura", Namespace.getNamespace(namespace)) != null) {
            Element resumenFactura = nodoPadre.getChild("ResumenFactura", Namespace.getNamespace(namespace));
            CodigoTipoMoneda codigoMoneda = crearCodigoTipoMoneda(resumenFactura,namespace);
            String totalServiciosGravados = crearElemento("TotalServGravados", resumenFactura, namespace);
            String totalServiciosExcentos = crearElemento("TotalServExentos", resumenFactura, namespace);
            String totalServiciosExonerados = crearElemento("TotalServExonerado", resumenFactura, namespace);                         
            
            String totalMercanciasGravadas = crearElemento("TotalMercanciasGravadas", resumenFactura, namespace);
            String totalMercanciasExentas = crearElemento("TotalMercanciasExentas", resumenFactura, namespace);
            String totalMercanciasExoneradas = crearElemento("TotalMercExonerada", resumenFactura, namespace);       
            
            String totalGravado = crearElemento("TotalGravado", resumenFactura, namespace);
            String totalExcento = crearElemento("TotalExento", resumenFactura, namespace);
            String totalExonerado = crearElemento("TotalExonerado", resumenFactura, namespace);
            
            String totalVenta = crearElemento("TotalVenta", resumenFactura, namespace);
            String totalDescuento = crearElemento("TotalDescuentos", resumenFactura, namespace);
            String totalVentaNeta = crearElemento("TotalVentaNeta", resumenFactura, namespace);
            String totalImpuesto = crearElemento("TotalImpuesto", resumenFactura, namespace);
            String totalIVADevuelto = crearElemento("TotalIVADevuelto",resumenFactura,namespace);
            String totalOtrosCargos = crearElemento("TotalOtrosCargos",resumenFactura,namespace);   
            String totalComprobante = crearElemento("TotalComprobante", resumenFactura, namespace);
            
            return new ResumenFactura(codigoMoneda, totalServiciosGravados, totalServiciosExcentos,totalServiciosExonerados, totalMercanciasGravadas, totalMercanciasExentas, totalMercanciasExoneradas, totalGravado, totalExcento,totalExonerado, totalVenta, totalDescuento, totalVentaNeta, totalImpuesto,totalIVADevuelto,totalOtrosCargos, totalComprobante);
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


    private CodigoTipoMoneda crearCodigoTipoMoneda(Element nodoPadre, String namespace) {
        if (nodoPadre.getChild("CodigoTipoMoneda", Namespace.getNamespace(namespace)) != null) {
            Element normativa = nodoPadre.getChild("CodigoTipoMoneda", Namespace.getNamespace(namespace));
            String numResolucion = crearElemento("CodigoMoneda", normativa, namespace);
            String fechaResolucion = crearElemento("TipoCambio", normativa, namespace);
            return new CodigoTipoMoneda(numResolucion, fechaResolucion);
        }
        return new CodigoTipoMoneda();
    }
    
    
    private Descuento crearDescuento(Element nodoPadre, String namespace) {

        if (nodoPadre.getChild("Descuento", Namespace.getNamespace(namespace)) != null) {
            Element descuento = nodoPadre.getChild("Descuento", Namespace.getNamespace(namespace));
            String montoDescuento = crearElemento("MontoDescuento", descuento, namespace);
            String naturalezaDescuento = crearElemento("NaturalezaDescuento", descuento, namespace);
            return new Descuento(montoDescuento, naturalezaDescuento);
        }
        return new Descuento();
    }
    
    private Otros crearOtros(Element nodoPadre, String namespace) {

        if (nodoPadre.getChild("Otros", Namespace.getNamespace(namespace)) != null) {
            Element otros = nodoPadre.getChild("Otros", Namespace.getNamespace(namespace));
            String montoDescuento = crearElemento("OtroTexto", otros, namespace);
            String naturalezaDescuento = crearElemento("OtroContenido", otros, namespace);
            return new Otros(montoDescuento, naturalezaDescuento);
        }
        return new Otros();
    }

    
    
// </editor-fold>

}
