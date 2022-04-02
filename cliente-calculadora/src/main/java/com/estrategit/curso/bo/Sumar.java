
package com.estrategit.curso.bo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sumar complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sumar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sumando1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="sumando2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sumar", propOrder = {
    "sumando1",
    "sumando2"
})
public class Sumar {

    protected Double sumando1;
    protected Double sumando2;

    /**
     * Obtiene el valor de la propiedad sumando1.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumando1() {
        return sumando1;
    }

    /**
     * Define el valor de la propiedad sumando1.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumando1(Double value) {
        this.sumando1 = value;
    }

    /**
     * Obtiene el valor de la propiedad sumando2.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSumando2() {
        return sumando2;
    }

    /**
     * Define el valor de la propiedad sumando2.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSumando2(Double value) {
        this.sumando2 = value;
    }

}
