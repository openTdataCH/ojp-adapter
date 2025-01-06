//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.JourneyRelationsStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.MonitoredVehicleJourneyStructure;
import uk.org.siri.siri.OccupancyEnumeration;
import uk.org.siri.siri.OperatorRefStructure;
import uk.org.siri.siri.ProductCategoryRefStructure;
import uk.org.siri.siri.ServiceFeatureRefStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.siri.VehicleFeatureRefStructure;
import uk.org.siri.siri.VehicleRefStructure;


/**
 * [equivalent to  DATED VEHICLE JOURNEY in TMv6]  passenger carrying VEHICLE JOURNEY for one specified DAY TYPE for which the pattern of working is in principle defined by a SERVICE JOURNEY PATTERN. DatedJourney details of a service include its operating days. 
 * 
 * <p>Java-Klasse für DatedJourneyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DatedJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.vdv.de/ojp}DatedJourneyGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyFormationGroup"/&gt;
 *         &lt;element name="BookingArrangements" type="{http://www.vdv.de/ojp}BookingArrangementsContainerStructure" minOccurs="0"/&gt;
 *         &lt;element name="ReservationNeeded" type="{http://www.vdv.de/ojp}ReservationNeededEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
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
@XmlType(name = "DatedJourneyStructure", propOrder = {
    "conventionalModeOfOperation",
    "operatingDayRef",
    "journeyRef",
    "publicCode",
    "lineRef",
    "directionRef",
    "mode",
    "productCategory",
    "publishedServiceName",
    "trainNumber",
    "vehicleRef",
    "operatorRefs",
    "routeDescription",
    "via",
    "restricted",
    "restrictionNote",
    "attribute",
    "originStopPointRef",
    "originText",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "destinationStopPointRef",
    "destinationText",
    "unplanned",
    "cancelled",
    "deviation",
    "undefinedDelay",
    "occupancy",
    "journeyRelations",
    "trainElements",
    "trains",
    "compoundTrains",
    "bookingArrangements",
    "reservationNeeded",
    "situationFullRefs",
    "extension"
})
public class DatedJourneyStructure {

    @XmlElement(name = "ConventionalModeOfOperation", defaultValue = "scheduled")
    @XmlSchemaType(name = "string")
    protected ConventionalModesOfOperationEnumeration conventionalModeOfOperation;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "JourneyRef")
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri")
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Mode")
    protected ModeStructure mode;
    @XmlElement(name = "ProductCategory")
    protected ProductCategoryStructure productCategory;
    @XmlElement(name = "PublishedServiceName")
    protected InternationalTextStructure publishedServiceName;
    @XmlElement(name = "TrainNumber")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String trainNumber;
    @XmlElement(name = "VehicleRef", namespace = "http://www.siri.org.uk/siri")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "OperatorRefs")
    protected OperatorRefs_RelStructure operatorRefs;
    @XmlElement(name = "RouteDescription")
    protected InternationalTextStructure routeDescription;
    @XmlElement(name = "Via")
    protected List<ServiceViaPointStructure> via;
    @XmlElement(name = "Restricted")
    protected Boolean restricted;
    @XmlElement(name = "RestrictionNote")
    protected InternationalTextStructure restrictionNote;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;
    @XmlElement(name = "OriginStopPointRef")
    protected StopPointRefStructure originStopPointRef;
    @XmlElement(name = "OriginText")
    protected InternationalTextStructure originText;
    @XmlElement(name = "OperatorRef", namespace = "http://www.siri.org.uk/siri")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef", namespace = "http://www.siri.org.uk/siri")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef", namespace = "http://www.siri.org.uk/siri")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef", namespace = "http://www.siri.org.uk/siri")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "DestinationStopPointRef")
    protected StopPointRefStructure destinationStopPointRef;
    @XmlElement(name = "DestinationText")
    protected InternationalTextStructure destinationText;
    @XmlElement(name = "Unplanned", defaultValue = "false")
    protected Boolean unplanned;
    @XmlElement(name = "Cancelled", defaultValue = "false")
    protected Boolean cancelled;
    @XmlElement(name = "Deviation", defaultValue = "false")
    protected Boolean deviation;
    @XmlElement(name = "UndefinedDelay", defaultValue = "false")
    protected Boolean undefinedDelay;
    @XmlElement(name = "Occupancy")
    @XmlSchemaType(name = "NMTOKEN")
    protected OccupancyEnumeration occupancy;
    @XmlElement(name = "JourneyRelations")
    protected JourneyRelationsStructure journeyRelations;
    @XmlElement(name = "TrainElements", namespace = "http://www.siri.org.uk/siri")
    protected MonitoredVehicleJourneyStructure.TrainElements trainElements;
    @XmlElement(name = "Trains", namespace = "http://www.siri.org.uk/siri")
    protected MonitoredVehicleJourneyStructure.Trains trains;
    @XmlElement(name = "CompoundTrains", namespace = "http://www.siri.org.uk/siri")
    protected MonitoredVehicleJourneyStructure.CompoundTrains compoundTrains;
    @XmlElement(name = "BookingArrangements")
    protected BookingArrangementsContainerStructure bookingArrangements;
    @XmlElement(name = "ReservationNeeded", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected ReservationNeededEnumeration reservationNeeded;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der conventionalModeOfOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConventionalModesOfOperationEnumeration }
     *     
     */
    public ConventionalModesOfOperationEnumeration getConventionalModeOfOperation() {
        return conventionalModeOfOperation;
    }

    /**
     * Legt den Wert der conventionalModeOfOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConventionalModesOfOperationEnumeration }
     *     
     */
    public void setConventionalModeOfOperation(ConventionalModesOfOperationEnumeration value) {
        this.conventionalModeOfOperation = value;
    }

    /**
     * Reference to an OPERATING DAY.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public OperatingDayRefStructure getOperatingDayRef() {
        return operatingDayRef;
    }

    /**
     * Legt den Wert der operatingDayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDayRefStructure }
     *     
     */
    public void setOperatingDayRef(OperatingDayRefStructure value) {
        this.operatingDayRef = value;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRefStructure }
     *     
     */
    public JourneyRefStructure getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRefStructure }
     *     
     */
    public void setJourneyRef(JourneyRefStructure value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicCode(String value) {
        this.publicCode = value;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ModeStructure }
     *     
     */
    public ModeStructure getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ModeStructure }
     *     
     */
    public void setMode(ModeStructure value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der productCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryStructure }
     *     
     */
    public ProductCategoryStructure getProductCategory() {
        return productCategory;
    }

    /**
     * Legt den Wert der productCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryStructure }
     *     
     */
    public void setProductCategory(ProductCategoryStructure value) {
        this.productCategory = value;
    }

    /**
     * Ruft den Wert der publishedServiceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPublishedServiceName() {
        return publishedServiceName;
    }

    /**
     * Legt den Wert der publishedServiceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPublishedServiceName(InternationalTextStructure value) {
        this.publishedServiceName = value;
    }

    /**
     * Ruft den Wert der trainNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Legt den Wert der trainNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Contains the Vehicle reference of the vehicle. In Transmodel this may be the VEHICLE id.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRefStructure }
     *     
     */
    public VehicleRefStructure getVehicleRef() {
        return vehicleRef;
    }

    /**
     * Legt den Wert der vehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRefStructure }
     *     
     */
    public void setVehicleRef(VehicleRefStructure value) {
        this.vehicleRef = value;
    }

    /**
     * Ruft den Wert der operatorRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefs_RelStructure }
     *     
     */
    public OperatorRefs_RelStructure getOperatorRefs() {
        return operatorRefs;
    }

    /**
     * Legt den Wert der operatorRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefs_RelStructure }
     *     
     */
    public void setOperatorRefs(OperatorRefs_RelStructure value) {
        this.operatorRefs = value;
    }

    /**
     * Ruft den Wert der routeDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getRouteDescription() {
        return routeDescription;
    }

    /**
     * Legt den Wert der routeDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setRouteDescription(InternationalTextStructure value) {
        this.routeDescription = value;
    }

    /**
     * Gets the value of the via property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the via property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceViaPointStructure }
     * 
     * 
     */
    public List<ServiceViaPointStructure> getVia() {
        if (via == null) {
            via = new ArrayList<ServiceViaPointStructure>();
        }
        return this.via;
    }

    /**
     * Ruft den Wert der restricted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * Legt den Wert der restricted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Ruft den Wert der restrictionNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getRestrictionNote() {
        return restrictionNote;
    }

    /**
     * Legt den Wert der restrictionNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setRestrictionNote(InternationalTextStructure value) {
        this.restrictionNote = value;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralAttributeStructure }
     * 
     * 
     */
    public List<GeneralAttributeStructure> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<GeneralAttributeStructure>();
        }
        return this.attribute;
    }

    /**
     * Ruft den Wert der originStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getOriginStopPointRef() {
        return originStopPointRef;
    }

    /**
     * Legt den Wert der originStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setOriginStopPointRef(StopPointRefStructure value) {
        this.originStopPointRef = value;
    }

    /**
     * Ruft den Wert der originText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOriginText() {
        return originText;
    }

    /**
     * Legt den Wert der originText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOriginText(InternationalTextStructure value) {
        this.originText = value;
    }

    /**
     * Ruft den Wert der operatorRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatorRefStructure }
     *     
     */
    public OperatorRefStructure getOperatorRef() {
        return operatorRef;
    }

    /**
     * Legt den Wert der operatorRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorRefStructure }
     *     
     */
    public void setOperatorRef(OperatorRefStructure value) {
        this.operatorRef = value;
    }

    /**
     * Ruft den Wert der productCategoryRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public ProductCategoryRefStructure getProductCategoryRef() {
        return productCategoryRef;
    }

    /**
     * Legt den Wert der productCategoryRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryRefStructure }
     *     
     */
    public void setProductCategoryRef(ProductCategoryRefStructure value) {
        this.productCategoryRef = value;
    }

    /**
     * Classification of service into arbitrary Service categories, e.g. school bus. Recommended SIRI values based on TPEG are given in SIRI documentation and enumerated in the siri_facilities package. 
     * Corresponds to NeTEX TYPE OF SERVICe.Gets the value of the serviceFeatureRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureRefStructure }
     * 
     * 
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
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleFeatureRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleFeatureRefStructure }
     * 
     * 
     */
    public List<VehicleFeatureRefStructure> getVehicleFeatureRef() {
        if (vehicleFeatureRef == null) {
            vehicleFeatureRef = new ArrayList<VehicleFeatureRefStructure>();
        }
        return this.vehicleFeatureRef;
    }

    /**
     * Ruft den Wert der destinationStopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getDestinationStopPointRef() {
        return destinationStopPointRef;
    }

    /**
     * Legt den Wert der destinationStopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setDestinationStopPointRef(StopPointRefStructure value) {
        this.destinationStopPointRef = value;
    }

    /**
     * Ruft den Wert der destinationText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDestinationText() {
        return destinationText;
    }

    /**
     * Legt den Wert der destinationText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDestinationText(InternationalTextStructure value) {
        this.destinationText = value;
    }

    /**
     * Ruft den Wert der unplanned-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplanned() {
        return unplanned;
    }

    /**
     * Legt den Wert der unplanned-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplanned(Boolean value) {
        this.unplanned = value;
    }

    /**
     * Ruft den Wert der cancelled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelled() {
        return cancelled;
    }

    /**
     * Legt den Wert der cancelled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelled(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Ruft den Wert der deviation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeviation() {
        return deviation;
    }

    /**
     * Legt den Wert der deviation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeviation(Boolean value) {
        this.deviation = value;
    }

    /**
     * Ruft den Wert der undefinedDelay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUndefinedDelay() {
        return undefinedDelay;
    }

    /**
     * Legt den Wert der undefinedDelay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUndefinedDelay(Boolean value) {
        this.undefinedDelay = value;
    }

    /**
     * Ruft den Wert der occupancy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancy() {
        return occupancy;
    }

    /**
     * Legt den Wert der occupancy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancy(OccupancyEnumeration value) {
        this.occupancy = value;
    }

    /**
     * Ruft den Wert der journeyRelations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRelationsStructure }
     *     
     */
    public JourneyRelationsStructure getJourneyRelations() {
        return journeyRelations;
    }

    /**
     * Legt den Wert der journeyRelations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRelationsStructure }
     *     
     */
    public void setJourneyRelations(JourneyRelationsStructure value) {
        this.journeyRelations = value;
    }

    /**
     * Ruft den Wert der trainElements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MonitoredVehicleJourneyStructure.TrainElements }
     *     
     */
    public MonitoredVehicleJourneyStructure.TrainElements getTrainElements() {
        return trainElements;
    }

    /**
     * Legt den Wert der trainElements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is {@link MonitoredVehicleJourneyStructure.TrainElements }
     *     
     */
    public void setTrainElements(MonitoredVehicleJourneyStructure.TrainElements value) {
        this.trainElements = value;
    }

    /**
     * Ruft den Wert der trains-Eigenschaft ab.
     * 
     * @return
     *     possible object is {@link MonitoredVehicleJourneyStructure.Trains }
     *     
     */
    public MonitoredVehicleJourneyStructure.Trains getTrains() {
        return trains;
    }

    /**
     * Legt den Wert der trains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is {@link MonitoredVehicleJourneyStructure.Trains }
     *     
     */
    public void setTrains(MonitoredVehicleJourneyStructure.Trains value) {
        this.trains = value;
    }

    /**
     * Ruft den Wert der compoundTrains-Eigenschaft ab.
     * 
     * @return
     *     possible object is {@link MonitoredVehicleJourneyStructure.CompoundTrains }
     *     
     */
    public MonitoredVehicleJourneyStructure.CompoundTrains getCompoundTrains() {
        return compoundTrains;
    }

    /**
     * Legt den Wert der compoundTrains-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is {@link MonitoredVehicleJourneyStructure.CompoundTrains }
     *     
     */
    public void setCompoundTrains(MonitoredVehicleJourneyStructure.CompoundTrains value) {
        this.compoundTrains = value;
    }

    /**
     * Ruft den Wert der bookingArrangements-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BookingArrangementsContainerStructure }
     *     
     */
    public BookingArrangementsContainerStructure getBookingArrangements() {
        return bookingArrangements;
    }

    /**
     * Legt den Wert der bookingArrangements-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingArrangementsContainerStructure }
     *     
     */
    public void setBookingArrangements(BookingArrangementsContainerStructure value) {
        this.bookingArrangements = value;
    }

    /**
     * Ruft den Wert der reservationNeeded-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReservationNeededEnumeration }
     *     
     */
    public ReservationNeededEnumeration getReservationNeeded() {
        return reservationNeeded;
    }

    /**
     * Legt den Wert der reservationNeeded-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationNeededEnumeration }
     *     
     */
    public void setReservationNeeded(ReservationNeededEnumeration value) {
        this.reservationNeeded = value;
    }

    /**
     * Ruft den Wert der situationFullRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefList }
     *     
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefList }
     *     
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
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

    public DatedJourneyStructure withConventionalModeOfOperation(ConventionalModesOfOperationEnumeration value) {
        setConventionalModeOfOperation(value);
        return this;
    }

    public DatedJourneyStructure withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    public DatedJourneyStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public DatedJourneyStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public DatedJourneyStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public DatedJourneyStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public DatedJourneyStructure withMode(ModeStructure value) {
        setMode(value);
        return this;
    }

    public DatedJourneyStructure withProductCategory(ProductCategoryStructure value) {
        setProductCategory(value);
        return this;
    }

    public DatedJourneyStructure withPublishedServiceName(InternationalTextStructure value) {
        setPublishedServiceName(value);
        return this;
    }

    public DatedJourneyStructure withTrainNumber(String value) {
        setTrainNumber(value);
        return this;
    }

    public DatedJourneyStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public DatedJourneyStructure withOperatorRefs(OperatorRefs_RelStructure value) {
        setOperatorRefs(value);
        return this;
    }

    public DatedJourneyStructure withRouteDescription(InternationalTextStructure value) {
        setRouteDescription(value);
        return this;
    }

    public DatedJourneyStructure withVia(ServiceViaPointStructure... values) {
        if (values!= null) {
            for (ServiceViaPointStructure value: values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public DatedJourneyStructure withVia(Collection<ServiceViaPointStructure> values) {
        if (values!= null) {
            getVia().addAll(values);
        }
        return this;
    }

    public DatedJourneyStructure withRestricted(Boolean value) {
        setRestricted(value);
        return this;
    }

    public DatedJourneyStructure withRestrictionNote(InternationalTextStructure value) {
        setRestrictionNote(value);
        return this;
    }

    public DatedJourneyStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public DatedJourneyStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values!= null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public DatedJourneyStructure withOriginStopPointRef(StopPointRefStructure value) {
        setOriginStopPointRef(value);
        return this;
    }

    public DatedJourneyStructure withOriginText(InternationalTextStructure value) {
        setOriginText(value);
        return this;
    }

    public DatedJourneyStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public DatedJourneyStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public DatedJourneyStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values!= null) {
            for (ServiceFeatureRefStructure value: values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public DatedJourneyStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values!= null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public DatedJourneyStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values!= null) {
            for (VehicleFeatureRefStructure value: values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public DatedJourneyStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values!= null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public DatedJourneyStructure withDestinationStopPointRef(StopPointRefStructure value) {
        setDestinationStopPointRef(value);
        return this;
    }

    public DatedJourneyStructure withDestinationText(InternationalTextStructure value) {
        setDestinationText(value);
        return this;
    }

    public DatedJourneyStructure withUnplanned(Boolean value) {
        setUnplanned(value);
        return this;
    }

    public DatedJourneyStructure withCancelled(Boolean value) {
        setCancelled(value);
        return this;
    }

    public DatedJourneyStructure withDeviation(Boolean value) {
        setDeviation(value);
        return this;
    }

    public DatedJourneyStructure withUndefinedDelay(Boolean value) {
        setUndefinedDelay(value);
        return this;
    }

    public DatedJourneyStructure withOccupancy(OccupancyEnumeration value) {
        setOccupancy(value);
        return this;
    }

    public DatedJourneyStructure withJourneyRelations(JourneyRelationsStructure value) {
        setJourneyRelations(value);
        return this;
    }

    public DatedJourneyStructure withTrainElements(uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    public DatedJourneyStructure withTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains value) {
        setTrains(value);
        return this;
    }

    public DatedJourneyStructure withCompoundTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains value) {
        setCompoundTrains(value);
        return this;
    }

    public DatedJourneyStructure withBookingArrangements(BookingArrangementsContainerStructure value) {
        setBookingArrangements(value);
        return this;
    }

    public DatedJourneyStructure withReservationNeeded(ReservationNeededEnumeration value) {
        setReservationNeeded(value);
        return this;
    }

    public DatedJourneyStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
        return this;
    }

    public DatedJourneyStructure withExtension(Object value) {
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
