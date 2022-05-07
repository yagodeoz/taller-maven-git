
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.efactoring_webservices.ArrayOfCesionDocumentoModelComprador;
import org.datacontract.schemas._2004._07.efactoring_webservices.ArrayOfCesionDocumentoReporteModel;
import org.datacontract.schemas._2004._07.efactoring_webservices.RespuestaModel;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _CargaPruebaResponseCargaPruebaResult_QNAME = new QName("http://tempuri.org/", "CargaPruebaResult");
    private final static QName _CargaArchivoPagosResponseCargaArchivoPagosResult_QNAME = new QName("http://tempuri.org/", "CargaArchivoPagosResult");
    private final static QName _CargaArchivoDocumentosPassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _CargaArchivoDocumentosArchivoDocumentosNombre_QNAME = new QName("http://tempuri.org/", "ArchivoDocumentosNombre");
    private final static QName _CargaArchivoDocumentosBytes_QNAME = new QName("http://tempuri.org/", "bytes");
    private final static QName _CargaArchivoDocumentosUsuarioId_QNAME = new QName("http://tempuri.org/", "usuarioId");
    private final static QName _CargaArchivoDocumentosResponseCargaArchivoDocumentosResult_QNAME = new QName("http://tempuri.org/", "CargaArchivoDocumentosResult");
    private final static QName _CargaArchivoProveedoresResponseCargaArchivoProveedoresResult_QNAME = new QName("http://tempuri.org/", "CargaArchivoProveedoresResult");
    private final static QName _DescargarCesionesResponseDescargarCesionesResult_QNAME = new QName("http://tempuri.org/", "DescargarCesionesResult");
    private final static QName _InformarCesionesProcesadasLCesionDocumentoReporteModel_QNAME = new QName("http://tempuri.org/", "lCesionDocumentoReporteModel");
    private final static QName _CargaArchivoProveedoresArchivoProveedoresNombre_QNAME = new QName("http://tempuri.org/", "ArchivoProveedoresNombre");
    private final static QName _InformarCesionesProcesadasResponseInformarCesionesProcesadasResult_QNAME = new QName("http://tempuri.org/", "InformarCesionesProcesadasResult");
    private final static QName _CargaArchivoPagosArchivoEncabezadoNombre_QNAME = new QName("http://tempuri.org/", "ArchivoEncabezadoNombre");
    private final static QName _CargaArchivoPagosArchivoEncabezadoBytes_QNAME = new QName("http://tempuri.org/", "ArchivoEncabezadoBytes");
    private final static QName _CargaArchivoPagosArchivoDetalleBytes_QNAME = new QName("http://tempuri.org/", "ArchivoDetalleBytes");
    private final static QName _CargaArchivoPagosArchivoDetalleNombre_QNAME = new QName("http://tempuri.org/", "ArchivoDetalleNombre");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CargaArchivoDocumentos }
     * 
     */
    public CargaArchivoDocumentos createCargaArchivoDocumentos() {
        return new CargaArchivoDocumentos();
    }

    /**
     * Create an instance of {@link CargaPrueba }
     * 
     */
    public CargaPrueba createCargaPrueba() {
        return new CargaPrueba();
    }

    /**
     * Create an instance of {@link InformarCesionesProcesadasResponse }
     * 
     */
    public InformarCesionesProcesadasResponse createInformarCesionesProcesadasResponse() {
        return new InformarCesionesProcesadasResponse();
    }

    /**
     * Create an instance of {@link CargaPruebaResponse }
     * 
     */
    public CargaPruebaResponse createCargaPruebaResponse() {
        return new CargaPruebaResponse();
    }

    /**
     * Create an instance of {@link InformarCesionesProcesadas }
     * 
     */
    public InformarCesionesProcesadas createInformarCesionesProcesadas() {
        return new InformarCesionesProcesadas();
    }

    /**
     * Create an instance of {@link CargaArchivoProveedores }
     * 
     */
    public CargaArchivoProveedores createCargaArchivoProveedores() {
        return new CargaArchivoProveedores();
    }

    /**
     * Create an instance of {@link CargaArchivoProveedoresResponse }
     * 
     */
    public CargaArchivoProveedoresResponse createCargaArchivoProveedoresResponse() {
        return new CargaArchivoProveedoresResponse();
    }

    /**
     * Create an instance of {@link CargaArchivoDocumentosResponse }
     * 
     */
    public CargaArchivoDocumentosResponse createCargaArchivoDocumentosResponse() {
        return new CargaArchivoDocumentosResponse();
    }

    /**
     * Create an instance of {@link DescargarCesiones }
     * 
     */
    public DescargarCesiones createDescargarCesiones() {
        return new DescargarCesiones();
    }

    /**
     * Create an instance of {@link CargaArchivoPagosResponse }
     * 
     */
    public CargaArchivoPagosResponse createCargaArchivoPagosResponse() {
        return new CargaArchivoPagosResponse();
    }

    /**
     * Create an instance of {@link DescargarCesionesResponse }
     * 
     */
    public DescargarCesionesResponse createDescargarCesionesResponse() {
        return new DescargarCesionesResponse();
    }

    /**
     * Create an instance of {@link CargaArchivoPagos }
     * 
     */
    public CargaArchivoPagos createCargaArchivoPagos() {
        return new CargaArchivoPagos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CargaPruebaResult", scope = CargaPruebaResponse.class)
    public JAXBElement<String> createCargaPruebaResponseCargaPruebaResult(String value) {
        return new JAXBElement<String>(_CargaPruebaResponseCargaPruebaResult_QNAME, String.class, CargaPruebaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CargaArchivoPagosResult", scope = CargaArchivoPagosResponse.class)
    public JAXBElement<RespuestaModel> createCargaArchivoPagosResponseCargaArchivoPagosResult(RespuestaModel value) {
        return new JAXBElement<RespuestaModel>(_CargaArchivoPagosResponseCargaArchivoPagosResult_QNAME, RespuestaModel.class, CargaArchivoPagosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CargaArchivoDocumentos.class)
    public JAXBElement<String> createCargaArchivoDocumentosPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, CargaArchivoDocumentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoDocumentosNombre", scope = CargaArchivoDocumentos.class)
    public JAXBElement<String> createCargaArchivoDocumentosArchivoDocumentosNombre(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosArchivoDocumentosNombre_QNAME, String.class, CargaArchivoDocumentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bytes", scope = CargaArchivoDocumentos.class)
    public JAXBElement<byte[]> createCargaArchivoDocumentosBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CargaArchivoDocumentosBytes_QNAME, byte[].class, CargaArchivoDocumentos.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = CargaArchivoDocumentos.class)
    public JAXBElement<String> createCargaArchivoDocumentosUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, CargaArchivoDocumentos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CargaArchivoDocumentosResult", scope = CargaArchivoDocumentosResponse.class)
    public JAXBElement<RespuestaModel> createCargaArchivoDocumentosResponseCargaArchivoDocumentosResult(RespuestaModel value) {
        return new JAXBElement<RespuestaModel>(_CargaArchivoDocumentosResponseCargaArchivoDocumentosResult_QNAME, RespuestaModel.class, CargaArchivoDocumentosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CargaArchivoProveedoresResult", scope = CargaArchivoProveedoresResponse.class)
    public JAXBElement<RespuestaModel> createCargaArchivoProveedoresResponseCargaArchivoProveedoresResult(RespuestaModel value) {
        return new JAXBElement<RespuestaModel>(_CargaArchivoProveedoresResponseCargaArchivoProveedoresResult_QNAME, RespuestaModel.class, CargaArchivoProveedoresResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoModelComprador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DescargarCesionesResult", scope = DescargarCesionesResponse.class)
    public JAXBElement<ArrayOfCesionDocumentoModelComprador> createDescargarCesionesResponseDescargarCesionesResult(ArrayOfCesionDocumentoModelComprador value) {
        return new JAXBElement<ArrayOfCesionDocumentoModelComprador>(_DescargarCesionesResponseDescargarCesionesResult_QNAME, ArrayOfCesionDocumentoModelComprador.class, DescargarCesionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = InformarCesionesProcesadas.class)
    public JAXBElement<String> createInformarCesionesProcesadasPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, InformarCesionesProcesadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoReporteModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lCesionDocumentoReporteModel", scope = InformarCesionesProcesadas.class)
    public JAXBElement<ArrayOfCesionDocumentoReporteModel> createInformarCesionesProcesadasLCesionDocumentoReporteModel(ArrayOfCesionDocumentoReporteModel value) {
        return new JAXBElement<ArrayOfCesionDocumentoReporteModel>(_InformarCesionesProcesadasLCesionDocumentoReporteModel_QNAME, ArrayOfCesionDocumentoReporteModel.class, InformarCesionesProcesadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = InformarCesionesProcesadas.class)
    public JAXBElement<String> createInformarCesionesProcesadasUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, InformarCesionesProcesadas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CargaArchivoProveedores.class)
    public JAXBElement<String> createCargaArchivoProveedoresPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, CargaArchivoProveedores.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bytes", scope = CargaArchivoProveedores.class)
    public JAXBElement<byte[]> createCargaArchivoProveedoresBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CargaArchivoDocumentosBytes_QNAME, byte[].class, CargaArchivoProveedores.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = CargaArchivoProveedores.class)
    public JAXBElement<String> createCargaArchivoProveedoresUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, CargaArchivoProveedores.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoProveedoresNombre", scope = CargaArchivoProveedores.class)
    public JAXBElement<String> createCargaArchivoProveedoresArchivoProveedoresNombre(String value) {
        return new JAXBElement<String>(_CargaArchivoProveedoresArchivoProveedoresNombre_QNAME, String.class, CargaArchivoProveedores.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CargaPrueba.class)
    public JAXBElement<String> createCargaPruebaPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, CargaPrueba.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoDocumentosNombre", scope = CargaPrueba.class)
    public JAXBElement<String> createCargaPruebaArchivoDocumentosNombre(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosArchivoDocumentosNombre_QNAME, String.class, CargaPrueba.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bytes", scope = CargaPrueba.class)
    public JAXBElement<byte[]> createCargaPruebaBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CargaArchivoDocumentosBytes_QNAME, byte[].class, CargaPrueba.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = CargaPrueba.class)
    public JAXBElement<String> createCargaPruebaUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, CargaPrueba.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InformarCesionesProcesadasResult", scope = InformarCesionesProcesadasResponse.class)
    public JAXBElement<RespuestaModel> createInformarCesionesProcesadasResponseInformarCesionesProcesadasResult(RespuestaModel value) {
        return new JAXBElement<RespuestaModel>(_InformarCesionesProcesadasResponseInformarCesionesProcesadasResult_QNAME, RespuestaModel.class, InformarCesionesProcesadasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = DescargarCesiones.class)
    public JAXBElement<String> createDescargarCesionesPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, DescargarCesiones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = DescargarCesiones.class)
    public JAXBElement<String> createDescargarCesionesUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, DescargarCesiones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = CargaArchivoPagos.class)
    public JAXBElement<String> createCargaArchivoPagosPassword(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosPassword_QNAME, String.class, CargaArchivoPagos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoEncabezadoNombre", scope = CargaArchivoPagos.class)
    public JAXBElement<String> createCargaArchivoPagosArchivoEncabezadoNombre(String value) {
        return new JAXBElement<String>(_CargaArchivoPagosArchivoEncabezadoNombre_QNAME, String.class, CargaArchivoPagos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoEncabezadoBytes", scope = CargaArchivoPagos.class)
    public JAXBElement<byte[]> createCargaArchivoPagosArchivoEncabezadoBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CargaArchivoPagosArchivoEncabezadoBytes_QNAME, byte[].class, CargaArchivoPagos.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoDetalleBytes", scope = CargaArchivoPagos.class)
    public JAXBElement<byte[]> createCargaArchivoPagosArchivoDetalleBytes(byte[] value) {
        return new JAXBElement<byte[]>(_CargaArchivoPagosArchivoDetalleBytes_QNAME, byte[].class, CargaArchivoPagos.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ArchivoDetalleNombre", scope = CargaArchivoPagos.class)
    public JAXBElement<String> createCargaArchivoPagosArchivoDetalleNombre(String value) {
        return new JAXBElement<String>(_CargaArchivoPagosArchivoDetalleNombre_QNAME, String.class, CargaArchivoPagos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "usuarioId", scope = CargaArchivoPagos.class)
    public JAXBElement<String> createCargaArchivoPagosUsuarioId(String value) {
        return new JAXBElement<String>(_CargaArchivoDocumentosUsuarioId_QNAME, String.class, CargaArchivoPagos.class, value);
    }

}
