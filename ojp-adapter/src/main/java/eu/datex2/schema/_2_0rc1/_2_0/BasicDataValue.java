//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für BasicDataValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BasicDataValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accuracy" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="computationalMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="fault" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="faultReason" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="numberOfIncompleteInputs" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="numberOfInputValuesUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="smoothingFactor" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="standardDeviation" type="{http://datex2.eu/schema/2_0RC1/2_0}Float" minOccurs="0"/&gt;
 *         &lt;element name="supplierCalculatedDataQuality" type="{http://datex2.eu/schema/2_0RC1/2_0}Percentage" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="pertinentLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}GroupOfLocations" minOccurs="0"/&gt;
 *         &lt;element name="basicDataValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicDataValue", propOrder = {
    "accuracy",
    "computationalMethod",
    "fault",
    "faultReason",
    "numberOfIncompleteInputs",
    "numberOfInputValuesUsed",
    "period",
    "smoothingFactor",
    "standardDeviation",
    "supplierCalculatedDataQuality",
    "time",
    "pertinentLocation",
    "basicDataValueExtension"
})
@XmlSeeAlso({
    TrafficStatusValue.class,
    TrafficValue.class,
    TravelTimeValue.class,
    WeatherValue.class
})
public abstract class BasicDataValue {

    protected Float accuracy;
    @XmlSchemaType(name = "string")
    protected ComputationMethodEnum computationalMethod;
    protected Boolean fault;
    protected MultilingualString faultReason;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfIncompleteInputs;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfInputValuesUsed;
    protected Float period;
    protected Float smoothingFactor;
    protected Float standardDeviation;
    protected Float supplierCalculatedDataQuality;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime time;
    protected GroupOfLocations pertinentLocation;
    protected ExtensionType basicDataValueExtension;

    /**
     * Ruft den Wert der accuracy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Legt den Wert der accuracy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    /**
     * Ruft den Wert der computationalMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationalMethod() {
        return computationalMethod;
    }

    /**
     * Legt den Wert der computationalMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationalMethod(ComputationMethodEnum value) {
        this.computationalMethod = value;
    }

    /**
     * Ruft den Wert der fault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFault() {
        return fault;
    }

    /**
     * Legt den Wert der fault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFault(Boolean value) {
        this.fault = value;
    }

    /**
     * Ruft den Wert der faultReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getFaultReason() {
        return faultReason;
    }

    /**
     * Legt den Wert der faultReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setFaultReason(MultilingualString value) {
        this.faultReason = value;
    }

    /**
     * Ruft den Wert der numberOfIncompleteInputs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfIncompleteInputs() {
        return numberOfIncompleteInputs;
    }

    /**
     * Legt den Wert der numberOfIncompleteInputs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfIncompleteInputs(BigInteger value) {
        this.numberOfIncompleteInputs = value;
    }

    /**
     * Ruft den Wert der numberOfInputValuesUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfInputValuesUsed() {
        return numberOfInputValuesUsed;
    }

    /**
     * Legt den Wert der numberOfInputValuesUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfInputValuesUsed(BigInteger value) {
        this.numberOfInputValuesUsed = value;
    }

    /**
     * Ruft den Wert der period-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriod() {
        return period;
    }

    /**
     * Legt den Wert der period-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriod(Float value) {
        this.period = value;
    }

    /**
     * Ruft den Wert der smoothingFactor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmoothingFactor() {
        return smoothingFactor;
    }

    /**
     * Legt den Wert der smoothingFactor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmoothingFactor(Float value) {
        this.smoothingFactor = value;
    }

    /**
     * Ruft den Wert der standardDeviation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStandardDeviation() {
        return standardDeviation;
    }

    /**
     * Legt den Wert der standardDeviation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStandardDeviation(Float value) {
        this.standardDeviation = value;
    }

    /**
     * Ruft den Wert der supplierCalculatedDataQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSupplierCalculatedDataQuality() {
        return supplierCalculatedDataQuality;
    }

    /**
     * Legt den Wert der supplierCalculatedDataQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSupplierCalculatedDataQuality(Float value) {
        this.supplierCalculatedDataQuality = value;
    }

    /**
     * Ruft den Wert der time-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTime() {
        return time;
    }

    /**
     * Legt den Wert der time-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(ZonedDateTime value) {
        this.time = value;
    }

    /**
     * Ruft den Wert der pertinentLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GroupOfLocations }
     *     
     */
    public GroupOfLocations getPertinentLocation() {
        return pertinentLocation;
    }

    /**
     * Legt den Wert der pertinentLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupOfLocations }
     *     
     */
    public void setPertinentLocation(GroupOfLocations value) {
        this.pertinentLocation = value;
    }

    /**
     * Ruft den Wert der basicDataValueExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getBasicDataValueExtension() {
        return basicDataValueExtension;
    }

    /**
     * Legt den Wert der basicDataValueExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setBasicDataValueExtension(ExtensionType value) {
        this.basicDataValueExtension = value;
    }

    public BasicDataValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    public BasicDataValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    public BasicDataValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    public BasicDataValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    public BasicDataValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    public BasicDataValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    public BasicDataValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    public BasicDataValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    public BasicDataValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    public BasicDataValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    public BasicDataValue withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    public BasicDataValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    public BasicDataValue withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
