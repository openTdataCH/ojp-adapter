//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for geospatial Position of a point. May be expressed in concrete WGS 84 Coordinates or any gml compatible point coordinates format.
 *
 * <p>Java-Klasse für LocationStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="LocationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.siri.org.uk/siri}WgsGroup"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Coordinates" type="{http://www.siri.org.uk/siri}CoordinatesStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Precision" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationStructure", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "coordinates",
    "precision"
})
@XmlSeeAlso({
    CircularAreaStructure.class
})
public class LocationStructure {

    @XmlElement(name = "Longitude")
    protected BigDecimal longitude;
    @XmlElement(name = "Latitude")
    protected BigDecimal latitude;
    @XmlElement(name = "Altitude")
    protected BigDecimal altitude;
    @XmlElement(name = "Coordinates")
    protected CoordinatesStructure coordinates;
    @XmlElement(name = "Precision")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger precision;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String id;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Ruft den Wert der altitude-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getAltitude() {
        return altitude;
    }

    /**
     * Legt den Wert der altitude-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setAltitude(BigDecimal value) {
        this.altitude = value;
    }

    /**
     * Ruft den Wert der coordinates-Eigenschaft ab.
     *
     * @return possible object is {@link CoordinatesStructure }
     */
    public CoordinatesStructure getCoordinates() {
        return coordinates;
    }

    /**
     * Legt den Wert der coordinates-Eigenschaft fest.
     *
     * @param value allowed object is {@link CoordinatesStructure }
     */
    public void setCoordinates(CoordinatesStructure value) {
        this.coordinates = value;
    }

    /**
     * Ruft den Wert der precision-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Legt den Wert der precision-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public LocationStructure withLongitude(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    public LocationStructure withLatitude(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    public LocationStructure withAltitude(BigDecimal value) {
        setAltitude(value);
        return this;
    }

    public LocationStructure withCoordinates(CoordinatesStructure value) {
        setCoordinates(value);
        return this;
    }

    public LocationStructure withPrecision(BigInteger value) {
        setPrecision(value);
        return this;
    }

    public LocationStructure withId(String value) {
        setId(value);
        return this;
    }

    public LocationStructure withSrsName(String value) {
        setSrsName(value);
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
