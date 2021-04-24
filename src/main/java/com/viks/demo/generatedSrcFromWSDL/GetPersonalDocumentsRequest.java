
package com.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BitrhDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeDocument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NumberDocument" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeSemd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lastName",
    "firstName",
    "middleName",
    "bitrhDate",
    "typeDocument",
    "numberDocument",
    "typeSemd"
})
@XmlRootElement(name = "GetPersonalDocumentsRequest")
public class GetPersonalDocumentsRequest {

    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", required = true)
    protected String middleName;
    @XmlElement(name = "BitrhDate", required = true)
    protected String bitrhDate;
    @XmlElement(name = "TypeDocument", required = true)
    protected String typeDocument;
    @XmlElement(name = "NumberDocument", required = true)
    protected String numberDocument;
    @XmlElement(name = "TypeSemd", required = true)
    protected String typeSemd;

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the bitrhDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitrhDate() {
        return bitrhDate;
    }

    /**
     * Sets the value of the bitrhDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitrhDate(String value) {
        this.bitrhDate = value;
    }

    /**
     * Gets the value of the typeDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDocument() {
        return typeDocument;
    }

    /**
     * Sets the value of the typeDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDocument(String value) {
        this.typeDocument = value;
    }

    /**
     * Gets the value of the numberDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberDocument() {
        return numberDocument;
    }

    /**
     * Sets the value of the numberDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberDocument(String value) {
        this.numberDocument = value;
    }

    /**
     * Gets the value of the typeSemd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSemd() {
        return typeSemd;
    }

    /**
     * Sets the value of the typeSemd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSemd(String value) {
        this.typeSemd = value;
    }

}
