
package org.datacontract.schemas._2004._07.efactoring_webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CesionDocumentoReporteModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CesionDocumentoReporteModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CesionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocumentoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CesionDocumentoReporteModel", propOrder = {
    "cesionId",
    "documentoId"
})
public class CesionDocumentoReporteModel {

    @XmlElement(name = "CesionId")
    protected Long cesionId;
    @XmlElement(name = "DocumentoId")
    protected Long documentoId;

    /**
     * Obtiene el valor de la propiedad cesionId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCesionId() {
        return cesionId;
    }

    /**
     * Define el valor de la propiedad cesionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCesionId(Long value) {
        this.cesionId = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDocumentoId() {
        return documentoId;
    }

    /**
     * Define el valor de la propiedad documentoId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDocumentoId(Long value) {
        this.documentoId = value;
    }

}
