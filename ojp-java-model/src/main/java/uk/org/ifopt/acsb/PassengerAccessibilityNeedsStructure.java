//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for accessibility needs. Records the requirementrs of a passenger that may affect choice of facilities.
 *
 * <p>Java-Klasse für PassengerAccessibilityNeedsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PassengerAccessibilityNeedsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UserNeed" type="{http://www.ifopt.org.uk/acsb}UserNeedStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccompaniedByCarer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerAccessibilityNeedsStructure", propOrder = {
    "userNeed",
    "accompaniedByCarer"
})
public class PassengerAccessibilityNeedsStructure {

    @XmlElement(name = "UserNeed")
    protected List<UserNeedStructure> userNeed;
    @XmlElement(name = "AccompaniedByCarer")
    protected Boolean accompaniedByCarer;

    /**
     * Gets the value of the userNeed property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the userNeed property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserNeed().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link UserNeedStructure }
     */
    public List<UserNeedStructure> getUserNeed() {
        if (userNeed == null) {
            userNeed = new ArrayList<UserNeedStructure>();
        }
        return this.userNeed;
    }

    /**
     * Ruft den Wert der accompaniedByCarer-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAccompaniedByCarer() {
        return accompaniedByCarer;
    }

    /**
     * Legt den Wert der accompaniedByCarer-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAccompaniedByCarer(Boolean value) {
        this.accompaniedByCarer = value;
    }

    public PassengerAccessibilityNeedsStructure withUserNeed(UserNeedStructure... values) {
        if (values != null) {
            for (UserNeedStructure value : values) {
                getUserNeed().add(value);
            }
        }
        return this;
    }

    public PassengerAccessibilityNeedsStructure withUserNeed(Collection<UserNeedStructure> values) {
        if (values != null) {
            getUserNeed().addAll(values);
        }
        return this;
    }

    public PassengerAccessibilityNeedsStructure withAccompaniedByCarer(Boolean value) {
        setAccompaniedByCarer(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
