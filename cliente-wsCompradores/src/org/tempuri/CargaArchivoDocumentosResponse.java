
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.efactoring_webservices.RespuestaModel;


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
 *         &lt;element name="CargaArchivoDocumentosResult" type="{http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models}RespuestaModel" minOccurs="0"/>
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
    "cargaArchivoDocumentosResult"
})
@XmlRootElement(name = "CargaArchivoDocumentosResponse")
public class CargaArchivoDocumentosResponse {

    @XmlElementRef(name = "CargaArchivoDocumentosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RespuestaModel> cargaArchivoDocumentosResult;

    /**
     * Obtiene el valor de la propiedad cargaArchivoDocumentosResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}
     *     
     */
    public JAXBElement<RespuestaModel> getCargaArchivoDocumentosResult() {
        return cargaArchivoDocumentosResult;
    }

    /**
     * Define el valor de la propiedad cargaArchivoDocumentosResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}
     *     
     */
    public void setCargaArchivoDocumentosResult(JAXBElement<RespuestaModel> value) {
        this.cargaArchivoDocumentosResult = value;
    }

}
