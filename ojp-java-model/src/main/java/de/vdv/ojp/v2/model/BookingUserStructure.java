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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.time.Duration;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;

/**
 * Passenger(s) for whom the service needs to be booked.
 *
 * <p>Java-Klasse für BookingUserStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="BookingUserStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Age" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PassengerProfileGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PassengerRequirementsGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingUserStructure", propOrder = {
    "age",
    "wheelchairUser",
    "walkingFrame",
    "walkingStick",
    "walkingImpaired",
    "pram",
    "heavyLuggage",
    "visuallyImpaired",
    "hearingImpaired",
    "readingImpaired",
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
    "boardingAssistance",
    "alightingAssistance"
})
public class BookingUserStructure {

    @XmlElement(name = "Age")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger age;
    @XmlElement(name = "WheelchairUser")
    protected Boolean wheelchairUser;
    @XmlElement(name = "WalkingFrame")
    protected Boolean walkingFrame;
    @XmlElement(name = "WalkingStick")
    protected Boolean walkingStick;
    @XmlElement(name = "WalkingImpaired")
    protected Boolean walkingImpaired;
    @XmlElement(name = "Pram")
    protected Boolean pram;
    @XmlElement(name = "HeavyLuggage")
    protected Boolean heavyLuggage;
    @XmlElement(name = "VisuallyImpaired")
    protected Boolean visuallyImpaired;
    @XmlElement(name = "HearingImpaired")
    protected Boolean hearingImpaired;
    @XmlElement(name = "ReadingImpaired")
    protected Boolean readingImpaired;
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
    @XmlElement(name = "BoardingAssistance")
    protected Boolean boardingAssistance;
    @XmlElement(name = "AlightingAssistance")
    protected Boolean alightingAssistance;

    /**
     * Ruft den Wert der age-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Legt den Wert der age-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

    /**
     * Ruft den Wert der wheelchairUser-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isWheelchairUser() {
        return wheelchairUser;
    }

    /**
     * Legt den Wert der wheelchairUser-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setWheelchairUser(Boolean value) {
        this.wheelchairUser = value;
    }

    /**
     * Ruft den Wert der walkingFrame-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isWalkingFrame() {
        return walkingFrame;
    }

    /**
     * Legt den Wert der walkingFrame-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setWalkingFrame(Boolean value) {
        this.walkingFrame = value;
    }

    /**
     * Ruft den Wert der walkingStick-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isWalkingStick() {
        return walkingStick;
    }

    /**
     * Legt den Wert der walkingStick-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setWalkingStick(Boolean value) {
        this.walkingStick = value;
    }

    /**
     * Ruft den Wert der walkingImpaired-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isWalkingImpaired() {
        return walkingImpaired;
    }

    /**
     * Legt den Wert der walkingImpaired-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setWalkingImpaired(Boolean value) {
        this.walkingImpaired = value;
    }

    /**
     * Ruft den Wert der pram-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isPram() {
        return pram;
    }

    /**
     * Legt den Wert der pram-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setPram(Boolean value) {
        this.pram = value;
    }

    /**
     * Ruft den Wert der heavyLuggage-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isHeavyLuggage() {
        return heavyLuggage;
    }

    /**
     * Legt den Wert der heavyLuggage-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setHeavyLuggage(Boolean value) {
        this.heavyLuggage = value;
    }

    /**
     * Ruft den Wert der visuallyImpaired-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isVisuallyImpaired() {
        return visuallyImpaired;
    }

    /**
     * Legt den Wert der visuallyImpaired-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setVisuallyImpaired(Boolean value) {
        this.visuallyImpaired = value;
    }

    /**
     * Ruft den Wert der hearingImpaired-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isHearingImpaired() {
        return hearingImpaired;
    }

    /**
     * Legt den Wert der hearingImpaired-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setHearingImpaired(Boolean value) {
        this.hearingImpaired = value;
    }

    /**
     * Ruft den Wert der readingImpaired-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isReadingImpaired() {
        return readingImpaired;
    }

    /**
     * Legt den Wert der readingImpaired-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setReadingImpaired(Boolean value) {
        this.readingImpaired = value;
    }

    /**
     * Ruft den Wert der noSingleStep-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoSingleStep() {
        return noSingleStep;
    }

    /**
     * Legt den Wert der noSingleStep-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoSingleStep(Boolean value) {
        this.noSingleStep = value;
    }

    /**
     * Ruft den Wert der noStairs-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoStairs() {
        return noStairs;
    }

    /**
     * Legt den Wert der noStairs-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoStairs(Boolean value) {
        this.noStairs = value;
    }

    /**
     * Ruft den Wert der noEscalator-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoEscalator() {
        return noEscalator;
    }

    /**
     * Legt den Wert der noEscalator-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoEscalator(Boolean value) {
        this.noEscalator = value;
    }

    /**
     * Ruft den Wert der noElevator-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoElevator() {
        return noElevator;
    }

    /**
     * Legt den Wert der noElevator-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoElevator(Boolean value) {
        this.noElevator = value;
    }

    /**
     * Ruft den Wert der noRamp-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoRamp() {
        return noRamp;
    }

    /**
     * Legt den Wert der noRamp-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoRamp(Boolean value) {
        this.noRamp = value;
    }

    /**
     * Ruft den Wert der noSight-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoSight() {
        return noSight;
    }

    /**
     * Legt den Wert der noSight-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoSight(Boolean value) {
        this.noSight = value;
    }

    /**
     * Ruft den Wert der noTravelator-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isNoTravelator() {
        return noTravelator;
    }

    /**
     * Legt den Wert der noTravelator-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setNoTravelator(Boolean value) {
        this.noTravelator = value;
    }

    /**
     * Ruft den Wert der levelEntrance-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isLevelEntrance() {
        return levelEntrance;
    }

    /**
     * Legt den Wert der levelEntrance-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setLevelEntrance(Boolean value) {
        this.levelEntrance = value;
    }

    /**
     * Ruft den Wert der levelEntranceOrBoardingAid-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isLevelEntranceOrBoardingAid() {
        return levelEntranceOrBoardingAid;
    }

    /**
     * Legt den Wert der levelEntranceOrBoardingAid-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setLevelEntranceOrBoardingAid(Boolean value) {
        this.levelEntranceOrBoardingAid = value;
    }

    /**
     * Ruft den Wert der bikeTransport-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isBikeTransport() {
        return bikeTransport;
    }

    /**
     * Legt den Wert der bikeTransport-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setBikeTransport(Boolean value) {
        this.bikeTransport = value;
    }

    /**
     * Ruft den Wert der walkSpeed-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getWalkSpeed() {
        return walkSpeed;
    }

    /**
     * Legt den Wert der walkSpeed-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setWalkSpeed(BigInteger value) {
        this.walkSpeed = value;
    }

    /**
     * Ruft den Wert der additionalTransferTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getAdditionalTransferTime() {
        return additionalTransferTime;
    }

    /**
     * Legt den Wert der additionalTransferTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAdditionalTransferTime(Duration value) {
        this.additionalTransferTime = value;
    }

    /**
     * Ruft den Wert der hikingProfile-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getHikingProfile() {
        return hikingProfile;
    }

    /**
     * Legt den Wert der hikingProfile-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setHikingProfile(String value) {
        this.hikingProfile = value;
    }

    /**
     * Ruft den Wert der cyclingProfile-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getCyclingProfile() {
        return cyclingProfile;
    }

    /**
     * Legt den Wert der cyclingProfile-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCyclingProfile(String value) {
        this.cyclingProfile = value;
    }

    /**
     * Ruft den Wert der boardingAssistance-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isBoardingAssistance() {
        return boardingAssistance;
    }

    /**
     * Legt den Wert der boardingAssistance-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setBoardingAssistance(Boolean value) {
        this.boardingAssistance = value;
    }

    /**
     * Ruft den Wert der alightingAssistance-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isAlightingAssistance() {
        return alightingAssistance;
    }

    /**
     * Legt den Wert der alightingAssistance-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setAlightingAssistance(Boolean value) {
        this.alightingAssistance = value;
    }

    public BookingUserStructure withAge(BigInteger value) {
        setAge(value);
        return this;
    }

    public BookingUserStructure withWheelchairUser(Boolean value) {
        setWheelchairUser(value);
        return this;
    }

    public BookingUserStructure withWalkingFrame(Boolean value) {
        setWalkingFrame(value);
        return this;
    }

    public BookingUserStructure withWalkingStick(Boolean value) {
        setWalkingStick(value);
        return this;
    }

    public BookingUserStructure withWalkingImpaired(Boolean value) {
        setWalkingImpaired(value);
        return this;
    }

    public BookingUserStructure withPram(Boolean value) {
        setPram(value);
        return this;
    }

    public BookingUserStructure withHeavyLuggage(Boolean value) {
        setHeavyLuggage(value);
        return this;
    }

    public BookingUserStructure withVisuallyImpaired(Boolean value) {
        setVisuallyImpaired(value);
        return this;
    }

    public BookingUserStructure withHearingImpaired(Boolean value) {
        setHearingImpaired(value);
        return this;
    }

    public BookingUserStructure withReadingImpaired(Boolean value) {
        setReadingImpaired(value);
        return this;
    }

    public BookingUserStructure withNoSingleStep(Boolean value) {
        setNoSingleStep(value);
        return this;
    }

    public BookingUserStructure withNoStairs(Boolean value) {
        setNoStairs(value);
        return this;
    }

    public BookingUserStructure withNoEscalator(Boolean value) {
        setNoEscalator(value);
        return this;
    }

    public BookingUserStructure withNoElevator(Boolean value) {
        setNoElevator(value);
        return this;
    }

    public BookingUserStructure withNoRamp(Boolean value) {
        setNoRamp(value);
        return this;
    }

    public BookingUserStructure withNoSight(Boolean value) {
        setNoSight(value);
        return this;
    }

    public BookingUserStructure withNoTravelator(Boolean value) {
        setNoTravelator(value);
        return this;
    }

    public BookingUserStructure withLevelEntrance(Boolean value) {
        setLevelEntrance(value);
        return this;
    }

    public BookingUserStructure withLevelEntranceOrBoardingAid(Boolean value) {
        setLevelEntranceOrBoardingAid(value);
        return this;
    }

    public BookingUserStructure withBikeTransport(Boolean value) {
        setBikeTransport(value);
        return this;
    }

    public BookingUserStructure withWalkSpeed(BigInteger value) {
        setWalkSpeed(value);
        return this;
    }

    public BookingUserStructure withAdditionalTransferTime(Duration value) {
        setAdditionalTransferTime(value);
        return this;
    }

    public BookingUserStructure withHikingProfile(String value) {
        setHikingProfile(value);
        return this;
    }

    public BookingUserStructure withCyclingProfile(String value) {
        setCyclingProfile(value);
        return this;
    }

    public BookingUserStructure withBoardingAssistance(Boolean value) {
        setBoardingAssistance(value);
        return this;
    }

    public BookingUserStructure withAlightingAssistance(Boolean value) {
        setAlightingAssistance(value);
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
