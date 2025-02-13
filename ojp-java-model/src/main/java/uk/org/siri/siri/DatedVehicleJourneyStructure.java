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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Planned VEHICLE JOURNEY (Production Timetable Service).
 *
 * <p>Java-Klasse für DatedVehicleJourneyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DatedVehicleJourneyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatedVehicleJourneyCode" type="{http://www.siri.org.uk/siri}DatedVehicleJourneyCodeType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableAlterationGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyPatternInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyEndNamesGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DatedServiceInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TimetableRealtimeInfoGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DatedTrainOperationalInfoGroup"/&gt;
 *         &lt;element name="DatedCalls"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JourneyRelations" type="{http://www.siri.org.uk/siri}JourneyRelationsStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedVehicleJourneyStructure", propOrder = {
    "datedVehicleJourneyCode",
    "framedVehicleJourneyRef",
    "vehicleJourneyRef",
    "extraJourney",
    "cancellation",
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
    "originRef",
    "originName",
    "originShortName",
    "destinationDisplayAtOrigin",
    "via",
    "destinationRef",
    "destinationName",
    "destinationShortName",
    "originDisplayAtDestination",
    "operatorRef",
    "productCategoryRef",
    "serviceFeatureRef",
    "vehicleFeatureRef",
    "vehicleJourneyName",
    "journeyNote",
    "publicContact",
    "operationsContact",
    "originDisplay",
    "destinationDisplay",
    "lineNote",
    "firstOrLastJourney",
    "headwayService",
    "monitored",
    "trainBlockPart",
    "blockRef",
    "courseOfJourneyRef",
    "vehicleRef",
    "trainNumbers",
    "journeyParts",
    "trainElements",
    "trains",
    "compoundTrains",
    "datedCalls",
    "journeyRelations",
    "extensions"
})
public class DatedVehicleJourneyStructure {

    @XmlElement(name = "DatedVehicleJourneyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String datedVehicleJourneyCode;
    @XmlElement(name = "FramedVehicleJourneyRef")
    protected FramedVehicleJourneyRefStructure framedVehicleJourneyRef;
    @XmlElement(name = "VehicleJourneyRef")
    protected VehicleJourneyRefStructure vehicleJourneyRef;
    @XmlElement(name = "ExtraJourney", defaultValue = "false")
    protected Boolean extraJourney;
    @XmlElement(name = "Cancellation", defaultValue = "false")
    protected Boolean cancellation;
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
    @XmlElement(name = "OperatorRef")
    protected OperatorRefStructure operatorRef;
    @XmlElement(name = "ProductCategoryRef")
    protected ProductCategoryRefStructure productCategoryRef;
    @XmlElement(name = "ServiceFeatureRef")
    protected List<ServiceFeatureRefStructure> serviceFeatureRef;
    @XmlElement(name = "VehicleFeatureRef")
    protected List<VehicleFeatureRefStructure> vehicleFeatureRef;
    @XmlElement(name = "VehicleJourneyName")
    protected List<NaturalLanguageStringStructure> vehicleJourneyName;
    @XmlElement(name = "JourneyNote")
    protected List<NaturalLanguageStringStructure> journeyNote;
    @XmlElement(name = "PublicContact")
    protected SimpleContactStructure publicContact;
    @XmlElement(name = "OperationsContact")
    protected SimpleContactStructure operationsContact;
    @XmlElement(name = "OriginDisplay")
    protected List<NaturalLanguageStringStructure> originDisplay;
    @XmlElement(name = "DestinationDisplay")
    protected List<NaturalLanguageStringStructure> destinationDisplay;
    @XmlElement(name = "LineNote")
    protected List<NaturalLanguagePlaceNameStructure> lineNote;
    @XmlElement(name = "FirstOrLastJourney", defaultValue = "unspecified")
    @XmlSchemaType(name = "NMTOKEN")
    protected FirstOrLastJourneyEnumeration firstOrLastJourney;
    @XmlElement(name = "HeadwayService")
    protected Boolean headwayService;
    @XmlElement(name = "Monitored", defaultValue = "true")
    protected Boolean monitored;
    @XmlElement(name = "TrainBlockPart")
    protected List<TrainBlockPartStructure> trainBlockPart;
    @XmlElement(name = "BlockRef")
    protected BlockRefStructure blockRef;
    @XmlElement(name = "CourseOfJourneyRef")
    protected CourseOfJourneyRefStructure courseOfJourneyRef;
    @XmlElement(name = "VehicleRef")
    protected VehicleRefStructure vehicleRef;
    @XmlElement(name = "TrainNumbers")
    protected DatedVehicleJourneyStructure.TrainNumbers trainNumbers;
    @XmlElement(name = "JourneyParts")
    protected DatedVehicleJourneyStructure.JourneyParts journeyParts;
    @XmlElement(name = "TrainElements")
    protected uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements trainElements;
    @XmlElement(name = "Trains")
    protected uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains trains;
    @XmlElement(name = "CompoundTrains")
    protected uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains compoundTrains;
    @XmlElement(name = "DatedCalls", required = true)
    protected DatedVehicleJourneyStructure.DatedCalls datedCalls;
    @XmlElement(name = "JourneyRelations")
    protected JourneyRelationsStructure journeyRelations;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der datedVehicleJourneyCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getDatedVehicleJourneyCode() {
        return datedVehicleJourneyCode;
    }

    /**
     * Legt den Wert der datedVehicleJourneyCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setDatedVehicleJourneyCode(String value) {
        this.datedVehicleJourneyCode = value;
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
     * Ruft den Wert der extraJourney-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isExtraJourney() {
        return extraJourney;
    }

    /**
     * Legt den Wert der extraJourney-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setExtraJourney(Boolean value) {
        this.extraJourney = value;
    }

    /**
     * Ruft den Wert der cancellation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCancellation() {
        return cancellation;
    }

    /**
     * Legt den Wert der cancellation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCancellation(Boolean value) {
        this.cancellation = value;
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
     * Gets the value of the lineNote property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the lineNote property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNote().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguagePlaceNameStructure }
     */
    public List<NaturalLanguagePlaceNameStructure> getLineNote() {
        if (lineNote == null) {
            lineNote = new ArrayList<NaturalLanguagePlaceNameStructure>();
        }
        return this.lineNote;
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
     * Ruft den Wert der trainNumbers-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyStructure.TrainNumbers }
     */
    public DatedVehicleJourneyStructure.TrainNumbers getTrainNumbers() {
        return trainNumbers;
    }

    /**
     * Legt den Wert der trainNumbers-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyStructure.TrainNumbers }
     */
    public void setTrainNumbers(DatedVehicleJourneyStructure.TrainNumbers value) {
        this.trainNumbers = value;
    }

    /**
     * Ruft den Wert der journeyParts-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyStructure.JourneyParts }
     */
    public DatedVehicleJourneyStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Legt den Wert der journeyParts-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyStructure.JourneyParts }
     */
    public void setJourneyParts(DatedVehicleJourneyStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    /**
     * Ruft den Wert der trainElements-Eigenschaft ab.
     *
     * @return possible object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements }
     */
    public uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements getTrainElements() {
        return trainElements;
    }

    /**
     * Legt den Wert der trainElements-Eigenschaft fest.
     *
     * @param value allowed object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements }
     */
    public void setTrainElements(uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements value) {
        this.trainElements = value;
    }

    /**
     * Ruft den Wert der trains-Eigenschaft ab.
     *
     * @return possible object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains }
     */
    public uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains getTrains() {
        return trains;
    }

    /**
     * Legt den Wert der trains-Eigenschaft fest.
     *
     * @param value allowed object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains }
     */
    public void setTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains value) {
        this.trains = value;
    }

    /**
     * Ruft den Wert der compoundTrains-Eigenschaft ab.
     *
     * @return possible object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains }
     */
    public uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains getCompoundTrains() {
        return compoundTrains;
    }

    /**
     * Legt den Wert der compoundTrains-Eigenschaft fest.
     *
     * @param value allowed object is {@link uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains }
     */
    public void setCompoundTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains value) {
        this.compoundTrains = value;
    }

    /**
     * Ruft den Wert der datedCalls-Eigenschaft ab.
     *
     * @return possible object is {@link DatedVehicleJourneyStructure.DatedCalls }
     */
    public DatedVehicleJourneyStructure.DatedCalls getDatedCalls() {
        return datedCalls;
    }

    /**
     * Legt den Wert der datedCalls-Eigenschaft fest.
     *
     * @param value allowed object is {@link DatedVehicleJourneyStructure.DatedCalls }
     */
    public void setDatedCalls(DatedVehicleJourneyStructure.DatedCalls value) {
        this.datedCalls = value;
    }

    /**
     * Ruft den Wert der journeyRelations-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyRelationsStructure }
     */
    public JourneyRelationsStructure getJourneyRelations() {
        return journeyRelations;
    }

    /**
     * Legt den Wert der journeyRelations-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyRelationsStructure }
     */
    public void setJourneyRelations(JourneyRelationsStructure value) {
        this.journeyRelations = value;
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

    public DatedVehicleJourneyStructure withDatedVehicleJourneyCode(String value) {
        setDatedVehicleJourneyCode(value);
        return this;
    }

    public DatedVehicleJourneyStructure withFramedVehicleJourneyRef(FramedVehicleJourneyRefStructure value) {
        setFramedVehicleJourneyRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleJourneyRef(VehicleJourneyRefStructure value) {
        setVehicleJourneyRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withExtraJourney(Boolean value) {
        setExtraJourney(value);
        return this;
    }

    public DatedVehicleJourneyStructure withCancellation(Boolean value) {
        setCancellation(value);
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyPatternRef(JourneyPatternRefStructure value) {
        setJourneyPatternRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyPatternName(NaturalLanguageStringStructure value) {
        setJourneyPatternName(value);
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleMode(VehicleModesEnumeration... values) {
        if (values != null) {
            for (VehicleModesEnumeration value : values) {
                getVehicleMode().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleMode(Collection<VehicleModesEnumeration> values) {
        if (values != null) {
            getVehicleMode().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withRouteRef(RouteRefStructure value) {
        setRouteRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withPublishedLineName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getPublishedLineName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withPublishedLineName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getPublishedLineName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withGroupOfLinesRef(GroupOfLinesRefStructure value) {
        setGroupOfLinesRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withDirectionName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDirectionName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDirectionName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDirectionName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withExternalLineRef(LineRefStructure value) {
        setExternalLineRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withBrandingRef(BrandingRefStructure value) {
        setBrandingRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withBranding(BrandingStructure value) {
        setBranding(value);
        return this;
    }

    public DatedVehicleJourneyStructure withOriginRef(JourneyPlaceRefStructure value) {
        setOriginRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withOriginName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginShortName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginShortName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationDisplayAtOrigin(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationDisplayAtOrigin().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationDisplayAtOrigin(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationDisplayAtOrigin().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVia(ViaNameStructure... values) {
        if (values != null) {
            for (ViaNameStructure value : values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVia(Collection<ViaNameStructure> values) {
        if (values != null) {
            getVia().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationRef(DestinationRefStructure value) {
        setDestinationRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getDestinationShortName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getDestinationShortName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginDisplayAtDestination(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getOriginDisplayAtDestination().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginDisplayAtDestination(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getOriginDisplayAtDestination().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values != null) {
            for (ServiceFeatureRefStructure value : values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values != null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values != null) {
            for (VehicleFeatureRefStructure value : values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values != null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleJourneyName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getVehicleJourneyName().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleJourneyName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getVehicleJourneyName().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyNote(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getJourneyNote().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyNote(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getJourneyNote().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withPublicContact(SimpleContactStructure value) {
        setPublicContact(value);
        return this;
    }

    public DatedVehicleJourneyStructure withOperationsContact(SimpleContactStructure value) {
        setOperationsContact(value);
        return this;
    }

    public DatedVehicleJourneyStructure withOriginDisplay(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getOriginDisplay().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withOriginDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getOriginDisplay().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationDisplay(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDestinationDisplay().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withDestinationDisplay(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDestinationDisplay().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withLineNote(NaturalLanguagePlaceNameStructure... values) {
        if (values != null) {
            for (NaturalLanguagePlaceNameStructure value : values) {
                getLineNote().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withLineNote(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values != null) {
            getLineNote().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withFirstOrLastJourney(FirstOrLastJourneyEnumeration value) {
        setFirstOrLastJourney(value);
        return this;
    }

    public DatedVehicleJourneyStructure withHeadwayService(Boolean value) {
        setHeadwayService(value);
        return this;
    }

    public DatedVehicleJourneyStructure withMonitored(Boolean value) {
        setMonitored(value);
        return this;
    }

    public DatedVehicleJourneyStructure withTrainBlockPart(TrainBlockPartStructure... values) {
        if (values != null) {
            for (TrainBlockPartStructure value : values) {
                getTrainBlockPart().add(value);
            }
        }
        return this;
    }

    public DatedVehicleJourneyStructure withTrainBlockPart(Collection<TrainBlockPartStructure> values) {
        if (values != null) {
            getTrainBlockPart().addAll(values);
        }
        return this;
    }

    public DatedVehicleJourneyStructure withBlockRef(BlockRefStructure value) {
        setBlockRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withCourseOfJourneyRef(CourseOfJourneyRefStructure value) {
        setCourseOfJourneyRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public DatedVehicleJourneyStructure withTrainNumbers(DatedVehicleJourneyStructure.TrainNumbers value) {
        setTrainNumbers(value);
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyParts(DatedVehicleJourneyStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    public DatedVehicleJourneyStructure withTrainElements(uk.org.siri.siri.MonitoredVehicleJourneyStructure.TrainElements value) {
        setTrainElements(value);
        return this;
    }

    public DatedVehicleJourneyStructure withTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.Trains value) {
        setTrains(value);
        return this;
    }

    public DatedVehicleJourneyStructure withCompoundTrains(uk.org.siri.siri.MonitoredVehicleJourneyStructure.CompoundTrains value) {
        setCompoundTrains(value);
        return this;
    }

    public DatedVehicleJourneyStructure withDatedCalls(DatedVehicleJourneyStructure.DatedCalls value) {
        setDatedCalls(value);
        return this;
    }

    public DatedVehicleJourneyStructure withJourneyRelations(JourneyRelationsStructure value) {
        setJourneyRelations(value);
        return this;
    }

    public DatedVehicleJourneyStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element ref="{http://www.siri.org.uk/siri}DatedCall" maxOccurs="unbounded" minOccurs="2"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "datedCall"
    })
    public static class DatedCalls {

        @XmlElement(name = "DatedCall", required = true)
        protected List<DatedCallStructure> datedCall;

        /**
         * Gets the value of the datedCall property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the datedCall property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDatedCall().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link DatedCallStructure }
         */
        public List<DatedCallStructure> getDatedCall() {
            if (datedCall == null) {
                datedCall = new ArrayList<DatedCallStructure>();
            }
            return this.datedCall;
        }

        public DatedVehicleJourneyStructure.DatedCalls withDatedCall(DatedCallStructure... values) {
            if (values != null) {
                for (DatedCallStructure value : values) {
                    getDatedCall().add(value);
                }
            }
            return this;
        }

        public DatedVehicleJourneyStructure.DatedCalls withDatedCall(Collection<DatedCallStructure> values) {
            if (values != null) {
                getDatedCall().addAll(values);
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
     *         &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}DatedJourneyPartInfoStructure" maxOccurs="unbounded"/&gt;
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
        protected List<DatedJourneyPartInfoStructure> journeyPartInfo;

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
         * Objects of the following type(s) are allowed in the list {@link DatedJourneyPartInfoStructure }
         */
        public List<DatedJourneyPartInfoStructure> getJourneyPartInfo() {
            if (journeyPartInfo == null) {
                journeyPartInfo = new ArrayList<DatedJourneyPartInfoStructure>();
            }
            return this.journeyPartInfo;
        }

        public DatedVehicleJourneyStructure.JourneyParts withJourneyPartInfo(DatedJourneyPartInfoStructure... values) {
            if (values != null) {
                for (DatedJourneyPartInfoStructure value : values) {
                    getJourneyPartInfo().add(value);
                }
            }
            return this;
        }

        public DatedVehicleJourneyStructure.JourneyParts withJourneyPartInfo(Collection<DatedJourneyPartInfoStructure> values) {
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

        public DatedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(TrainNumberRefStructure... values) {
            if (values != null) {
                for (TrainNumberRefStructure value : values) {
                    getTrainNumberRef().add(value);
                }
            }
            return this;
        }

        public DatedVehicleJourneyStructure.TrainNumbers withTrainNumberRef(Collection<TrainNumberRefStructure> values) {
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

}
