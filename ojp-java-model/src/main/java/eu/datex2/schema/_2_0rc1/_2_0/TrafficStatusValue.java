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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für TrafficStatusValue complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TrafficStatusValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}BasicDataValue"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trafficStatus" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficStatusEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficStatusValueExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatusValue", propOrder = {
    "trafficStatus",
    "trafficTrendType",
    "trafficStatusValueExtension"
})
public class TrafficStatusValue
    extends BasicDataValue {

    @XmlSchemaType(name = "string")
    protected TrafficStatusEnum trafficStatus;
    @XmlSchemaType(name = "string")
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType trafficStatusValueExtension;

    /**
     * Ruft den Wert der trafficStatus-Eigenschaft ab.
     *
     * @return possible object is {@link TrafficStatusEnum }
     */
    public TrafficStatusEnum getTrafficStatus() {
        return trafficStatus;
    }

    /**
     * Legt den Wert der trafficStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrafficStatusEnum }
     */
    public void setTrafficStatus(TrafficStatusEnum value) {
        this.trafficStatus = value;
    }

    /**
     * Ruft den Wert der trafficTrendType-Eigenschaft ab.
     *
     * @return possible object is {@link TrafficTrendTypeEnum }
     */
    public TrafficTrendTypeEnum getTrafficTrendType() {
        return trafficTrendType;
    }

    /**
     * Legt den Wert der trafficTrendType-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrafficTrendTypeEnum }
     */
    public void setTrafficTrendType(TrafficTrendTypeEnum value) {
        this.trafficTrendType = value;
    }

    /**
     * Ruft den Wert der trafficStatusValueExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getTrafficStatusValueExtension() {
        return trafficStatusValueExtension;
    }

    /**
     * Legt den Wert der trafficStatusValueExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setTrafficStatusValueExtension(ExtensionType value) {
        this.trafficStatusValueExtension = value;
    }

    public TrafficStatusValue withTrafficStatus(TrafficStatusEnum value) {
        setTrafficStatus(value);
        return this;
    }

    public TrafficStatusValue withTrafficTrendType(TrafficTrendTypeEnum value) {
        setTrafficTrendType(value);
        return this;
    }

    public TrafficStatusValue withTrafficStatusValueExtension(ExtensionType value) {
        setTrafficStatusValueExtension(value);
        return this;
    }

    @Override
    public TrafficStatusValue withAccuracy(Float value) {
        setAccuracy(value);
        return this;
    }

    @Override
    public TrafficStatusValue withComputationalMethod(ComputationMethodEnum value) {
        setComputationalMethod(value);
        return this;
    }

    @Override
    public TrafficStatusValue withFault(Boolean value) {
        setFault(value);
        return this;
    }

    @Override
    public TrafficStatusValue withFaultReason(MultilingualString value) {
        setFaultReason(value);
        return this;
    }

    @Override
    public TrafficStatusValue withNumberOfIncompleteInputs(BigInteger value) {
        setNumberOfIncompleteInputs(value);
        return this;
    }

    @Override
    public TrafficStatusValue withNumberOfInputValuesUsed(BigInteger value) {
        setNumberOfInputValuesUsed(value);
        return this;
    }

    @Override
    public TrafficStatusValue withPeriod(Float value) {
        setPeriod(value);
        return this;
    }

    @Override
    public TrafficStatusValue withSmoothingFactor(Float value) {
        setSmoothingFactor(value);
        return this;
    }

    @Override
    public TrafficStatusValue withStandardDeviation(Float value) {
        setStandardDeviation(value);
        return this;
    }

    @Override
    public TrafficStatusValue withSupplierCalculatedDataQuality(Float value) {
        setSupplierCalculatedDataQuality(value);
        return this;
    }

    @Override
    public TrafficStatusValue withTime(ZonedDateTime value) {
        setTime(value);
        return this;
    }

    @Override
    public TrafficStatusValue withPertinentLocation(GroupOfLocations value) {
        setPertinentLocation(value);
        return this;
    }

    @Override
    public TrafficStatusValue withBasicDataValueExtension(ExtensionType value) {
        setBasicDataValueExtension(value);
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
