//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für Mobility complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Mobility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mobilityType" type="{http://datex2.eu/schema/2_0RC1/2_0}MobilityEnum"/&gt;
 *         &lt;element name="mobilityExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mobility", propOrder = {
    "mobilityType",
    "mobilityExtension"
})
public class Mobility {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected MobilityEnum mobilityType;
    protected ExtensionType mobilityExtension;

    /**
     * Ruft den Wert der mobilityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityEnum }
     *     
     */
    public MobilityEnum getMobilityType() {
        return mobilityType;
    }

    /**
     * Legt den Wert der mobilityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityEnum }
     *     
     */
    public void setMobilityType(MobilityEnum value) {
        this.mobilityType = value;
    }

    /**
     * Ruft den Wert der mobilityExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMobilityExtension() {
        return mobilityExtension;
    }

    /**
     * Legt den Wert der mobilityExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMobilityExtension(ExtensionType value) {
        this.mobilityExtension = value;
    }

    public Mobility withMobilityType(MobilityEnum value) {
        setMobilityType(value);
        return this;
    }

    public Mobility withMobilityExtension(ExtensionType value) {
        setMobilityExtension(value);
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
