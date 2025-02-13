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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
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
 * Type for Monitored VEHICLE JOURNEY.
 *
 * <p>Java-Klasse für MonitoredVehicleJourneyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MonitoredVehicleJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredJourneyIdentityGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleJourneyInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DisruptionGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyProgressGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainOperationalInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}MonitoredCallingPatternGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredVehicleJourneyStructure", propOrder = {
    "lineRef",
    "directionRef",
    "framedVehicleJourneyRef",
    "journeyPatternRef",
    "journeyPatternName",
    "vehicleMode",
    "routeRef",
    "publishedLineName",
    "groupOfLinesRef",
    "directionName",
    "externalLineRef",
    "brandingRef",
    "branding",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "originRef",
    "originName",
    "originShortName",
    "destinationDisplayAtOrigin",
    "via",
    "destinationRef",
    "destinationName",
    "destinationShortName",
    "originDisplayAtDestination",
    "vehicleJourneyName",
    "journeyNote",
    "publicContact",
    "operationsContact",
    "headwayService",
    "originAimedDepartureTime",
    "destinationAimedArrivalTime",
    "firstOrLastJourney",
    "formationCondition",
    "facilityConditionElement",
    "facilityChangeElement",
    "situationRef",
    "monitored",
    "monitoringError",
    "inCongestion",
    "inPanic",
    "predictionInaccurate",
    "predictionInaccurateReason",
    "dataSource",
    "confidenceLevel",
    "vehicleLocation",
    "locationRecordedAtTime",
    "bearing",
    "progressRate",
    "velocity",
    "engineOn",
    "occupancy",
    "delay",
    "progressStatus",
    "vehicleStatus",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "vehicleJourneyRef",
    "vehicleRef",
    "additionalVehicleJourneyRef",
    "driverRef",
    "driverName",
    "trainNumbers",
    "journeyParts",
    "trainElements",
    "trains",
    "compoundTrains",
    "previousCalls",
    "monitoredCall",
    "onwardCalls",
    "isCompleteStopSequence"
})
public class MonitoredVehicleJourneyStructure {

    @XmlElement(name = "LineRef")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "JourneyPatternRef")
    protected JourneyPatternRefStructure journeyPatternRef;
    @XmlElement(name = "JourneyPatternName")
    protected NaturalLanguageStringStructure journeyPatternName;
    @XmlElement(name = "VehicleMode")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<VehicleModesEnumeration> vehicleMode;
    @XmlElement(name = "RouteRef")
    protected RouteRefStructure routeRef;
    @XmlElement(name = "PublishedLineName")
    protected List<NaturalLanguageStringStructure> publishedLineName;
    @XmlElement(name = "GroupOfLinesRef")
    protected GroupOfLinesRefStructure groupOfLinesRef;
    @XmlElement(name = "DirectionName")
    protected List<NaturalLanguageStringStructure> directionName;
    @XmlElement(name = "ExternalLineRef")
    protected LineRefStructure externalLineRef;
    @XmlElement(name = "BrandingRef")
    protected BrandingRefStructure brandingRef;
    @XmlElement(name = "Branding")
    protected BrandingStructure branding;
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "OriginRef")
    protected JourneyPlaceRefStructure originRef;
    @XmlElement(name = "OriginName")
    protected List<NaturalLanguagePlaceNameStructure> originName;
    @XmlElement(name = "OriginShortName")
    protected List<NaturalLanguagePlaceNameStructure> originShortName;
    @XmlElement(name = "DestinationDisplayAtOrigin")
    protected List<NaturalLanguagePlaceNameStructure> destinationDisplayAtOrigin;
    @XmlElement(name = "Via")
    protected List<ViaNameStructure> via;
    @XmlElement(name = "DestinationRef")
    protected DestinationRefStructure destinationRef;
    @XmlElement(name = "DestinationName")
    protected List<NaturalLanguageStringStructure> destinationName;
    @XmlElement(name = "DestinationShortName")
    protected List<NaturalLanguagePlaceNameStructure> destinationShortName;
    @XmlElement(name = "OriginDisplayAtDestination")
    protected List<NaturalLanguagePlaceNameStructure> originDisplayAtDestination;
    @XmlElement(name = "VehicleJourneyName")
    protected List<NaturalLanguageStringStructure> vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "PublicContact")
    protected SimpleContactStructure publicContact;
    @XmlElement(name = "OperationsContact")
    protected SimpleContactStructure operationsContact;
    @XmlElement(name = "HeadwayService", defaultValue = "false")
    protected Boolean headwayService;
    @XmlElement(name = "OriginAimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime originAimedDepartureTime;
    @XmlElement(name = "DestinationAimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime destinationAimedArrivalTime;
    @XmlElement(name = "FirstOrLastJourney", defaultValue = "unspecified")
    @XmlSchemaType(name = "NMTOKEN")
    protected FirstOrLastJourneyEnumeration firstOrLastJourney;
    @XmlElement(name = "FormationCondition")
    protected List<FormationConditionStructure> formationCondition;
    @XmlElement(name = "FacilityConditionElement")
    protected List<FacilityConditionStructure> facilityConditionElement;
    @XmlElement(name = "FacilityChangeElement")
    protected FacilityChangeStructure facilityChangeElement;
    @XmlElement(name = "SituationRef")
    protected List<SituationRefStructure> situationRef;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlList
    @XmlElement(name = "MonitoringError")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> monitoringError;
    @XmlElement(name = "InCongestion")
    protected Boolean inCongestion;
    @XmlElement(name = "InPanic", defaultValue = "false")
    protected Boolean inPanic;
    @XmlElement(name = "PredictionInaccurate", defaultValue = "false")
    protected Boolean predictionInaccurate;
    @XmlElement(name = "PredictionInaccurateReason")
    @XmlSchemaType(name = "NMTOKEN")
    protected PredictionInaccurateReasonEnumeration predictionInaccurateReason;
    @XmlElement(name = "DataSource")
    protected String dataSource;
    @XmlElement(name = "ConfidenceLevel", defaultValue = "reliable")
    @XmlSchemaType(name = "NMTOKEN")
    protected QualityIndexEnumeration confidenceLevel;
    @XmlElement(name = "VehicleLocation")
    protected LocationStructure vehicleLocation;
    @XmlElement(name = "LocationRecordedAtTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime locationRecordedAtTime;
    @XmlElement(name = "Bearing")
    protected Float bearing;
    @XmlElement(name = "ProgressRate")
    @XmlSchemaType(name = "NMTOKEN")
    protected ProgressRateEnumeration progressRate;
    @XmlElement(name = "Velocity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger velocity;
    @XmlElement(name = "EngineOn", defaultValue = "true")
    protected Boolean engineOn;
    @XmlElement(name = "Occupancy")
    @XmlSchemaType(name = "NMTOKEN")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "Delay", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration delay;
    @XmlElement(name = "ProgressStatus")
    protected List<NaturalLanguageStringStructure> progressStatus;
    @XmlElement(name = "VehicleStatus")
    @XmlSchemaType(name = "NMTOKEN")
    protected VehicleStatusEnumeration vehicleStatus;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "AdditionalVehicleJourneyRef")
    protected List<FramedVehicleJourneyRefStructure> additionalVehicleJourneyRef;
    @XmlElement(name = "DriverRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverRef;
    @XmlElement(name = "DriverName")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String driverName;
    @XmlElement(name = "TrainNumbers")
    protected MonitoredVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected MonitoredVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "TrainElements")
    protected MonitoredVehicleJourneyStructure.TrainElements trainElements;
    @XmlElement(name = "Trains")
    protected MonitoredVehicleJourneyStructure.Trains trains;
    @XmlElement(name = "CompoundTrains")
    protected MonitoredVehicleJourneyStructure.CompoundTrains compoundTrains;
    @XmlElement(name = "PreviousCalls")
    protected PreviousCallsStructure previousCalls;
    @XmlElement(name = "MonitoredCall")
    protected MonitoredCallStructure monitoredCall;
    @XmlElement(name = "OnwardCalls")
    protected OnwardCallsStructure onwardCalls;
    @XmlElement(name = "IsCompleteStopSequence", defaultValue = "false")
    protected Boolean isCompleteStopSequence;

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     *
     * @return possible object is {@link LineRefStructure }
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link LineRefStructure }
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     *
     * @return possible object is {@link DirectionRefStructure }
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DirectionRefStructure }
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Ruft den Wert der framedVehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link FramedVehicleJourneyRefStructure }
     */
    public FramedVehicleJourneyRefStructure getFramedVehicleJourneyRef() {
        return framedVehicleJourneyRef;
    }

    /**
     * Legt den Wert der framedVehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FramedVehicleJourneyRefStructure }
     */
    public void setFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        this.framedVehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der journeyPatternRef-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyPatternRefStructure }
     */
    public JourneyPatternRefStructure getJourneyPatternRef() {
        return journeyPatternRef;
    }

    /**
     * Legt den Wert der journeyPatternRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyPatternRefStructure }
     */
    public void setJourneyPatternRef(JourneyPatternRefStructure value) {
        this.journeyPatternRef = value;
    }

    /**
     * Ruft den Wert der journeyPatternName-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getJourneyPatternName() {
        return journeyPatternName;
    }

    /**
     * Legt den Wert der journeyPatternName-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setJourneyPatternName(NaturalLanguageStringStructure value) {
        this.journeyPatternName = value;
    }

    /**
     * Gets the value of the vehicleMode property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vehicleMode property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleMode().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleModesEnumeration }
     */
    public List<VehicleModesEnumeration> getVehicleMode() {
        if (vehicleMode == null) {
            vehicleMode = new ArrayList<VehicleModesEnumeration>();
        }
        return this.vehicleMode;
    }

    /**
     * Ruft den Wert der routeRef-Eigenschaft ab.
     *
     * @return possible object is {@link RouteRefStructure }
     */
    public RouteRefStructure getRouteRef() {
        return routeRef;
    }

    /**
     * Legt den Wert der routeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link RouteRefStructure }
     */
    public void setRouteRef(RouteRefStructure value) {
        this.routeRef = value;
    }

    /**
     * Name or Number by which the LINE is known to the public.  (Unbounded since SIRI 2.0) Gets the value of the publishedLineName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the publishedLineName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedLineName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getPublishedLineName() {
        if (publishedLineName == null) {
            publishedLineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.publishedLineName;
    }

    /**
     * Ruft den Wert der groupOfLinesRef-Eigenschaft ab.
     *
     * @return possible object is {@link GroupOfLinesRefStructure }
     */
    public GroupOfLinesRefStructure getGroupOfLinesRef() {
        return groupOfLinesRef;
    }

    /**
     * Legt den Wert der groupOfLinesRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link GroupOfLinesRefStructure }
     */
    public void setGroupOfLinesRef(GroupOfLinesRefStructure value) {
        this.groupOfLinesRef = value;
    }

    /**
     * Gets the value of the directionName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the directionName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDirectionName() {
        if (directionName == null) {
            directionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.directionName;
    }

    /**
     * Ruft den Wert der externalLineRef-Eigenschaft ab.
     *
     * @return possible object is {@link LineRefStructure }
     */
    public LineRefStructure getExternalLineRef() {
        return externalLineRef;
    }

    /**
     * Legt den Wert der externalLineRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link LineRefStructure }
     */
    public void setExternalLineRef(LineRefStructure value) {
        this.externalLineRef = value;
    }

    /**
     * Ruft den Wert der brandingRef-Eigenschaft ab.
     *
     * @return possible object is {@link BrandingRefStructure }
     */
    public BrandingRefStructure getBrandingRef() {
        return brandingRef;
    }

    /**
     * Legt den Wert der brandingRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link BrandingRefStructure }
     */
    public void setBrandingRef(BrandingRefStructure value) {
        this.brandingRef = value;
    }

    /**
     * Ruft den Wert der branding-Eigenschaft ab.
     *
     * @return possible object is {@link BrandingStructure }
     */
    public BrandingStructure getBranding() {
        return branding;
    }

    /**
     * Legt den Wert der branding-Eigenschaft fest.
     *
     * @param value allowed object is {@link BrandingStructure }
     */
    public void setBranding(BrandingStructure value) {
        this.branding = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorRefStructure }
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorRefStructure }
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der productCategoryRef-Eigenschaft ab.
     *
     * @return possible object is {@link ProductCategoryRefStructure }
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Legt den Wert der productCategoryRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ProductCategoryRefStructure }
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities
     * package. Corresponds to NeTEX TYPE OF SERVICe.Gets the value of the serviceFeatureRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ServiceFeatureRefStructure }
     */
    public List<ServiceFeatureRefStructure> getServiceFeatureRef() {
        if (serviceFeatureRef == null) {
            serviceFeatureRef = new ArrayList<ServiceFeatureRefStructure>();
        }
        return this.serviceFeatureRef;
    }

    /**
     * Gets the value of the vehicleFeatureRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link VehicleFeatureRefStructure }
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Ruft den Wert der originRef-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyPlaceRefStructure }
     */
    public JourneyPlaceRefStructure getOriginRef() {
        return originRef;
    }

    /**
     * Legt den Wert der originRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyPlaceRefStructure }
     */
    public void setOriginRef(JourneyPlaceRefStructure value) {
        this.originRef = value;
    }

    /**
     * Gets the value of the originName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginName() {
        if (originName == null) {
            originName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originName;
    }

    /**
     * Gets the value of the originShortName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originShortName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginShortName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginShortName() {
        if (originShortName == null) {
            originShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originShortName;
    }

    /**
     * Gets the value of the destinationDisplayAtOrigin property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationDisplayAtOrigin property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationDisplayAtOrigin().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationDisplayAtOrigin() {
        if (destinationDisplayAtOrigin == null) {
            destinationDisplayAtOrigin = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationDisplayAtOrigin;
    }

    /**
     * Gets the value of the via property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the via property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ViaNameStructure }
     */
    public List<ViaNameStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ViaNameStructure>();
        }
        return this.via;
    }

    /**
     * Reference to a DESTINATION.
     *
     * @return possible object is {@link DestinationRefStructure }
     */
    public DestinationRefStructure getDestinationRef() {
        return destinationRef;
    }

    /**
     * Legt den Wert der destinationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DestinationRefStructure }
     */
    public void setDestinationRef(DestinationRefStructure value) {
        this.destinationRef = value;
    }

    /**
     * Gets the value of the destinationName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDestinationName() {
        if (destinationName == null) {
            destinationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.destinationName;
    }

    /**
     * Gets the value of the destinationShortName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the destinationShortName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationShortName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getDestinationShortName() {
        if (destinationShortName == null) {
            destinationShortName = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.destinationShortName;
    }

    /**
     * Gets the value of the originDisplayAtDestination property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the originDisplayAtDestination property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDisplayAtDestination().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getOriginDisplayAtDestination() {
        if (originDisplayAtDestination == null) {
            originDisplayAtDestination = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.originDisplayAtDestination;
    }

    /**
     * Gets the value of the vehicleJourneyName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the vehicleJourneyName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleJourneyName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getVehicleJourneyName() {
        if (vehicleJourneyName == null) {
            vehicleJourneyName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.vehicleJourneyName;
    }

    /**
     * Gets the value of the journeyNote property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the journeyNote property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getJourneyNote() {
        if (journeyNote == null) {
            journeyNote = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.journeyNote;
    }

    /**
     * Ruft den Wert der publicContact-Eigenschaft ab.
     *
     * @return possible object is {@link SimpleContactStructure }
     */
    public SimpleContactStructure getPublicContact() {
        return publicContact;
    }

    /**
     * Legt den Wert der publicContact-Eigenschaft fest.
     *
     * @param value allowed object is {@link SimpleContactStructure }
     */
    public void setPublicContact(SimpleContactStructure value) {
        this.publicContact = value;
    }

    /**
     * Ruft den Wert der operationsContact-Eigenschaft ab.
     *
     * @return possible object is {@link SimpleContactStructure }
     */
    public SimpleContactStructure getOperationsContact() {
        return operationsContact;
    }

    /**
     * Legt den Wert der operationsContact-Eigenschaft fest.
     *
     * @param value allowed object is {@link SimpleContactStructure }
     */
    public void setOperationsContact(SimpleContactStructure value) {
        this.operationsContact = value;
    }

    /**
     * Ruft den Wert der headwayService-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isHeadwayService() {
        return headwayService;
    }

    /**
     * Legt den Wert der headwayService-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setHeadwayService(Boolean value) {
        this.headwayService = value;
    }

    /**
     * Ruft den Wert der originAimedDepartureTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getOriginAimedDepartureTime() {
        return originAimedDepartureTime;
    }

    /**
     * Legt den Wert der originAimedDepartureTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setOriginAimedDepartureTime(ZonedDateTime value) {
        this.originAimedDepartureTime = value;
    }

    /**
     * Ruft den Wert der destinationAimedArrivalTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getDestinationAimedArrivalTime() {
        return destinationAimedArrivalTime;
    }

    /**
     * Legt den Wert der destinationAimedArrivalTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDestinationAimedArrivalTime(ZonedDateTime value) {
        this.destinationAimedArrivalTime = value;
    }

    /**
     * Ruft den Wert der firstOrLastJourney-Eigenschaft ab.
     *
     * @return possible object is {@link FirstOrLastJourneyEnumeration }
     */
    public FirstOrLastJourneyEnumeration getFirstOrLastJourney() {
        return firstOrLastJourney;
    }

    /**
     * Legt den Wert der firstOrLastJourney-Eigenschaft fest.
     *
     * @param value allowed object is {@link FirstOrLastJourneyEnumeration }
     */
    public void setFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        this.firstOrLastJourney = value;
    }

    /**
     * Information about a change of the formation (e.g. TRAIN composition) or changes of vehicles within the formation. (since SIRI 2.1) Gets the value of the formationCondition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the formationCondition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormationCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FormationConditionStructure }
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
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the facilityConditionElement property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityConditionElement().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FacilityConditionStructure }
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
     * @return possible object is {@link FacilityChangeStructure }
     */
    public FacilityChangeStructure getFacilityChangeElement() {
        return facilityChangeElement;
    }

    /**
     * Legt den Wert der facilityChangeElement-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityChangeStructure }
     */
    public void setFacilityChangeElement(FacilityChangeStructure value) {
        this.facilityChangeElement = value;
    }

    /**
     * Gets the value of the situationRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the situationRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SituationRefStructure }
     */
    public List<SituationRefStructure> getSituationRef() {
        if (situationRef == null) {
            situationRef = new ArrayList<SituationRefStructure>();
        }
        return this.situationRef;
    }

    /**
     * Ruft den Wert der monitored-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isMonitored() {
        return monitored;
    }

    /**
     * Legt den Wert der monitored-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMonitored(Boolean value) {
        this.monitored = value;
    }

    /**
     * Gets the value of the monitoringError property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the monitoringError property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoringError().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getMonitoringError() {
        if (monitoringError == null) {
            monitoringError = new ArrayList<String>();
        }
        return this.monitoringError;
    }

    /**
     * Ruft den Wert der inCongestion-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isInCongestion() {
        return inCongestion;
    }

    /**
     * Legt den Wert der inCongestion-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setInCongestion(Boolean value) {
        this.inCongestion = value;
    }

    /**
     * Ruft den Wert der inPanic-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isInPanic() {
        return inPanic;
    }

    /**
     * Legt den Wert der inPanic-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setInPanic(Boolean value) {
        this.inPanic = value;
    }

    /**
     * Ruft den Wert der predictionInaccurate-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isPredictionInaccurate() {
        return predictionInaccurate;
    }

    /**
     * Legt den Wert der predictionInaccurate-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setPredictionInaccurate(Boolean value) {
        this.predictionInaccurate = value;
    }

    /**
     * Ruft den Wert der predictionInaccurateReason-Eigenschaft ab.
     *
     * @return possible object is {@link PredictionInaccurateReasonEnumeration }
     */
    public PredictionInaccurateReasonEnumeration getPredictionInaccurateReason() {
        return predictionInaccurateReason;
    }

    /**
     * Legt den Wert der predictionInaccurateReason-Eigenschaft fest.
     *
     * @param value allowed object is {@link PredictionInaccurateReasonEnumeration }
     */
    public void setPredictionInaccurateReason(PredictionInaccurateReasonEnumeration value) {
        this.predictionInaccurateReason = value;
    }

    /**
     * Ruft den Wert der dataSource-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * Legt den Wert der dataSource-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * Ruft den Wert der confidenceLevel-Eigenschaft ab.
     *
     * @return possible object is {@link QualityIndexEnumeration }
     */
    public QualityIndexEnumeration getConfidenceLevel() {
        return confidenceLevel;
    }

    /**
     * Legt den Wert der confidenceLevel-Eigenschaft fest.
     *
     * @param value allowed object is {@link QualityIndexEnumeration }
     */
    public void setConfidenceLevel(QualityIndexEnumeration value) {
        this.confidenceLevel = value;
    }

    /**
     * Ruft den Wert der vehicleLocation-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getVehicleLocation() {
        return vehicleLocation;
    }

    /**
     * Legt den Wert der vehicleLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setVehicleLocation(LocationStructure value) {
        this.vehicleLocation = value;
    }

    /**
     * Ruft den Wert der locationRecordedAtTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getLocationRecordedAtTime() {
        return locationRecordedAtTime;
    }

    /**
     * Legt den Wert der locationRecordedAtTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLocationRecordedAtTime(ZonedDateTime value) {
        this.locationRecordedAtTime = value;
    }

    /**
     * Ruft den Wert der bearing-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getBearing() {
        return bearing;
    }

    /**
     * Legt den Wert der bearing-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setBearing(Float value) {
        this.bearing = value;
    }

    /**
     * Ruft den Wert der progressRate-Eigenschaft ab.
     *
     * @return possible object is {@link ProgressRateEnumeration }
     */
    public ProgressRateEnumeration getProgressRate() {
        return progressRate;
    }

    /**
     * Legt den Wert der progressRate-Eigenschaft fest.
     *
     * @param value allowed object is {@link ProgressRateEnumeration }
     */
    public void setProgressRate(ProgressRateEnumeration value) {
        this.progressRate = value;
    }

    /**
     * Ruft den Wert der velocity-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getVelocity() {
        return velocity;
    }

    /**
     * Legt den Wert der velocity-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setVelocity(BigInteger value) {
        this.velocity = value;
    }

    /**
     * Ruft den Wert der engineOn-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isEngineOn() {
        return engineOn;
    }

    /**
     * Legt den Wert der engineOn-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setEngineOn(Boolean value) {
        this.engineOn = value;
    }

    /**
     * Ruft den Wert der occupancy-Eigenschaft ab.
     *
     * @return possible object is {@link OccupancyEnumeration }
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Legt den Wert der occupancy-Eigenschaft fest.
     *
     * @param value allowed object is {@link OccupancyEnumeration }
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    /**
     * Ruft den Wert der delay-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getDelay() {
        return delay;
    }

    /**
     * Legt den Wert der delay-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDelay(Duration value) {
        this.delay = value;
    }

    /**
     * Gets the value of the progressStatus property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the progressStatus property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgressStatus().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getProgressStatus() {
        if (progressStatus == null) {
            progressStatus = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.progressStatus;
    }

    /**
     * Ruft den Wert der vehicleStatus-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleStatusEnumeration }
     */
    public VehicleStatusEnumeration getVehicleStatus() {
        return vehicleStatus;
    }

    /**
     * Legt den Wert der vehicleStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleStatusEnumeration }
     */
    public void setVehicleStatus(VehicleStatusEnumeration value) {
        this.vehicleStatus = value;
    }

    /**
     * Gets the value of the trainBlockPart property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the trainBlockPart property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainBlockPart().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TrainBlockPartStructure }
     */
    public List<TrainBlockPartStructure> getTrainBlockPart() {
        if (trainBlockPart == null) {
            trainBlockPart = new ArrayList<TrainBlockPartStructure>();
        }
        return this.trainBlockPart;
    }

    /**
     * Ruft den Wert der blockRef-Eigenschaft ab.
     *
     * @return possible object is {@link BlockRefStructure }
     */
    public BlockRefStructure getBlockRef() {
        return blockRef;
    }

    /**
     * Legt den Wert der blockRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link BlockRefStructure }
     */
    public void setBlockRef(BlockRefStructure value) {
        this.blockRef = value;
    }

    /**
     * Ruft den Wert der courseOfJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link CourseOfJourneyRefStructure }
     */
    public CourseOfJourneyRefStructure getCourseOfJourneyRef() {
        return courseOfJourneyRef;
    }

    /**
     * Legt den Wert der courseOfJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link CourseOfJourneyRefStructure }
     */
    public void setCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        this.courseOfJourneyRef = value;
    }

    /**
     * Ruft den Wert der vehicleJourneyRef-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleJourneyRefStructure }
     */
    public VehicleJourneyRefStructure getVehicleJourneyRef() {
        return vehicleJourneyRef;
    }

    /**
     * Legt den Wert der vehicleJourneyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleJourneyRefStructure }
     */
    public void setVehicleJourneyRef(VehicleJourneyRefStructure value) {
        this.vehicleJourneyRef = value;
    }

    /**
     * Ruft den Wert der vehicleRef-Eigenschaft ab.
     *
     * @return possible object is {@link VehicleRefStructure }
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link VehicleRefStructure }
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Gets the value of the additionalVehicleJourneyRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the additionalVehicleJourneyRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalVehicleJourneyRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FramedVehicleJourneyRefStructure }
     */
    public List<FramedVehicleJourneyRefStructure> getAdditionalVehicleJourneyRef() {
        if (additionalVehicleJourneyRef == null) {
            additionalVehicleJourneyRef = new ArrayList<FramedVehicleJourneyRefStructure>();
        }
        return this.additionalVehicleJourneyRef;
    }

    /**
     * Ruft den Wert der driverRef-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDriverRef() {
        return driverRef;
    }

    /**
     * Legt den Wert der driverRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDriverRef(String value) {
        this.driverRef = value;
    }

    /**
     * Ruft den Wert der driverName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * Legt den Wert der driverName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDriverName(String value) {
        this.driverName = value;
    }

    /**
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     */
    public MonitoredVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredVehicleJourneyStructure.TrainNumbers }
     */
    public void setTrainNumbers(MonitoredVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der journeyParts-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredVehicleJourneyStructure.JourneyParts }
     */
    public MonitoredVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Legt den Wert der journeyParts-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredVehicleJourneyStructure.JourneyParts }
     */
    public void setJourneyParts(MonitoredVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    /**
     * Ruft den Wert der trainElements-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredVehicleJourneyStructure.TrainElements }
     */
    public MonitoredVehicleJourneyStructure.TrainElements getTrainElements() {
        return trainElements;
    }

    /**
     * Legt den Wert der trainElements-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredVehicleJourneyStructure.TrainElements }
     */
    public void setTrainElements(MonitoredVehicleJourneyStructure.TrainElements value) {
        this.trainElements = value;
    }

    /**
     * Ruft den Wert der trains-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredVehicleJourneyStructure.Trains }
     */
    public MonitoredVehicleJourneyStructure.Trains getTrains() {
        return trains;
    }

    /**
     * Legt den Wert der trains-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredVehicleJourneyStructure.Trains }
     */
    public void setTrains(MonitoredVehicleJourneyStructure.Trains value) {
        this.trains = value;
    }

    /**
     * Ruft den Wert der compoundTrains-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredVehicleJourneyStructure.CompoundTrains }
     */
    public MonitoredVehicleJourneyStructure.CompoundTrains getCompoundTrains() {
        return compoundTrains;
    }

    /**
     * Legt den Wert der compoundTrains-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredVehicleJourneyStructure.CompoundTrains }
     */
    public void setCompoundTrains(MonitoredVehicleJourneyStructure.CompoundTrains value) {
        this.compoundTrains = value;
    }

    /**
     * Ruft den Wert der previousCalls-Eigenschaft ab.
     *
     * @return possible object is {@link PreviousCallsStructure }
     */
    public PreviousCallsStructure getPreviousCalls() {
        return previousCalls;
    }

    /**
     * Legt den Wert der previousCalls-Eigenschaft fest.
     *
     * @param value allowed object is {@link PreviousCallsStructure }
     */
    public void setPreviousCalls(PreviousCallsStructure value) {
        this.previousCalls = value;
    }

    /**
     * Ruft den Wert der monitoredCall-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredCallStructure }
     */
    public MonitoredCallStructure getMonitoredCall() {
        return monitoredCall;
    }

    /**
     * Legt den Wert der monitoredCall-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredCallStructure }
     */
    public void setMonitoredCall(MonitoredCallStructure value) {
        this.monitoredCall = value;
    }

    /**
     * Ruft den Wert der onwardCalls-Eigenschaft ab.
     *
     * @return possible object is {@link OnwardCallsStructure }
     */
    public OnwardCallsStructure getOnwardCalls() {
        return onwardCalls;
    }

    /**
     * Legt den Wert der onwardCalls-Eigenschaft fest.
     *
     * @param value allowed object is {@link OnwardCallsStructure }
     */
    public void setOnwardCalls(OnwardCallsStructure value) {
        this.onwardCalls = value;
    }

    /**
     * Ruft den Wert der isCompleteStopSequence-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIsCompleteStopSequence() {
        return isCompleteStopSequence;
    }

    /**
     * Legt den Wert der isCompleteStopSequence-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIsCompleteStopSequence(Boolean value) {
        this.isCompleteStopSequence = value;
    }

    public MonitoredVehicleJourneyStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyPatternRef(JourneyPatternRefStructure value) {
        setJourneyPatternRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyPatternName(NaturalLanguageStringStructure value) {
        setJourneyPatternName(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleMode(VehicleModesEnumeration... values) {
        if (values != null) {
            for (VehicleModesEnumeration value : values) {
                getVehicleMode().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleMode(Collection<VehicleModesEnumeration> values) {
        if (values != null) {
            getVehicleMode().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublishedLineName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getPublishedLineName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublishedLineName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getPublishedLineName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withGroupOfLinesRef(GroupOfLinesRefStructure value) {
        setGroupOfLinesRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDirectionName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDirectionName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDirectionName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withExternalLineRef(LineRefStructure value) {
        setExternalLineRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withBranding(BrandingStructure value) {
        setBranding(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values != null) {
            for (ServiceFeatureRefStructure value : values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values != null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values != null) {
            for (VehicleFeatureRefStructure value : values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values != null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginRef(JourneyPlaceRefStructure value) {
        setOriginRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginShortName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginShortName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationDisplayAtOrigin(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationDisplayAtOrigin().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationDisplayAtOrigin(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationDisplayAtOrigin().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVia(ViaNameStructure... values) {
        if (values != null) {
            for (ViaNameStructure value : values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVia(Collection<ViaNameStructure> values) {
        if (values != null) {
            getVia().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationRef(DestinationRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationShortName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationShortName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginDisplayAtDestination(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginDisplayAtDestination().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginDisplayAtDestination(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginDisplayAtDestination().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getVehicleJourneyName().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getVehicleJourneyName().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyNote(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getJourneyNote().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyNote(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getJourneyNote().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withPublicContact(SimpleContactStructure value) {
        setPublicContact(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOperationsContact(SimpleContactStructure value) {
        setOperationsContact(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withHeadwayService(Boolean value) {
        setHeadwayService(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOriginAimedDepartureTime(ZonedDateTime value) {
        setOriginAimedDepartureTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDestinationAimedArrivalTime(ZonedDateTime value) {
        setDestinationAimedArrivalTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        setFirstOrLastJourney(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withFormationCondition(FormationConditionStructure... values) {
        if (values != null) {
            for (FormationConditionStructure value : values) {
                getFormationCondition().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFormationCondition(Collection<FormationConditionStructure> values) {
        if (values != null) {
            getFormationCondition().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityConditionElement(FacilityConditionStructure... values) {
        if (values != null) {
            for (FacilityConditionStructure value : values) {
                getFacilityConditionElement().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityConditionElement(Collection<FacilityConditionStructure> values) {
        if (values != null) {
            getFacilityConditionElement().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withFacilityChangeElement(FacilityChangeStructure value) {
        setFacilityChangeElement(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withSituationRef(SituationRefStructure... values) {
        if (values != null) {
            for (SituationRefStructure value : values) {
                getSituationRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withSituationRef(Collection<SituationRefStructure> values) {
        if (values != null) {
            getSituationRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoringError(String... values) {
        if (values != null) {
            for (String value : values) {
                getMonitoringError().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoringError(Collection<String> values) {
        if (values != null) {
            getMonitoringError().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withInCongestion(Boolean value) {
        setInCongestion(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withInPanic(Boolean value) {
        setInPanic(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPredictionInaccurate(Boolean value) {
        setPredictionInaccurate(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPredictionInaccurateReason(PredictionInaccurateReasonEnumeration value) {
        setPredictionInaccurateReason(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDataSource(String value) {
        setDataSource(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withConfidenceLevel(QualityIndexEnumeration value) {
        setConfidenceLevel(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleLocation(LocationStructure value) {
        setVehicleLocation(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withLocationRecordedAtTime(ZonedDateTime value) {
        setLocationRecordedAtTime(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withBearing(Float value) {
        setBearing(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressRate(ProgressRateEnumeration value) {
        setProgressRate(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVelocity(BigInteger value) {
        setVelocity(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withEngineOn(Boolean value) {
        setEngineOn(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOccupancy(OccupancyEnumeration value) {
        setOccupancy(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDelay(Duration value) {
        setDelay(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressStatus(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getProgressStatus().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withProgressStatus(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getProgressStatus().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleStatus(VehicleStatusEnumeration value) {
        setVehicleStatus(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainBlockPart(TrainBlockPartStructure... values) {
        if (values != null) {
            for (TrainBlockPartStructure value : values) {
                getTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainBlockPart(Collection<TrainBlockPartStructure> values) {
        if (values != null) {
            getTrainBlockPart().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withBlockRef(BlockRefStructure value) {
        setBlockRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        setCourseOfJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleJourneyRef(VehicleJourneyRefStructure value) {
        setVehicleJourneyRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withAdditionalVehicleJourneyRef(FramedVehicleJourneyRefStructure... values) {
        if (values != null) {
            for (FramedVehicleJourneyRefStructure value : values) {
                getAdditionalVehicleJourneyRef().add(value);
            }
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withAdditionalVehicleJourneyRef(Collection<FramedVehicleJourneyRefStructure> values) {
        if (values != null) {
            getAdditionalVehicleJourneyRef().addAll(values);
        }
        return this;
    }

    public MonitoredVehicleJourneyStructure withDriverRef(String value) {
        setDriverRef(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withDriverName(String value) {
        setDriverName(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainNumbers(MonitoredVehicleJourneyStructure.TrainNumbers value) {
        setTrainNumbers(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withJourneyParts(MonitoredVehicleJourneyStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrainElements(MonitoredVehicleJourneyStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withTrains(MonitoredVehicleJourneyStructure.Trains value) {
        setTrains(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withCompoundTrains(MonitoredVehicleJourneyStructure.CompoundTrains value) {
        setCompoundTrains(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withPreviousCalls(PreviousCallsStructure value) {
        setPreviousCalls(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withMonitoredCall(MonitoredCallStructure value) {
        setMonitoredCall(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withOnwardCalls(OnwardCallsStructure value) {
        setOnwardCalls(value);
        return this;
    }

    public MonitoredVehicleJourneyStructure withIsCompleteStopSequence(Boolean value) {
        setIsCompleteStopSequence(value);
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="CompoundTrainRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}CompoundTrain"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "compoundTrainRefOrCompoundTrain"
    })
    public static class CompoundTrains {

        @XmlElements({
            @XmlElement(name = "CompoundTrainRef"),
            @XmlElement(name = "CompoundTrain", type = CompoundTrainStructure.class)
        })
        protected List<Object> compoundTrainRefOrCompoundTrain;

        /**
         * Gets the value of the compoundTrainRefOrCompoundTrain property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the compoundTrainRefOrCompoundTrain property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCompoundTrainRefOrCompoundTrain().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link Object } {@link CompoundTrainStructure }
         */
        public List<Object> getCompoundTrainRefOrCompoundTrain() {
            if (compoundTrainRefOrCompoundTrain == null) {
                compoundTrainRefOrCompoundTrain = new ArrayList<Object>();
            }
            return this.compoundTrainRefOrCompoundTrain;
        }

        public MonitoredVehicleJourneyStructure.CompoundTrains withCompoundTrainRefOrCompoundTrain(Object... values) {
            if (values != null) {
                for (Object value : values) {
                    getCompoundTrainRefOrCompoundTrain().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.CompoundTrains withCompoundTrainRefOrCompoundTrain(Collection<Object> values) {
            if (values != null) {
                getCompoundTrainRefOrCompoundTrain().addAll(values);
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
     *         &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}JourneyPartInfoStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "journeyPartInfo"
    })
    public static class JourneyParts {

        @XmlElement(name = "JourneyPartInfo", required = true)
        protected List<JourneyPartInfoStructure> journeyPartInfo;

        /**
         * Gets the value of the journeyPartInfo property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPartInfo property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPartInfo().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link JourneyPartInfoStructure }
         */
        public List<JourneyPartInfoStructure> getJourneyPartInfo() {
            if (journeyPartInfo == null) {
                journeyPartInfo = new ArrayList<JourneyPartInfoStructure>();
            }
            return this.journeyPartInfo;
        }

        public MonitoredVehicleJourneyStructure.JourneyParts withJourneyPartInfo(JourneyPartInfoStructure... values) {
            if (values != null) {
                for (JourneyPartInfoStructure value : values) {
                    getJourneyPartInfo().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.JourneyParts withJourneyPartInfo(Collection<JourneyPartInfoStructure> values) {
            if (values != null) {
                getJourneyPartInfo().addAll(values);
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainElementRef"/&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainElement"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainElementRefOrTrainElement"
    })
    public static class TrainElements {

        @XmlElements({
            @XmlElement(name = "TrainElementRef", type = TrainElementRefStructure.class),
            @XmlElement(name = "TrainElement", type = TrainElementStructure.class)
        })
        protected List<Object> trainElementRefOrTrainElement;

        /**
         * Gets the value of the trainElementRefOrTrainElement property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainElementRefOrTrainElement property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainElementRefOrTrainElement().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link TrainElementRefStructure } {@link TrainElementStructure }
         */
        public List<Object> getTrainElementRefOrTrainElement() {
            if (trainElementRefOrTrainElement == null) {
                trainElementRefOrTrainElement = new ArrayList<Object>();
            }
            return this.trainElementRefOrTrainElement;
        }

        public MonitoredVehicleJourneyStructure.TrainElements withTrainElementRefOrTrainElement(Object... values) {
            if (values != null) {
                for (Object value : values) {
                    getTrainElementRefOrTrainElement().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.TrainElements withTrainElementRefOrTrainElement(Collection<Object> values) {
            if (values != null) {
                getTrainElementRefOrTrainElement().addAll(values);
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
     *         &lt;element name="TrainNumberRef" type="{http://www.siri.org.uk/siri}TrainNumberRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainNumberRef"
    })
    public static class TrainNumbers {

        @XmlElement(name = "TrainNumberRef", required = true)
        protected List<TrainNumberRefStructure> trainNumberRef;

        /**
         * Gets the value of the trainNumberRef property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainNumberRef property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainNumberRef().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link TrainNumberRefStructure }
         */
        public List<TrainNumberRefStructure> getTrainNumberRef() {
            if (trainNumberRef == null) {
                trainNumberRef = new ArrayList<TrainNumberRefStructure>();
            }
            return this.trainNumberRef;
        }

        public MonitoredVehicleJourneyStructure.TrainNumbers withTrainNumberRef(TrainNumberRefStructure... values) {
            if (values != null) {
                for (TrainNumberRefStructure value : values) {
                    getTrainNumberRef().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.TrainNumbers withTrainNumberRef(Collection<TrainNumberRefStructure> values) {
            if (values != null) {
                getTrainNumberRef().addAll(values);
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

    /**
     * <p>Java-Klasse für anonymous complex type.
     *
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element name="TrainRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}Train"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainRefOrTrain"
    })
    public static class Trains {

        @XmlElements({
            @XmlElement(name = "TrainRef"),
            @XmlElement(name = "Train", type = TrainStructure.class)
        })
        protected List<Object> trainRefOrTrain;

        /**
         * Gets the value of the trainRefOrTrain property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainRefOrTrain property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainRefOrTrain().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link Object } {@link TrainStructure }
         */
        public List<Object> getTrainRefOrTrain() {
            if (trainRefOrTrain == null) {
                trainRefOrTrain = new ArrayList<Object>();
            }
            return this.trainRefOrTrain;
        }

        public MonitoredVehicleJourneyStructure.Trains withTrainRefOrTrain(Object... values) {
            if (values != null) {
                for (Object value : values) {
                    getTrainRefOrTrain().add(value);
                }
            }
            return this;
        }

        public MonitoredVehicleJourneyStructure.Trains withTrainRefOrTrain(Collection<Object> values) {
            if (values != null) {
                getTrainRefOrTrain().addAll(values);
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
