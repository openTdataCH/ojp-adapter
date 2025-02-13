//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Duration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;

/**
 * Type for a CHECK CONSTRAINT Hazard that can be associated with.
 *
 * <p>Java-Klasse für CheckPointStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CheckPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CheckPointId" type="{http://www.ifopt.org.uk/ifopt}CheckPointIdType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}CheckPointGroup"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}DelayGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointStructure", propOrder = {
    "checkPointId",
    "validityCondition",
    "checkPointProcess",
    "checkPointService",
    "accessFeatureType",
    "congestion",
    "facilityRef",
    "minimumLikelyDelay",
    "averageDelay",
    "maximumLikelyDelay"
})
public class CheckPointStructure {

    @XmlElement(name = "CheckPointId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String checkPointId;
    @XmlElement(name = "ValidityCondition")
    protected ValidityConditionStructure validityCondition;
    @XmlElement(name = "CheckPointProcess")
    @XmlSchemaType(name = "string")
    protected CheckPointProcessEnumeration checkPointProcess;
    @XmlElement(name = "CheckPointService")
    @XmlSchemaType(name = "string")
    protected CheckPointServiceEnumeration checkPointService;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "Congestion")
    @XmlSchemaType(name = "string")
    protected CongestionEnumeration congestion;
    @XmlElement(name = "FacilityRef")
    protected String facilityRef;
    @XmlElement(name = "MinimumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumLikelyDelay;
    @XmlElement(name = "AverageDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration averageDelay;
    @XmlElement(name = "MaximumLikelyDelay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumLikelyDelay;

    /**
     * Ruft den Wert der checkPointId-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getCheckPointId() {
        return checkPointId;
    }

    /**
     * Legt den Wert der checkPointId-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCheckPointId(String value) {
        this.checkPointId = value;
    }

    /**
     * Ruft den Wert der validityCondition-Eigenschaft ab.
     *
     * @return possible object is {@link ValidityConditionStructure }
     */
    public ValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Legt den Wert der validityCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link ValidityConditionStructure }
     */
    public void setValidityCondition(ValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Ruft den Wert der checkPointProcess-Eigenschaft ab.
     *
     * @return possible object is {@link CheckPointProcessEnumeration }
     */
    public CheckPointProcessEnumeration getCheckPointProcess() {
        return checkPointProcess;
    }

    /**
     * Legt den Wert der checkPointProcess-Eigenschaft fest.
     *
     * @param value allowed object is {@link CheckPointProcessEnumeration }
     */
    public void setCheckPointProcess(CheckPointProcessEnumeration value) {
        this.checkPointProcess = value;
    }

    /**
     * Ruft den Wert der checkPointService-Eigenschaft ab.
     *
     * @return possible object is {@link CheckPointServiceEnumeration }
     */
    public CheckPointServiceEnumeration getCheckPointService() {
        return checkPointService;
    }

    /**
     * Legt den Wert der checkPointService-Eigenschaft fest.
     *
     * @param value allowed object is {@link CheckPointServiceEnumeration }
     */
    public void setCheckPointService(CheckPointServiceEnumeration value) {
        this.checkPointService = value;
    }

    /**
     * Ruft den Wert der accessFeatureType-Eigenschaft ab.
     *
     * @return possible object is {@link AccessibilityFeatureEnumeration }
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Legt den Wert der accessFeatureType-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessibilityFeatureEnumeration }
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Ruft den Wert der congestion-Eigenschaft ab.
     *
     * @return possible object is {@link CongestionEnumeration }
     */
    public CongestionEnumeration getCongestion() {
        return congestion;
    }

    /**
     * Legt den Wert der congestion-Eigenschaft fest.
     *
     * @param value allowed object is {@link CongestionEnumeration }
     */
    public void setCongestion(CongestionEnumeration value) {
        this.congestion = value;
    }

    /**
     * Ruft den Wert der facilityRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFacilityRef() {
        return facilityRef;
    }

    /**
     * Legt den Wert der facilityRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFacilityRef(String value) {
        this.facilityRef = value;
    }

    /**
     * Ruft den Wert der minimumLikelyDelay-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMinimumLikelyDelay() {
        return minimumLikelyDelay;
    }

    /**
     * Legt den Wert der minimumLikelyDelay-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMinimumLikelyDelay(Duration value) {
        this.minimumLikelyDelay = value;
    }

    /**
     * Ruft den Wert der averageDelay-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getAverageDelay() {
        return averageDelay;
    }

    /**
     * Legt den Wert der averageDelay-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAverageDelay(Duration value) {
        this.averageDelay = value;
    }

    /**
     * Ruft den Wert der maximumLikelyDelay-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getMaximumLikelyDelay() {
        return maximumLikelyDelay;
    }

    /**
     * Legt den Wert der maximumLikelyDelay-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMaximumLikelyDelay(Duration value) {
        this.maximumLikelyDelay = value;
    }

    public CheckPointStructure withCheckPointId(String value) {
        setCheckPointId(value);
        return this;
    }

    public CheckPointStructure withValidityCondition(ValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public CheckPointStructure withCheckPointProcess(CheckPointProcessEnumeration value) {
        setCheckPointProcess(value);
        return this;
    }

    public CheckPointStructure withCheckPointService(CheckPointServiceEnumeration value) {
        setCheckPointService(value);
        return this;
    }

    public CheckPointStructure withAccessFeatureType(AccessibilityFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public CheckPointStructure withCongestion(CongestionEnumeration value) {
        setCongestion(value);
        return this;
    }

    public CheckPointStructure withFacilityRef(String value) {
        setFacilityRef(value);
        return this;
    }

    public CheckPointStructure withMinimumLikelyDelay(Duration value) {
        setMinimumLikelyDelay(value);
        return this;
    }

    public CheckPointStructure withAverageDelay(Duration value) {
        setAverageDelay(value);
        return this;
    }

    public CheckPointStructure withMaximumLikelyDelay(Duration value) {
        setMaximumLikelyDelay(value);
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
