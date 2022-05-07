
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.efactoring_webservices.ArrayOfCesionDocumentoModelComprador;


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
 *         &lt;element name="DescargarCesionesResult" type="{http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models}ArrayOfCesionDocumentoModelComprador" minOccurs="0"/>
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
    "descargarCesionesResult"
})
@XmlRootElement(name = "DescargarCesionesResponse")
public class DescargarCesionesResponse {

    @XmlElementRef(name = "DescargarCesionesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCesionDocumentoModelComprador> descargarCesionesResult;

    /**
     * Obtiene el valor de la propiedad descargarCesionesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoModelComprador }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCesionDocumentoModelComprador> getDescargarCesionesResult() {
        return descargarCesionesResult;
    }

    /**
     * Define el valor de la propiedad descargarCesionesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCesionDocumentoModelComprador }{@code >}
     *     
     */
    public void setDescargarCesionesResult(JAXBElement<ArrayOfCesionDocumentoModelComprador> value) {
        this.descargarCesionesResult = value;
    }

}
