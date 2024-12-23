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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.PassengerCapacityStructure;
import uk.org.siri.siri.VehicleOccupancyStructure;


/**
 * Provisioned vehicle call at a general location.
 * 
 * <p>Java-Klasse für ProvisionedCallAtPlaceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ProvisionedCallAtPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}DatedJourneyRefGroup" minOccurs="0"/&gt;
 *         &lt;element name="CallPlace" type="{http://www.vdv.de/ojp}PlaceRefStructure"/&gt;
 *         &lt;element name="ServiceArrival" type="{http://www.vdv.de/ojp}ServiceArrivalStructure" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDeparture" type="{http://www.vdv.de/ojp}ServiceDepartureStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopCallStatusGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProvisionedCallAtPlaceStructure", propOrder = {
    "journeyRef",
    "operatingDayRef",
    "callPlace",
    "serviceArrival",
    "serviceDeparture",
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
public class ProvisionedCallAtPlaceStructure {

    @XmlElement(name = "JourneyRef")
    protected JourneyRefStructure journeyRef;
    @XmlElement(name = "OperatingDayRef")
    protected OperatingDayRefStructure operatingDayRef;
    @XmlElement(name = "CallPlace", required = true)
    protected PlaceRefStructure callPlace;
    @XmlElement(name = "ServiceArrival")
    protected ServiceArrivalStructure serviceArrival;
    @XmlElement(name = "ServiceDeparture")
    protected ServiceDepartureStructure serviceDeparture;
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
     * Ruft den Wert der operatingDayRef-Eigenschaft ab.
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
     * Ruft den Wert der callPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getCallPlace() {
        return callPlace;
    }

    /**
     * Legt den Wert der callPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setCallPlace(PlaceRefStructure value) {
        this.callPlace = value;
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

    public ProvisionedCallAtPlaceStructure withJourneyRef(JourneyRefStructure value) {
        setJourneyRef(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withOperatingDayRef(OperatingDayRefStructure value) {
        setOperatingDayRef(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withCallPlace(PlaceRefStructure value) {
        setCallPlace(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withServiceArrival(ServiceArrivalStructure value) {
        setServiceArrival(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withServiceDeparture(ServiceDepartureStructure value) {
        setServiceDeparture(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withRequestStop(Boolean value) {
        setRequestStop(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withUnplannedStop(Boolean value) {
        setUnplannedStop(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withNotServicedStop(Boolean value) {
        setNotServicedStop(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withNoBoardingAtStop(Boolean value) {
        setNoBoardingAtStop(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withNoAlightingAtStop(Boolean value) {
        setNoAlightingAtStop(value);
        return this;
    }

    public ProvisionedCallAtPlaceStructure withExpectedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values!= null) {
            for (VehicleOccupancyStructure value: values) {
                getExpectedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public ProvisionedCallAtPlaceStructure withExpectedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values!= null) {
            getExpectedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public ProvisionedCallAtPlaceStructure withExpectedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values!= null) {
            for (PassengerCapacityStructure value: values) {
                getExpectedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public ProvisionedCallAtPlaceStructure withExpectedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values!= null) {
            getExpectedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public ProvisionedCallAtPlaceStructure withAttribute(GeneralAttributeStructure... values) {
        if (values!= null) {
            for (GeneralAttributeStructure value: values) {
                getAttribute().add(value);
            }
        }
        return this;
    }

    public ProvisionedCallAtPlaceStructure withAttribute(Collection<GeneralAttributeStructure> values) {
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
