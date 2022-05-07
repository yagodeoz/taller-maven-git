
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.efactoring_webservices.ArrayOfCesionDocumentoReporteModel;


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
 *         &lt;element name="lCesionDocumentoReporteModel" type="{http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models}ArrayOfCesionDocumentoReporteModel" minOccurs="0"/>
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
    "lCesionDocumentoReporteModel"
})
@XmlRootElement(name = "InformarCesionesProcesadas")
public class InformarCesionesProcesadas {

    protected Long autorizacionId;
    @XmlElementRef(name = "usuarioId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuarioId;
    @XmlElementRef(name = "password", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> password;
    @XmlElementRef(name = "lCesionDocumentoReporteModel", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCesionDocumentoReporteModel> lCesionDocumentoReporteModel;

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
     * Obtiene el valor de la propiedad lCesionDocumentoReporteModel.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoReporteModel }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCesionDocumentoReporteModel> getLCesionDocumentoReporteModel() {
        return lCesionDocumentoReporteModel;
    }

    /**
     * Define el valor de la propiedad lCesionDocumentoReporteModel.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoReporteModel }{@code >}
     *     
     */
    public void setLCesionDocumentoReporteModel(JAXBElement<ArrayOfCesionDocumentoReporteModel> value) {
        this.lCesionDocumentoReporteModel = value;
    }

}
