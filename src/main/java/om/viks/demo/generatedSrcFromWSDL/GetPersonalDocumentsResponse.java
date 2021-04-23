
package om.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPersonalDocumentsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPersonalDocumentsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListDocuments" type="{http://www.yarcloud.ru/er76/}listDocuments"/&gt;
 *         &lt;element name="Error" type="{http://www.yarcloud.ru/er76/}error"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPersonalDocumentsResponse", propOrder = {
    "listDocuments",
    "error"
})
public class GetPersonalDocumentsResponse {

    @XmlElement(name = "ListDocuments", required = true)
    protected ListDocuments listDocuments;
    @XmlElement(name = "Error", required = true)
    protected Error error;

    /**
     * Gets the value of the listDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link ListDocuments }
     *     
     */
    public ListDocuments getListDocuments() {
        return listDocuments;
    }

    /**
     * Sets the value of the listDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListDocuments }
     *     
     */
    public void setListDocuments(ListDocuments value) {
        this.listDocuments = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link Error }
     *     
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link Error }
     *     
     */
    public void setError(Error value) {
        this.error = value;
    }

}
