
package org.datacontract.schemas._2004._07.efactoring_webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.efactoring_webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CesionDocumentoModelComprador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "CesionDocumentoModelComprador");
    private final static QName _ArrayOfCesionDocumentoModelComprador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "ArrayOfCesionDocumentoModelComprador");
    private final static QName _ArrayOfCesionDocumentoReporteModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "ArrayOfCesionDocumentoReporteModel");
    private final static QName _RespuestaModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "RespuestaModel");
    private final static QName _CesionDocumentoReporteModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "CesionDocumentoReporteModel");
    private final static QName _CesionDocumentoModelCompradorFactorIdentificacionTributaria_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "FactorIdentificacionTributaria");
    private final static QName _CesionDocumentoModelCompradorNumeroDocumentoFisico_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "NumeroDocumentoFisico");
    private final static QName _CesionDocumentoModelCompradorNumeroEmpresaProveedor_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "NumeroEmpresaProveedor");
    private final static QName _CesionDocumentoModelCompradorTipoDocumentoId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "TipoDocumentoId");
    private final static QName _CesionDocumentoModelCompradorNumeroDocumentoComprador_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "NumeroDocumentoComprador");
    private final static QName _RespuestaModelMensaje_QNAME = new QName("http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", "Mensaje");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.efactoring_webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RespuestaModel }
     * 
     */
    public RespuestaModel createRespuestaModel() {
        return new RespuestaModel();
    }

    /**
     * Create an instance of {@link CesionDocumentoModelComprador }
     * 
     */
    public CesionDocumentoModelComprador createCesionDocumentoModelComprador() {
        return new CesionDocumentoModelComprador();
    }

    /**
     * Create an instance of {@link ArrayOfCesionDocumentoModelComprador }
     * 
     */
    public ArrayOfCesionDocumentoModelComprador createArrayOfCesionDocumentoModelComprador() {
        return new ArrayOfCesionDocumentoModelComprador();
    }

    /**
     * Create an instance of {@link CesionDocumentoReporteModel }
     * 
     */
    public CesionDocumentoReporteModel createCesionDocumentoReporteModel() {
        return new CesionDocumentoReporteModel();
    }

    /**
     * Create an instance of {@link ArrayOfCesionDocumentoReporteModel }
     * 
     */
    public ArrayOfCesionDocumentoReporteModel createArrayOfCesionDocumentoReporteModel() {
        return new ArrayOfCesionDocumentoReporteModel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CesionDocumentoModelComprador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "CesionDocumentoModelComprador")
    public JAXBElement<CesionDocumentoModelComprador> createCesionDocumentoModelComprador(CesionDocumentoModelComprador value) {
        return new JAXBElement<CesionDocumentoModelComprador>(_CesionDocumentoModelComprador_QNAME, CesionDocumentoModelComprador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoModelComprador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "ArrayOfCesionDocumentoModelComprador")
    public JAXBElement<ArrayOfCesionDocumentoModelComprador> createArrayOfCesionDocumentoModelComprador(ArrayOfCesionDocumentoModelComprador value) {
        return new JAXBElement<ArrayOfCesionDocumentoModelComprador>(_ArrayOfCesionDocumentoModelComprador_QNAME, ArrayOfCesionDocumentoModelComprador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoReporteModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "ArrayOfCesionDocumentoReporteModel")
    public JAXBElement<ArrayOfCesionDocumentoReporteModel> createArrayOfCesionDocumentoReporteModel(ArrayOfCesionDocumentoReporteModel value) {
        return new JAXBElement<ArrayOfCesionDocumentoReporteModel>(_ArrayOfCesionDocumentoReporteModel_QNAME, ArrayOfCesionDocumentoReporteModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "RespuestaModel")
    public JAXBElement<RespuestaModel> createRespuestaModel(RespuestaModel value) {
        return new JAXBElement<RespuestaModel>(_RespuestaModel_QNAME, RespuestaModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CesionDocumentoReporteModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "CesionDocumentoReporteModel")
    public JAXBElement<CesionDocumentoReporteModel> createCesionDocumentoReporteModel(CesionDocumentoReporteModel value) {
        return new JAXBElement<CesionDocumentoReporteModel>(_CesionDocumentoReporteModel_QNAME, CesionDocumentoReporteModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "FactorIdentificacionTributaria", scope = CesionDocumentoModelComprador.class)
    public JAXBElement<String> createCesionDocumentoModelCompradorFactorIdentificacionTributaria(String value) {
        return new JAXBElement<String>(_CesionDocumentoModelCompradorFactorIdentificacionTributaria_QNAME, String.class, CesionDocumentoModelComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "NumeroDocumentoFisico", scope = CesionDocumentoModelComprador.class)
    public JAXBElement<String> createCesionDocumentoModelCompradorNumeroDocumentoFisico(String value) {
        return new JAXBElement<String>(_CesionDocumentoModelCompradorNumeroDocumentoFisico_QNAME, String.class, CesionDocumentoModelComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "NumeroEmpresaProveedor", scope = CesionDocumentoModelComprador.class)
    public JAXBElement<String> createCesionDocumentoModelCompradorNumeroEmpresaProveedor(String value) {
        return new JAXBElement<String>(_CesionDocumentoModelCompradorNumeroEmpresaProveedor_QNAME, String.class, CesionDocumentoModelComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "TipoDocumentoId", scope = CesionDocumentoModelComprador.class)
    public JAXBElement<String> createCesionDocumentoModelCompradorTipoDocumentoId(String value) {
        return new JAXBElement<String>(_CesionDocumentoModelCompradorTipoDocumentoId_QNAME, String.class, CesionDocumentoModelComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "NumeroDocumentoComprador", scope = CesionDocumentoModelComprador.class)
    public JAXBElement<String> createCesionDocumentoModelCompradorNumeroDocumentoComprador(String value) {
        return new JAXBElement<String>(_CesionDocumentoModelCompradorNumeroDocumentoComprador_QNAME, String.class, CesionDocumentoModelComprador.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", name = "Mensaje", scope = RespuestaModel.class)
    public JAXBElement<String> createRespuestaModelMensaje(String value) {
        return new JAXBElement<String>(_RespuestaModelMensaje_QNAME, String.class, RespuestaModel.class, value);
    }

}
