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
 * indication of the walk distance and time to a nearby stop where relevant.
 * 
 * <p>Java-Klasse für CallAtNearStopStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CallAtNearStopStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallAtStop" type="{http://www.vdv.de/ojp}CallAtStopStructure"/&gt;
 *         &lt;element name="WalkDistance" type="{http://www.siri.org.uk/siri}DistanceType" minOccurs="0"/&gt;
 *         &lt;element name="WalkDuration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallAtNearStopStructure", propOrder = {
    "callAtStop",
    "walkDistance",
    "walkDuration"
})
public class CallAtNearStopStructure {

    @XmlElement(name = "CallAtStop", required = true)
    protected CallAtStopStructure callAtStop;
    @XmlElement(name = "WalkDistance")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger walkDistance;
    @XmlElement(name = "WalkDuration", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration walkDuration;

    /**
     * Ruft den Wert der callAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallAtStopStructure }
     *     
     */
    public CallAtStopStructure getCallAtStop() {
        return callAtStop;
    }

    /**
     * Legt den Wert der callAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallAtStopStructure }
     *     
     */
    public void setCallAtStop(CallAtStopStructure value) {
        this.callAtStop = value;
    }

    /**
     * Ruft den Wert der walkDistance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkDistance() {
        return walkDistance;
    }

    /**
     * Legt den Wert der walkDistance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkDistance(BigInteger value) {
        this.walkDistance = value;
    }

    /**
     * Ruft den Wert der walkDuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getWalkDuration() {
        return walkDuration;
    }

    /**
     * Legt den Wert der walkDuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWalkDuration(Duration value) {
        this.walkDuration = value;
    }

    public CallAtNearStopStructure withCallAtStop(CallAtStopStructure value) {
        setCallAtStop(value);
        return this;
    }

    public CallAtNearStopStructure withWalkDistance(BigInteger value) {
        setWalkDistance(value);
        return this;
    }

    public CallAtNearStopStructure withWalkDuration(Duration value) {
        setWalkDuration(value);
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
