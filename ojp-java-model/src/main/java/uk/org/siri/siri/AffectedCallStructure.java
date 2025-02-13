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
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;

/**
 * Type for information about a CALL affected by an SITUATION.
 *
 * <p>Java-Klasse für AffectedCallStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPointStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="CallCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallRealtimeGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}CallPropertyGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopArrivalGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}AffectedStopDepartureGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}HeadwayIntervalGroup"/&gt;
 *         &lt;element name="AffectedInterchanges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedInterchange" type="{http://www.siri.org.uk/siri}AffectedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCallStructure", propOrder = {
    "order",
    "callCondition",
    "vehicleAtStop",
    "vehicleLocationAtStop",
    "timingPoint",
    "boardingStretch",
    "requestStop",
    "originDisplay",
    "destinationDisplay",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "arrivalStatus",
    "arrivalPlatformName",
    "arrivalBoardingActivity",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "departureStatus",
    "departurePlatformName",
    "departureBoardingActivity",
    "aimedHeadwayInterval",
    "expectedHeadwayInterval",
    "affectedInterchanges"
})
public class AffectedCallStructure
    extends AffectedStopPointStructure {

    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "CallCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RoutePointTypeEnumeration> callCondition;
    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "VehicleLocationAtStop")
    protected LocationStructure vehicleLocationAtStop;
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
    @XmlElement(name = "ArrivalStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration arrivalStatus;
    @XmlElement(name = "ArrivalPlatformName")
    protected List<NaturalLanguageStringStructure> arrivalPlatformName;
    @XmlElement(name = "ArrivalBoardingActivity", defaultValue = "alighting")
    @XmlSchemaType(name = "NMTOKEN")
    protected ArrivalBoardingActivityEnumeration arrivalBoardingActivity;
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
    @XmlElement(name = "DepartureStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected CallStatusEnumeration departureStatus;
    @XmlElement(name = "DeparturePlatformName")
    protected List<NaturalLanguageStringStructure> departurePlatformName;
    @XmlElement(name = "DepartureBoardingActivity", defaultValue = "boarding")
    @XmlSchemaType(name = "NMTOKEN")
    protected DepartureBoardingActivityEnumeration departureBoardingActivity;
    @XmlElement(name = "AimedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration aimedHeadwayInterval;
    @XmlElement(name = "ExpectedHeadwayInterval", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration expectedHeadwayInterval;
    @XmlElement(name = "AffectedInterchanges")
    protected AffectedCallStructure.AffectedInterchanges affectedInterchanges;

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

    /**
     * Gets the value of the callCondition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the callCondition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link RoutePointTypeEnumeration }
     */
    public List<RoutePointTypeEnumeration> getCallCondition() {
        if (callCondition == null) {
            callCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.callCondition;
    }

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
     * Ruft den Wert der vehicleLocationAtStop-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getVehicleLocationAtStop() {
        return vehicleLocationAtStop;
    }

    /**
     * Legt den Wert der vehicleLocationAtStop-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setVehicleLocationAtStop(LocationStructure value) {
        this.vehicleLocationAtStop = value;
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
     * Ruft den Wert der boardingStretch-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isBoardingStretch() {
        return boardingStretch;
    }

    /**
     * Legt den Wert der boardingStretch-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setBoardingStretch(Boolean value) {
        this.boardingStretch = value;
    }

    /**
     * Ruft den Wert der requestStop-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isRequestStop() {
        return requestStop;
    }

    /**
     * Legt den Wert der requestStop-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setRequestStop(Boolean value) {
        this.requestStop = value;
    }

    /**
     * Gets the value of the originDisplay property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originDisplay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationDisplay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDestinationDisplay() {
        if (destinationDisplay == null) {
            destinationDisplay = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationDisplay;
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
     * Ruft den Wert der actualArrivalTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Legt den Wert der actualArrivalTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setActualArrivalTime(ZonedDateTime value) {
        this.actualArrivalTime = value;
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
     * Gets the value of the arrivalPlatformName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the arrivalPlatformName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalPlatformName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getArrivalPlatformName() {
        if (arrivalPlatformName == null) {
            arrivalPlatformName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.arrivalPlatformName;
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
     * Ruft den Wert der actualDepartureTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Legt den Wert der actualDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setActualDepartureTime(ZonedDateTime value) {
        this.actualDepartureTime = value;
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
     * Gets the value of the departurePlatformName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the departurePlatformName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeparturePlatformName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDeparturePlatformName() {
        if (departurePlatformName == null) {
            departurePlatformName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.departurePlatformName;
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
     * Ruft den Wert der affectedInterchanges-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedCallStructure.AffectedInterchanges }
     */
    public AffectedCallStructure.AffectedInterchanges getAffectedInterchanges() {
        return affectedInterchanges;
    }

    /**
     * Legt den Wert der affectedInterchanges-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedCallStructure.AffectedInterchanges }
     */
    public void setAffectedInterchanges(AffectedCallStructure.AffectedInterchanges value) {
        this.affectedInterchanges = value;
    }

    public AffectedCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public AffectedCallStructure withCallCondition(RoutePointTypeEnumeration... values) {
        if (values != null) {
            for (RoutePointTypeEnumeration value : values) {
                getCallCondition().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withCallCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values != null) {
            getCallCondition().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public AffectedCallStructure withVehicleLocationAtStop(LocationStructure value) {
        setVehicleLocationAtStop(value);
        return this;
    }

    public AffectedCallStructure withTimingPoint(Boolean value) {
        setTimingPoint(value);
        return this;
    }

    public AffectedCallStructure withBoardingStretch(Boolean value) {
        setBoardingStretch(value);
        return this;
    }

    public AffectedCallStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public AffectedCallStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withActualArrivalTime(ZonedDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withExpectedArrivalTime(ZonedDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public AffectedCallStructure withArrivalStatus(CallStatusEnumeration value) {
        setArrivalStatus(value);
        return this;
    }

    public AffectedCallStructure withArrivalPlatformName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getArrivalPlatformName().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withArrivalPlatformName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getArrivalPlatformName().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withArrivalBoardingActivity(ArrivalBoardingActivityEnumeration value) {
        setArrivalBoardingActivity(value);
        return this;
    }

    public AffectedCallStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withActualDepartureTime(ZonedDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withExpectedDepartureTime(ZonedDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public AffectedCallStructure withDepartureStatus(CallStatusEnumeration value) {
        setDepartureStatus(value);
        return this;
    }

    public AffectedCallStructure withDeparturePlatformName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDeparturePlatformName().add(value);
            }
        }
        return this;
    }

    public AffectedCallStructure withDeparturePlatformName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDeparturePlatformName().addAll(values);
        }
        return this;
    }

    public AffectedCallStructure withDepartureBoardingActivity(DepartureBoardingActivityEnumeration value) {
        setDepartureBoardingActivity(value);
        return this;
    }

    public AffectedCallStructure withAimedHeadwayInterval(Duration value) {
        setAimedHeadwayInterval(value);
        return this;
    }

    public AffectedCallStructure withExpectedHeadwayInterval(Duration value) {
        setExpectedHeadwayInterval(value);
        return this;
    }

    public AffectedCallStructure withAffectedInterchanges(AffectedCallStructure.AffectedInterchanges value) {
        setAffectedInterchanges(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPrivateRef(String value) {
        setPrivateRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getStopPointName().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPointType(StopPointTypeEnumeration value) {
        setStopPointType(value);
        return this;
    }

    @Override
    public AffectedCallStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopPlaceName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getStopPlaceName().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getStopPlaceName().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withAffectedModes(AffectedModesStructure value) {
        setAffectedModes(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceRef(ZoneRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    @Override
    public AffectedCallStructure withStopCondition(RoutePointTypeEnumeration... values) {
        if (values != null) {
            for (RoutePointTypeEnumeration value : values) {
                getStopCondition().add(value);
            }
        }
        return this;
    }

    @Override
    public AffectedCallStructure withStopCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values != null) {
            getStopCondition().addAll(values);
        }
        return this;
    }

    @Override
    public AffectedCallStructure withConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        setConnectionLinks(value);
        return this;
    }

    @Override
    public AffectedCallStructure withLines(AffectedStopPointStructure.Lines value) {
        setLines(value);
        return this;
    }

    @Override
    public AffectedCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedInterchange" type="{http://www.siri.org.uk/siri}AffectedInterchangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedInterchange"
    })
    public static class AffectedInterchanges {

        @XmlElement(name = "AffectedInterchange")
        protected List<AffectedInterchangeStructure> affectedInterchange;

        /**
         * Gets the value of the affectedInterchange property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedInterchange property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedInterchange().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedInterchangeStructure }
         */
        public List<AffectedInterchangeStructure> getAffectedInterchange() {
            if (affectedInterchange == null) {
                affectedInterchange = new ArrayList<AffectedInterchangeStructure>();
            }
            return this.affectedInterchange;
        }

        public AffectedCallStructure.AffectedInterchanges withAffectedInterchange(AffectedInterchangeStructure... values) {
            if (values != null) {
                for (AffectedInterchangeStructure value : values) {
                    getAffectedInterchange().add(value);
                }
            }
            return this;
        }

        public AffectedCallStructure.AffectedInterchanges withAffectedInterchange(Collection<AffectedInterchangeStructure> values) {
            if (values != null) {
                getAffectedInterchange().addAll(values);
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

}
