//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

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
 * Type for Information about a DESTINATION.
 *
 * <p>Java-Klasse für DestinationStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DestinationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationRef" type="{http://www.siri.org.uk/siri}DestinationRefStructure"/&gt;
 *         &lt;element name="DestinationName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationStructure", propOrder = {
    "destinationRef",
    "destinationName"
})
public class DestinationStructure {

    @XmlElement(name = "DestinationRef", required = true)
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "DestinationName", required = true)
    protected List<NaturalLanguageStringStructure> destinationName;

    /**
     * Ruft den Wert der destinationRef-Eigenschaft ab.
     *
     * @return possible object is {@link DestinationRefStructure }
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Legt den Wert der destinationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DestinationRefStructure }
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the destinationName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDestinationName() {
        if (destinationName == null) {
            destinationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationName;
    }

    public DestinationStructure withDestinationRef(DestinationRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public DestinationStructure withDestinationName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationName().add(value);
            }
        }
        return this;
    }

    public DestinationStructure withDestinationName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationName().addAll(values);
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
