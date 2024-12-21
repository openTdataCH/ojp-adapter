//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * A planned SERVICE JOURNEY INTERCHANGE between two journeys. (since SIRI 2.0)
 * 
 * <p>Java-Klasse für AbstractServiceJourneyInterchangeStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AbstractServiceJourneyInterchangeStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}InterchangeCode" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}InterchangeRef" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ConnectionLinkRef" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}ExtraInterchange" minOccurs="0"/&gt;
 *           &lt;element name="Cancellation" type="{http://www.siri.org.uk/siri}InterchangeCancellation" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReasonForRemoval" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederArrivalStopRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederVisitNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FeederStopOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedArrivalTimeOfFeeder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorDepartureStopRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorVisitNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DistributorStopOrder" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedDepartureTimeOfDistributor" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangePropertyGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}InterchangeTimesGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractServiceJourneyInterchangeStructure", propOrder = {
    "interchangeCode",
    "interchangeRef",
    "connectionLinkRef",
    "extraInterchange",
    "cancellation",
    "reasonForRemoval",
    "feederRef",
    "feederArrivalStopRef",
    "feederVisitNumber",
    "feederStopOrder",
    "aimedArrivalTimeOfFeeder",
    "distributorRef",
    "distributorDepartureStopRef",
    "distributorVisitNumber",
    "distributorStopOrder",
    "aimedDepartureTimeOfDistributor",
    "staySeated",
    "guaranteed",
    "advertised",
    "standardWaitTime",
    "maximumWaitTime",
    "maximumAutomaticWaitTime",
    "standardTransferTime",
    "minimumTransferTime",
    "maximumTransferTime",
    "extensions"
})
@XmlSeeAlso({
    FromServiceJourneyInterchangeStructure.class,
    ToServiceJourneyInterchangeStructure.class,
    ServiceJourneyInterchangeStructure.class,
    RemovedServiceJourneyInterchangeStructure.class
})
public abstract class AbstractServiceJourneyInterchangeStructure {

    @XmlElement(name = "InterchangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String interchangeCode;
    @XmlElement(name = "InterchangeRef")
    protected InterchangeRefStructure interchangeRef;
    @XmlElement(name = "ConnectionLinkRef")
    protected ConnectionLinkRefStructure connectionLinkRef;
    @XmlElement(name = "ExtraInterchange", defaultValue = "false")
    protected Boolean extraInterchange;
    @XmlElement(name = "Cancellation", defaultValue = "false")
    protected Boolean cancellation;
    @XmlElement(name = "ReasonForRemoval")
    protected NaturalLanguageStringStructure reasonForRemoval;
    @XmlElement(name = "FeederRef")
    protected ConnectingJourneyRefStructure feederRef;
    @XmlElement(name = "FeederArrivalStopRef")
    protected StopPointRefStructure feederArrivalStopRef;
    @XmlElement(name = "FeederVisitNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger feederVisitNumber;
    @XmlElement(name = "FeederStopOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger feederStopOrder;
    @XmlElement(name = "AimedArrivalTimeOfFeeder", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTimeOfFeeder;
    @XmlElement(name = "DistributorRef")
    protected ConnectingJourneyRefStructure distributorRef;
    @XmlElement(name = "DistributorDepartureStopRef")
    protected StopPointRefStructure distributorDepartureStopRef;
    @XmlElement(name = "DistributorVisitNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorVisitNumber;
    @XmlElement(name = "DistributorStopOrder")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger distributorStopOrder;
    @XmlElement(name = "AimedDepartureTimeOfDistributor", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTimeOfDistributor;
    @XmlElement(name = "StaySeated", defaultValue = "false")
    protected Boolean staySeated;
    @XmlElement(name = "Guaranteed", defaultValue = "false")
    protected Boolean guaranteed;
    @XmlElement(name = "Advertised", defaultValue = "false")
    protected Boolean advertised;
    @XmlElement(name = "StandardWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardWaitTime;
    @XmlElement(name = "MaximumWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumWaitTime;
    @XmlElement(name = "MaximumAutomaticWaitTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumAutomaticWaitTime;
    @XmlElement(name = "StandardTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration standardTransferTime;
    @XmlElement(name = "MinimumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration minimumTransferTime;
    @XmlElement(name = "MaximumTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration maximumTransferTime;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der interchangeCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeCode() {
        return interchangeCode;
    }

    /**
     * Legt den Wert der interchangeCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeCode(String value) {
        this.interchangeCode = value;
    }

    /**
     * Ruft den Wert der interchangeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public InterchangeRefStructure getInterchangeRef() {
        return interchangeRef;
    }

    /**
     * Legt den Wert der interchangeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InterchangeRefStructure }
     *     
     */
    public void setInterchangeRef(InterchangeRefStructure value) {
        this.interchangeRef = value;
    }

    /**
     * Ruft den Wert der connectionLinkRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public ConnectionLinkRefStructure getConnectionLinkRef() {
        return connectionLinkRef;
    }

    /**
     * Legt den Wert der connectionLinkRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionLinkRefStructure }
     *     
     */
    public void setConnectionLinkRef(ConnectionLinkRefStructure value) {
        this.connectionLinkRef = value;
    }

    /**
     * Ruft den Wert der extraInterchange-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraInterchange() {
        return extraInterchange;
    }

    /**
     * Legt den Wert der extraInterchange-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraInterchange(Boolean value) {
        this.extraInterchange = value;
    }

    /**
     * Ruft den Wert der cancellation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Legt den Wert der cancellation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
    }

    /**
     * Ruft den Wert der reasonForRemoval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getReasonForRemoval() {
        return reasonForRemoval;
    }

    /**
     * Legt den Wert der reasonForRemoval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setReasonForRemoval(NaturalLanguageStringStructure value) {
        this.reasonForRemoval = value;
    }

    /**
     * Ruft den Wert der feederRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getFeederRef() {
        return feederRef;
    }

    /**
     * Legt den Wert der feederRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setFeederRef(ConnectingJourneyRefStructure value) {
        this.feederRef = value;
    }

    /**
     * Ruft den Wert der feederArrivalStopRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getFeederArrivalStopRef() {
        return feederArrivalStopRef;
    }

    /**
     * Legt den Wert der feederArrivalStopRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setFeederArrivalStopRef(StopPointRefStructure value) {
        this.feederArrivalStopRef = value;
    }

    /**
     * Ruft den Wert der feederVisitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeederVisitNumber() {
        return feederVisitNumber;
    }

    /**
     * Legt den Wert der feederVisitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeederVisitNumber(BigInteger value) {
        this.feederVisitNumber = value;
    }

    /**
     * Ruft den Wert der feederStopOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFeederStopOrder() {
        return feederStopOrder;
    }

    /**
     * Legt den Wert der feederStopOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFeederStopOrder(BigInteger value) {
        this.feederStopOrder = value;
    }

    /**
     * Ruft den Wert der aimedArrivalTimeOfFeeder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTimeOfFeeder() {
        return aimedArrivalTimeOfFeeder;
    }

    /**
     * Legt den Wert der aimedArrivalTimeOfFeeder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        this.aimedArrivalTimeOfFeeder = value;
    }

    /**
     * Ruft den Wert der distributorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public ConnectingJourneyRefStructure getDistributorRef() {
        return distributorRef;
    }

    /**
     * Legt den Wert der distributorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectingJourneyRefStructure }
     *     
     */
    public void setDistributorRef(ConnectingJourneyRefStructure value) {
        this.distributorRef = value;
    }

    /**
     * Ruft den Wert der distributorDepartureStopRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDistributorDepartureStopRef() {
        return distributorDepartureStopRef;
    }

    /**
     * Legt den Wert der distributorDepartureStopRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDistributorDepartureStopRef(StopPointRefStructure value) {
        this.distributorDepartureStopRef = value;
    }

    /**
     * Ruft den Wert der distributorVisitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorVisitNumber() {
        return distributorVisitNumber;
    }

    /**
     * Legt den Wert der distributorVisitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorVisitNumber(BigInteger value) {
        this.distributorVisitNumber = value;
    }

    /**
     * Ruft den Wert der distributorStopOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistributorStopOrder() {
        return distributorStopOrder;
    }

    /**
     * Legt den Wert der distributorStopOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistributorStopOrder(BigInteger value) {
        this.distributorStopOrder = value;
    }

    /**
     * Ruft den Wert der aimedDepartureTimeOfDistributor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTimeOfDistributor() {
        return aimedDepartureTimeOfDistributor;
    }

    /**
     * Legt den Wert der aimedDepartureTimeOfDistributor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        this.aimedDepartureTimeOfDistributor = value;
    }

    /**
     * Ruft den Wert der staySeated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStaySeated() {
        return staySeated;
    }

    /**
     * Legt den Wert der staySeated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStaySeated(Boolean value) {
        this.staySeated = value;
    }

    /**
     * Ruft den Wert der guaranteed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteed() {
        return guaranteed;
    }

    /**
     * Legt den Wert der guaranteed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteed(Boolean value) {
        this.guaranteed = value;
    }

    /**
     * Ruft den Wert der advertised-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvertised() {
        return advertised;
    }

    /**
     * Legt den Wert der advertised-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvertised(Boolean value) {
        this.advertised = value;
    }

    /**
     * Ruft den Wert der standardWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getStandardWaitTime() {
        return standardWaitTime;
    }

    /**
     * Legt den Wert der standardWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardWaitTime(Duration value) {
        this.standardWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumWaitTime() {
        return maximumWaitTime;
    }

    /**
     * Legt den Wert der maximumWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumWaitTime(Duration value) {
        this.maximumWaitTime = value;
    }

    /**
     * Ruft den Wert der maximumAutomaticWaitTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumAutomaticWaitTime() {
        return maximumAutomaticWaitTime;
    }

    /**
     * Legt den Wert der maximumAutomaticWaitTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAutomaticWaitTime(Duration value) {
        this.maximumAutomaticWaitTime = value;
    }

    /**
     * Ruft den Wert der standardTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getStandardTransferTime() {
        return standardTransferTime;
    }

    /**
     * Legt den Wert der standardTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardTransferTime(Duration value) {
        this.standardTransferTime = value;
    }

    /**
     * Ruft den Wert der minimumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMinimumTransferTime() {
        return minimumTransferTime;
    }

    /**
     * Legt den Wert der minimumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumTransferTime(Duration value) {
        this.minimumTransferTime = value;
    }

    /**
     * Ruft den Wert der maximumTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getMaximumTransferTime() {
        return maximumTransferTime;
    }

    /**
     * Legt den Wert der maximumTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumTransferTime(Duration value) {
        this.maximumTransferTime = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AbstractServiceJourneyInterchangeStructure withInterchangeCode(String value) {
        setInterchangeCode(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withInterchangeRef(InterchangeRefStructure value) {
        setInterchangeRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withConnectionLinkRef(ConnectionLinkRefStructure value) {
        setConnectionLinkRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withExtraInterchange(Boolean value) {
        setExtraInterchange(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withReasonForRemoval(NaturalLanguageStringStructure value) {
        setReasonForRemoval(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withFeederRef(ConnectingJourneyRefStructure value) {
        setFeederRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withFeederArrivalStopRef(StopPointRefStructure value) {
        setFeederArrivalStopRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withFeederVisitNumber(BigInteger value) {
        setFeederVisitNumber(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withFeederStopOrder(BigInteger value) {
        setFeederStopOrder(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withAimedArrivalTimeOfFeeder(ZonedDateTime value) {
        setAimedArrivalTimeOfFeeder(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withDistributorRef(ConnectingJourneyRefStructure value) {
        setDistributorRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withDistributorDepartureStopRef(StopPointRefStructure value) {
        setDistributorDepartureStopRef(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withDistributorVisitNumber(BigInteger value) {
        setDistributorVisitNumber(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withDistributorStopOrder(BigInteger value) {
        setDistributorStopOrder(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withAimedDepartureTimeOfDistributor(ZonedDateTime value) {
        setAimedDepartureTimeOfDistributor(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withStaySeated(Boolean value) {
        setStaySeated(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withGuaranteed(Boolean value) {
        setGuaranteed(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withAdvertised(Boolean value) {
        setAdvertised(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withStandardWaitTime(Duration value) {
        setStandardWaitTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withMaximumWaitTime(Duration value) {
        setMaximumWaitTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withMaximumAutomaticWaitTime(Duration value) {
        setMaximumAutomaticWaitTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withStandardTransferTime(Duration value) {
        setStandardTransferTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withMinimumTransferTime(Duration value) {
        setMinimumTransferTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withMaximumTransferTime(Duration value) {
        setMaximumTransferTime(value);
        return this;
    }

    public AbstractServiceJourneyInterchangeStructure withExtensions(ExtensionsStructure value) {
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
