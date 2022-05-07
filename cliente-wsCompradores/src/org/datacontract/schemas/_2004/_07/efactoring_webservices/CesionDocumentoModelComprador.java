
package org.datacontract.schemas._2004._07.efactoring_webservices;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para CesionDocumentoModelComprador complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CesionDocumentoModelComprador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CesionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DocumentoId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FactorIdentificacionTributaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaRegistro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentoComprador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroDocumentoFisico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroEmpresaProveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SaldoDocumento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TipoDocumentoId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CesionDocumentoModelComprador", propOrder = {
    "cesionId",
    "documentoId",
    "factorIdentificacionTributaria",
    "fechaIngreso",
    "fechaRegistro",
    "numeroDocumentoComprador",
    "numeroDocumentoFisico",
    "numeroEmpresaProveedor",
    "saldoDocumento",
    "tipoDocumentoId"
})
public class CesionDocumentoModelComprador {

    @XmlElement(name = "CesionId")
    protected Long cesionId;
    @XmlElement(name = "DocumentoId")
    protected Long documentoId;
    @XmlElementRef(name = "FactorIdentificacionTributaria", namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> factorIdentificacionTributaria;
    @XmlElement(name = "FechaIngreso")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngreso;
    @XmlElement(name = "FechaRegistro")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRegistro;
    @XmlElementRef(name = "NumeroDocumentoComprador", namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumentoComprador;
    @XmlElementRef(name = "NumeroDocumentoFisico", namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumentoFisico;
    @XmlElementRef(name = "NumeroEmpresaProveedor", namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroEmpresaProveedor;
    @XmlElement(name = "SaldoDocumento")
    protected BigDecimal saldoDocumento;
    @XmlElementRef(name = "TipoDocumentoId", namespace = "http://schemas.datacontract.org/2004/07/Efactoring.WebServices.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumentoId;

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

    /**
     * Obtiene el valor de la propiedad factorIdentificacionTributaria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFactorIdentificacionTributaria() {
        return factorIdentificacionTributaria;
    }

    /**
     * Define el valor de la propiedad factorIdentificacionTributaria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFactorIdentificacionTributaria(JAXBElement<String> value) {
        this.factorIdentificacionTributaria = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegistro.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Define el valor de la propiedad fechaRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRegistro(XMLGregorianCalendar value) {
        this.fechaRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentoComprador.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumentoComprador() {
        return numeroDocumentoComprador;
    }

    /**
     * Define el valor de la propiedad numeroDocumentoComprador.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumentoComprador(JAXBElement<String> value) {
        this.numeroDocumentoComprador = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumentoFisico.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumentoFisico() {
        return numeroDocumentoFisico;
    }

    /**
     * Define el valor de la propiedad numeroDocumentoFisico.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumentoFisico(JAXBElement<String> value) {
        this.numeroDocumentoFisico = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroEmpresaProveedor.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroEmpresaProveedor() {
        return numeroEmpresaProveedor;
    }

    /**
     * Define el valor de la propiedad numeroEmpresaProveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroEmpresaProveedor(JAXBElement<String> value) {
        this.numeroEmpresaProveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaldoDocumento() {
        return saldoDocumento;
    }

    /**
     * Define el valor de la propiedad saldoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaldoDocumento(BigDecimal value) {
        this.saldoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumentoId.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumentoId() {
        return tipoDocumentoId;
    }

    /**
     * Define el valor de la propiedad tipoDocumentoId.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumentoId(JAXBElement<String> value) {
        this.tipoDocumentoId = value;
    }

}
