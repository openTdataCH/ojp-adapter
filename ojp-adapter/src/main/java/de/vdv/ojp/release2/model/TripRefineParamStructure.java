//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Trip refinement request parameter structure.
 * 
 * <p>Java-Klasse für TripRefineParamStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripRefineParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForeignObjectRefs" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RefineLegRef" type="{http://www.vdv.de/ojp}LegObjectIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripMobilityFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripContentFilterGroup"/&gt;
 *         &lt;element name="FareParam" type="{http://www.vdv.de/ojp}FareParamStructure" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripRefineParamStructure", propOrder = {
    "foreignObjectRefs",
    "refineLegRef",
    "systemId",
    "noSingleStep",
    "noStairs",
    "noEscalator",
    "noElevator",
    "noRamp",
    "noSight",
    "noTravelator",
    "levelEntrance",
    "levelEntranceOrBoardingAid",
    "bikeTransport",
    "walkSpeed",
    "additionalTransferTime",
    "hikingProfile",
    "cyclingProfile",
    "numberOfResults",
    "numberOfResultsBefore",
    "numberOfResultsAfter",
    "timeWindow",
    "useRealtimeData",
    "immediateTripStart",
    "transferLimit",
    "optimisationMethod",
    "considerElevationData",
    "includeAllRestrictedLines",
    "passengerCategory",
    "motorisedMainTravelMode",
    "itModeToCover",
    "includeAlternativeOptions",
    "includeTrackSections",
    "includeLegProjection",
    "includeTurnDescription",
    "includeAccessFeatures",
    "includeAccessFeaturesStatus",
    "includeAccessibilityDetails",
    "includePlacesContext",
    "includeSituationsContext",
    "includeIntermediateStops",
    "includeFare",
    "includeOperatingDays",
    "tripSummaryOnly",
    "fareParam",
    "extension"
})
public class TripRefineParamStructure {

    @XmlElement(name = "ForeignObjectRefs")
    protected Boolean foreignObjectRefs;
    @XmlElement(name = "RefineLegRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected List<String> refineLegRef;
    @XmlElement(name = "SystemId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String systemId;
    @XmlElement(name = "NoSingleStep", defaultValue = "false")
    protected Boolean noSingleStep;
    @XmlElement(name = "NoStairs", defaultValue = "false")
    protected Boolean noStairs;
    @XmlElement(name = "NoEscalator", defaultValue = "false")
    protected Boolean noEscalator;
    @XmlElement(name = "NoElevator", defaultValue = "false")
    protected Boolean noElevator;
    @XmlElement(name = "NoRamp", defaultValue = "false")
    protected Boolean noRamp;
    @XmlElement(name = "NoSight", defaultValue = "false")
    protected Boolean noSight;
    @XmlElement(name = "NoTravelator", defaultValue = "false")
    protected Boolean noTravelator;
    @XmlElement(name = "LevelEntrance", defaultValue = "false")
    protected Boolean levelEntrance;
    @XmlElement(name = "LevelEntranceOrBoardingAid", defaultValue = "false")
    protected Boolean levelEntranceOrBoardingAid;
    @XmlElement(name = "BikeTransport", defaultValue = "false")
    protected Boolean bikeTransport;
    @XmlElement(name = "WalkSpeed")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger walkSpeed;
    @XmlElement(name = "AdditionalTransferTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration additionalTransferTime;
    @XmlElement(name = "HikingProfile", defaultValue = "easy")
    protected String hikingProfile;
    @XmlElement(name = "CyclingProfile", defaultValue = "fast")
    protected String cyclingProfile;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "NumberOfResultsBefore", defaultValue = "0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsBefore;
    @XmlElement(name = "NumberOfResultsAfter", defaultValue = "0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfResultsAfter;
    @XmlElement(name = "TimeWindow", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeWindow;
    @XmlElement(name = "UseRealtimeData", defaultValue = "full")
    @XmlSchemaType(name = "string")
    protected UseRealtimeDataEnumeration useRealtimeData;
    @XmlElement(name = "ImmediateTripStart", defaultValue = "false")
    protected Boolean immediateTripStart;
    @XmlElement(name = "TransferLimit")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transferLimit;
    @XmlElement(name = "OptimisationMethod")
    @XmlSchemaType(name = "string")
    protected OptimisationMethodEnumeration optimisationMethod;
    @XmlElement(name = "ConsiderElevationData", defaultValue = "false")
    protected Boolean considerElevationData;
    @XmlElement(name = "IncludeAllRestrictedLines", defaultValue = "false")
    protected Boolean includeAllRestrictedLines;
    @XmlElement(name = "PassengerCategory")
    @XmlSchemaType(name = "string")
    protected List<PassengerCategoryEnumeration> passengerCategory;
    @XmlElement(name = "MotorisedMainTravelMode")
    protected Boolean motorisedMainTravelMode;
    @XmlElement(name = "ItModeToCover")
    protected List<ItModesStructure> itModeToCover;
    @XmlElement(name = "IncludeAlternativeOptions", defaultValue = "false")
    protected Boolean includeAlternativeOptions;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeLegProjection", defaultValue = "false")
    protected Boolean includeLegProjection;
    @XmlElement(name = "IncludeTurnDescription", defaultValue = "false")
    protected Boolean includeTurnDescription;
    @XmlElement(name = "IncludeAccessFeatures", defaultValue = "false")
    protected Boolean includeAccessFeatures;
    @XmlElement(name = "IncludeAccessFeaturesStatus", defaultValue = "false")
    protected Boolean includeAccessFeaturesStatus;
    @XmlElement(name = "IncludeAccessibilityDetails")
    @XmlSchemaType(name = "string")
    protected List<AccessibilityDetailsProfileEnumeration> includeAccessibilityDetails;
    @XmlElement(name = "IncludePlacesContext", defaultValue = "true")
    protected Boolean includePlacesContext;
    @XmlElement(name = "IncludeSituationsContext", defaultValue = "true")
    protected Boolean includeSituationsContext;
    @XmlElement(name = "IncludeIntermediateStops", defaultValue = "false")
    protected Boolean includeIntermediateStops;
    @XmlElement(name = "IncludeFare", defaultValue = "false")
    protected Boolean includeFare;
    @XmlElement(name = "IncludeOperatingDays", defaultValue = "false")
    protected Boolean includeOperatingDays;
    @XmlElement(name = "TripSummaryOnly", defaultValue = "false")
    protected Boolean tripSummaryOnly;
    @XmlElement(name = "FareParam")
    protected FareParamStructure fareParam;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der foreignObjectRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignObjectRefs() {
        return foreignObjectRefs;
    }

    /**
     * Legt den Wert der foreignObjectRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignObjectRefs(Boolean value) {
        this.foreignObjectRefs = value;
    }

    /**
     * Gets the value of the refineLegRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refineLegRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefineLegRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRefineLegRef() {
        if (refineLegRef == null) {
            refineLegRef = new ArrayList<String>();
        }
        return this.refineLegRef;
    }

    /**
     * Ruft den Wert der systemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Legt den Wert der systemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Ruft den Wert der noSingleStep-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSingleStep() {
        return noSingleStep;
    }

    /**
     * Legt den Wert der noSingleStep-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSingleStep(Boolean value) {
        this.noSingleStep = value;
    }

    /**
     * Ruft den Wert der noStairs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoStairs() {
        return noStairs;
    }

    /**
     * Legt den Wert der noStairs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoStairs(Boolean value) {
        this.noStairs = value;
    }

    /**
     * Ruft den Wert der noEscalator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEscalator() {
        return noEscalator;
    }

    /**
     * Legt den Wert der noEscalator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEscalator(Boolean value) {
        this.noEscalator = value;
    }

    /**
     * Ruft den Wert der noElevator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoElevator() {
        return noElevator;
    }

    /**
     * Legt den Wert der noElevator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoElevator(Boolean value) {
        this.noElevator = value;
    }

    /**
     * Ruft den Wert der noRamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoRamp() {
        return noRamp;
    }

    /**
     * Legt den Wert der noRamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoRamp(Boolean value) {
        this.noRamp = value;
    }

    /**
     * Ruft den Wert der noSight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoSight() {
        return noSight;
    }

    /**
     * Legt den Wert der noSight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoSight(Boolean value) {
        this.noSight = value;
    }

    /**
     * Ruft den Wert der noTravelator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoTravelator() {
        return noTravelator;
    }

    /**
     * Legt den Wert der noTravelator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoTravelator(Boolean value) {
        this.noTravelator = value;
    }

    /**
     * Ruft den Wert der levelEntrance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelEntrance() {
        return levelEntrance;
    }

    /**
     * Legt den Wert der levelEntrance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelEntrance(Boolean value) {
        this.levelEntrance = value;
    }

    /**
     * Ruft den Wert der levelEntranceOrBoardingAid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLevelEntranceOrBoardingAid() {
        return levelEntranceOrBoardingAid;
    }

    /**
     * Legt den Wert der levelEntranceOrBoardingAid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLevelEntranceOrBoardingAid(Boolean value) {
        this.levelEntranceOrBoardingAid = value;
    }

    /**
     * Ruft den Wert der bikeTransport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBikeTransport() {
        return bikeTransport;
    }

    /**
     * Legt den Wert der bikeTransport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBikeTransport(Boolean value) {
        this.bikeTransport = value;
    }

    /**
     * Ruft den Wert der walkSpeed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Legt den Wert der walkSpeed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWalkSpeed(BigInteger value) {
        this.walkSpeed = value;
    }

    /**
     * Ruft den Wert der additionalTransferTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAdditionalTransferTime() {
        return additionalTransferTime;
    }

    /**
     * Legt den Wert der additionalTransferTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTransferTime(Duration value) {
        this.additionalTransferTime = value;
    }

    /**
     * Ruft den Wert der hikingProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHikingProfile() {
        return hikingProfile;
    }

    /**
     * Legt den Wert der hikingProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHikingProfile(String value) {
        this.hikingProfile = value;
    }

    /**
     * Ruft den Wert der cyclingProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCyclingProfile() {
        return cyclingProfile;
    }

    /**
     * Legt den Wert der cyclingProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCyclingProfile(String value) {
        this.cyclingProfile = value;
    }

    /**
     * Ruft den Wert der numberOfResults-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Legt den Wert der numberOfResults-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResults(BigInteger value) {
        this.numberOfResults = value;
    }

    /**
     * Ruft den Wert der numberOfResultsBefore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsBefore() {
        return numberOfResultsBefore;
    }

    /**
     * Legt den Wert der numberOfResultsBefore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsBefore(BigInteger value) {
        this.numberOfResultsBefore = value;
    }

    /**
     * Ruft den Wert der numberOfResultsAfter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfResultsAfter() {
        return numberOfResultsAfter;
    }

    /**
     * Legt den Wert der numberOfResultsAfter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfResultsAfter(BigInteger value) {
        this.numberOfResultsAfter = value;
    }

    /**
     * Ruft den Wert der timeWindow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Legt den Wert der timeWindow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindow(Duration value) {
        this.timeWindow = value;
    }

    /**
     * Ruft den Wert der useRealtimeData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UseRealtimeDataEnumeration }
     *     
     */
    public UseRealtimeDataEnumeration getUseRealtimeData() {
        return useRealtimeData;
    }

    /**
     * Legt den Wert der useRealtimeData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UseRealtimeDataEnumeration }
     *     
     */
    public void setUseRealtimeData(UseRealtimeDataEnumeration value) {
        this.useRealtimeData = value;
    }

    /**
     * Ruft den Wert der immediateTripStart-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateTripStart() {
        return immediateTripStart;
    }

    /**
     * Legt den Wert der immediateTripStart-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateTripStart(Boolean value) {
        this.immediateTripStart = value;
    }

    /**
     * Ruft den Wert der transferLimit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransferLimit() {
        return transferLimit;
    }

    /**
     * Legt den Wert der transferLimit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransferLimit(BigInteger value) {
        this.transferLimit = value;
    }

    /**
     * Ruft den Wert der optimisationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public OptimisationMethodEnumeration getOptimisationMethod() {
        return optimisationMethod;
    }

    /**
     * Legt den Wert der optimisationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OptimisationMethodEnumeration }
     *     
     */
    public void setOptimisationMethod(OptimisationMethodEnumeration value) {
        this.optimisationMethod = value;
    }

    /**
     * Ruft den Wert der considerElevationData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsiderElevationData() {
        return considerElevationData;
    }

    /**
     * Legt den Wert der considerElevationData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsiderElevationData(Boolean value) {
        this.considerElevationData = value;
    }

    /**
     * Ruft den Wert der includeAllRestrictedLines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAllRestrictedLines() {
        return includeAllRestrictedLines;
    }

    /**
     * Legt den Wert der includeAllRestrictedLines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAllRestrictedLines(Boolean value) {
        this.includeAllRestrictedLines = value;
    }

    /**
     * Gets the value of the passengerCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCategoryEnumeration }
     * 
     * 
     */
    public List<PassengerCategoryEnumeration> getPassengerCategory() {
        if (passengerCategory == null) {
            passengerCategory = new ArrayList<PassengerCategoryEnumeration>();
        }
        return this.passengerCategory;
    }

    /**
     * Ruft den Wert der motorisedMainTravelMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMotorisedMainTravelMode() {
        return motorisedMainTravelMode;
    }

    /**
     * Legt den Wert der motorisedMainTravelMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMotorisedMainTravelMode(Boolean value) {
        this.motorisedMainTravelMode = value;
    }

    /**
     * Gets the value of the itModeToCover property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itModeToCover property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItModeToCover().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItModesStructure }
     * 
     * 
     */
    public List<ItModesStructure> getItModeToCover() {
        if (itModeToCover == null) {
            itModeToCover = new ArrayList<ItModesStructure>();
        }
        return this.itModeToCover;
    }

    /**
     * Ruft den Wert der includeAlternativeOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAlternativeOptions() {
        return includeAlternativeOptions;
    }

    /**
     * Legt den Wert der includeAlternativeOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAlternativeOptions(Boolean value) {
        this.includeAlternativeOptions = value;
    }

    /**
     * Ruft den Wert der includeTrackSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Legt den Wert der includeTrackSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
    }

    /**
     * Ruft den Wert der includeLegProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeLegProjection() {
        return includeLegProjection;
    }

    /**
     * Legt den Wert der includeLegProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeLegProjection(Boolean value) {
        this.includeLegProjection = value;
    }

    /**
     * Ruft den Wert der includeTurnDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTurnDescription() {
        return includeTurnDescription;
    }

    /**
     * Legt den Wert der includeTurnDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTurnDescription(Boolean value) {
        this.includeTurnDescription = value;
    }

    /**
     * Ruft den Wert der includeAccessFeatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAccessFeatures() {
        return includeAccessFeatures;
    }

    /**
     * Legt den Wert der includeAccessFeatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAccessFeatures(Boolean value) {
        this.includeAccessFeatures = value;
    }

    /**
     * Ruft den Wert der includeAccessFeaturesStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeAccessFeaturesStatus() {
        return includeAccessFeaturesStatus;
    }

    /**
     * Legt den Wert der includeAccessFeaturesStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeAccessFeaturesStatus(Boolean value) {
        this.includeAccessFeaturesStatus = value;
    }

    /**
     * Gets the value of the includeAccessibilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the includeAccessibilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeAccessibilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityDetailsProfileEnumeration }
     * 
     * 
     */
    public List<AccessibilityDetailsProfileEnumeration> getIncludeAccessibilityDetails() {
        if (includeAccessibilityDetails == null) {
            includeAccessibilityDetails = new ArrayList<AccessibilityDetailsProfileEnumeration>();
        }
        return this.includeAccessibilityDetails;
    }

    /**
     * Ruft den Wert der includePlacesContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePlacesContext() {
        return includePlacesContext;
    }

    /**
     * Legt den Wert der includePlacesContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePlacesContext(Boolean value) {
        this.includePlacesContext = value;
    }

    /**
     * Ruft den Wert der includeSituationsContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSituationsContext() {
        return includeSituationsContext;
    }

    /**
     * Legt den Wert der includeSituationsContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSituationsContext(Boolean value) {
        this.includeSituationsContext = value;
    }

    /**
     * Ruft den Wert der includeIntermediateStops-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeIntermediateStops() {
        return includeIntermediateStops;
    }

    /**
     * Legt den Wert der includeIntermediateStops-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeIntermediateStops(Boolean value) {
        this.includeIntermediateStops = value;
    }

    /**
     * Ruft den Wert der includeFare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeFare() {
        return includeFare;
    }

    /**
     * Legt den Wert der includeFare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFare(Boolean value) {
        this.includeFare = value;
    }

    /**
     * Ruft den Wert der includeOperatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeOperatingDays() {
        return includeOperatingDays;
    }

    /**
     * Legt den Wert der includeOperatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeOperatingDays(Boolean value) {
        this.includeOperatingDays = value;
    }

    /**
     * Ruft den Wert der tripSummaryOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripSummaryOnly() {
        return tripSummaryOnly;
    }

    /**
     * Legt den Wert der tripSummaryOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripSummaryOnly(Boolean value) {
        this.tripSummaryOnly = value;
    }

    /**
     * Ruft den Wert der fareParam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareParamStructure }
     *     
     */
    public FareParamStructure getFareParam() {
        return fareParam;
    }

    /**
     * Legt den Wert der fareParam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareParamStructure }
     *     
     */
    public void setFareParam(FareParamStructure value) {
        this.fareParam = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TripRefineParamStructure withForeignObjectRefs(Boolean value) {
        setForeignObjectRefs(value);
        return this;
    }

    public TripRefineParamStructure withRefineLegRef(String... values) {
        if (values!= null) {
            for (String value: values) {
                getRefineLegRef().add(value);
            }
        }
        return this;
    }

    public TripRefineParamStructure withRefineLegRef(Collection<String> values) {
        if (values!= null) {
            getRefineLegRef().addAll(values);
        }
        return this;
    }

    public TripRefineParamStructure withSystemId(String value) {
        setSystemId(value);
        return this;
    }

    public TripRefineParamStructure withNoSingleStep(Boolean value) {
        setNoSingleStep(value);
        return this;
    }

    public TripRefineParamStructure withNoStairs(Boolean value) {
        setNoStairs(value);
        return this;
    }

    public TripRefineParamStructure withNoEscalator(Boolean value) {
        setNoEscalator(value);
        return this;
    }

    public TripRefineParamStructure withNoElevator(Boolean value) {
        setNoElevator(value);
        return this;
    }

    public TripRefineParamStructure withNoRamp(Boolean value) {
        setNoRamp(value);
        return this;
    }

    public TripRefineParamStructure withNoSight(Boolean value) {
        setNoSight(value);
        return this;
    }

    public TripRefineParamStructure withNoTravelator(Boolean value) {
        setNoTravelator(value);
        return this;
    }

    public TripRefineParamStructure withLevelEntrance(Boolean value) {
        setLevelEntrance(value);
        return this;
    }

    public TripRefineParamStructure withLevelEntranceOrBoardingAid(Boolean value) {
        setLevelEntranceOrBoardingAid(value);
        return this;
    }

    public TripRefineParamStructure withBikeTransport(Boolean value) {
        setBikeTransport(value);
        return this;
    }

    public TripRefineParamStructure withWalkSpeed(BigInteger value) {
        setWalkSpeed(value);
        return this;
    }

    public TripRefineParamStructure withAdditionalTransferTime(Duration value) {
        setAdditionalTransferTime(value);
        return this;
    }

    public TripRefineParamStructure withHikingProfile(String value) {
        setHikingProfile(value);
        return this;
    }

    public TripRefineParamStructure withCyclingProfile(String value) {
        setCyclingProfile(value);
        return this;
    }

    public TripRefineParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public TripRefineParamStructure withNumberOfResultsBefore(BigInteger value) {
        setNumberOfResultsBefore(value);
        return this;
    }

    public TripRefineParamStructure withNumberOfResultsAfter(BigInteger value) {
        setNumberOfResultsAfter(value);
        return this;
    }

    public TripRefineParamStructure withTimeWindow(Duration value) {
        setTimeWindow(value);
        return this;
    }

    public TripRefineParamStructure withUseRealtimeData(UseRealtimeDataEnumeration value) {
        setUseRealtimeData(value);
        return this;
    }

    public TripRefineParamStructure withImmediateTripStart(Boolean value) {
        setImmediateTripStart(value);
        return this;
    }

    public TripRefineParamStructure withTransferLimit(BigInteger value) {
        setTransferLimit(value);
        return this;
    }

    public TripRefineParamStructure withOptimisationMethod(OptimisationMethodEnumeration value) {
        setOptimisationMethod(value);
        return this;
    }

    public TripRefineParamStructure withConsiderElevationData(Boolean value) {
        setConsiderElevationData(value);
        return this;
    }

    public TripRefineParamStructure withIncludeAllRestrictedLines(Boolean value) {
        setIncludeAllRestrictedLines(value);
        return this;
    }

    public TripRefineParamStructure withPassengerCategory(PassengerCategoryEnumeration... values) {
        if (values!= null) {
            for (PassengerCategoryEnumeration value: values) {
                getPassengerCategory().add(value);
            }
        }
        return this;
    }

    public TripRefineParamStructure withPassengerCategory(Collection<PassengerCategoryEnumeration> values) {
        if (values!= null) {
            getPassengerCategory().addAll(values);
        }
        return this;
    }

    public TripRefineParamStructure withMotorisedMainTravelMode(Boolean value) {
        setMotorisedMainTravelMode(value);
        return this;
    }

    public TripRefineParamStructure withItModeToCover(ItModesStructure... values) {
        if (values!= null) {
            for (ItModesStructure value: values) {
                getItModeToCover().add(value);
            }
        }
        return this;
    }

    public TripRefineParamStructure withItModeToCover(Collection<ItModesStructure> values) {
        if (values!= null) {
            getItModeToCover().addAll(values);
        }
        return this;
    }

    public TripRefineParamStructure withIncludeAlternativeOptions(Boolean value) {
        setIncludeAlternativeOptions(value);
        return this;
    }

    public TripRefineParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public TripRefineParamStructure withIncludeLegProjection(Boolean value) {
        setIncludeLegProjection(value);
        return this;
    }

    public TripRefineParamStructure withIncludeTurnDescription(Boolean value) {
        setIncludeTurnDescription(value);
        return this;
    }

    public TripRefineParamStructure withIncludeAccessFeatures(Boolean value) {
        setIncludeAccessFeatures(value);
        return this;
    }

    public TripRefineParamStructure withIncludeAccessFeaturesStatus(Boolean value) {
        setIncludeAccessFeaturesStatus(value);
        return this;
    }

    public TripRefineParamStructure withIncludeAccessibilityDetails(AccessibilityDetailsProfileEnumeration... values) {
        if (values!= null) {
            for (AccessibilityDetailsProfileEnumeration value: values) {
                getIncludeAccessibilityDetails().add(value);
            }
        }
        return this;
    }

    public TripRefineParamStructure withIncludeAccessibilityDetails(Collection<AccessibilityDetailsProfileEnumeration> values) {
        if (values!= null) {
            getIncludeAccessibilityDetails().addAll(values);
        }
        return this;
    }

    public TripRefineParamStructure withIncludePlacesContext(Boolean value) {
        setIncludePlacesContext(value);
        return this;
    }

    public TripRefineParamStructure withIncludeSituationsContext(Boolean value) {
        setIncludeSituationsContext(value);
        return this;
    }

    public TripRefineParamStructure withIncludeIntermediateStops(Boolean value) {
        setIncludeIntermediateStops(value);
        return this;
    }

    public TripRefineParamStructure withIncludeFare(Boolean value) {
        setIncludeFare(value);
        return this;
    }

    public TripRefineParamStructure withIncludeOperatingDays(Boolean value) {
        setIncludeOperatingDays(value);
        return this;
    }

    public TripRefineParamStructure withTripSummaryOnly(Boolean value) {
        setTripSummaryOnly(value);
        return this;
    }

    public TripRefineParamStructure withFareParam(FareParamStructure value) {
        setFareParam(value);
        return this;
    }

    public TripRefineParamStructure withExtension(Object value) {
        setExtension(value);
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