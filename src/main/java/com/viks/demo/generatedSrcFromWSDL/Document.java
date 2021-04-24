
package com.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="document"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TypeSemd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NameSemd" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Inserted" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="AuthorMis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "document", propOrder = {
    "uniqueId",
    "typeSemd",
    "nameSemd",
    "inserted",
    "created",
    "authorMis"
})
public class Document {

    @XmlElement(name = "UniqueId", required = true)
    protected String uniqueId;
    @XmlElement(name = "TypeSemd", required = true)
    protected String typeSemd;
    @XmlElement(name = "NameSemd", required = true)
    protected String nameSemd;
    @XmlElement(name = "Inserted", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inserted;
    @XmlElement(name = "Created", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlElement(name = "AuthorMis", required = true)
    protected String authorMis;

    /**
     * Gets the value of the uniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * Sets the value of the uniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueId(String value) {
        this.uniqueId = value;
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

    /**
     * Gets the value of the nameSemd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSemd() {
        return nameSemd;
    }

    /**
     * Sets the value of the nameSemd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSemd(String value) {
        this.nameSemd = value;
    }

    /**
     * Gets the value of the inserted property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInserted() {
        return inserted;
    }

    /**
     * Sets the value of the inserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInserted(XMLGregorianCalendar value) {
        this.inserted = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the authorMis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorMis() {
        return authorMis;
    }

    /**
     * Sets the value of the authorMis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorMis(String value) {
        this.authorMis = value;
    }

}
