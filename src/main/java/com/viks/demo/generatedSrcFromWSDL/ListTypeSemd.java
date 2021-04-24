
package com.viks.demo.generatedSrcFromWSDL;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listTypeSemd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listTypeSemd"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Semd" type="{http://www.yarcloud.ru/er76/}semd" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listTypeSemd", propOrder = {
    "semd"
})
public class ListTypeSemd {

    @XmlElement(name = "Semd")
    protected List<Semd> semd;

    /**
     * Gets the value of the semd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Semd }
     * 
     * 
     */
    public List<Semd> getSemd() {
        if (semd == null) {
            semd = new ArrayList<Semd>();
        }
        return this.semd;
    }

}
