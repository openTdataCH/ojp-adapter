//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

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
 * VIA restrictions for a TRIP.
 *
 * <p>Java-Klasse für TripViaStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TripViaStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViaPoint" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="DwellTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripViaStructure", propOrder = {
    "viaPoint",
    "dwellTime"
})
public class TripViaStructure {

    @XmlElement(name = "ViaPoint", required = true)
    protected PlaceRefStructure viaPoint;
    @XmlElement(name = "DwellTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration dwellTime;

    /**
     * Ruft den Wert der viaPoint-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceRefStructure }
     */
    public PlaceRefStructure getViaPoint() {
        return viaPoint;
    }

    /**
     * Legt den Wert der viaPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceRefStructure }
     */
    public void setViaPoint(PlaceRefStructure value) {
        this.viaPoint = value;
    }

    /**
     * Ruft den Wert der dwellTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getDwellTime() {
        return dwellTime;
    }

    /**
     * Legt den Wert der dwellTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDwellTime(Duration value) {
        this.dwellTime = value;
    }

    public TripViaStructure withViaPoint(PlaceRefStructure value) {
        setViaPoint(value);
        return this;
    }

    public TripViaStructure withDwellTime(Duration value) {
        setDwellTime(value);
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
