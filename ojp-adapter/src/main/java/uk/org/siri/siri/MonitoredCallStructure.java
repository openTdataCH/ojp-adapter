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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for Current CALL at stop.
 * 
 * <p>Java-Klasse für MonitoredCallStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoredCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredCallGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredCallStructure", propOrder = {
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "reversesAtStop",
    "platformTraversal",
    "signalStatus",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "callNote",
    "formationCondition",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "latestExpectedArrivalTime",
    "arrivalStatus",
    "arrivalCancellationReason",
    "arrivalProximityText",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "arrivalStopAssignment",
    "arrivalFormationAssignment",
    "arrivalOrientationRelativeToQuay",
    "arrivalOperatorRefs",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "provisionalExpectedDepartureTime",
    "earliestExpectedDepartureTime",
    "expectedDeparturePredictionQuality",
    "aimedLatestPassengerAccessTime",
    "expectedLatestPassengerAccessTime",
    "departureStatus",
    "departureCancellationReason",
    "departureProximityText",
    "departurePlatformName",
    "departureBoardingActivity",
    "departureStopAssignment",
    "departureFormationAssignment",
    "departureOrientationRelativeToQuay",
    "expectedDepartureOccupancy",
    "expectedDepartureCapacities",
    "recordedDepartureOccupancy",
    "recordedDepartureCapacities",
    "departureOperatorRefs",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "distanceFromStop",
    "numberOfStopsAway",
    "extensions"
})
public class MonitoredCallStructure
    extends AbstractMonitoredCallStructure
{

    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop")
    protected LocationStructure vehicleLocationAtStop;
    @XmlElement(name = "ReversesAtStop", defaultValue = "false")
    protected Boolean reversesAtStop;
    @XmlElement(name = "PlatformTraversal", defaultValue = "false")
    protected Boolean platformTraversal;
    @XmlElement(name = "SignalStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String signalStatus;
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
    @XmlElement(name = "FormationCondition")
    protected List<FormationConditionStructure> formationCondition;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedArrivalTime;
    @XmlElement(name = "LatestExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime latestExpectedArrivalTime;
    @XmlElement(name = "ArrivalStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalCancellationReason")
    protected NaturalLanguageStringStructure arrivalCancellationReason;
    @XmlElement(name = "ArrivalProximityText")
    protected NaturalLanguageStringStructure arrivalProximityText;
    @XmlElement(name = "ArrivalPlatformName")
    protected NaturalLanguageStringStructure arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
    @XmlElement(name = "ArrivalStopAssignment")
    protected List<StopAssignmentStructure> arrivalStopAssignment;
    @XmlElement(name = "ArrivalFormationAssignment")
    protected List<FormationAssignmentStructure> arrivalFormationAssignment;
    @XmlElement(name = "ArrivalOrientationRelativeToQuay")
    protected List<VehicleOrientationRelativeToQuay> arrivalOrientationRelativeToQuay;
    @XmlElement(name = "ArrivalOperatorRefs")
    protected List<OperatorRefStructure> arrivalOperatorRefs;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedDepartureTime;
    @XmlElement(name = "ProvisionalExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime provisionalExpectedDepartureTime;
    @XmlElement(name = "EarliestExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime earliestExpectedDepartureTime;
    @XmlElement(name = "ExpectedDeparturePredictionQuality")
    protected PredictionQualityStructure expectedDeparturePredictionQuality;
    @XmlElement(name = "AimedLatestPassengerAccessTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedLatestPassengerAccessTime;
    @XmlElement(name = "ExpectedLatestPassengerAccessTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedLatestPassengerAccessTime;
    @XmlElement(name = "DepartureStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DepartureCancellationReason")
    protected NaturalLanguageStringStructure departureCancellationReason;
    @XmlElement(name = "DepartureProximityText")
    protected NaturalLanguageStringStructure departureProximityText;
    @XmlElement(name = "DeparturePlatformName")
    protected NaturalLanguageStringStructure departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "DepartureStopAssignment")
    protected List<StopAssignmentStructure> departureStopAssignment;
    @XmlElement(name = "DepartureFormationAssignment")
    protected List<FormationAssignmentStructure> departureFormationAssignment;
    @XmlElement(name = "DepartureOrientationRelativeToQuay")
    protected List<VehicleOrientationRelativeToQuay> departureOrientationRelativeToQuay;
    @XmlElement(name = "ExpectedDepartureOccupancy")
    protected List<VehicleOccupancyStructure> expectedDepartureOccupancy;
    @XmlElement(name = "ExpectedDepartureCapacities")
    protected List<PassengerCapacityStructure> expectedDepartureCapacities;
    @XmlElement(name = "RecordedDepartureOccupancy")
    protected List<VehicleOccupancyStructure> recordedDepartureOccupancy;
    @XmlElement(name = "RecordedDepartureCapacities")
    protected List<PassengerCapacityStructure> recordedDepartureCapacities;
    @XmlElement(name = "DepartureOperatorRefs")
    protected List<OperatorRefStructure> departureOperatorRefs;
    @XmlElement(name = "AimedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "DistanceFromStop")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceFromStop;
    @XmlElement(name = "NumberOfStopsAway")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfStopsAway;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der vehicleAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Legt den Wert der vehicleAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Ruft den Wert der vehicleLocationAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getVehicleLocationAtStop() {
        return vehicleLocationAtStop;
    }

    /**
     * Legt den Wert der vehicleLocationAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setVehicleLocationAtStop(LocationStructure value) {
        this.vehicleLocationAtStop = value;
    }

    /**
     * Ruft den Wert der reversesAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversesAtStop() {
        return reversesAtStop;
    }

    /**
     * Legt den Wert der reversesAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversesAtStop(Boolean value) {
        this.reversesAtStop = value;
    }

    /**
     * Ruft den Wert der platformTraversal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlatformTraversal() {
        return platformTraversal;
    }

    /**
     * Legt den Wert der platformTraversal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlatformTraversal(Boolean value) {
        this.platformTraversal = value;
    }

    /**
     * Ruft den Wert der signalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignalStatus() {
        return signalStatus;
    }

    /**
     * Legt den Wert der signalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignalStatus(String value) {
        this.signalStatus = value;
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
     * Information about a change of the formation (e.g. TRAIN composition) or changes of vehicles within the formation. (since SIRI 2.1) Gets the value of the formationCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the formationCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormationCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationConditionStructure }
     * 
     * 
     */
    public List<FormationConditionStructure> getFormationCondition() {
        if (formationCondition == null) {
            formationCondition = new ArrayList<FormationConditionStructure>();
        }
        return this.formationCondition;
    }

    /**
     * Information about a change of Equipment availability at stop or on vehicle that may affect access or use.Gets the value of the facilityConditionElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityConditionStructure }
     * 
     * 
     */
    public List<FacilityConditionStructure> getFacilityConditionElement() {
        if (facilityConditionElement == null) {
            facilityConditionElement = new ArrayList<FacilityConditionStructure>();
        }
        return this.facilityConditionElement;
    }

    /**
     * Ruft den Wert der facilityChangeElement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Legt den Wert der facilityChangeElement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityChangeStructure }
     *     
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    /**
     * Gets the value of the situationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the situationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationRefStructure }
     * 
     * 
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
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
     * Ruft den Wert der actualArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Legt den Wert der actualArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualArrivalTime(ZonedDateTime value) {
        this.actualArrivalTime = value;
    }

    /**
     * Ruft den Wert der expectedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Legt den Wert der expectedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedArrivalTime(ZonedDateTime value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der latestExpectedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getLatestExpectedArrivalTime() {
        return latestExpectedArrivalTime;
    }

    /**
     * Legt den Wert der latestExpectedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatestExpectedArrivalTime(ZonedDateTime value) {
        this.latestExpectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der arrivalStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Legt den Wert der arrivalStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setArrivalStatus(CallStatusEnumeration value) {
        this.arrivalStatus = value;
    }

    /**
     * Ruft den Wert der arrivalCancellationReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalCancellationReason() {
        return arrivalCancellationReason;
    }

    /**
     * Legt den Wert der arrivalCancellationReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalCancellationReason(NaturalLanguageStringStructure value) {
        this.arrivalCancellationReason = value;
    }

    /**
     * Ruft den Wert der arrivalProximityText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getArrivalProximityText() {
        return arrivalProximityText;
    }

    /**
     * Legt den Wert der arrivalProximityText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setArrivalProximityText(NaturalLanguageStringStructure value) {
        this.arrivalProximityText = value;
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
     * {@link StopAssignmentStructure }
     * 
     * 
     */
    public List<StopAssignmentStructure> getArrivalStopAssignment() {
        if (arrivalStopAssignment == null) {
            arrivalStopAssignment = new ArrayList<StopAssignmentStructure>();
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
     * Gets the value of the arrivalOrientationRelativeToQuay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalOrientationRelativeToQuay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOrientationRelativeToQuay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleOrientationRelativeToQuay }
     * 
     * 
     */
    public List<VehicleOrientationRelativeToQuay> getArrivalOrientationRelativeToQuay() {
        if (arrivalOrientationRelativeToQuay == null) {
            arrivalOrientationRelativeToQuay = new ArrayList<VehicleOrientationRelativeToQuay>();
        }
        return this.arrivalOrientationRelativeToQuay;
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
     * Ruft den Wert der actualDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Legt den Wert der actualDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepartureTime(ZonedDateTime value) {
        this.actualDepartureTime = value;
    }

    /**
     * Ruft den Wert der expectedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Legt den Wert der expectedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDepartureTime(ZonedDateTime value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der provisionalExpectedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getProvisionalExpectedDepartureTime() {
        return provisionalExpectedDepartureTime;
    }

    /**
     * Legt den Wert der provisionalExpectedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvisionalExpectedDepartureTime(ZonedDateTime value) {
        this.provisionalExpectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der earliestExpectedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEarliestExpectedDepartureTime() {
        return earliestExpectedDepartureTime;
    }

    /**
     * Legt den Wert der earliestExpectedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEarliestExpectedDepartureTime(ZonedDateTime value) {
        this.earliestExpectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der expectedDeparturePredictionQuality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public PredictionQualityStructure getExpectedDeparturePredictionQuality() {
        return expectedDeparturePredictionQuality;
    }

    /**
     * Legt den Wert der expectedDeparturePredictionQuality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PredictionQualityStructure }
     *     
     */
    public void setExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        this.expectedDeparturePredictionQuality = value;
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
     * Ruft den Wert der expectedLatestPassengerAccessTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedLatestPassengerAccessTime() {
        return expectedLatestPassengerAccessTime;
    }

    /**
     * Legt den Wert der expectedLatestPassengerAccessTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedLatestPassengerAccessTime(ZonedDateTime value) {
        this.expectedLatestPassengerAccessTime = value;
    }

    /**
     * Ruft den Wert der departureStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public CallStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Legt den Wert der departureStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CallStatusEnumeration }
     *     
     */
    public void setDepartureStatus(CallStatusEnumeration value) {
        this.departureStatus = value;
    }

    /**
     * Ruft den Wert der departureCancellationReason-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDepartureCancellationReason() {
        return departureCancellationReason;
    }

    /**
     * Legt den Wert der departureCancellationReason-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDepartureCancellationReason(NaturalLanguageStringStructure value) {
        this.departureCancellationReason = value;
    }

    /**
     * Ruft den Wert der departureProximityText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDepartureProximityText() {
        return departureProximityText;
    }

    /**
     * Legt den Wert der departureProximityText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDepartureProximityText(NaturalLanguageStringStructure value) {
        this.departureProximityText = value;
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
     * {@link StopAssignmentStructure }
     * 
     * 
     */
    public List<StopAssignmentStructure> getDepartureStopAssignment() {
        if (departureStopAssignment == null) {
            departureStopAssignment = new ArrayList<StopAssignmentStructure>();
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
     * Gets the value of the departureOrientationRelativeToQuay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departureOrientationRelativeToQuay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOrientationRelativeToQuay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleOrientationRelativeToQuay }
     * 
     * 
     */
    public List<VehicleOrientationRelativeToQuay> getDepartureOrientationRelativeToQuay() {
        if (departureOrientationRelativeToQuay == null) {
            departureOrientationRelativeToQuay = new ArrayList<VehicleOrientationRelativeToQuay>();
        }
        return this.departureOrientationRelativeToQuay;
    }

    /**
     * Gets the value of the expectedDepartureOccupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedDepartureOccupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDepartureOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleOccupancyStructure }
     * 
     * 
     */
    public List<VehicleOccupancyStructure> getExpectedDepartureOccupancy() {
        if (expectedDepartureOccupancy == null) {
            expectedDepartureOccupancy = new ArrayList<VehicleOccupancyStructure>();
        }
        return this.expectedDepartureOccupancy;
    }

    /**
     * Gets the value of the expectedDepartureCapacities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedDepartureCapacities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDepartureCapacities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCapacityStructure }
     * 
     * 
     */
    public List<PassengerCapacityStructure> getExpectedDepartureCapacities() {
        if (expectedDepartureCapacities == null) {
            expectedDepartureCapacities = new ArrayList<PassengerCapacityStructure>();
        }
        return this.expectedDepartureCapacities;
    }

    /**
     * Gets the value of the recordedDepartureOccupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recordedDepartureOccupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleOccupancyStructure }
     * 
     * 
     */
    public List<VehicleOccupancyStructure> getRecordedDepartureOccupancy() {
        if (recordedDepartureOccupancy == null) {
            recordedDepartureOccupancy = new ArrayList<VehicleOccupancyStructure>();
        }
        return this.recordedDepartureOccupancy;
    }

    /**
     * Gets the value of the recordedDepartureCapacities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recordedDepartureCapacities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureCapacities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCapacityStructure }
     * 
     * 
     */
    public List<PassengerCapacityStructure> getRecordedDepartureCapacities() {
        if (recordedDepartureCapacities == null) {
            recordedDepartureCapacities = new ArrayList<PassengerCapacityStructure>();
        }
        return this.recordedDepartureCapacities;
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
     * Ruft den Wert der expectedHeadwayInterval-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Legt den Wert der expectedHeadwayInterval-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der distanceFromStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceFromStop() {
        return distanceFromStop;
    }

    /**
     * Legt den Wert der distanceFromStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceFromStop(BigInteger value) {
        this.distanceFromStop = value;
    }

    /**
     * Ruft den Wert der numberOfStopsAway-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    /**
     * Legt den Wert der numberOfStopsAway-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStopsAway(BigInteger value) {
        this.numberOfStopsAway = value;
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

    public MonitoredCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public MonitoredCallStructure withVehicleLocationAtStop(LocationStructure value) {
        setVehicleLocationAtStop(value);
        return this;
    }

    public MonitoredCallStructure withReversesAtStop(Boolean value) {
        setReversesAtStop(value);
        return this;
    }

    public MonitoredCallStructure withPlatformTraversal(Boolean value) {
        setPlatformTraversal(value);
        return this;
    }

    public MonitoredCallStructure withSignalStatus(String value) {
        setSignalStatus(value);
        return this;
    }

    public MonitoredCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public MonitoredCallStructure withBoardingStretch(Boolean value) {
        setBoardingStretch(value);
        return this;
    }

    public MonitoredCallStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public MonitoredCallStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withCallNote(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getCallNote().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withCallNote(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getCallNote().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withFormationCondition(FormationConditionStructure... values) {
        if (values!= null) {
            for (FormationConditionStructure value: values) {
                getFormationCondition().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withFormationCondition(Collection<FormationConditionStructure> values) {
        if (values!= null) {
            getFormationCondition().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withFacilityConditionElement(FacilityConditionStructure... values) {
        if (values!= null) {
            for (FacilityConditionStructure value: values) {
                getFacilityConditionElement().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withFacilityConditionElement(Collection<FacilityConditionStructure> values) {
        if (values!= null) {
            getFacilityConditionElement().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withFacilityChangeElement(FacilityChangeStructure value) {
        setFacilityChangeElement(value);
        return this;
    }

    public MonitoredCallStructure withSituationRef(SituationRefStructure... values) {
        if (values!= null) {
            for (SituationRefStructure value: values) {
                getSituationRef().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withSituationRef(Collection<SituationRefStructure> values) {
        if (values!= null) {
            getSituationRef().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withActualArrivalTime(ZonedDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedArrivalTime(ZonedDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withLatestExpectedArrivalTime(ZonedDateTime value) {
        setLatestExpectedArrivalTime(value);
        return this;
    }

    public MonitoredCallStructure withArrivalStatus(CallStatusEnumeration value) {
        setArrivalStatus(value);
        return this;
    }

    public MonitoredCallStructure withArrivalCancellationReason(NaturalLanguageStringStructure value) {
        setArrivalCancellationReason(value);
        return this;
    }

    public MonitoredCallStructure withArrivalProximityText(NaturalLanguageStringStructure value) {
        setArrivalProximityText(value);
        return this;
    }

    public MonitoredCallStructure withArrivalPlatformName(NaturalLanguageStringStructure value) {
        setArrivalPlatformName(value);
        return this;
    }

    public MonitoredCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public MonitoredCallStructure withArrivalStopAssignment(StopAssignmentStructure... values) {
        if (values!= null) {
            for (StopAssignmentStructure value: values) {
                getArrivalStopAssignment().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withArrivalStopAssignment(Collection<StopAssignmentStructure> values) {
        if (values!= null) {
            getArrivalStopAssignment().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withArrivalFormationAssignment(FormationAssignmentStructure... values) {
        if (values!= null) {
            for (FormationAssignmentStructure value: values) {
                getArrivalFormationAssignment().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withArrivalFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values!= null) {
            getArrivalFormationAssignment().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withArrivalOrientationRelativeToQuay(VehicleOrientationRelativeToQuay... values) {
        if (values!= null) {
            for (VehicleOrientationRelativeToQuay value: values) {
                getArrivalOrientationRelativeToQuay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withArrivalOrientationRelativeToQuay(Collection<VehicleOrientationRelativeToQuay> values) {
        if (values!= null) {
            getArrivalOrientationRelativeToQuay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withArrivalOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getArrivalOperatorRefs().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withArrivalOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getArrivalOperatorRefs().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withActualDepartureTime(ZonedDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureTime(ZonedDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withProvisionalExpectedDepartureTime(ZonedDateTime value) {
        setProvisionalExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withEarliestExpectedDepartureTime(ZonedDateTime value) {
        setEarliestExpectedDepartureTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        setExpectedDeparturePredictionQuality(value);
        return this;
    }

    public MonitoredCallStructure withAimedLatestPassengerAccessTime(ZonedDateTime value) {
        setAimedLatestPassengerAccessTime(value);
        return this;
    }

    public MonitoredCallStructure withExpectedLatestPassengerAccessTime(ZonedDateTime value) {
        setExpectedLatestPassengerAccessTime(value);
        return this;
    }

    public MonitoredCallStructure withDepartureStatus(CallStatusEnumeration value) {
        setDepartureStatus(value);
        return this;
    }

    public MonitoredCallStructure withDepartureCancellationReason(NaturalLanguageStringStructure value) {
        setDepartureCancellationReason(value);
        return this;
    }

    public MonitoredCallStructure withDepartureProximityText(NaturalLanguageStringStructure value) {
        setDepartureProximityText(value);
        return this;
    }

    public MonitoredCallStructure withDeparturePlatformName(NaturalLanguageStringStructure value) {
        setDeparturePlatformName(value);
        return this;
    }

    public MonitoredCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public MonitoredCallStructure withDepartureStopAssignment(StopAssignmentStructure... values) {
        if (values!= null) {
            for (StopAssignmentStructure value: values) {
                getDepartureStopAssignment().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDepartureStopAssignment(Collection<StopAssignmentStructure> values) {
        if (values!= null) {
            getDepartureStopAssignment().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withDepartureFormationAssignment(FormationAssignmentStructure... values) {
        if (values!= null) {
            for (FormationAssignmentStructure value: values) {
                getDepartureFormationAssignment().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDepartureFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values!= null) {
            getDepartureFormationAssignment().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withDepartureOrientationRelativeToQuay(VehicleOrientationRelativeToQuay... values) {
        if (values!= null) {
            for (VehicleOrientationRelativeToQuay value: values) {
                getDepartureOrientationRelativeToQuay().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDepartureOrientationRelativeToQuay(Collection<VehicleOrientationRelativeToQuay> values) {
        if (values!= null) {
            getDepartureOrientationRelativeToQuay().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values!= null) {
            for (VehicleOccupancyStructure value: values) {
                getExpectedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values!= null) {
            getExpectedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values!= null) {
            for (PassengerCapacityStructure value: values) {
                getExpectedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withExpectedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values!= null) {
            getExpectedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withRecordedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values!= null) {
            for (VehicleOccupancyStructure value: values) {
                getRecordedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withRecordedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values!= null) {
            getRecordedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withRecordedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values!= null) {
            for (PassengerCapacityStructure value: values) {
                getRecordedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withRecordedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values!= null) {
            getRecordedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withDepartureOperatorRefs(OperatorRefStructure... values) {
        if (values!= null) {
            for (OperatorRefStructure value: values) {
                getDepartureOperatorRefs().add(value);
            }
        }
        return this;
    }

    public MonitoredCallStructure withDepartureOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values!= null) {
            getDepartureOperatorRefs().addAll(values);
        }
        return this;
    }

    public MonitoredCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public MonitoredCallStructure withExpectedHeadwayInterval(Duration value) {
        setExpectedHeadwayInterval(value);
        return this;
    }

    public MonitoredCallStructure withDistanceFromStop(BigInteger value) {
        setDistanceFromStop(value);
        return this;
    }

    public MonitoredCallStructure withNumberOfStopsAway(BigInteger value) {
        setNumberOfStopsAway(value);
        return this;
    }

    public MonitoredCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public MonitoredCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
        }
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
