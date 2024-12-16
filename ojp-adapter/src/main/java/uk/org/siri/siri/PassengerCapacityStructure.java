//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Real-time capacities of a VEHICLE (by fare class), i.e., number of available seats. Alternative way to communicate occupancy measurements. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für PassengerCapacityStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PassengerCapacityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}OccupancyScopeFilterGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}PassengerCapacityGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerCapacityStructure", propOrder = {
    "compoundTrainRef",
    "trainRef",
    "trainInCompoundTrainRef",
    "trainElementRef",
    "trainComponentRef",
    "entranceToVehicleRef",
    "fareClass",
    "passengerCategory",
    "totalCapacity",
    "seatingCapacity",
    "standingCapacity",
    "specialPlaceCapacity",
    "pushchairCapacity",
    "wheelchairPlaceCapacity",
    "pramPlaceCapacity",
    "bicycleRackCapacity"
})
public class PassengerCapacityStructure {

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
    @XmlElement(name = "TotalCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalCapacity;
    @XmlElement(name = "SeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seatingCapacity;
    @XmlElement(name = "StandingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger standingCapacity;
    @XmlElement(name = "SpecialPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specialPlaceCapacity;
    @XmlElement(name = "PushchairCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pushchairCapacity;
    @XmlElement(name = "WheelchairPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger wheelchairPlaceCapacity;
    @XmlElement(name = "PramPlaceCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pramPlaceCapacity;
    @XmlElement(name = "BicycleRackCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger bicycleRackCapacity;

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
     * Ruft den Wert der totalCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Legt den Wert der totalCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalCapacity(BigInteger value) {
        this.totalCapacity = value;
    }

    /**
     * Ruft den Wert der seatingCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatingCapacity() {
        return seatingCapacity;
    }

    /**
     * Legt den Wert der seatingCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatingCapacity(BigInteger value) {
        this.seatingCapacity = value;
    }

    /**
     * Ruft den Wert der standingCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandingCapacity() {
        return standingCapacity;
    }

    /**
     * Legt den Wert der standingCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandingCapacity(BigInteger value) {
        this.standingCapacity = value;
    }

    /**
     * Ruft den Wert der specialPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialPlaceCapacity() {
        return specialPlaceCapacity;
    }

    /**
     * Legt den Wert der specialPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialPlaceCapacity(BigInteger value) {
        this.specialPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der pushchairCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPushchairCapacity() {
        return pushchairCapacity;
    }

    /**
     * Legt den Wert der pushchairCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPushchairCapacity(BigInteger value) {
        this.pushchairCapacity = value;
    }

    /**
     * Ruft den Wert der wheelchairPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWheelchairPlaceCapacity() {
        return wheelchairPlaceCapacity;
    }

    /**
     * Legt den Wert der wheelchairPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWheelchairPlaceCapacity(BigInteger value) {
        this.wheelchairPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der pramPlaceCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPramPlaceCapacity() {
        return pramPlaceCapacity;
    }

    /**
     * Legt den Wert der pramPlaceCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPramPlaceCapacity(BigInteger value) {
        this.pramPlaceCapacity = value;
    }

    /**
     * Ruft den Wert der bicycleRackCapacity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBicycleRackCapacity() {
        return bicycleRackCapacity;
    }

    /**
     * Legt den Wert der bicycleRackCapacity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBicycleRackCapacity(BigInteger value) {
        this.bicycleRackCapacity = value;
    }

    public PassengerCapacityStructure withCompoundTrainRef(CompoundTrainRefStructure value) {
        setCompoundTrainRef(value);
        return this;
    }

    public PassengerCapacityStructure withTrainRef(TrainRefStructure value) {
        setTrainRef(value);
        return this;
    }

    public PassengerCapacityStructure withTrainInCompoundTrainRef(TrainInCompoundTrainRefStructure value) {
        setTrainInCompoundTrainRef(value);
        return this;
    }

    public PassengerCapacityStructure withTrainElementRef(TrainElementRefStructure value) {
        setTrainElementRef(value);
        return this;
    }

    public PassengerCapacityStructure withTrainComponentRef(TrainComponentRefStructure value) {
        setTrainComponentRef(value);
        return this;
    }

    public PassengerCapacityStructure withEntranceToVehicleRef(EntranceToVehicleRefStructure value) {
        setEntranceToVehicleRef(value);
        return this;
    }

    public PassengerCapacityStructure withFareClass(FareClassEnumeration value) {
        setFareClass(value);
        return this;
    }

    public PassengerCapacityStructure withPassengerCategory(NaturalLanguageStringStructure value) {
        setPassengerCategory(value);
        return this;
    }

    public PassengerCapacityStructure withTotalCapacity(BigInteger value) {
        setTotalCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withSeatingCapacity(BigInteger value) {
        setSeatingCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withStandingCapacity(BigInteger value) {
        setStandingCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withSpecialPlaceCapacity(BigInteger value) {
        setSpecialPlaceCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withPushchairCapacity(BigInteger value) {
        setPushchairCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withWheelchairPlaceCapacity(BigInteger value) {
        setWheelchairPlaceCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withPramPlaceCapacity(BigInteger value) {
        setPramPlaceCapacity(value);
        return this;
    }

    public PassengerCapacityStructure withBicycleRackCapacity(BigInteger value) {
        setBicycleRackCapacity(value);
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
