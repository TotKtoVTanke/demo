
package om.viks.demo.generatedSrcFromWSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetActualTypeSemdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetActualTypeSemdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ListTypeSemd" type="{http://www.yarcloud.ru/er76/}listTypeSemd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetActualTypeSemdResponse", propOrder = {
    "listTypeSemd"
})
public class GetActualTypeSemdResponse {

    @XmlElement(name = "ListTypeSemd", required = true)
    protected ListTypeSemd listTypeSemd;

    /**
     * Gets the value of the listTypeSemd property.
     * 
     * @return
     *     possible object is
     *     {@link ListTypeSemd }
     *     
     */
    public ListTypeSemd getListTypeSemd() {
        return listTypeSemd;
    }

    /**
     * Sets the value of the listTypeSemd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListTypeSemd }
     *     
     */
    public void setListTypeSemd(ListTypeSemd value) {
        this.listTypeSemd = value;
    }

}
