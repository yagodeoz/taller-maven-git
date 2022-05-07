
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
 *         &lt;element name="CargaArchivoProveedoresResult" type="{http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models}RespuestaModel" minOccurs="0"/>
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
    "cargaArchivoProveedoresResult"
})
@XmlRootElement(name = "CargaArchivoProveedoresResponse")
public class CargaArchivoProveedoresResponse {

    @XmlElementRef(name = "CargaArchivoProveedoresResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RespuestaModel> cargaArchivoProveedoresResult;

    /**
     * Obtiene el valor de la propiedad cargaArchivoProveedoresResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}
     *     
     */
    public JAXBElement<RespuestaModel> getCargaArchivoProveedoresResult() {
        return cargaArchivoProveedoresResult;
    }

    /**
     * Define el valor de la propiedad cargaArchivoProveedoresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RespuestaModel }{@code >}
     *     
     */
    public void setCargaArchivoProveedoresResult(JAXBElement<RespuestaModel> value) {
        this.cargaArchivoProveedoresResult = value;
    }

}
