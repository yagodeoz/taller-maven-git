
package org.datacontract.schemas._2004._07.efactoring_webservices;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfCesionDocumentoReporteModel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCesionDocumentoReporteModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CesionDocumentoReporteModel" type="{http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models}CesionDocumentoReporteModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCesionDocumentoReporteModel", propOrder = {
    "cesionDocumentoReporteModel"
})
public class ArrayOfCesionDocumentoReporteModel {

    @XmlElement(name = "CesionDocumentoReporteModel", nillable = true)
    protected List<CesionDocumentoReporteModel> cesionDocumentoReporteModel;

    /**
     * Gets the value of the cesionDocumentoReporteModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cesionDocumentoReporteModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCesionDocumentoReporteModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CesionDocumentoReporteModel }
     * 
     * 
     */
    public List<CesionDocumentoReporteModel> getCesionDocumentoReporteModel() {
        if (cesionDocumentoReporteModel == null) {
            cesionDocumentoReporteModel = new ArrayList<CesionDocumentoReporteModel>();
        }
        return this.cesionDocumentoReporteModel;
    }

}
