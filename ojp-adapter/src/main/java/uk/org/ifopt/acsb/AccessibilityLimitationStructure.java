//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.Extensions;
import uk.org.ifopt.ifopt.ValidityConditionStructure;


/**
 * Type for limitation on navigation.
 * 
 * <p>Java-Klasse für AccessibilityLimitationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AccessibilityLimitationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LimitationId" type="{http://www.ifopt.org.uk/acsb}LimitationIdType" minOccurs="0"/&gt;
 *         &lt;element name="ValidityCondition" type="{http://www.ifopt.org.uk/ifopt}ValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/&gt;
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityLimitationStructure", propOrder = {
    "limitationId",
    "validityCondition",
    "wheelchairAccess",
    "stepFreeAccess",
    "escalatorFreeAccess",
    "liftFreeAccess",
    "audibleSignalsAvailable",
    "visualSignsAvailable",
    "extensions"
})
public class AccessibilityLimitationStructure {

    @XmlElement(name = "LimitationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String limitationId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "WheelchairAccess", required = true, defaultValue = "false")
    protected AccessibilityStructure wheelchairAccess;
    @XmlElement(name = "StepFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure stepFreeAccess;
    @XmlElement(name = "EscalatorFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure escalatorFreeAccess;
    @XmlElement(name = "LiftFreeAccess", defaultValue = "unknown")
    protected AccessibilityStructure liftFreeAccess;
    @XmlElement(name = "AudibleSignalsAvailable", defaultValue = "false")
    protected AccessibilityStructure audibleSignalsAvailable;
    @XmlElement(name = "VisualSignsAvailable", defaultValue = "unknown")
    protected AccessibilityStructure visualSignsAvailable;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/ifopt")
    protected Extensions extensions;

    /**
     * Ruft den Wert der limitationId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitationId() {
        return limitationId;
    }

    /**
     * Legt den Wert der limitationId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitationId(String value) {
        this.limitationId = value;
    }

    /**
     * Ruft den Wert der validityCondition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Legt den Wert der validityCondition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityConditionStructure }
     *     
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Ruft den Wert der wheelchairAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getWheelchairAccess() {
        return wheelchairAccess;
    }

    /**
     * Legt den Wert der wheelchairAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setWheelchairAccess(AccessibilityStructure value) {
        this.wheelchairAccess = value;
    }

    /**
     * Ruft den Wert der stepFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getStepFreeAccess() {
        return stepFreeAccess;
    }

    /**
     * Legt den Wert der stepFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setStepFreeAccess(AccessibilityStructure value) {
        this.stepFreeAccess = value;
    }

    /**
     * Ruft den Wert der escalatorFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getEscalatorFreeAccess() {
        return escalatorFreeAccess;
    }

    /**
     * Legt den Wert der escalatorFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setEscalatorFreeAccess(AccessibilityStructure value) {
        this.escalatorFreeAccess = value;
    }

    /**
     * Ruft den Wert der liftFreeAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getLiftFreeAccess() {
        return liftFreeAccess;
    }

    /**
     * Legt den Wert der liftFreeAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setLiftFreeAccess(AccessibilityStructure value) {
        this.liftFreeAccess = value;
    }

    /**
     * Whether a PLACE / SITE ELEMENT has Audible signals for the visually impaired. Default is 'false'.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getAudibleSignalsAvailable() {
        return audibleSignalsAvailable;
    }

    /**
     * Legt den Wert der audibleSignalsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setAudibleSignalsAvailable(AccessibilityStructure value) {
        this.audibleSignalsAvailable = value;
    }

    /**
     * Whether a PLACE / SITE ELEMENT has Visual signals for the hearing impaired. Default is 'unknown'.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityStructure }
     *     
     */
    public AccessibilityStructure getVisualSignsAvailable() {
        return visualSignsAvailable;
    }

    /**
     * Legt den Wert der visualSignsAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityStructure }
     *     
     */
    public void setVisualSignsAvailable(AccessibilityStructure value) {
        this.visualSignsAvailable = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public AccessibilityLimitationStructure withLimitationId(String value) {
        setLimitationId(value);
        return this;
    }

    public AccessibilityLimitationStructure withValidityCondition(ValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public AccessibilityLimitationStructure withWheelchairAccess(AccessibilityStructure value) {
        setWheelchairAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withStepFreeAccess(AccessibilityStructure value) {
        setStepFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withEscalatorFreeAccess(AccessibilityStructure value) {
        setEscalatorFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withLiftFreeAccess(AccessibilityStructure value) {
        setLiftFreeAccess(value);
        return this;
    }

    public AccessibilityLimitationStructure withAudibleSignalsAvailable(AccessibilityStructure value) {
        setAudibleSignalsAvailable(value);
        return this;
    }

    public AccessibilityLimitationStructure withVisualSignsAvailable(AccessibilityStructure value) {
        setVisualSignsAvailable(value);
        return this;
    }

    public AccessibilityLimitationStructure withExtensions(Extensions value) {
        setExtensions(value);
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
