
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="usuarioId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ArchivoEncabezadoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivoEncabezadoBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ArchivoDetalleNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ArchivoDetalleBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "autorizacionId",
    "usuarioId",
    "password",
    "fecha",
    "archivoEncabezadoNombre",
    "archivoEncabezadoBytes",
    "archivoDetalleNombre",
    "archivoDetalleBytes"
})
@XmlRootElement(name = "CargaArchivoPagos")
public class CargaArchivoPagos {

    protected Long autorizacionId;
    @XmlElementRef(name = "usuarioId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioId;
    @XmlElementRef(name = "password", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElementRef(name = "ArchivoEncabezadoNombre", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> archivoEncabezadoNombre;
    @XmlElementRef(name = "ArchivoEncabezadoBytes", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> archivoEncabezadoBytes;
    @XmlElementRef(name = "ArchivoDetalleNombre", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> archivoDetalleNombre;
    @XmlElementRef(name = "ArchivoDetalleBytes", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> archivoDetalleBytes;

    /**
     * Obtiene el valor de la propiedad autorizacionId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAutorizacionId() {
        return autorizacionId;
    }

    /**
     * Define el valor de la propiedad autorizacionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAutorizacionId(Long value) {
        this.autorizacionId = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioId() {
        return usuarioId;
    }

    /**
     * Define el valor de la propiedad usuarioId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioId(JAXBElement<String> value) {
        this.usuarioId = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPassword(JAXBElement<String> value) {
        this.password = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoEncabezadoNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArchivoEncabezadoNombre() {
        return archivoEncabezadoNombre;
    }

    /**
     * Define el valor de la propiedad archivoEncabezadoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArchivoEncabezadoNombre(JAXBElement<String> value) {
        this.archivoEncabezadoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoEncabezadoBytes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getArchivoEncabezadoBytes() {
        return archivoEncabezadoBytes;
    }

    /**
     * Define el valor de la propiedad archivoEncabezadoBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setArchivoEncabezadoBytes(JAXBElement<byte[]> value) {
        this.archivoEncabezadoBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoDetalleNombre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getArchivoDetalleNombre() {
        return archivoDetalleNombre;
    }

    /**
     * Define el valor de la propiedad archivoDetalleNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setArchivoDetalleNombre(JAXBElement<String> value) {
        this.archivoDetalleNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad archivoDetalleBytes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getArchivoDetalleBytes() {
        return archivoDetalleBytes;
    }

    /**
     * Define el valor de la propiedad archivoDetalleBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setArchivoDetalleBytes(JAXBElement<byte[]> value) {
        this.archivoDetalleBytes = value;
    }

}
