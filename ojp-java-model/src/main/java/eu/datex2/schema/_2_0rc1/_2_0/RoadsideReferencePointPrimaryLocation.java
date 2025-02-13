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
 * <p>Java-Klasse für RoadsideReferencePointPrimaryLocation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RoadsideReferencePointPrimaryLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint"/&gt;
 *         &lt;element name="roadsideReferencePointPrimaryLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePointPrimaryLocation", propOrder = {
    "roadsideReferencePoint",
    "roadsideReferencePointPrimaryLocationExtension"
})
public class RoadsideReferencePointPrimaryLocation {

    @XmlElement(required = true)
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected ExtensionType roadsideReferencePointPrimaryLocationExtension;

    /**
     * Ruft den Wert der roadsideReferencePoint-Eigenschaft ab.
     *
     * @return possible object is {@link RoadsideReferencePoint }
     */
    public RoadsideReferencePoint getRoadsideReferencePoint() {
        return roadsideReferencePoint;
    }

    /**
     * Legt den Wert der roadsideReferencePoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadsideReferencePoint }
     */
    public void setRoadsideReferencePoint(RoadsideReferencePoint value) {
        this.roadsideReferencePoint = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointPrimaryLocationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getRoadsideReferencePointPrimaryLocationExtension() {
        return roadsideReferencePointPrimaryLocationExtension;
    }

    /**
     * Legt den Wert der roadsideReferencePointPrimaryLocationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setRoadsideReferencePointPrimaryLocationExtension(ExtensionType value) {
        this.roadsideReferencePointPrimaryLocationExtension = value;
    }

    public RoadsideReferencePointPrimaryLocation withRoadsideReferencePoint(RoadsideReferencePoint value) {
        setRoadsideReferencePoint(value);
        return this;
    }

    public RoadsideReferencePointPrimaryLocation withRoadsideReferencePointPrimaryLocationExtension(ExtensionType value) {
        setRoadsideReferencePointPrimaryLocationExtension(value);
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
