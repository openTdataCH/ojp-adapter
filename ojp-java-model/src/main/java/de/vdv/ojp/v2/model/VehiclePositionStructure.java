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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.ProgressBetweenStopsStructure;

/**
 * Geographical and logical position of a vehicle.
 *
 * <p>Java-Klasse für VehiclePositionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="VehiclePositionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="Progress" type="{http://www.vdv.de/ojp}VehicleProgressEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Bearing" type="{http://www.siri.org.uk/siri}AbsoluteBearingType" minOccurs="0"/&gt;
 *         &lt;element name="ProgressBetweenStops" type="{http://www.siri.org.uk/siri}ProgressBetweenStopsStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehiclePositionStructure", propOrder = {
    "geoPosition",
    "progress",
    "bearing",
    "progressBetweenStops"
})
public class VehiclePositionStructure {

    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "Progress")
    @XmlSchemaType(name = "string")
    protected VehicleProgressEnumeration progress;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "ProgressBetweenStops")
    protected ProgressBetweenStopsStructure progressBetweenStops;

    /**
     * Ruft den Wert der geoPosition-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Legt den Wert der geoPosition-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Ruft den Wert der progress-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleProgressEnumeration }
     */
    public VehicleProgressEnumeration getProgress() {
        return progress;
    }

    /**
     * Legt den Wert der progress-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleProgressEnumeration }
     */
    public void setProgress(VehicleProgressEnumeration value) {
        this.progress = value;
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setBearing(Float value) {
        this.bearing = value;
    }

    /**
     * Ruft den Wert der progressBetweenStops-Eigenschaft ab.
     *
     * @return possible object is {@link ProgressBetweenStopsStructure }
     */
    public ProgressBetweenStopsStructure getProgressBetweenStops() {
        return progressBetweenStops;
    }

    /**
     * Legt den Wert der progressBetweenStops-Eigenschaft fest.
     *
     * @param value allowed object is {@link ProgressBetweenStopsStructure }
     */
    public void setProgressBetweenStops(ProgressBetweenStopsStructure value) {
        this.progressBetweenStops = value;
    }

    public VehiclePositionStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public VehiclePositionStructure withProgress(VehicleProgressEnumeration value) {
        setProgress(value);
        return this;
    }

    public VehiclePositionStructure withBearing(Float value) {
        setBearing(value);
        return this;
    }

    public VehiclePositionStructure withProgressBetweenStops(ProgressBetweenStopsStructure value) {
        setProgressBetweenStops(value);
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
