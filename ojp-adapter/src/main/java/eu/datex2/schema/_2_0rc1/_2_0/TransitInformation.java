//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für TransitInformation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TransitInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NonRoadEventInformation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="journeyDestination" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="journeyOrigin" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="journeyReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="transitServiceInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}TransitServiceInformationEnum"/&gt;
 *         &lt;element name="transitServiceType" type="{http://datex2.eu/schema/2_0RC1/2_0}TransitServiceTypeEnum"/&gt;
 *         &lt;element name="scheduledDepartureTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="transitInformationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitInformation", propOrder = {
    "journeyDestination",
    "journeyOrigin",
    "journeyReference",
    "transitServiceInformation",
    "transitServiceType",
    "scheduledDepartureTime",
    "transitInformationExtension"
})
public class TransitInformation
    extends NonRoadEventInformation
{

    protected MultilingualString journeyDestination;
    protected MultilingualString journeyOrigin;
    protected String journeyReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransitServiceInformationEnum transitServiceInformation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TransitServiceTypeEnum transitServiceType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime scheduledDepartureTime;
    protected ExtensionType transitInformationExtension;

    /**
     * Ruft den Wert der journeyDestination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyDestination() {
        return journeyDestination;
    }

    /**
     * Legt den Wert der journeyDestination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyDestination(MultilingualString value) {
        this.journeyDestination = value;
    }

    /**
     * Ruft den Wert der journeyOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getJourneyOrigin() {
        return journeyOrigin;
    }

    /**
     * Legt den Wert der journeyOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setJourneyOrigin(MultilingualString value) {
        this.journeyOrigin = value;
    }

    /**
     * Ruft den Wert der journeyReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyReference() {
        return journeyReference;
    }

    /**
     * Legt den Wert der journeyReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyReference(String value) {
        this.journeyReference = value;
    }

    /**
     * Ruft den Wert der transitServiceInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public TransitServiceInformationEnum getTransitServiceInformation() {
        return transitServiceInformation;
    }

    /**
     * Legt den Wert der transitServiceInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceInformationEnum }
     *     
     */
    public void setTransitServiceInformation(TransitServiceInformationEnum value) {
        this.transitServiceInformation = value;
    }

    /**
     * Ruft den Wert der transitServiceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public TransitServiceTypeEnum getTransitServiceType() {
        return transitServiceType;
    }

    /**
     * Legt den Wert der transitServiceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitServiceTypeEnum }
     *     
     */
    public void setTransitServiceType(TransitServiceTypeEnum value) {
        this.transitServiceType = value;
    }

    /**
     * Ruft den Wert der scheduledDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getScheduledDepartureTime() {
        return scheduledDepartureTime;
    }

    /**
     * Legt den Wert der scheduledDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduledDepartureTime(ZonedDateTime value) {
        this.scheduledDepartureTime = value;
    }

    /**
     * Ruft den Wert der transitInformationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTransitInformationExtension() {
        return transitInformationExtension;
    }

    /**
     * Legt den Wert der transitInformationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTransitInformationExtension(ExtensionType value) {
        this.transitInformationExtension = value;
    }

    public TransitInformation withJourneyDestination(MultilingualString value) {
        setJourneyDestination(value);
        return this;
    }

    public TransitInformation withJourneyOrigin(MultilingualString value) {
        setJourneyOrigin(value);
        return this;
    }

    public TransitInformation withJourneyReference(String value) {
        setJourneyReference(value);
        return this;
    }

    public TransitInformation withTransitServiceInformation(TransitServiceInformationEnum value) {
        setTransitServiceInformation(value);
        return this;
    }

    public TransitInformation withTransitServiceType(TransitServiceTypeEnum value) {
        setTransitServiceType(value);
        return this;
    }

    public TransitInformation withScheduledDepartureTime(ZonedDateTime value) {
        setScheduledDepartureTime(value);
        return this;
    }

    public TransitInformation withTransitInformationExtension(ExtensionType value) {
        setTransitInformationExtension(value);
        return this;
    }

    @Override
    public TransitInformation withNonRoadEventInformationExtension(ExtensionType value) {
        setNonRoadEventInformationExtension(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordCreationReference(String value) {
        setSituationRecordCreationReference(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordCreationTime(ZonedDateTime value) {
        setSituationRecordCreationTime(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordObservationTime(ZonedDateTime value) {
        setSituationRecordObservationTime(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordVersion(BigInteger value) {
        setSituationRecordVersion(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordVersionTime(ZonedDateTime value) {
        setSituationRecordVersionTime(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordFirstSupplierVersionTime(ZonedDateTime value) {
        setSituationRecordFirstSupplierVersionTime(value);
        return this;
    }

    @Override
    public TransitInformation withConfidentialityOverride(ConfidentialityValueEnum value) {
        setConfidentialityOverride(value);
        return this;
    }

    @Override
    public TransitInformation withProbabilityOfOccurrence(ProbabilityOfOccurrenceEnum value) {
        setProbabilityOfOccurrence(value);
        return this;
    }

    @Override
    public TransitInformation withSource(Source value) {
        setSource(value);
        return this;
    }

    @Override
    public TransitInformation withValidity(Validity value) {
        setValidity(value);
        return this;
    }

    @Override
    public TransitInformation withImpact(Impact value) {
        setImpact(value);
        return this;
    }

    @Override
    public TransitInformation withCause(Cause value) {
        setCause(value);
        return this;
    }

    @Override
    public TransitInformation withGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public TransitInformation withGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public TransitInformation withNonGeneralPublicComment(Comment... values) {
        if (values!= null) {
            for (Comment value: values) {
                getNonGeneralPublicComment().add(value);
            }
        }
        return this;
    }

    @Override
    public TransitInformation withNonGeneralPublicComment(Collection<Comment> values) {
        if (values!= null) {
            getNonGeneralPublicComment().addAll(values);
        }
        return this;
    }

    @Override
    public TransitInformation withUrlLink(UrlLink... values) {
        if (values!= null) {
            for (UrlLink value: values) {
                getUrlLink().add(value);
            }
        }
        return this;
    }

    @Override
    public TransitInformation withUrlLink(Collection<UrlLink> values) {
        if (values!= null) {
            getUrlLink().addAll(values);
        }
        return this;
    }

    @Override
    public TransitInformation withGroupOfLocations(GroupOfLocations value) {
        setGroupOfLocations(value);
        return this;
    }

    @Override
    public TransitInformation withManagement(Management value) {
        setManagement(value);
        return this;
    }

    @Override
    public TransitInformation withSituationRecordExtension(ExtensionType value) {
        setSituationRecordExtension(value);
        return this;
    }

    @Override
    public TransitInformation withId(String value) {
        setId(value);
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
