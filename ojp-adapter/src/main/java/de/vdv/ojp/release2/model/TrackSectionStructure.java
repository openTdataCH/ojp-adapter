//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * SECTION of a LEG TRACK on the infrastructure network of the LEG together with time information.
 * 
 * <p>Java-Klasse für TrackSectionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrackSectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackSectionStart" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="TrackSectionEnd" type="{http://www.vdv.de/ojp}PlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="LinkProjection" type="{http://www.vdv.de/ojp}LinearShapeStructure" minOccurs="0"/&gt;
 *         &lt;element name="RoadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSectionStructure", propOrder = {
    "trackSectionStart",
    "trackSectionEnd",
    "linkProjection",
    "roadName",
    "duration",
    "length",
    "extension"
})
public class TrackSectionStructure {

    @XmlElement(name = "TrackSectionStart")
    protected PlaceRefStructure trackSectionStart;
    @XmlElement(name = "TrackSectionEnd")
    protected PlaceRefStructure trackSectionEnd;
    @XmlElement(name = "LinkProjection")
    protected LinearShapeStructure linkProjection;
    @XmlElement(name = "RoadName")
    protected String roadName;
    @XmlElement(name = "Duration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration duration;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger length;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der trackSectionStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getTrackSectionStart() {
        return trackSectionStart;
    }

    /**
     * Legt den Wert der trackSectionStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setTrackSectionStart(PlaceRefStructure value) {
        this.trackSectionStart = value;
    }

    /**
     * Ruft den Wert der trackSectionEnd-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getTrackSectionEnd() {
        return trackSectionEnd;
    }

    /**
     * Legt den Wert der trackSectionEnd-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setTrackSectionEnd(PlaceRefStructure value) {
        this.trackSectionEnd = value;
    }

    /**
     * Ruft den Wert der linkProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinearShapeStructure }
     *     
     */
    public LinearShapeStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Legt den Wert der linkProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearShapeStructure }
     *     
     */
    public void setLinkProjection(LinearShapeStructure value) {
        this.linkProjection = value;
    }

    /**
     * Ruft den Wert der roadName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Legt den Wert der roadName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Ruft den Wert der duration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Legt den Wert der duration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TrackSectionStructure withTrackSectionStart(PlaceRefStructure value) {
        setTrackSectionStart(value);
        return this;
    }

    public TrackSectionStructure withTrackSectionEnd(PlaceRefStructure value) {
        setTrackSectionEnd(value);
        return this;
    }

    public TrackSectionStructure withLinkProjection(LinearShapeStructure value) {
        setLinkProjection(value);
        return this;
    }

    public TrackSectionStructure withRoadName(String value) {
        setRoadName(value);
        return this;
    }

    public TrackSectionStructure withDuration(Duration value) {
        setDuration(value);
        return this;
    }

    public TrackSectionStructure withLength(BigInteger value) {
        setLength(value);
        return this;
    }

    public TrackSectionStructure withExtension(Object value) {
        setExtension(value);
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
