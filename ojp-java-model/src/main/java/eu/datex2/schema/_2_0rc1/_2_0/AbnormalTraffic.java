//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für AbnormalTraffic complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbnormalTraffic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="abnormalTrafficType" type="{http://datex2.eu/schema/2_0RC1/2_0}AbnormalTrafficTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="numberOfVehiclesWaiting" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="queueLength" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="relativeTrafficFlow" type="{http://datex2.eu/schema/2_0RC1/2_0}RelativeTrafficFlowEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficFlowCharacteristics" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficFlowCharacteristicsEnum" minOccurs="0"/&gt;
 *         &lt;element name="trafficTrendType" type="{http://datex2.eu/schema/2_0RC1/2_0}TrafficTrendTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="abnormalTrafficExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbnormalTraffic", propOrder = {
    "abnormalTrafficType",
    "numberOfVehiclesWaiting",
    "queueLength",
    "relativeTrafficFlow",
    "trafficFlowCharacteristics",
    "trafficTrendType",
    "abnormalTrafficExtension"
})
public class AbnormalTraffic
    extends TrafficElement {

    @XmlSchemaType(name = "string")
    protected AbnormalTrafficTypeEnum abnormalTrafficType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfVehiclesWaiting;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger queueLength;
    @XmlSchemaType(name = "string")
    protected RelativeTrafficFlowEnum relativeTrafficFlow;
    @XmlSchemaType(name = "string")
    protected TrafficFlowCharacteristicsEnum trafficFlowCharacteristics;
    @XmlSchemaType(name = "string")
    protected TrafficTrendTypeEnum trafficTrendType;
    protected ExtensionType abnormalTrafficExtension;

    /**
     * Ruft den Wert der abnormalTrafficType-Eigenschaft ab.
     *
     * @return possible object is {@link AbnormalTrafficTypeEnum }
     */
    public AbnormalTrafficTypeEnum getAbnormalTrafficType() {
        return abnormalTrafficType;
    }

    /**
     * Legt den Wert der abnormalTrafficType-Eigenschaft fest.
     *
     * @param value allowed object is {@link AbnormalTrafficTypeEnum }
     */
    public void setAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        this.abnormalTrafficType = value;
    }

    /**
     * Ruft den Wert der numberOfVehiclesWaiting-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfVehiclesWaiting() {
        return numberOfVehiclesWaiting;
    }

    /**
     * Legt den Wert der numberOfVehiclesWaiting-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfVehiclesWaiting(BigInteger value) {
        this.numberOfVehiclesWaiting = value;
    }

    /**
     * Ruft den Wert der queueLength-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getQueueLength() {
        return queueLength;
    }

    /**
     * Legt den Wert der queueLength-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setQueueLength(BigInteger value) {
        this.queueLength = value;
    }

    /**
     * Ruft den Wert der relativeTrafficFlow-Eigenschaft ab.
     *
     * @return possible object is {@link RelativeTrafficFlowEnum }
     */
    public RelativeTrafficFlowEnum getRelativeTrafficFlow() {
        return relativeTrafficFlow;
    }

    /**
     * Legt den Wert der relativeTrafficFlow-Eigenschaft fest.
     *
     * @param value allowed object is {@link RelativeTrafficFlowEnum }
     */
    public void setRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        this.relativeTrafficFlow = value;
    }

    /**
     * Ruft den Wert der trafficFlowCharacteristics-Eigenschaft ab.
     *
     * @return possible object is {@link TrafficFlowCharacteristicsEnum }
     */
    public TrafficFlowCharacteristicsEnum getTrafficFlowCharacteristics() {
        return trafficFlowCharacteristics;
    }

    /**
     * Legt den Wert der trafficFlowCharacteristics-Eigenschaft fest.
     *
     * @param value allowed object is {@link TrafficFlowCharacteristicsEnum }
     */
    public void setTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        this.trafficFlowCharacteristics = value;
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
     * Ruft den Wert der abnormalTrafficExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getAbnormalTrafficExtension() {
        return abnormalTrafficExtension;
    }

    /**
     * Legt den Wert der abnormalTrafficExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setAbnormalTrafficExtension(ExtensionType value) {
        this.abnormalTrafficExtension = value;
    }

    public AbnormalTraffic withAbnormalTrafficType(AbnormalTrafficTypeEnum value) {
        setAbnormalTrafficType(value);
        return this;
    }

    public AbnormalTraffic withNumberOfVehiclesWaiting(BigInteger value) {
        setNumberOfVehiclesWaiting(value);
        return this;
    }

    public AbnormalTraffic withQueueLength(BigInteger value) {
        setQueueLength(value);
        return this;
    }

    public AbnormalTraffic withRelativeTrafficFlow(RelativeTrafficFlowEnum value) {
        setRelativeTrafficFlow(value);
        return this;
    }

    public AbnormalTraffic withTrafficFlowCharacteristics(TrafficFlowCharacteristicsEnum value) {
        setTrafficFlowCharacteristics(value);
        return this;
    }

    public AbnormalTraffic withTrafficTrendType(TrafficTrendTypeEnum value) {
        setTrafficTrendType(value);
        return this;
    }

    public AbnormalTraffic withAbnormalTrafficExtension(ExtensionType value) {
        setAbnormalTrafficExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withTrafficElementExtension(ExtensionType value) {
        setTrafficElementExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public AbnormalTraffic withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public AbnormalTraffic withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public AbnormalTraffic withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public AbnormalTraffic withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public AbnormalTraffic withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public AbnormalTraffic withGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withNonGeneralPublicComment(Comment... values) {
        if (values != null) {
            for (Comment value : values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withNonGeneralPublicComment(Collection<Comment> values) {
        if (values != null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withUrlLink(UrlLink... values) {
        if (values != null) {
            for (UrlLink value : values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public AbnormalTraffic withUrlLink(Collection<UrlLink> values) {
        if (values != null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public AbnormalTraffic withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public AbnormalTraffic withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public AbnormalTraffic withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public AbnormalTraffic withId(String value) {
        setId(value);
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
