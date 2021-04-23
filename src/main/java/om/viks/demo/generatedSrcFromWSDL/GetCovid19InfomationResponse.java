
package om.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCovid19InfomationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCovid19InfomationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListStatusSnils" type="{http://www.yarcloud.ru/er76/}listStatusSnils"/&gt;
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
@XmlType(name = "GetCovid19InfomationResponse", propOrder = {
    "listStatusSnils",
    "error"
})
public class GetCovid19InfomationResponse {

    @XmlElement(name = "ListStatusSnils", required = true)
    protected ListStatusSnils listStatusSnils;
    @XmlElement(name = "Error", required = true)
    protected Error error;

    /**
     * Gets the value of the listStatusSnils property.
     * 
     * @return
     *     possible object is
     *     {@link ListStatusSnils }
     *     
     */
    public ListStatusSnils getListStatusSnils() {
        return listStatusSnils;
    }

    /**
     * Sets the value of the listStatusSnils property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListStatusSnils }
     *     
     */
    public void setListStatusSnils(ListStatusSnils value) {
        this.listStatusSnils = value;
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
