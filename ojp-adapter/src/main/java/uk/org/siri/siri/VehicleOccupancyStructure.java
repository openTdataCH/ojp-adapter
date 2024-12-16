//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigDecimal;
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


/**
 * Real-time occupancies of a VEHICLE (by fare class). Could be feedback from an automatic passenger counting system (APC) or estimated values from statistics. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für VehicleOccupancyStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="VehicleOccupancyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}OccupancyScopeFilterGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}OccupancyValuesGroup"/&gt;
 *         &lt;element name="TotalNumberOfReservedSeats" type="{http://www.siri.org.uk/siri}NumberOfPassengers" minOccurs="0"/&gt;
 *         &lt;element name="GroupReservation" type="{http://www.siri.org.uk/siri}GroupReservationStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleOccupancyStructure", propOrder = {
    "compoundTrainRef",
    "trainRef",
    "trainInCompoundTrainRef",
    "trainElementRef",
    "trainComponentRef",
    "entranceToVehicleRef",
    "fareClass",
    "passengerCategory",
    "occupancyLevel",
    "occupancyPercentage",
    "alightingCount",
    "boardingCount",
    "onboardCount",
    "specialPlacesOccupied",
    "pushchairsOnboardCount",
    "wheelchairsOnboardCount",
    "pramsOnboardCount",
    "bicycleOnboardCount",
    "totalNumberOfReservedSeats",
    "groupReservation"
})
public class VehicleOccupancyStructure {

    @XmlElement(name = "CompoundTrainRef")
    protected CompoundTrainRefStructure compoundTrainRef;
    @XmlElement(name = "TrainRef")
    protected TrainRefStructure trainRef;
    @XmlElement(name = "TrainInCompoundTrainRef")
    protected TrainInCompoundTrainRefStructure trainInCompoundTrainRef;
    @XmlElement(name = "TrainElementRef")
    protected TrainElementRefStructure trainElementRef;
    @XmlElement(name = "TrainComponentRef")
    protected TrainComponentRefStructure trainComponentRef;
    @XmlElement(name = "EntranceToVehicleRef")
    protected EntranceToVehicleRefStructure entranceToVehicleRef;
    @XmlElement(name = "FareClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassEnumeration fareClass;
    @XmlElement(name = "PassengerCategory")
    protected NaturalLanguageStringStructure passengerCategory;
    @XmlElement(name = "OccupancyLevel")
    @XmlSchemaType(name = "NMTOKEN")
    protected OccupancyEnumeration occupancyLevel;
    @XmlElement(name = "OccupancyPercentage")
    protected BigDecimal occupancyPercentage;
    @XmlElement(name = "AlightingCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger alightingCount;
    @XmlElement(name = "BoardingCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger boardingCount;
    @XmlElement(name = "OnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger onboardCount;
    @XmlElement(name = "SpecialPlacesOccupied")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specialPlacesOccupied;
    @XmlElement(name = "PushchairsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pushchairsOnboardCount;
    @XmlElement(name = "WheelchairsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelchairsOnboardCount;
    @XmlElement(name = "PramsOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pramsOnboardCount;
    @XmlElement(name = "BicycleOnboardCount")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bicycleOnboardCount;
    @XmlElement(name = "TotalNumberOfReservedSeats")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfReservedSeats;
    @XmlElement(name = "GroupReservation")
    protected List<GroupReservationStructure> groupReservation;

    /**
     * Ruft den Wert der compoundTrainRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompoundTrainRefStructure }
     *     
     */
    public CompoundTrainRefStructure getCompoundTrainRef() {
        return compoundTrainRef;
    }

    /**
     * Legt den Wert der compoundTrainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundTrainRefStructure }
     *     
     */
    public void setCompoundTrainRef(CompoundTrainRefStructure value) {
        this.compoundTrainRef = value;
    }

    /**
     * Ruft den Wert der trainRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainRefStructure }
     *     
     */
    public TrainRefStructure getTrainRef() {
        return trainRef;
    }

    /**
     * Legt den Wert der trainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainRefStructure }
     *     
     */
    public void setTrainRef(TrainRefStructure value) {
        this.trainRef = value;
    }

    /**
     * Ruft den Wert der trainInCompoundTrainRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainInCompoundTrainRefStructure }
     *     
     */
    public TrainInCompoundTrainRefStructure getTrainInCompoundTrainRef() {
        return trainInCompoundTrainRef;
    }

    /**
     * Legt den Wert der trainInCompoundTrainRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainInCompoundTrainRefStructure }
     *     
     */
    public void setTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        this.trainInCompoundTrainRef = value;
    }

    /**
     * Ruft den Wert der trainElementRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public TrainElementRefStructure getTrainElementRef() {
        return trainElementRef;
    }

    /**
     * Legt den Wert der trainElementRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainElementRefStructure }
     *     
     */
    public void setTrainElementRef(TrainElementRefStructure value) {
        this.trainElementRef = value;
    }

    /**
     * Ruft den Wert der trainComponentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public TrainComponentRefStructure getTrainComponentRef() {
        return trainComponentRef;
    }

    /**
     * Legt den Wert der trainComponentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainComponentRefStructure }
     *     
     */
    public void setTrainComponentRef(TrainComponentRefStructure value) {
        this.trainComponentRef = value;
    }

    /**
     * Ruft den Wert der entranceToVehicleRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EntranceToVehicleRefStructure }
     *     
     */
    public EntranceToVehicleRefStructure getEntranceToVehicleRef() {
        return entranceToVehicleRef;
    }

    /**
     * Legt den Wert der entranceToVehicleRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EntranceToVehicleRefStructure }
     *     
     */
    public void setEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        this.entranceToVehicleRef = value;
    }

    /**
     * Ruft den Wert der fareClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassEnumeration }
     *     
     */
    public FareClassEnumeration getFareClass() {
        return fareClass;
    }

    /**
     * Legt den Wert der fareClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassEnumeration }
     *     
     */
    public void setFareClass(FareClassEnumeration value) {
        this.fareClass = value;
    }

    /**
     * Ruft den Wert der passengerCategory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPassengerCategory() {
        return passengerCategory;
    }

    /**
     * Legt den Wert der passengerCategory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPassengerCategory(NaturalLanguageStringStructure value) {
        this.passengerCategory = value;
    }

    /**
     * Ruft den Wert der occupancyLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public OccupancyEnumeration getOccupancyLevel() {
        return occupancyLevel;
    }

    /**
     * Legt den Wert der occupancyLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OccupancyEnumeration }
     *     
     */
    public void setOccupancyLevel(OccupancyEnumeration value) {
        this.occupancyLevel = value;
    }

    /**
     * Ruft den Wert der occupancyPercentage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOccupancyPercentage() {
        return occupancyPercentage;
    }

    /**
     * Legt den Wert der occupancyPercentage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOccupancyPercentage(BigDecimal value) {
        this.occupancyPercentage = value;
    }

    /**
     * Ruft den Wert der alightingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAlightingCount() {
        return alightingCount;
    }

    /**
     * Legt den Wert der alightingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAlightingCount(BigInteger value) {
        this.alightingCount = value;
    }

    /**
     * Ruft den Wert der boardingCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBoardingCount() {
        return boardingCount;
    }

    /**
     * Legt den Wert der boardingCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBoardingCount(BigInteger value) {
        this.boardingCount = value;
    }

    /**
     * Ruft den Wert der onboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOnboardCount() {
        return onboardCount;
    }

    /**
     * Legt den Wert der onboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOnboardCount(BigInteger value) {
        this.onboardCount = value;
    }

    /**
     * Ruft den Wert der specialPlacesOccupied-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialPlacesOccupied() {
        return specialPlacesOccupied;
    }

    /**
     * Legt den Wert der specialPlacesOccupied-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialPlacesOccupied(BigInteger value) {
        this.specialPlacesOccupied = value;
    }

    /**
     * Ruft den Wert der pushchairsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushchairsOnboardCount() {
        return pushchairsOnboardCount;
    }

    /**
     * Legt den Wert der pushchairsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushchairsOnboardCount(BigInteger value) {
        this.pushchairsOnboardCount = value;
    }

    /**
     * Ruft den Wert der wheelchairsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWheelchairsOnboardCount() {
        return wheelchairsOnboardCount;
    }

    /**
     * Legt den Wert der wheelchairsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWheelchairsOnboardCount(BigInteger value) {
        this.wheelchairsOnboardCount = value;
    }

    /**
     * Ruft den Wert der pramsOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPramsOnboardCount() {
        return pramsOnboardCount;
    }

    /**
     * Legt den Wert der pramsOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPramsOnboardCount(BigInteger value) {
        this.pramsOnboardCount = value;
    }

    /**
     * Ruft den Wert der bicycleOnboardCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBicycleOnboardCount() {
        return bicycleOnboardCount;
    }

    /**
     * Legt den Wert der bicycleOnboardCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBicycleOnboardCount(BigInteger value) {
        this.bicycleOnboardCount = value;
    }

    /**
     * Ruft den Wert der totalNumberOfReservedSeats-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfReservedSeats() {
        return totalNumberOfReservedSeats;
    }

    /**
     * Legt den Wert der totalNumberOfReservedSeats-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfReservedSeats(BigInteger value) {
        this.totalNumberOfReservedSeats = value;
    }

    /**
     * Gets the value of the groupReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the groupReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GroupReservationStructure }
     * 
     * 
     */
    public List<GroupReservationStructure> getGroupReservation() {
        if (groupReservation == null) {
            groupReservation = new ArrayList<GroupReservationStructure>();
        }
        return this.groupReservation;
    }

    public VehicleOccupancyStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public VehicleOccupancyStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public VehicleOccupancyStructure withTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        setTrainInCompoundTrainRef(value);
        return this;
    }

    public VehicleOccupancyStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public VehicleOccupancyStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public VehicleOccupancyStructure withEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        setEntranceToVehicleRef(value);
        return this;
    }

    public VehicleOccupancyStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public VehicleOccupancyStructure withPassengerCategory(NaturalLanguageStringStructure value) {
        setPassengerCategory(value);
        return this;
    }

    public VehicleOccupancyStructure withOccupancyLevel(OccupancyEnumeration value) {
        setOccupancyLevel(value);
        return this;
    }

    public VehicleOccupancyStructure withOccupancyPercentage(BigDecimal value) {
        setOccupancyPercentage(value);
        return this;
    }

    public VehicleOccupancyStructure withAlightingCount(BigInteger value) {
        setAlightingCount(value);
        return this;
    }

    public VehicleOccupancyStructure withBoardingCount(BigInteger value) {
        setBoardingCount(value);
        return this;
    }

    public VehicleOccupancyStructure withOnboardCount(BigInteger value) {
        setOnboardCount(value);
        return this;
    }

    public VehicleOccupancyStructure withSpecialPlacesOccupied(BigInteger value) {
        setSpecialPlacesOccupied(value);
        return this;
    }

    public VehicleOccupancyStructure withPushchairsOnboardCount(BigInteger value) {
        setPushchairsOnboardCount(value);
        return this;
    }

    public VehicleOccupancyStructure withWheelchairsOnboardCount(BigInteger value) {
        setWheelchairsOnboardCount(value);
        return this;
    }

    public VehicleOccupancyStructure withPramsOnboardCount(BigInteger value) {
        setPramsOnboardCount(value);
        return this;
    }

    public VehicleOccupancyStructure withBicycleOnboardCount(BigInteger value) {
        setBicycleOnboardCount(value);
        return this;
    }

    public VehicleOccupancyStructure withTotalNumberOfReservedSeats(BigInteger value) {
        setTotalNumberOfReservedSeats(value);
        return this;
    }

    public VehicleOccupancyStructure withGroupReservation(GroupReservationStructure... values) {
        if (values!= null) {
            for (GroupReservationStructure value: values) {
                getGroupReservation().add(value);
            }
        }
        return this;
    }

    public VehicleOccupancyStructure withGroupReservation(Collection<GroupReservationStructure> values) {
        if (values!= null) {
            getGroupReservation().addAll(values);
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
