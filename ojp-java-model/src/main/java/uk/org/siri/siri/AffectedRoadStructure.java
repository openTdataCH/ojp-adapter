//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import eu.datex2.schema._2_0rc1._2_0.RoadsideReferencePointLinear;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.LinkProjectionStructure;

/**
 * Type for Raod scope for scope of SITUATION or effect.
 *
 * <p>Java-Klasse für AffectedRoadStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedRoadStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Road" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointLinear" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ProjectionGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedRoadStructure", propOrder = {
    "road",
    "linkProjection",
    "offset",
    "extensions"
})
public class AffectedRoadStructure {

    @XmlElement(name = "Road")
    protected RoadsideReferencePointLinear road;
    @XmlElement(name = "LinkProjection")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der road-Eigenschaft ab.
     *
     * @return possible object is {@link RoadsideReferencePointLinear }
     */
    public RoadsideReferencePointLinear getRoad() {
        return road;
    }

    /**
     * Legt den Wert der road-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadsideReferencePointLinear }
     */
    public void setRoad(RoadsideReferencePointLinear value) {
        this.road = value;
    }

    /**
     * Ruft den Wert der linkProjection-Eigenschaft ab.
     *
     * @return possible object is {@link LinkProjectionStructure }
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Legt den Wert der linkProjection-Eigenschaft fest.
     *
     * @param value allowed object is {@link LinkProjectionStructure }
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     *
     * @return possible object is {@link OffsetStructure }
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     *
     * @param value allowed object is {@link OffsetStructure }
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedRoadStructure withRoad(RoadsideReferencePointLinear value) {
        setRoad(value);
        return this;
    }

    public AffectedRoadStructure withLinkProjection(LinkProjectionStructure value) {
        setLinkProjection(value);
        return this;
    }

    public AffectedRoadStructure withOffset(OffsetStructure value) {
        setOffset(value);
        return this;
    }

    public AffectedRoadStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
