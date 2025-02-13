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
 * <p>Java-Klasse für RoadsideReferencePoint complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RoadsideReferencePoint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadsideReferencePointIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="administrativeArea" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="directionBound" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelative" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferencePointDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="distanceFromPrevious" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="distanceToNext" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="elevatedRoadSection" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointDistance" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadsideReferencePoint", propOrder = {
    "roadsideReferencePointIdentifier",
    "administrativeArea",
    "roadName",
    "roadNumber",
    "directionBound",
    "directionRelative",
    "distanceFromPrevious",
    "distanceToNext",
    "elevatedRoadSection",
    "roadsideReferencePointDescription",
    "roadsideReferencePointDistance",
    "roadsideReferencePointExtension"
})
public class RoadsideReferencePoint {

    @XmlElement(required = true)
    protected String roadsideReferencePointIdentifier;
    protected MultilingualString administrativeArea;
    protected MultilingualString roadName;
    protected String roadNumber;
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBound;
    @XmlSchemaType(name = "string")
    protected ReferencePointDirectionEnum directionRelative;
    protected Float distanceFromPrevious;
    protected Float distanceToNext;
    protected Boolean elevatedRoadSection;
    protected MultilingualString roadsideReferencePointDescription;
    protected Float roadsideReferencePointDistance;
    protected ExtensionType roadsideReferencePointExtension;

    /**
     * Ruft den Wert der roadsideReferencePointIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getRoadsideReferencePointIdentifier() {
        return roadsideReferencePointIdentifier;
    }

    /**
     * Legt den Wert der roadsideReferencePointIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setRoadsideReferencePointIdentifier(String value) {
        this.roadsideReferencePointIdentifier = value;
    }

    /**
     * Ruft den Wert der administrativeArea-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getAdministrativeArea() {
        return administrativeArea;
    }

    /**
     * Legt den Wert der administrativeArea-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setAdministrativeArea(MultilingualString value) {
        this.administrativeArea = value;
    }

    /**
     * Ruft den Wert der roadName-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getRoadName() {
        return roadName;
    }

    /**
     * Legt den Wert der roadName-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setRoadName(MultilingualString value) {
        this.roadName = value;
    }

    /**
     * Ruft den Wert der roadNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Legt den Wert der roadNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Ruft den Wert der directionBound-Eigenschaft ab.
     *
     * @return possible object is {@link DirectionEnum }
     */
    public DirectionEnum getDirectionBound() {
        return directionBound;
    }

    /**
     * Legt den Wert der directionBound-Eigenschaft fest.
     *
     * @param value allowed object is {@link DirectionEnum }
     */
    public void setDirectionBound(DirectionEnum value) {
        this.directionBound = value;
    }

    /**
     * Ruft den Wert der directionRelative-Eigenschaft ab.
     *
     * @return possible object is {@link ReferencePointDirectionEnum }
     */
    public ReferencePointDirectionEnum getDirectionRelative() {
        return directionRelative;
    }

    /**
     * Legt den Wert der directionRelative-Eigenschaft fest.
     *
     * @param value allowed object is {@link ReferencePointDirectionEnum }
     */
    public void setDirectionRelative(ReferencePointDirectionEnum value) {
        this.directionRelative = value;
    }

    /**
     * Ruft den Wert der distanceFromPrevious-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    /**
     * Legt den Wert der distanceFromPrevious-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDistanceFromPrevious(Float value) {
        this.distanceFromPrevious = value;
    }

    /**
     * Ruft den Wert der distanceToNext-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getDistanceToNext() {
        return distanceToNext;
    }

    /**
     * Legt den Wert der distanceToNext-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setDistanceToNext(Float value) {
        this.distanceToNext = value;
    }

    /**
     * Ruft den Wert der elevatedRoadSection-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isElevatedRoadSection() {
        return elevatedRoadSection;
    }

    /**
     * Legt den Wert der elevatedRoadSection-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setElevatedRoadSection(Boolean value) {
        this.elevatedRoadSection = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointDescription-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getRoadsideReferencePointDescription() {
        return roadsideReferencePointDescription;
    }

    /**
     * Legt den Wert der roadsideReferencePointDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setRoadsideReferencePointDescription(MultilingualString value) {
        this.roadsideReferencePointDescription = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointDistance-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getRoadsideReferencePointDistance() {
        return roadsideReferencePointDistance;
    }

    /**
     * Legt den Wert der roadsideReferencePointDistance-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setRoadsideReferencePointDistance(Float value) {
        this.roadsideReferencePointDistance = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getRoadsideReferencePointExtension() {
        return roadsideReferencePointExtension;
    }

    /**
     * Legt den Wert der roadsideReferencePointExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setRoadsideReferencePointExtension(ExtensionType value) {
        this.roadsideReferencePointExtension = value;
    }

    public RoadsideReferencePoint withRoadsideReferencePointIdentifier(String value) {
        setRoadsideReferencePointIdentifier(value);
        return this;
    }

    public RoadsideReferencePoint withAdministrativeArea(MultilingualString value) {
        setAdministrativeArea(value);
        return this;
    }

    public RoadsideReferencePoint withRoadName(MultilingualString value) {
        setRoadName(value);
        return this;
    }

    public RoadsideReferencePoint withRoadNumber(String value) {
        setRoadNumber(value);
        return this;
    }

    public RoadsideReferencePoint withDirectionBound(DirectionEnum value) {
        setDirectionBound(value);
        return this;
    }

    public RoadsideReferencePoint withDirectionRelative(ReferencePointDirectionEnum value) {
        setDirectionRelative(value);
        return this;
    }

    public RoadsideReferencePoint withDistanceFromPrevious(Float value) {
        setDistanceFromPrevious(value);
        return this;
    }

    public RoadsideReferencePoint withDistanceToNext(Float value) {
        setDistanceToNext(value);
        return this;
    }

    public RoadsideReferencePoint withElevatedRoadSection(Boolean value) {
        setElevatedRoadSection(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointDescription(MultilingualString value) {
        setRoadsideReferencePointDescription(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointDistance(Float value) {
        setRoadsideReferencePointDistance(value);
        return this;
    }

    public RoadsideReferencePoint withRoadsideReferencePointExtension(ExtensionType value) {
        setRoadsideReferencePointExtension(value);
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
