//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
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
import uk.org.siri.siri.LocationStructure;
import uk.org.siri.siri.PassengerCapacityStructure;
import uk.org.siri.siri.StopPointRefStructure;
import uk.org.siri.siri.VehicleOccupancyStructure;


/**
 * Describes the situation at a stop or station at which the passenger boards a Leg of a trip including time-related information.
 * 
 * <p>Java-Klasse für LegBoardStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LegBoardStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.vdv.de/ojp}StopPointGroup"/&gt;
 *           &lt;element name="GeoPosition" type="{http://www.siri.org.uk/siri}LocationStructure"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ServiceArrival" type="{http://www.vdv.de/ojp}ServiceArrivalStructure" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDeparture" type="{http://www.vdv.de/ojp}ServiceDepartureStructure"/&gt;
 *         &lt;element name="DistributorInterchangeId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element name="MeetsViaRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopCallStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegBoardStructure", propOrder = {
    "stopPointRef",
    "stopPointName",
    "nameSuffix",
    "plannedQuay",
    "estimatedQuay",
    "geoPosition",
    "serviceArrival",
    "serviceDeparture",
    "distributorInterchangeId",
    "meetsViaRequest",
    "order",
    "requestStop",
    "unplannedStop",
    "notServicedStop",
    "noBoardingAtStop",
    "noAlightingAtStop",
    "expectedDepartureOccupancy",
    "expectedDepartureCapacities",
    "attribute"
})
public class LegBoardStructure {

    @XmlElement(name = "StopPointRef", namespace = "http://www.siri.org.uk/siri")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "StopPointName")
    protected InternationalTextStructure stopPointName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PlannedQuay")
    protected InternationalTextStructure plannedQuay;
    @XmlElement(name = "EstimatedQuay")
    protected InternationalTextStructure estimatedQuay;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "ServiceArrival")
    protected ServiceArrivalStructure serviceArrival;
    @XmlElement(name = "ServiceDeparture", required = true)
    protected ServiceDepartureStructure serviceDeparture;
    @XmlElement(name = "DistributorInterchangeId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String distributorInterchangeId;
    @XmlElement(name = "MeetsViaRequest", defaultValue = "false")
    protected Boolean meetsViaRequest;
    @XmlElement(name = "Order")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger order;
    @XmlElement(name = "RequestStop", defaultValue = "false")
    protected Boolean requestStop;
    @XmlElement(name = "UnplannedStop", defaultValue = "false")
    protected Boolean unplannedStop;
    @XmlElement(name = "NotServicedStop", defaultValue = "false")
    protected Boolean notServicedStop;
    @XmlElement(name = "NoBoardingAtStop", defaultValue = "false")
    protected Boolean noBoardingAtStop;
    @XmlElement(name = "NoAlightingAtStop", defaultValue = "false")
    protected Boolean noAlightingAtStop;
    @XmlElement(name = "ExpectedDepartureOccupancy", namespace = "http://www.siri.org.uk/siri")
    protected List<VehicleOccupancyStructure> expectedDepartureOccupancy;
    @XmlElement(name = "ExpectedDepartureCapacities", namespace = "http://www.siri.org.uk/siri")
    protected List<PassengerCapacityStructure> expectedDepartureCapacities;
    @XmlElement(name = "Attribute")
    protected List<GeneralAttributeStructure> attribute;

    /**
     * Reference to a stop point.
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
     * Ruft den Wert der stopPointName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getStopPointName() {
        return stopPointName;
    }

    /**
     * Legt den Wert der stopPointName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setStopPointName(InternationalTextStructure value) {
        this.stopPointName = value;
    }

    /**
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Ruft den Wert der plannedQuay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getPlannedQuay() {
        return plannedQuay;
    }

    /**
     * Legt den Wert der plannedQuay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setPlannedQuay(InternationalTextStructure value) {
        this.plannedQuay = value;
    }

    /**
     * Ruft den Wert der estimatedQuay-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getEstimatedQuay() {
        return estimatedQuay;
    }

    /**
     * Legt den Wert der estimatedQuay-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setEstimatedQuay(InternationalTextStructure value) {
        this.estimatedQuay = value;
    }

    /**
     * Ruft den Wert der geoPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Legt den Wert der geoPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Ruft den Wert der serviceArrival-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceArrivalStructure }
     *     
     */
    public ServiceArrivalStructure getServiceArrival() {
        return serviceArrival;
    }

    /**
     * Legt den Wert der serviceArrival-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceArrivalStructure }
     *     
     */
    public void setServiceArrival(ServiceArrivalStructure value) {
        this.serviceArrival = value;
    }

    /**
     * Ruft den Wert der serviceDeparture-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDepartureStructure }
     *     
     */
    public ServiceDepartureStructure getServiceDeparture() {
        return serviceDeparture;
    }

    /**
     * Legt den Wert der serviceDeparture-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDepartureStructure }
     *     
     */
    public void setServiceDeparture(ServiceDepartureStructure value) {
        this.serviceDeparture = value;
    }

    /**
     * Ruft den Wert der distributorInterchangeId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributorInterchangeId() {
        return distributorInterchangeId;
    }

    /**
     * Legt den Wert der distributorInterchangeId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributorInterchangeId(String value) {
        this.distributorInterchangeId = value;
    }

    /**
     * Ruft den Wert der meetsViaRequest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMeetsViaRequest() {
        return meetsViaRequest;
    }

    /**
     * Legt den Wert der meetsViaRequest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMeetsViaRequest(Boolean value) {
        this.meetsViaRequest = value;
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
     * Ruft den Wert der unplannedStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnplannedStop() {
        return unplannedStop;
    }

    /**
     * Legt den Wert der unplannedStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnplannedStop(Boolean value) {
        this.unplannedStop = value;
    }

    /**
     * Ruft den Wert der notServicedStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotServicedStop() {
        return notServicedStop;
    }

    /**
     * Legt den Wert der notServicedStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotServicedStop(Boolean value) {
        this.notServicedStop = value;
    }

    /**
     * Ruft den Wert der noBoardingAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoBoardingAtStop() {
        return noBoardingAtStop;
    }

    /**
     * Legt den Wert der noBoardingAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoBoardingAtStop(Boolean value) {
        this.noBoardingAtStop = value;
    }

    /**
     * Ruft den Wert der noAlightingAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoAlightingAtStop() {
        return noAlightingAtStop;
    }

    /**
     * Legt den Wert der noAlightingAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoAlightingAtStop(Boolean value) {
        this.noAlightingAtStop = value;
    }

    /**
     * The Occupancy structure from SIRI can be used here. It is recommended to mainly have one ExpectedDepartureOccupancy for each FareClass and mainly focus on OccupancyLevel and OccupancyPercentage. For more details have a look at the SIRI documentation.Gets the value of the expectedDepartureOccupancy property.
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
     * The Capacity structure also will probably rarely be used and parsed. When used, then it mainly shows elements that are important for accessibility.Gets the value of the expectedDepartureCapacities property.
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

    public LegBoardStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public LegBoardStructure withStopPointName(InternationalTextStructure value) {
        setStopPointName(value);
        return this;
    }

    public LegBoardStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public LegBoardStructure withPlannedQuay(InternationalTextStructure value) {
        setPlannedQuay(value);
        return this;
    }

    public LegBoardStructure withEstimatedQuay(InternationalTextStructure value) {
        setEstimatedQuay(value);
        return this;
    }

    public LegBoardStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public LegBoardStructure withServiceArrival(ServiceArrivalStructure value) {
        setServiceArrival(value);
        return this;
    }

    public LegBoardStructure withServiceDeparture(ServiceDepartureStructure value) {
        setServiceDeparture(value);
        return this;
    }

    public LegBoardStructure withDistributorInterchangeId(String value) {
        setDistributorInterchangeId(value);
        return this;
    }

    public LegBoardStructure withMeetsViaRequest(Boolean value) {
        setMeetsViaRequest(value);
        return this;
    }

    public LegBoardStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public LegBoardStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public LegBoardStructure withUnplannedStop(Boolean value) {
        setUnplannedStop(value);
        return this;
    }

    public LegBoardStructure withNotServicedStop(Boolean value) {
        setNotServicedStop(value);
        return this;
    }

    public LegBoardStructure withNoBoardingAtStop(Boolean value) {
        setNoBoardingAtStop(value);
        return this;
    }

    public LegBoardStructure withNoAlightingAtStop(Boolean value) {
        setNoAlightingAtStop(value);
        return this;
    }

    public LegBoardStructure withExpectedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values!= null) {
            for (VehicleOccupancyStructure value: values) {
                getExpectedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public LegBoardStructure withExpectedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values!= null) {
            getExpectedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public LegBoardStructure withExpectedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values!= null) {
            for (PassengerCapacityStructure value: values) {
                getExpectedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public LegBoardStructure withExpectedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values!= null) {
            getExpectedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public LegBoardStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public LegBoardStructure withAttribute(Collection<GeneralAttributeStructure> values) {
        if (values!= null) {
            getAttribute().addAll(values);
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
