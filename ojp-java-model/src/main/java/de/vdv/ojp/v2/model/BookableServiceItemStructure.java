//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Possible service items that can be booked in the actual booking system (defined by the traffic company of charge). Only those elements with value greater 0 are bookable. The indicated capacity
 * corresponds to the maximum number that can be booked in one booking. This number does not have to be available for the specific booking and may result in booking failure. Caution: list can vary
 * widely from one traffic company to another.
 *
 * <p>Java-Klasse für BookableServiceItemStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BookableServiceItemStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.vdv.de/ojp}BookableServiceItemTypeEnumeration"/&gt;
 *         &lt;element name="MaxBookableCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookableServiceItemStructure", propOrder = {
    "type",
    "maxBookableCapacity"
})
public class BookableServiceItemStructure {

    @XmlElement(name = "Type", required = true)
    @XmlSchemaType(name = "string")
    protected BookableServiceItemTypeEnumeration type;
    @XmlElement(name = "MaxBookableCapacity", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxBookableCapacity;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     *
     * @return possible object is {@link BookableServiceItemTypeEnumeration }
     */
    public BookableServiceItemTypeEnumeration getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     *
     * @param value allowed object is {@link BookableServiceItemTypeEnumeration }
     */
    public void setType(BookableServiceItemTypeEnumeration value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der maxBookableCapacity-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getMaxBookableCapacity() {
        return maxBookableCapacity;
    }

    /**
     * Legt den Wert der maxBookableCapacity-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setMaxBookableCapacity(BigInteger value) {
        this.maxBookableCapacity = value;
    }

    public BookableServiceItemStructure withType(BookableServiceItemTypeEnumeration value) {
        setType(value);
        return this;
    }

    public BookableServiceItemStructure withMaxBookableCapacity(BigInteger value) {
        setMaxBookableCapacity(value);
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
