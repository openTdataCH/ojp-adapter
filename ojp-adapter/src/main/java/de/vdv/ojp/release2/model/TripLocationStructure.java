//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.LineRefStructure;


/**
 * A trip location represents the current logical position of a journey service. It can be used similarly to a place e.g., for starting a new trip request from within this service. A trip location does not(!) describe the relative position of a traveller within a vehicle, e.g., the seat.
 * 
 * <p>Java-Klasse für TripLocationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripLocationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}OperatingDayRef"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}JourneyRef"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineIdentityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripLocationStructure", propOrder = {
    "operatingDayRef",
    "journeyRef",
    "lineRef",
    "directionRef"
})
public class TripLocationStructure {

    @XmlElement(name = "OperatingDayRef", required = true)
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "JourneyRef", required = true)
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected DirectionRefStructure directionRef;

    /**
     * Ruft den Wert der operatingDayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Legt den Wert der operatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setJourneyRef(JourneyRefStructure value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    public TripLocationStructure withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    public TripLocationStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public TripLocationStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public TripLocationStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
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
