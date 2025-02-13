//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Type Onwards CALLs at stop.
 *
 * <p>Java-Klasse für OnwardCallStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OnwardCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}TimingPoint" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}OnwardsCallGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnwardCallStructure", propOrder = {
    "vehicleAtStop",
    "timingPoint",
    "aimedArrivalTime",
    "expectedArrivalTime",
    "latestExpectedArrivalTime",
    "expectedArrivalPredictionQuality",
    "arrivalPredictionUnknown",
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
    "expectedDepartureTime",
    "provisionalExpectedDepartureTime",
    "earliestExpectedDepartureTime",
    "expectedDeparturePredictionQuality",
    "departurePredictionUnknown",
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
public class OnwardCallStructure
    extends AbstractMonitoredCallStructure {

    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "TimingPoint", defaultValue = "true")
    protected Boolean timingPoint;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedArrivalTime;
    @XmlElement(name = "LatestExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime latestExpectedArrivalTime;
    @XmlElement(name = "ExpectedArrivalPredictionQuality")
    protected PredictionQualityStructure expectedArrivalPredictionQuality;
    @XmlElement(name = "ArrivalPredictionUnknown")
    protected String arrivalPredictionUnknown;
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
    @XmlElement(name = "DeparturePredictionUnknown")
    protected String departurePredictionUnknown;
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
     * @return possible object is {@link Boolean }
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Legt den Wert der vehicleAtStop-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Ruft den Wert der timingPoint-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isTimingPoint() {
        return timingPoint;
    }

    /**
     * Legt den Wert der timingPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setTimingPoint(Boolean value) {
        this.timingPoint = value;
    }

    /**
     * Ruft den Wert der aimedArrivalTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Legt den Wert der aimedArrivalTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Ruft den Wert der expectedArrivalTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Legt den Wert der expectedArrivalTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setExpectedArrivalTime(ZonedDateTime value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der latestExpectedArrivalTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getLatestExpectedArrivalTime() {
        return latestExpectedArrivalTime;
    }

    /**
     * Legt den Wert der latestExpectedArrivalTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLatestExpectedArrivalTime(ZonedDateTime value) {
        this.latestExpectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der expectedArrivalPredictionQuality-Eigenschaft ab.
     *
     * @return possible object is {@link PredictionQualityStructure }
     */
    public PredictionQualityStructure getExpectedArrivalPredictionQuality() {
        return expectedArrivalPredictionQuality;
    }

    /**
     * Legt den Wert der expectedArrivalPredictionQuality-Eigenschaft fest.
     *
     * @param value allowed object is {@link PredictionQualityStructure }
     */
    public void setExpectedArrivalPredictionQuality(PredictionQualityStructure value) {
        this.expectedArrivalPredictionQuality = value;
    }

    /**
     * Ruft den Wert der arrivalPredictionUnknown-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getArrivalPredictionUnknown() {
        return arrivalPredictionUnknown;
    }

    /**
     * Legt den Wert der arrivalPredictionUnknown-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setArrivalPredictionUnknown(String value) {
        this.arrivalPredictionUnknown = value;
    }

    /**
     * Ruft den Wert der arrivalStatus-Eigenschaft ab.
     *
     * @return possible object is {@link CallStatusEnumeration }
     */
    public CallStatusEnumeration getArrivalStatus() {
        return arrivalStatus;
    }

    /**
     * Legt den Wert der arrivalStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link CallStatusEnumeration }
     */
    public void setArrivalStatus(CallStatusEnumeration value) {
        this.arrivalStatus = value;
    }

    /**
     * Ruft den Wert der arrivalCancellationReason-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getArrivalCancellationReason() {
        return arrivalCancellationReason;
    }

    /**
     * Legt den Wert der arrivalCancellationReason-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setArrivalCancellationReason(NaturalLanguageStringStructure value) {
        this.arrivalCancellationReason = value;
    }

    /**
     * Ruft den Wert der arrivalProximityText-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getArrivalProximityText() {
        return arrivalProximityText;
    }

    /**
     * Legt den Wert der arrivalProximityText-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setArrivalProximityText(NaturalLanguageStringStructure value) {
        this.arrivalProximityText = value;
    }

    /**
     * Ruft den Wert der arrivalPlatformName-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getArrivalPlatformName() {
        return arrivalPlatformName;
    }

    /**
     * Legt den Wert der arrivalPlatformName-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setArrivalPlatformName(NaturalLanguageStringStructure value) {
        this.arrivalPlatformName = value;
    }

    /**
     * Ruft den Wert der arrivalBoardingActivity-Eigenschaft ab.
     *
     * @return possible object is {@link ArrivalBoardingActivityEnumeration }
     */
    public ArrivalBoardingActivityEnumeration getArrivalBoardingActivity() {
        return arrivalBoardingActivity;
    }

    /**
     * Legt den Wert der arrivalBoardingActivity-Eigenschaft fest.
     *
     * @param value allowed object is {@link ArrivalBoardingActivityEnumeration }
     */
    public void setArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        this.arrivalBoardingActivity = value;
    }

    /**
     * Gets the value of the arrivalStopAssignment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the arrivalStopAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalStopAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link StopAssignmentStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the arrivalFormationAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalFormationAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FormationAssignmentStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the arrivalOrientationRelativeToQuay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOrientationRelativeToQuay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleOrientationRelativeToQuay }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the arrivalOperatorRefs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalOperatorRefs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OperatorRefStructure }
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
     * @return possible object is {@link String }
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Legt den Wert der aimedDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Ruft den Wert der expectedDepartureTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Legt den Wert der expectedDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setExpectedDepartureTime(ZonedDateTime value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der provisionalExpectedDepartureTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getProvisionalExpectedDepartureTime() {
        return provisionalExpectedDepartureTime;
    }

    /**
     * Legt den Wert der provisionalExpectedDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setProvisionalExpectedDepartureTime(ZonedDateTime value) {
        this.provisionalExpectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der earliestExpectedDepartureTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getEarliestExpectedDepartureTime() {
        return earliestExpectedDepartureTime;
    }

    /**
     * Legt den Wert der earliestExpectedDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEarliestExpectedDepartureTime(ZonedDateTime value) {
        this.earliestExpectedDepartureTime = value;
    }

    /**
     * Ruft den Wert der expectedDeparturePredictionQuality-Eigenschaft ab.
     *
     * @return possible object is {@link PredictionQualityStructure }
     */
    public PredictionQualityStructure getExpectedDeparturePredictionQuality() {
        return expectedDeparturePredictionQuality;
    }

    /**
     * Legt den Wert der expectedDeparturePredictionQuality-Eigenschaft fest.
     *
     * @param value allowed object is {@link PredictionQualityStructure }
     */
    public void setExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        this.expectedDeparturePredictionQuality = value;
    }

    /**
     * Ruft den Wert der departurePredictionUnknown-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDeparturePredictionUnknown() {
        return departurePredictionUnknown;
    }

    /**
     * Legt den Wert der departurePredictionUnknown-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDeparturePredictionUnknown(String value) {
        this.departurePredictionUnknown = value;
    }

    /**
     * Ruft den Wert der aimedLatestPassengerAccessTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getAimedLatestPassengerAccessTime() {
        return aimedLatestPassengerAccessTime;
    }

    /**
     * Legt den Wert der aimedLatestPassengerAccessTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAimedLatestPassengerAccessTime(ZonedDateTime value) {
        this.aimedLatestPassengerAccessTime = value;
    }

    /**
     * Ruft den Wert der expectedLatestPassengerAccessTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getExpectedLatestPassengerAccessTime() {
        return expectedLatestPassengerAccessTime;
    }

    /**
     * Legt den Wert der expectedLatestPassengerAccessTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setExpectedLatestPassengerAccessTime(ZonedDateTime value) {
        this.expectedLatestPassengerAccessTime = value;
    }

    /**
     * Ruft den Wert der departureStatus-Eigenschaft ab.
     *
     * @return possible object is {@link CallStatusEnumeration }
     */
    public CallStatusEnumeration getDepartureStatus() {
        return departureStatus;
    }

    /**
     * Legt den Wert der departureStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link CallStatusEnumeration }
     */
    public void setDepartureStatus(CallStatusEnumeration value) {
        this.departureStatus = value;
    }

    /**
     * Ruft den Wert der departureCancellationReason-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDepartureCancellationReason() {
        return departureCancellationReason;
    }

    /**
     * Legt den Wert der departureCancellationReason-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDepartureCancellationReason(NaturalLanguageStringStructure value) {
        this.departureCancellationReason = value;
    }

    /**
     * Ruft den Wert der departureProximityText-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDepartureProximityText() {
        return departureProximityText;
    }

    /**
     * Legt den Wert der departureProximityText-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDepartureProximityText(NaturalLanguageStringStructure value) {
        this.departureProximityText = value;
    }

    /**
     * Ruft den Wert der departurePlatformName-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getDeparturePlatformName() {
        return departurePlatformName;
    }

    /**
     * Legt den Wert der departurePlatformName-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setDeparturePlatformName(NaturalLanguageStringStructure value) {
        this.departurePlatformName = value;
    }

    /**
     * Ruft den Wert der departureBoardingActivity-Eigenschaft ab.
     *
     * @return possible object is {@link DepartureBoardingActivityEnumeration }
     */
    public DepartureBoardingActivityEnumeration getDepartureBoardingActivity() {
        return departureBoardingActivity;
    }

    /**
     * Legt den Wert der departureBoardingActivity-Eigenschaft fest.
     *
     * @param value allowed object is {@link DepartureBoardingActivityEnumeration }
     */
    public void setDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        this.departureBoardingActivity = value;
    }

    /**
     * Gets the value of the departureStopAssignment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the departureStopAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureStopAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link StopAssignmentStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the departureFormationAssignment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureFormationAssignment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FormationAssignmentStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the departureOrientationRelativeToQuay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOrientationRelativeToQuay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleOrientationRelativeToQuay }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the expectedDepartureOccupancy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDepartureOccupancy().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleOccupancyStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the expectedDepartureCapacities property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedDepartureCapacities().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PassengerCapacityStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the recordedDepartureOccupancy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureOccupancy().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleOccupancyStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the recordedDepartureCapacities property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureCapacities().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PassengerCapacityStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the departureOperatorRefs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureOperatorRefs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link OperatorRefStructure }
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
     * @return possible object is {@link String }
     */
    public Duration getAimedHeadwayInterval() {
        return aimedHeadwayInterval;
    }

    /**
     * Legt den Wert der aimedHeadwayInterval-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAimedHeadwayInterval(Duration value) {
        this.aimedHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der expectedHeadwayInterval-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getExpectedHeadwayInterval() {
        return expectedHeadwayInterval;
    }

    /**
     * Legt den Wert der expectedHeadwayInterval-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setExpectedHeadwayInterval(Duration value) {
        this.expectedHeadwayInterval = value;
    }

    /**
     * Ruft den Wert der distanceFromStop-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getDistanceFromStop() {
        return distanceFromStop;
    }

    /**
     * Legt den Wert der distanceFromStop-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setDistanceFromStop(BigInteger value) {
        this.distanceFromStop = value;
    }

    /**
     * Ruft den Wert der numberOfStopsAway-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfStopsAway() {
        return numberOfStopsAway;
    }

    /**
     * Legt den Wert der numberOfStopsAway-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfStopsAway(BigInteger value) {
        this.numberOfStopsAway = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OnwardCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public OnwardCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public OnwardCallStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public OnwardCallStructure withExpectedArrivalTime(ZonedDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public OnwardCallStructure withLatestExpectedArrivalTime(ZonedDateTime value) {
        setLatestExpectedArrivalTime(value);
        return this;
    }

    public OnwardCallStructure withExpectedArrivalPredictionQuality(PredictionQualityStructure value) {
        setExpectedArrivalPredictionQuality(value);
        return this;
    }

    public OnwardCallStructure withArrivalPredictionUnknown(String value) {
        setArrivalPredictionUnknown(value);
        return this;
    }

    public OnwardCallStructure withArrivalStatus(CallStatusEnumeration value) {
        setArrivalStatus(value);
        return this;
    }

    public OnwardCallStructure withArrivalCancellationReason(NaturalLanguageStringStructure value) {
        setArrivalCancellationReason(value);
        return this;
    }

    public OnwardCallStructure withArrivalProximityText(NaturalLanguageStringStructure value) {
        setArrivalProximityText(value);
        return this;
    }

    public OnwardCallStructure withArrivalPlatformName(NaturalLanguageStringStructure value) {
        setArrivalPlatformName(value);
        return this;
    }

    public OnwardCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public OnwardCallStructure withArrivalStopAssignment(StopAssignmentStructure... values) {
        if (values != null) {
            for (StopAssignmentStructure value : values) {
                getArrivalStopAssignment().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withArrivalStopAssignment(Collection<StopAssignmentStructure> values) {
        if (values != null) {
            getArrivalStopAssignment().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withArrivalFormationAssignment(FormationAssignmentStructure... values) {
        if (values != null) {
            for (FormationAssignmentStructure value : values) {
                getArrivalFormationAssignment().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withArrivalFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values != null) {
            getArrivalFormationAssignment().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withArrivalOrientationRelativeToQuay(VehicleOrientationRelativeToQuay... values) {
        if (values != null) {
            for (VehicleOrientationRelativeToQuay value : values) {
                getArrivalOrientationRelativeToQuay().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withArrivalOrientationRelativeToQuay(Collection<VehicleOrientationRelativeToQuay> values) {
        if (values != null) {
            getArrivalOrientationRelativeToQuay().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withArrivalOperatorRefs(OperatorRefStructure... values) {
        if (values != null) {
            for (OperatorRefStructure value : values) {
                getArrivalOperatorRefs().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withArrivalOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values != null) {
            getArrivalOperatorRefs().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public OnwardCallStructure withExpectedDepartureTime(ZonedDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public OnwardCallStructure withProvisionalExpectedDepartureTime(ZonedDateTime value) {
        setProvisionalExpectedDepartureTime(value);
        return this;
    }

    public OnwardCallStructure withEarliestExpectedDepartureTime(ZonedDateTime value) {
        setEarliestExpectedDepartureTime(value);
        return this;
    }

    public OnwardCallStructure withExpectedDeparturePredictionQuality(PredictionQualityStructure value) {
        setExpectedDeparturePredictionQuality(value);
        return this;
    }

    public OnwardCallStructure withDeparturePredictionUnknown(String value) {
        setDeparturePredictionUnknown(value);
        return this;
    }

    public OnwardCallStructure withAimedLatestPassengerAccessTime(ZonedDateTime value) {
        setAimedLatestPassengerAccessTime(value);
        return this;
    }

    public OnwardCallStructure withExpectedLatestPassengerAccessTime(ZonedDateTime value) {
        setExpectedLatestPassengerAccessTime(value);
        return this;
    }

    public OnwardCallStructure withDepartureStatus(CallStatusEnumeration value) {
        setDepartureStatus(value);
        return this;
    }

    public OnwardCallStructure withDepartureCancellationReason(NaturalLanguageStringStructure value) {
        setDepartureCancellationReason(value);
        return this;
    }

    public OnwardCallStructure withDepartureProximityText(NaturalLanguageStringStructure value) {
        setDepartureProximityText(value);
        return this;
    }

    public OnwardCallStructure withDeparturePlatformName(NaturalLanguageStringStructure value) {
        setDeparturePlatformName(value);
        return this;
    }

    public OnwardCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public OnwardCallStructure withDepartureStopAssignment(StopAssignmentStructure... values) {
        if (values != null) {
            for (StopAssignmentStructure value : values) {
                getDepartureStopAssignment().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withDepartureStopAssignment(Collection<StopAssignmentStructure> values) {
        if (values != null) {
            getDepartureStopAssignment().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withDepartureFormationAssignment(FormationAssignmentStructure... values) {
        if (values != null) {
            for (FormationAssignmentStructure value : values) {
                getDepartureFormationAssignment().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withDepartureFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values != null) {
            getDepartureFormationAssignment().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withDepartureOrientationRelativeToQuay(VehicleOrientationRelativeToQuay... values) {
        if (values != null) {
            for (VehicleOrientationRelativeToQuay value : values) {
                getDepartureOrientationRelativeToQuay().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withDepartureOrientationRelativeToQuay(Collection<VehicleOrientationRelativeToQuay> values) {
        if (values != null) {
            getDepartureOrientationRelativeToQuay().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withExpectedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values != null) {
            for (VehicleOccupancyStructure value : values) {
                getExpectedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withExpectedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values != null) {
            getExpectedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withExpectedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values != null) {
            for (PassengerCapacityStructure value : values) {
                getExpectedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withExpectedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values != null) {
            getExpectedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withRecordedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values != null) {
            for (VehicleOccupancyStructure value : values) {
                getRecordedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withRecordedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values != null) {
            getRecordedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withRecordedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values != null) {
            for (PassengerCapacityStructure value : values) {
                getRecordedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withRecordedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values != null) {
            getRecordedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withDepartureOperatorRefs(OperatorRefStructure... values) {
        if (values != null) {
            for (OperatorRefStructure value : values) {
                getDepartureOperatorRefs().add(value);
            }
        }
        return this;
    }

    public OnwardCallStructure withDepartureOperatorRefs(Collection<OperatorRefStructure> values) {
        if (values != null) {
            getDepartureOperatorRefs().addAll(values);
        }
        return this;
    }

    public OnwardCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public OnwardCallStructure withExpectedHeadwayInterval(Duration value) {
        setExpectedHeadwayInterval(value);
        return this;
    }

    public OnwardCallStructure withDistanceFromStop(BigInteger value) {
        setDistanceFromStop(value);
        return this;
    }

    public OnwardCallStructure withNumberOfStopsAway(BigInteger value) {
        setNumberOfStopsAway(value);
        return this;
    }

    public OnwardCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OnwardCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public OnwardCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public OnwardCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public OnwardCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public OnwardCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getStopPointName().addAll(values);
        }
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
