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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for blocking.
 *
 * <p>Java-Klasse für BlockingStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BlockingStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyPlanner" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RealTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockingStructure", propOrder = {
    "journeyPlanner",
    "realTime"
})
public class BlockingStructure {

    @XmlElement(name = "JourneyPlanner", defaultValue = "false")
    protected Boolean journeyPlanner;
    @XmlElement(name = "RealTime", defaultValue = "false")
    protected Boolean realTime;

    /**
     * Ruft den Wert der journeyPlanner-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isJourneyPlanner() {
        return journeyPlanner;
    }

    /**
     * Legt den Wert der journeyPlanner-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setJourneyPlanner(Boolean value) {
        this.journeyPlanner = value;
    }

    /**
     * Ruft den Wert der realTime-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isRealTime() {
        return realTime;
    }

    /**
     * Legt den Wert der realTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setRealTime(Boolean value) {
        this.realTime = value;
    }

    public BlockingStructure withJourneyPlanner(Boolean value) {
        setJourneyPlanner(value);
        return this;
    }

    public BlockingStructure withRealTime(Boolean value) {
        setRealTime(value);
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
