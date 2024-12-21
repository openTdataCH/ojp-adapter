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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for information about the LINEs affected by a SITUATION.
 * 
 * <p>Java-Klasse für OffsetStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OffsetStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceFromStart" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="DistanceFromEnd" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetStructure", propOrder = {
    "distanceFromStart",
    "distanceFromEnd"
})
public class OffsetStructure {

    @XmlElement(name = "DistanceFromStart")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromStart;
    @XmlElement(name = "DistanceFromEnd")
    @XmlSchemaType(name = "unsignedInt")
    protected Long distanceFromEnd;

    /**
     * Ruft den Wert der distanceFromStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromStart() {
        return distanceFromStart;
    }

    /**
     * Legt den Wert der distanceFromStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromStart(Long value) {
        this.distanceFromStart = value;
    }

    /**
     * Ruft den Wert der distanceFromEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDistanceFromEnd() {
        return distanceFromEnd;
    }

    /**
     * Legt den Wert der distanceFromEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDistanceFromEnd(Long value) {
        this.distanceFromEnd = value;
    }

    public OffsetStructure withDistanceFromStart(Long value) {
        setDistanceFromStart(value);
        return this;
    }

    public OffsetStructure withDistanceFromEnd(Long value) {
        setDistanceFromEnd(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
