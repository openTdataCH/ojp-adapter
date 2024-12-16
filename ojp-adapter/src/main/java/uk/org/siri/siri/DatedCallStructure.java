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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for Planned VEHICLE JOURNEY Stop (Production Timetable Service).
 * 
 * <p>Java-Klasse für DatedCallStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatedCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}StopPointInSequenceGroup"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ExtraCall" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element name="Cancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/&gt;
 *         &lt;element name="CallNote" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AimedCallGroup"/&gt;
 *         &lt;element name="TargetedInterchange" type="{http://www.siri.org.uk/siri}TargetedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromServiceJourneyInterchange" type="{http://www.siri.org.uk/siri}FromServiceJourneyInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ToServiceJourneyInterchange" type="{http://www.siri.org.uk/siri}ToServiceJourneyInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DatedCallStructure", propOrder = {
    "stopPointRef",
    "visitNumber",
    "order",
    "stopPointName",
    "extraCall",
    "cancellation",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "callNote",
    "aimedArrivalTime",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalFormationAssignment",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureFormationAssignment",
    "departureOperatorRefs",
    "aimedLatestPassengerAccessTime",
    "aimedHeadwayInterval",
    "targetedInterchange",
    "fromServiceJourneyInterchange",
    "toServiceJourneyInterchange",
    "extensions"
})
public class DatedCallStructure {

    @XmlElement(name = "StopPointRef", required = true)
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "VisitNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger visitNumber;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "ExtraCall", defaultValue = "false")
    protected Boolean extraCall;
    @XmlElement(name = "Cancellation", defaultValue = "false")
    protected Boolean cancellation;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "BoardingStretch", defaultValue = "false")
    protected Boolean boardingStretch;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "OriginDisplay")
    protected List<NaturalLanguageStringStructure> originDisplay;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "CallNote")
    protected List<NaturalLanguageStringStructure> callNote;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected List<PlannedStopAssignmentStructure> arrivalStopAssignment;
    @XmlElement(name = "ArrivalFormationAssignment")
    protected List<FormationAssignmentStructure> arrivalFormationAssignment;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected List<PlannedStopAssignmentStructure> departureStopAssignment;
    @XmlElement(name = "DepartureFormationAssignment")
    protected List<FormationAssignmentStructure> departureFormationAssignment;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedLatestPassengerAccessTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedLatestPassengerAccessTime;
    @XmlElement(name = "AimedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "TargetedInterchange")
    protected List<TargetedInterchangeStructure> targetedInterchange;
    @XmlElement(name = "FromServiceJourneyInterchange")
    protected List<FromServiceJourneyInterchangeStructure> fromServiceJourneyInterchange;
    @XmlElement(name = "ToServiceJourneyInterchange")
    protected List<ToServiceJourneyInterchangeStructure> toServiceJourneyInterchange;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der stopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Legt den Wert der stopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Ruft den Wert der visitNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVisitNumber() {
        return visitNumber;
    }

    /**
     * Legt den Wert der visitNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVisitNumber(BigInteger value) {
        this.visitNumber = value;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Name of SCHEDULED STOP POINT.  (Unbounded since SIRI 2.0) Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    /**
     * Ruft den Wert der extraCall-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtraCall() {
        return extraCall;
    }

    /**
     * Legt den Wert der extraCall-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtraCall(Boolean value) {
        this.extraCall = value;
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
     * Ruft den Wert der timingPoint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Legt den Wert der timingPoint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Ruft den Wert der boardingStretch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBoardingStretch() {
        return boardingStretch;
    }

    /**
     * Legt den Wert der boardingStretch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBoardingStretch(Boolean value) {
        this.boardingStretch = value;
    }

    /**
     * Ruft den Wert der requestStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Legt den Wert der requestStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the originDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the originDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getOriginDisplay() {
        if (originDisplay == null) {
            originDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.originDisplay;
    }

    /**
     * Gets the value of the destinationDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the destinationDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getDestinationDisplay() {
        if (destinationDisplay == null) {
            destinationDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationDisplay;
    }

    /**
     * Gets the value of the callNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the callNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getCallNote() {
        if (callNote == null) {
            callNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.callNote;
    }

    /**
     * Ruft den Wert der aimedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Legt den Wert der aimedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Ruft den Wert der arrivalPlatformName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Legt den Wert der arrivalPlatformName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    /**
     * Ruft den Wert der arrivalBoardingActivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Legt den Wert der arrivalBoardingActivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalBoardingActivityEnumeration }
     *     
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    /**
     * Gets the value of the arrivalStopAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalStopAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalStopAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlannedStopAssignmentStructure }
     * 
     * 
     */
    public List<PlannedStopAssignmentStructure> getArrivalStopAssignment() {
        if (arrivalStopAssignment == null) {
            arrivalStopAssignment = new ArrayList<PlannedStopAssignmentStructure>();
        }
        return this.arrivalStopAssignment;
    }

    /**
     * Gets the value of the arrivalFormationAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalFormationAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalFormationAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationAssignmentStructure }
     * 
     * 
     */
    public List<FormationAssignmentStructure> getArrivalFormationAssignment() {
        if (arrivalFormationAssignment == null) {
            arrivalFormationAssignment = new ArrayList<FormationAssignmentStructure>();
        }
        return this.arrivalFormationAssignment;
    }

    /**
     * Gets the value of the arrivalOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getArrivalOperatorRefs() {
        if (arrivalOperatorRefs == null) {
            arrivalOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.arrivalOperatorRefs;
    }

    /**
     * Ruft den Wert der aimedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Legt den Wert der aimedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Ruft den Wert der departurePlatformName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Legt den Wert der departurePlatformName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDeparturePlatformName(NaturalLanguageStringStructure value) {
        this.departurePlatformName = value;
    }

    /**
     * Ruft den Wert der departureBoardingActivity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Legt den Wert der departureBoardingActivity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureBoardingActivityEnumeration }
     *     
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    /**
     * Gets the value of the departureStopAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departureStopAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureStopAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlannedStopAssignmentStructure }
     * 
     * 
     */
    public List<PlannedStopAssignmentStructure> getDepartureStopAssignment() {
        if (departureStopAssignment == null) {
            departureStopAssignment = new ArrayList<PlannedStopAssignmentStructure>();
        }
        return this.departureStopAssignment;
    }

    /**
     * Gets the value of the departureFormationAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departureFormationAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureFormationAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationAssignmentStructure }
     * 
     * 
     */
    public List<FormationAssignmentStructure> getDepartureFormationAssignment() {
        if (departureFormationAssignment == null) {
            departureFormationAssignment = new ArrayList<FormationAssignmentStructure>();
        }
        return this.departureFormationAssignment;
    }

    /**
     * Gets the value of the departureOperatorRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departureOperatorRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOperatorRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperatorRefStructure }
     * 
     * 
     */
    public List<OperatorRefStructure> getDepartureOperatorRefs() {
        if (departureOperatorRefs == null) {
            departureOperatorRefs = new ArrayList<OperatorRefStructure>();
        }
        return this.departureOperatorRefs;
    }

    /**
     * Ruft den Wert der aimedLatestPassengerAccessTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedLatestPassengerAccessTime() {
        return aimedLatestPassengerAccessTime;
    }

    /**
     * Legt den Wert der aimedLatestPassengerAccessTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedLatestPassengerAccessTime(ZonedDateTime value) {
        this.aimedLatestPassengerAccessTime = value;
    }

    /**
     * Ruft den Wert der aimedHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Legt den Wert der aimedHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
    }

    /**
     * Gets the value of the targetedInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the targetedInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetedInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetedInterchangeStructure }
     * 
     * 
     */
    public List<TargetedInterchangeStructure> getTargetedInterchange() {
        if (targetedInterchange == null) {
            targetedInterchange = new ArrayList<TargetedInterchangeStructure>();
        }
        return this.targetedInterchange;
    }

    /**
     * Gets the value of the fromServiceJourneyInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fromServiceJourneyInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFromServiceJourneyInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FromServiceJourneyInterchangeStructure }
     * 
     * 
     */
    public List<FromServiceJourneyInterchangeStructure> getFromServiceJourneyInterchange() {
        if (fromServiceJourneyInterchange == null) {
            fromServiceJourneyInterchange = new ArrayList<FromServiceJourneyInterchangeStructure>();
        }
        return this.fromServiceJourneyInterchange;
    }

    /**
     * Gets the value of the toServiceJourneyInterchange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the toServiceJourneyInterchange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToServiceJourneyInterchange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ToServiceJourneyInterchangeStructure }
     * 
     * 
     */
    public List<ToServiceJourneyInterchangeStructure> getToServiceJourneyInterchange() {
        if (toServiceJourneyInterchange == null) {
            toServiceJourneyInterchange = new ArrayList<ToServiceJourneyInterchangeStructure>();
        }
        return this.toServiceJourneyInterchange;
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

    public DatedCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public DatedCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    public DatedCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public DatedCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withExtraCall(Boolean value) {
        setExtraCall(value);
        return this;
    }

    public DatedCallStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    public DatedCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public DatedCallStructure withBoardingStretch(Boolean value) {
        setBoardingStretch(value);
        return this;
    }

    public DatedCallStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public DatedCallStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withCallNote(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getCallNote().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withCallNote(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getCallNote().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public DatedCallStructure withArrivalPlatformName(NaturalLanguageStringStructure value) {
        setArrivalPlatformName(value);
        return this;
    }

    public DatedCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public DatedCallStructure withArrivalStopAssignment(PlannedStopAssignmentStructure... values) {
        if (values!= null) {
            for (PlannedStopAssignmentStructure value: values) {
                getArrivalStopAssignment().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withArrivalStopAssignment(Collection<PlannedStopAssignmentStructure> values) {
        if (values!= null) {
            getArrivalStopAssignment().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withArrivalFormationAssignment(FormationAssignmentStructure... values) {
        if (values!= null) {
            for (FormationAssignmentStructure value: values) {
                getArrivalFormationAssignment().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withArrivalFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values!= null) {
            getArrivalFormationAssignment().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withArrivalOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getArrivalOperatorRefs().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withArrivalOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getArrivalOperatorRefs().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public DatedCallStructure withDeparturePlatformName(NaturalLanguageStringStructure value) {
        setDeparturePlatformName(value);
        return this;
    }

    public DatedCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public DatedCallStructure withDepartureStopAssignment(PlannedStopAssignmentStructure... values) {
        if (values!= null) {
            for (PlannedStopAssignmentStructure value: values) {
                getDepartureStopAssignment().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withDepartureStopAssignment(Collection<PlannedStopAssignmentStructure> values) {
        if (values!= null) {
            getDepartureStopAssignment().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withDepartureFormationAssignment(FormationAssignmentStructure... values) {
        if (values!= null) {
            for (FormationAssignmentStructure value: values) {
                getDepartureFormationAssignment().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withDepartureFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values!= null) {
            getDepartureFormationAssignment().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withDepartureOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getDepartureOperatorRefs().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withDepartureOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getDepartureOperatorRefs().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withAimedLatestPassengerAccessTime(ZonedDateTime value) {
        setAimedLatestPassengerAccessTime(value);
        return this;
    }

    public DatedCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public DatedCallStructure withTargetedInterchange(TargetedInterchangeStructure... values) {
        if (values!= null) {
            for (TargetedInterchangeStructure value: values) {
                getTargetedInterchange().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withTargetedInterchange(Collection<TargetedInterchangeStructure> values) {
        if (values!= null) {
            getTargetedInterchange().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withFromServiceJourneyInterchange(FromServiceJourneyInterchangeStructure... values) {
        if (values!= null) {
            for (FromServiceJourneyInterchangeStructure value: values) {
                getFromServiceJourneyInterchange().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withFromServiceJourneyInterchange(Collection<FromServiceJourneyInterchangeStructure> values) {
        if (values!= null) {
            getFromServiceJourneyInterchange().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withToServiceJourneyInterchange(ToServiceJourneyInterchangeStructure... values) {
        if (values!= null) {
            for (ToServiceJourneyInterchangeStructure value: values) {
                getToServiceJourneyInterchange().add(value);
            }
        }
        return this;
    }

    public DatedCallStructure withToServiceJourneyInterchange(Collection<ToServiceJourneyInterchangeStructure> values) {
        if (values!= null) {
            getToServiceJourneyInterchange().addAll(values);
        }
        return this;
    }

    public DatedCallStructure withExtensions(ExtensionsStructure value) {
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
