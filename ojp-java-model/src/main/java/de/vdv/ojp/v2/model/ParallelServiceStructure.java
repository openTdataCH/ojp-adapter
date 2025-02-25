//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.JourneyRelationsStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.OccupancyEnumeration;
import uk.org.siri.siri.OperatorRefStructure;
import uk.org.siri.siri.ProductCategoryRefStructure;
import uk.org.siri.siri.ServiceFeatureRefStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.siri.VehicleFeatureRefStructure;
import uk.org.siri.siri.VehicleRefStructure;

/**
 * Services running combined with at least parts of this journey, e.g., wing trains. The contained stop sequence interval refers to the original journey.
 *
 * <p>Java-Klasse für ParallelServiceStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ParallelServiceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopSequenceIntervalGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParallelServiceStructure", propOrder = {
    "fromStopSequenceNumber",
    "toStopSequenceNumber",
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
    "journeyRelations"
})
public class ParallelServiceStructure {

    @XmlElement(name = "FromStopSequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fromStopSequenceNumber;
    @XmlElement(name = "ToStopSequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger toStopSequenceNumber;
    @XmlElement(name = "JourneyRef", required = true)
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "PublicCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String publicCode;
    @XmlElement(name = "LineRef", namespace = "http://www.siri.org.uk/siri", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "DirectionRef", namespace = "http://www.siri.org.uk/siri")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "Mode", required = true)
    protected ModeStructure mode;
    @XmlElement(name = "ProductCategory")
    protected ProductCategoryStructure productCategory;
    @XmlElement(name = "PublishedServiceName", required = true)
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

    /**
     * Ruft den Wert der fromStopSequenceNumber-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getFromStopSequenceNumber() {
        return fromStopSequenceNumber;
    }

    /**
     * Legt den Wert der fromStopSequenceNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setFromStopSequenceNumber(BigInteger value) {
        this.fromStopSequenceNumber = value;
    }

    /**
     * Ruft den Wert der toStopSequenceNumber-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getToStopSequenceNumber() {
        return toStopSequenceNumber;
    }

    /**
     * Legt den Wert der toStopSequenceNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setToStopSequenceNumber(BigInteger value) {
        this.toStopSequenceNumber = value;
    }

    /**
     * Ruft den Wert der journeyRef-Eigenschaft ab.
     *
     * @return possible object is {@link JourneyRefStructure }
     */
    public JourneyRefStructure getJourneyRef() {
        return journeyRef;
    }

    /**
     * Legt den Wert der journeyRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link JourneyRefStructure }
     */
    public void setJourneyRef(JourneyRefStructure value) {
        this.journeyRef = value;
    }

    /**
     * Ruft den Wert der publicCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPublicCode() {
        return publicCode;
    }

    /**
     * Legt den Wert der publicCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPublicCode(String value) {
        this.publicCode = value;
    }

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
     * Ruft den Wert der mode-Eigenschaft ab.
     *
     * @return possible object is {@link ModeStructure }
     */
    public ModeStructure getMode() {
        return mode;
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     *
     * @param value allowed object is {@link ModeStructure }
     */
    public void setMode(ModeStructure value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der productCategory-Eigenschaft ab.
     *
     * @return possible object is {@link ProductCategoryStructure }
     */
    public ProductCategoryStructure getProductCategory() {
        return productCategory;
    }

    /**
     * Legt den Wert der productCategory-Eigenschaft fest.
     *
     * @param value allowed object is {@link ProductCategoryStructure }
     */
    public void setProductCategory(ProductCategoryStructure value) {
        this.productCategory = value;
    }

    /**
     * Ruft den Wert der publishedServiceName-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getPublishedServiceName() {
        return publishedServiceName;
    }

    /**
     * Legt den Wert der publishedServiceName-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setPublishedServiceName(InternationalTextStructure value) {
        this.publishedServiceName = value;
    }

    /**
     * Ruft den Wert der trainNumber-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getTrainNumber() {
        return trainNumber;
    }

    /**
     * Legt den Wert der trainNumber-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTrainNumber(String value) {
        this.trainNumber = value;
    }

    /**
     * Contains the Vehicle reference of the vehicle. In Transmodel this may be the VEHICLE id.
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
     * Ruft den Wert der operatorRefs-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorRefs_RelStructure }
     */
    public OperatorRefs_RelStructure getOperatorRefs() {
        return operatorRefs;
    }

    /**
     * Legt den Wert der operatorRefs-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorRefs_RelStructure }
     */
    public void setOperatorRefs(OperatorRefs_RelStructure value) {
        this.operatorRefs = value;
    }

    /**
     * Ruft den Wert der routeDescription-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getRouteDescription() {
        return routeDescription;
    }

    /**
     * Legt den Wert der routeDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setRouteDescription(InternationalTextStructure value) {
        this.routeDescription = value;
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
     * Objects of the following type(s) are allowed in the list {@link ServiceViaPointStructure }
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
     * @return possible object is {@link Boolean }
     */
    public Boolean isRestricted() {
        return restricted;
    }

    /**
     * Legt den Wert der restricted-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setRestricted(Boolean value) {
        this.restricted = value;
    }

    /**
     * Ruft den Wert der restrictionNote-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getRestrictionNote() {
        return restrictionNote;
    }

    /**
     * Legt den Wert der restrictionNote-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setRestrictionNote(InternationalTextStructure value) {
        this.restrictionNote = value;
    }

    /**
     * Gets the value of the attribute property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the attribute property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link GeneralAttributeStructure }
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
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getOriginStopPointRef() {
        return originStopPointRef;
    }

    /**
     * Legt den Wert der originStopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setOriginStopPointRef(StopPointRefStructure value) {
        this.originStopPointRef = value;
    }

    /**
     * Ruft den Wert der originText-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getOriginText() {
        return originText;
    }

    /**
     * Legt den Wert der originText-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setOriginText(InternationalTextStructure value) {
        this.originText = value;
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
     * Ruft den Wert der destinationStopPointRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPointRefStructure }
     */
    public StopPointRefStructure getDestinationStopPointRef() {
        return destinationStopPointRef;
    }

    /**
     * Legt den Wert der destinationStopPointRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPointRefStructure }
     */
    public void setDestinationStopPointRef(StopPointRefStructure value) {
        this.destinationStopPointRef = value;
    }

    /**
     * Ruft den Wert der destinationText-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalTextStructure }
     */
    public InternationalTextStructure getDestinationText() {
        return destinationText;
    }

    /**
     * Legt den Wert der destinationText-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalTextStructure }
     */
    public void setDestinationText(InternationalTextStructure value) {
        this.destinationText = value;
    }

    /**
     * Ruft den Wert der unplanned-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isUnplanned() {
        return unplanned;
    }

    /**
     * Legt den Wert der unplanned-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setUnplanned(Boolean value) {
        this.unplanned = value;
    }

    /**
     * Ruft den Wert der cancelled-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isCancelled() {
        return cancelled;
    }

    /**
     * Legt den Wert der cancelled-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setCancelled(Boolean value) {
        this.cancelled = value;
    }

    /**
     * Ruft den Wert der deviation-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isDeviation() {
        return deviation;
    }

    /**
     * Legt den Wert der deviation-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setDeviation(Boolean value) {
        this.deviation = value;
    }

    /**
     * Ruft den Wert der undefinedDelay-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isUndefinedDelay() {
        return undefinedDelay;
    }

    /**
     * Legt den Wert der undefinedDelay-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setUndefinedDelay(Boolean value) {
        this.undefinedDelay = value;
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

    public ParallelServiceStructure withFromStopSequenceNumber(BigInteger value) {
        setFromStopSequenceNumber(value);
        return this;
    }

    public ParallelServiceStructure withToStopSequenceNumber(BigInteger value) {
        setToStopSequenceNumber(value);
        return this;
    }

    public ParallelServiceStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public ParallelServiceStructure withPublicCode(String value) {
        setPublicCode(value);
        return this;
    }

    public ParallelServiceStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public ParallelServiceStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public ParallelServiceStructure withMode(ModeStructure value) {
        setMode(value);
        return this;
    }

    public ParallelServiceStructure withProductCategory(ProductCategoryStructure value) {
        setProductCategory(value);
        return this;
    }

    public ParallelServiceStructure withPublishedServiceName(InternationalTextStructure value) {
        setPublishedServiceName(value);
        return this;
    }

    public ParallelServiceStructure withTrainNumber(String value) {
        setTrainNumber(value);
        return this;
    }

    public ParallelServiceStructure withVehicleRef(VehicleRefStructure value) {
        setVehicleRef(value);
        return this;
    }

    public ParallelServiceStructure withOperatorRefs(OperatorRefs_RelStructure value) {
        setOperatorRefs(value);
        return this;
    }

    public ParallelServiceStructure withRouteDescription(InternationalTextStructure value) {
        setRouteDescription(value);
        return this;
    }

    public ParallelServiceStructure withVia(ServiceViaPointStructure... values) {
        if (values != null) {
            for (ServiceViaPointStructure value : values) {
                getVia().add(value);
            }
        }
        return this;
    }

    public ParallelServiceStructure withVia(Collection<ServiceViaPointStructure> values) {
        if (values != null) {
            getVia().addAll(values);
        }
        return this;
    }

    public ParallelServiceStructure withRestricted(Boolean value) {
        setRestricted(value);
        return this;
    }

    public ParallelServiceStructure withRestrictionNote(InternationalTextStructure value) {
        setRestrictionNote(value);
        return this;
    }

    public ParallelServiceStructure withAttribute(GeneralAttributeStructure... values) {
        if (values != null) {
            for (GeneralAttributeStructure value : values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public ParallelServiceStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values != null) {
            getAttribute().addAll(values);
        }
        return this;
    }

    public ParallelServiceStructure withOriginStopPointRef(StopPointRefStructure value) {
        setOriginStopPointRef(value);
        return this;
    }

    public ParallelServiceStructure withOriginText(InternationalTextStructure value) {
        setOriginText(value);
        return this;
    }

    public ParallelServiceStructure withOperatorRef(OperatorRefStructure value) {
        setOperatorRef(value);
        return this;
    }

    public ParallelServiceStructure withProductCategoryRef(ProductCategoryRefStructure value) {
        setProductCategoryRef(value);
        return this;
    }

    public ParallelServiceStructure withServiceFeatureRef(ServiceFeatureRefStructure... values) {
        if (values != null) {
            for (ServiceFeatureRefStructure value : values) {
                getServiceFeatureRef().add(value);
            }
        }
        return this;
    }

    public ParallelServiceStructure withServiceFeatureRef(Collection<ServiceFeatureRefStructure> values) {
        if (values != null) {
            getServiceFeatureRef().addAll(values);
        }
        return this;
    }

    public ParallelServiceStructure withVehicleFeatureRef(VehicleFeatureRefStructure... values) {
        if (values != null) {
            for (VehicleFeatureRefStructure value : values) {
                getVehicleFeatureRef().add(value);
            }
        }
        return this;
    }

    public ParallelServiceStructure withVehicleFeatureRef(Collection<VehicleFeatureRefStructure> values) {
        if (values != null) {
            getVehicleFeatureRef().addAll(values);
        }
        return this;
    }

    public ParallelServiceStructure withDestinationStopPointRef(StopPointRefStructure value) {
        setDestinationStopPointRef(value);
        return this;
    }

    public ParallelServiceStructure withDestinationText(InternationalTextStructure value) {
        setDestinationText(value);
        return this;
    }

    public ParallelServiceStructure withUnplanned(Boolean value) {
        setUnplanned(value);
        return this;
    }

    public ParallelServiceStructure withCancelled(Boolean value) {
        setCancelled(value);
        return this;
    }

    public ParallelServiceStructure withDeviation(Boolean value) {
        setDeviation(value);
        return this;
    }

    public ParallelServiceStructure withUndefinedDelay(Boolean value) {
        setUndefinedDelay(value);
        return this;
    }

    public ParallelServiceStructure withOccupancy(OccupancyEnumeration value) {
        setOccupancy(value);
        return this;
    }

    public ParallelServiceStructure withJourneyRelations(JourneyRelationsStructure value) {
        setJourneyRelations(value);
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
