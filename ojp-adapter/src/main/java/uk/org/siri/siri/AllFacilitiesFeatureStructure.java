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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Description of the features of any of the available facilities.
 * 
 * <p>Java-Klasse für AllFacilitiesFeatureStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AllFacilitiesFeatureStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccessFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AccommodationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AssistanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}FareClassFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}HireFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}LuggageFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}MobilityFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}NuisanceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ParkingFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerCommsFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerInformationFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RefreshmentFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ReservedSpaceFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RetailFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SanitaryFacility"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TicketingFacility"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllFacilitiesFeatureStructure", propOrder = {
    "accessFacility",
    "accommodationFacility",
    "assistanceFacility",
    "fareClassFacility",
    "hireFacility",
    "luggageFacility",
    "mobilityFacility",
    "nuisanceFacility",
    "parkingFacility",
    "passengerCommsFacility",
    "passengerInformationFacility",
    "refreshmentFacility",
    "reservedSpaceFacility",
    "retailFacility",
    "sanitaryFacility",
    "ticketingFacility"
})
public class AllFacilitiesFeatureStructure {

    @XmlElement(name = "AccessFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccessFacilityEnumeration accessFacility;
    @XmlElement(name = "AccommodationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AccommodationFacilityEnumeration accommodationFacility;
    @XmlElement(name = "AssistanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected AssistanceFacilityEnumeration assistanceFacility;
    @XmlElement(name = "FareClassFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected FareClassFacilityEnumeration fareClassFacility;
    @XmlElement(name = "HireFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected HireFacilityEnumeration hireFacility;
    @XmlElement(name = "LuggageFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected LuggageFacilityEnumeration luggageFacility;
    @XmlElement(name = "MobilityFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected MobilityFacilityEnumeration mobilityFacility;
    @XmlElement(name = "NuisanceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected NuisanceFacilityEnumeration nuisanceFacility;
    @XmlElement(name = "ParkingFacility")
    @XmlSchemaType(name = "NMTOKEN")
    protected ParkingFacilityEnumeration parkingFacility;
    @XmlElement(name = "PassengerCommsFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerCommsFacilityEnumeration passengerCommsFacility;
    @XmlElement(name = "PassengerInformationFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected PassengerInformationFacilityEnumeration passengerInformationFacility;
    @XmlElement(name = "RefreshmentFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RefreshmentFacilityEnumeration refreshmentFacility;
    @XmlElement(name = "ReservedSpaceFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected ReservedSpaceFacilityEnumeration reservedSpaceFacility;
    @XmlElement(name = "RetailFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected RetailFacilityEnumeration retailFacility;
    @XmlElement(name = "SanitaryFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected SanitaryFacilityEnumeration sanitaryFacility;
    @XmlElement(name = "TicketingFacility", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected TicketingFacilityEnumeration ticketingFacility;

    /**
     * Ruft den Wert der accessFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public AccessFacilityEnumeration getAccessFacility() {
        return accessFacility;
    }

    /**
     * Legt den Wert der accessFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFacilityEnumeration }
     *     
     */
    public void setAccessFacility(AccessFacilityEnumeration value) {
        this.accessFacility = value;
    }

    /**
     * Ruft den Wert der accommodationFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public AccommodationFacilityEnumeration getAccommodationFacility() {
        return accommodationFacility;
    }

    /**
     * Legt den Wert der accommodationFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationFacilityEnumeration }
     *     
     */
    public void setAccommodationFacility(AccommodationFacilityEnumeration value) {
        this.accommodationFacility = value;
    }

    /**
     * Ruft den Wert der assistanceFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public AssistanceFacilityEnumeration getAssistanceFacility() {
        return assistanceFacility;
    }

    /**
     * Legt den Wert der assistanceFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AssistanceFacilityEnumeration }
     *     
     */
    public void setAssistanceFacility(AssistanceFacilityEnumeration value) {
        this.assistanceFacility = value;
    }

    /**
     * Ruft den Wert der fareClassFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public FareClassFacilityEnumeration getFareClassFacility() {
        return fareClassFacility;
    }

    /**
     * Legt den Wert der fareClassFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FareClassFacilityEnumeration }
     *     
     */
    public void setFareClassFacility(FareClassFacilityEnumeration value) {
        this.fareClassFacility = value;
    }

    /**
     * Ruft den Wert der hireFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public HireFacilityEnumeration getHireFacility() {
        return hireFacility;
    }

    /**
     * Legt den Wert der hireFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HireFacilityEnumeration }
     *     
     */
    public void setHireFacility(HireFacilityEnumeration value) {
        this.hireFacility = value;
    }

    /**
     * Ruft den Wert der luggageFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public LuggageFacilityEnumeration getLuggageFacility() {
        return luggageFacility;
    }

    /**
     * Legt den Wert der luggageFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LuggageFacilityEnumeration }
     *     
     */
    public void setLuggageFacility(LuggageFacilityEnumeration value) {
        this.luggageFacility = value;
    }

    /**
     * Ruft den Wert der mobilityFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public MobilityFacilityEnumeration getMobilityFacility() {
        return mobilityFacility;
    }

    /**
     * Legt den Wert der mobilityFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MobilityFacilityEnumeration }
     *     
     */
    public void setMobilityFacility(MobilityFacilityEnumeration value) {
        this.mobilityFacility = value;
    }

    /**
     * Ruft den Wert der nuisanceFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public NuisanceFacilityEnumeration getNuisanceFacility() {
        return nuisanceFacility;
    }

    /**
     * Legt den Wert der nuisanceFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NuisanceFacilityEnumeration }
     *     
     */
    public void setNuisanceFacility(NuisanceFacilityEnumeration value) {
        this.nuisanceFacility = value;
    }

    /**
     * Ruft den Wert der parkingFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public ParkingFacilityEnumeration getParkingFacility() {
        return parkingFacility;
    }

    /**
     * Legt den Wert der parkingFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingFacilityEnumeration }
     *     
     */
    public void setParkingFacility(ParkingFacilityEnumeration value) {
        this.parkingFacility = value;
    }

    /**
     * Ruft den Wert der passengerCommsFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public PassengerCommsFacilityEnumeration getPassengerCommsFacility() {
        return passengerCommsFacility;
    }

    /**
     * Legt den Wert der passengerCommsFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerCommsFacilityEnumeration }
     *     
     */
    public void setPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        this.passengerCommsFacility = value;
    }

    /**
     * Ruft den Wert der passengerInformationFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public PassengerInformationFacilityEnumeration getPassengerInformationFacility() {
        return passengerInformationFacility;
    }

    /**
     * Legt den Wert der passengerInformationFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInformationFacilityEnumeration }
     *     
     */
    public void setPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        this.passengerInformationFacility = value;
    }

    /**
     * Ruft den Wert der refreshmentFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public RefreshmentFacilityEnumeration getRefreshmentFacility() {
        return refreshmentFacility;
    }

    /**
     * Legt den Wert der refreshmentFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RefreshmentFacilityEnumeration }
     *     
     */
    public void setRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        this.refreshmentFacility = value;
    }

    /**
     * Ruft den Wert der reservedSpaceFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public ReservedSpaceFacilityEnumeration getReservedSpaceFacility() {
        return reservedSpaceFacility;
    }

    /**
     * Legt den Wert der reservedSpaceFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservedSpaceFacilityEnumeration }
     *     
     */
    public void setReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        this.reservedSpaceFacility = value;
    }

    /**
     * Ruft den Wert der retailFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public RetailFacilityEnumeration getRetailFacility() {
        return retailFacility;
    }

    /**
     * Legt den Wert der retailFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailFacilityEnumeration }
     *     
     */
    public void setRetailFacility(RetailFacilityEnumeration value) {
        this.retailFacility = value;
    }

    /**
     * Ruft den Wert der sanitaryFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public SanitaryFacilityEnumeration getSanitaryFacility() {
        return sanitaryFacility;
    }

    /**
     * Legt den Wert der sanitaryFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryFacilityEnumeration }
     *     
     */
    public void setSanitaryFacility(SanitaryFacilityEnumeration value) {
        this.sanitaryFacility = value;
    }

    /**
     * Ruft den Wert der ticketingFacility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public TicketingFacilityEnumeration getTicketingFacility() {
        return ticketingFacility;
    }

    /**
     * Legt den Wert der ticketingFacility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFacilityEnumeration }
     *     
     */
    public void setTicketingFacility(TicketingFacilityEnumeration value) {
        this.ticketingFacility = value;
    }

    public AllFacilitiesFeatureStructure withAccessFacility(AccessFacilityEnumeration value) {
        setAccessFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAccommodationFacility(AccommodationFacilityEnumeration value) {
        setAccommodationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withAssistanceFacility(AssistanceFacilityEnumeration value) {
        setAssistanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withFareClassFacility(FareClassFacilityEnumeration value) {
        setFareClassFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withHireFacility(HireFacilityEnumeration value) {
        setHireFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withLuggageFacility(LuggageFacilityEnumeration value) {
        setLuggageFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withMobilityFacility(MobilityFacilityEnumeration value) {
        setMobilityFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withNuisanceFacility(NuisanceFacilityEnumeration value) {
        setNuisanceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withParkingFacility(ParkingFacilityEnumeration value) {
        setParkingFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration value) {
        setPassengerCommsFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration value) {
        setPassengerInformationFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRefreshmentFacility(RefreshmentFacilityEnumeration value) {
        setRefreshmentFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withReservedSpaceFacility(ReservedSpaceFacilityEnumeration value) {
        setReservedSpaceFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withRetailFacility(RetailFacilityEnumeration value) {
        setRetailFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withSanitaryFacility(SanitaryFacilityEnumeration value) {
        setSanitaryFacility(value);
        return this;
    }

    public AllFacilitiesFeatureStructure withTicketingFacility(TicketingFacilityEnumeration value) {
        setTicketingFacility(value);
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
