//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Ordered list of CALLs at previous stop.
 *
 * <p>Java-Klasse für PreviousCallsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PreviousCallsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PreviousCall" type="{http://www.siri.org.uk/siri}PreviousCallStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousCallsStructure", propOrder = {
    "previousCall"
})
public class PreviousCallsStructure {

    @XmlElement(name = "PreviousCall", required = true)
    protected List<PreviousCallStructure> previousCall;

    /**
     * Gets the value of the previousCall property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the previousCall property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCall().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PreviousCallStructure }
     */
    public List<PreviousCallStructure> getPreviousCall() {
        if (previousCall == null) {
            previousCall = new ArrayList<PreviousCallStructure>();
        }
        return this.previousCall;
    }

    public PreviousCallsStructure withPreviousCall(PreviousCallStructure... values) {
        if (values != null) {
            for (PreviousCallStructure value : values) {
                getPreviousCall().add(value);
            }
        }
        return this;
    }

    public PreviousCallsStructure withPreviousCall(Collection<PreviousCallStructure> values) {
        if (values != null) {
            getPreviousCall().addAll(values);
        }
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
