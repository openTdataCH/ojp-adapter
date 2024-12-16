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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für RoadsideReferencePointLinear complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RoadsideReferencePointLinear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePointPrimaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointPrimaryLocation"/&gt;
 *         &lt;element name="roadsideReferencePointSecondaryLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointSecondaryLocation"/&gt;
 *         &lt;element name="roadsideReferencePointLinearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointLinear", propOrder = {
    "roadsideReferencePointPrimaryLocation",
    "roadsideReferencePointSecondaryLocation",
    "roadsideReferencePointLinearExtension"
})
public class RoadsideReferencePointLinear {

    @XmlElement(required = true)
    protected RoadsideReferencePointPrimaryLocation roadsideReferencePointPrimaryLocation;
    @XmlElement(required = true)
    protected RoadsideReferencePointSecondaryLocation roadsideReferencePointSecondaryLocation;
    protected ExtensionType roadsideReferencePointLinearExtension;

    /**
     * Ruft den Wert der roadsideReferencePointPrimaryLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public RoadsideReferencePointPrimaryLocation getRoadsideReferencePointPrimaryLocation() {
        return roadsideReferencePointPrimaryLocation;
    }

    /**
     * Legt den Wert der roadsideReferencePointPrimaryLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointPrimaryLocation }
     *     
     */
    public void setRoadsideReferencePointPrimaryLocation(RoadsideReferencePointPrimaryLocation value) {
        this.roadsideReferencePointPrimaryLocation = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointSecondaryLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public RoadsideReferencePointSecondaryLocation getRoadsideReferencePointSecondaryLocation() {
        return roadsideReferencePointSecondaryLocation;
    }

    /**
     * Legt den Wert der roadsideReferencePointSecondaryLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadsideReferencePointSecondaryLocation }
     *     
     */
    public void setRoadsideReferencePointSecondaryLocation(RoadsideReferencePointSecondaryLocation value) {
        this.roadsideReferencePointSecondaryLocation = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointLinearExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadsideReferencePointLinearExtension() {
        return roadsideReferencePointLinearExtension;
    }

    /**
     * Legt den Wert der roadsideReferencePointLinearExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadsideReferencePointLinearExtension(ExtensionType value) {
        this.roadsideReferencePointLinearExtension = value;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointPrimaryLocation(RoadsideReferencePointPrimaryLocation value) {
        setRoadsideReferencePointPrimaryLocation(value);
        return this;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointSecondaryLocation(RoadsideReferencePointSecondaryLocation value) {
        setRoadsideReferencePointSecondaryLocation(value);
        return this;
    }

    public RoadsideReferencePointLinear withRoadsideReferencePointLinearExtension(ExtensionType value) {
        setRoadsideReferencePointLinearExtension(value);
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
