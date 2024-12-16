//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

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
import uk.org.siri.siri.AccessFacilityEnumeration;
import uk.org.siri.siri.AccommodationFacilityEnumeration;
import uk.org.siri.siri.FareClassFacilityEnumeration;
import uk.org.siri.siri.LuggageFacilityEnumeration;
import uk.org.siri.siri.MobilityFacilityEnumeration;
import uk.org.siri.siri.NuisanceFacilityEnumeration;
import uk.org.siri.siri.PassengerCommsFacilityEnumeration;
import uk.org.siri.siri.PassengerInformationFacilityEnumeration;
import uk.org.siri.siri.RefreshmentFacilityEnumeration;
import uk.org.siri.siri.SanitaryFacilityEnumeration;
import uk.org.siri.siri.TicketingFacilityEnumeration;


/**
 * TripInfo result structure containing the status of a trip.
 * 
 * <p>Java-Klasse für TripInfoResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripInfoResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreviousCall" type="{http://www.vdv.de/ojp}CallAtStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurrentPosition" type="{http://www.vdv.de/ojp}VehiclePositionStructure" minOccurs="0"/&gt;
 *         &lt;element name="OnwardCall" type="{http://www.vdv.de/ojp}CallAtStopStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.vdv.de/ojp}DatedJourneyStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}OperatingDaysGroup" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceFacilityGroup" minOccurs="0"/&gt;
 *         &lt;element name="JourneyTrack" type="{http://www.vdv.de/ojp}LegTrackStructure" minOccurs="0"/&gt;
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
@XmlType(name = "TripInfoResultStructure", propOrder = {
    "errorCondition",
    "previousCall",
    "currentPosition",
    "onwardCall",
    "service",
    "operatingDays",
    "operatingDaysDescription",
    "fareClassFacility",
    "ticketingFacility",
    "nuisanceFacility",
    "mobilityFacility",
    "passengerInformationFacility",
    "passengerCommsFacility",
    "refreshmentFacility",
    "accessFacility",
    "sanitaryFacility",
    "luggageFacility",
    "accommodationFacility",
    "journeyTrack",
    "extension"
})
public class TripInfoResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "PreviousCall")
    protected List<CallAtStopStructure> previousCall;
    @XmlElement(name = "CurrentPosition")
    protected VehiclePositionStructure currentPosition;
    @XmlElement(name = "OnwardCall")
    protected List<CallAtStopStructure> onwardCall;
    @XmlElement(name = "Service")
    protected DatedJourneyStructure service;
    @XmlElement(name = "OperatingDays")
    protected OperatingDaysStructure operatingDays;
    @XmlElement(name = "OperatingDaysDescription")
    protected InternationalTextStructure operatingDaysDescription;
    @XmlElement(name = "FareClassFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FareClassFacilityEnumeration> fareClassFacility;
    @XmlElement(name = "TicketingFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<TicketingFacilityEnumeration> ticketingFacility;
    @XmlElement(name = "NuisanceFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<NuisanceFacilityEnumeration> nuisanceFacility;
    @XmlElement(name = "MobilityFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<MobilityFacilityEnumeration> mobilityFacility;
    @XmlElement(name = "PassengerInformationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerInformationFacilityEnumeration> passengerInformationFacility;
    @XmlElement(name = "PassengerCommsFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<PassengerCommsFacilityEnumeration> passengerCommsFacility;
    @XmlElement(name = "RefreshmentFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RefreshmentFacilityEnumeration> refreshmentFacility;
    @XmlElement(name = "AccessFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccessFacilityEnumeration> accessFacility;
    @XmlElement(name = "SanitaryFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<SanitaryFacilityEnumeration> sanitaryFacility;
    @XmlElement(name = "LuggageFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<LuggageFacilityEnumeration> luggageFacility;
    @XmlElement(name = "AccommodationFacility", namespace = "http://www.siri.org.uk/siri", defaultValue = "unknown")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<AccommodationFacilityEnumeration> accommodationFacility;
    @XmlElement(name = "JourneyTrack")
    protected LegTrackStructure journeyTrack;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the errorCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJPErrorStructure }
     * 
     * 
     */
    public List<OJPErrorStructure> getErrorCondition() {
        if (errorCondition == null) {
            errorCondition = new ArrayList<OJPErrorStructure>();
        }
        return this.errorCondition;
    }

    /**
     * Gets the value of the previousCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the previousCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreviousCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallAtStopStructure }
     * 
     * 
     */
    public List<CallAtStopStructure> getPreviousCall() {
        if (previousCall == null) {
            previousCall = new ArrayList<CallAtStopStructure>();
        }
        return this.previousCall;
    }

    /**
     * Ruft den Wert der currentPosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePositionStructure }
     *     
     */
    public VehiclePositionStructure getCurrentPosition() {
        return currentPosition;
    }

    /**
     * Legt den Wert der currentPosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePositionStructure }
     *     
     */
    public void setCurrentPosition(VehiclePositionStructure value) {
        this.currentPosition = value;
    }

    /**
     * Gets the value of the onwardCall property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the onwardCall property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnwardCall().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallAtStopStructure }
     * 
     * 
     */
    public List<CallAtStopStructure> getOnwardCall() {
        if (onwardCall == null) {
            onwardCall = new ArrayList<CallAtStopStructure>();
        }
        return this.onwardCall;
    }

    /**
     * Ruft den Wert der service-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public DatedJourneyStructure getService() {
        return service;
    }

    /**
     * Legt den Wert der service-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedJourneyStructure }
     *     
     */
    public void setService(DatedJourneyStructure value) {
        this.service = value;
    }

    /**
     * Ruft den Wert der operatingDays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public OperatingDaysStructure getOperatingDays() {
        return operatingDays;
    }

    /**
     * Legt den Wert der operatingDays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatingDaysStructure }
     *     
     */
    public void setOperatingDays(OperatingDaysStructure value) {
        this.operatingDays = value;
    }

    /**
     * Ruft den Wert der operatingDaysDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getOperatingDaysDescription() {
        return operatingDaysDescription;
    }

    /**
     * Legt den Wert der operatingDaysDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setOperatingDaysDescription(InternationalTextStructure value) {
        this.operatingDaysDescription = value;
    }

    /**
     * Gets the value of the fareClassFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the fareClassFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareClassFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareClassFacilityEnumeration }
     * 
     * 
     */
    public List<FareClassFacilityEnumeration> getFareClassFacility() {
        if (fareClassFacility == null) {
            fareClassFacility = new ArrayList<FareClassFacilityEnumeration>();
        }
        return this.fareClassFacility;
    }

    /**
     * Gets the value of the ticketingFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFacilityEnumeration }
     * 
     * 
     */
    public List<TicketingFacilityEnumeration> getTicketingFacility() {
        if (ticketingFacility == null) {
            ticketingFacility = new ArrayList<TicketingFacilityEnumeration>();
        }
        return this.ticketingFacility;
    }

    /**
     * Gets the value of the nuisanceFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nuisanceFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNuisanceFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NuisanceFacilityEnumeration }
     * 
     * 
     */
    public List<NuisanceFacilityEnumeration> getNuisanceFacility() {
        if (nuisanceFacility == null) {
            nuisanceFacility = new ArrayList<NuisanceFacilityEnumeration>();
        }
        return this.nuisanceFacility;
    }

    /**
     * Gets the value of the mobilityFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mobilityFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilityFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobilityFacilityEnumeration }
     * 
     * 
     */
    public List<MobilityFacilityEnumeration> getMobilityFacility() {
        if (mobilityFacility == null) {
            mobilityFacility = new ArrayList<MobilityFacilityEnumeration>();
        }
        return this.mobilityFacility;
    }

    /**
     * Gets the value of the passengerInformationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInformationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerInformationFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerInformationFacilityEnumeration> getPassengerInformationFacility() {
        if (passengerInformationFacility == null) {
            passengerInformationFacility = new ArrayList<PassengerInformationFacilityEnumeration>();
        }
        return this.passengerInformationFacility;
    }

    /**
     * Gets the value of the passengerCommsFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the passengerCommsFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerCommsFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCommsFacilityEnumeration }
     * 
     * 
     */
    public List<PassengerCommsFacilityEnumeration> getPassengerCommsFacility() {
        if (passengerCommsFacility == null) {
            passengerCommsFacility = new ArrayList<PassengerCommsFacilityEnumeration>();
        }
        return this.passengerCommsFacility;
    }

    /**
     * Gets the value of the refreshmentFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the refreshmentFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefreshmentFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RefreshmentFacilityEnumeration }
     * 
     * 
     */
    public List<RefreshmentFacilityEnumeration> getRefreshmentFacility() {
        if (refreshmentFacility == null) {
            refreshmentFacility = new ArrayList<RefreshmentFacilityEnumeration>();
        }
        return this.refreshmentFacility;
    }

    /**
     * Gets the value of the accessFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessFacilityEnumeration }
     * 
     * 
     */
    public List<AccessFacilityEnumeration> getAccessFacility() {
        if (accessFacility == null) {
            accessFacility = new ArrayList<AccessFacilityEnumeration>();
        }
        return this.accessFacility;
    }

    /**
     * Gets the value of the sanitaryFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryFacilityEnumeration }
     * 
     * 
     */
    public List<SanitaryFacilityEnumeration> getSanitaryFacility() {
        if (sanitaryFacility == null) {
            sanitaryFacility = new ArrayList<SanitaryFacilityEnumeration>();
        }
        return this.sanitaryFacility;
    }

    /**
     * Gets the value of the luggageFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the luggageFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLuggageFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LuggageFacilityEnumeration }
     * 
     * 
     */
    public List<LuggageFacilityEnumeration> getLuggageFacility() {
        if (luggageFacility == null) {
            luggageFacility = new ArrayList<LuggageFacilityEnumeration>();
        }
        return this.luggageFacility;
    }

    /**
     * Gets the value of the accommodationFacility property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationFacility property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationFacility().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccommodationFacilityEnumeration }
     * 
     * 
     */
    public List<AccommodationFacilityEnumeration> getAccommodationFacility() {
        if (accommodationFacility == null) {
            accommodationFacility = new ArrayList<AccommodationFacilityEnumeration>();
        }
        return this.accommodationFacility;
    }

    /**
     * Ruft den Wert der journeyTrack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LegTrackStructure }
     *     
     */
    public LegTrackStructure getJourneyTrack() {
        return journeyTrack;
    }

    /**
     * Legt den Wert der journeyTrack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LegTrackStructure }
     *     
     */
    public void setJourneyTrack(LegTrackStructure value) {
        this.journeyTrack = value;
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

    public TripInfoResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withPreviousCall(CallAtStopStructure... values) {
        if (values!= null) {
            for (CallAtStopStructure value: values) {
                getPreviousCall().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withPreviousCall(Collection<CallAtStopStructure> values) {
        if (values!= null) {
            getPreviousCall().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withCurrentPosition(VehiclePositionStructure value) {
        setCurrentPosition(value);
        return this;
    }

    public TripInfoResultStructure withOnwardCall(CallAtStopStructure... values) {
        if (values!= null) {
            for (CallAtStopStructure value: values) {
                getOnwardCall().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withOnwardCall(Collection<CallAtStopStructure> values) {
        if (values!= null) {
            getOnwardCall().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withService(DatedJourneyStructure value) {
        setService(value);
        return this;
    }

    public TripInfoResultStructure withOperatingDays(OperatingDaysStructure value) {
        setOperatingDays(value);
        return this;
    }

    public TripInfoResultStructure withOperatingDaysDescription(InternationalTextStructure value) {
        setOperatingDaysDescription(value);
        return this;
    }

    public TripInfoResultStructure withFareClassFacility(FareClassFacilityEnumeration... values) {
        if (values!= null) {
            for (FareClassFacilityEnumeration value: values) {
                getFareClassFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withFareClassFacility(Collection<FareClassFacilityEnumeration> values) {
        if (values!= null) {
            getFareClassFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withTicketingFacility(TicketingFacilityEnumeration... values) {
        if (values!= null) {
            for (TicketingFacilityEnumeration value: values) {
                getTicketingFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withTicketingFacility(Collection<TicketingFacilityEnumeration> values) {
        if (values!= null) {
            getTicketingFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withNuisanceFacility(NuisanceFacilityEnumeration... values) {
        if (values!= null) {
            for (NuisanceFacilityEnumeration value: values) {
                getNuisanceFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withNuisanceFacility(Collection<NuisanceFacilityEnumeration> values) {
        if (values!= null) {
            getNuisanceFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withMobilityFacility(MobilityFacilityEnumeration... values) {
        if (values!= null) {
            for (MobilityFacilityEnumeration value: values) {
                getMobilityFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withMobilityFacility(Collection<MobilityFacilityEnumeration> values) {
        if (values!= null) {
            getMobilityFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withPassengerInformationFacility(PassengerInformationFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerInformationFacilityEnumeration value: values) {
                getPassengerInformationFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withPassengerInformationFacility(Collection<PassengerInformationFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerInformationFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withPassengerCommsFacility(PassengerCommsFacilityEnumeration... values) {
        if (values!= null) {
            for (PassengerCommsFacilityEnumeration value: values) {
                getPassengerCommsFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withPassengerCommsFacility(Collection<PassengerCommsFacilityEnumeration> values) {
        if (values!= null) {
            getPassengerCommsFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withRefreshmentFacility(RefreshmentFacilityEnumeration... values) {
        if (values!= null) {
            for (RefreshmentFacilityEnumeration value: values) {
                getRefreshmentFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withRefreshmentFacility(Collection<RefreshmentFacilityEnumeration> values) {
        if (values!= null) {
            getRefreshmentFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withAccessFacility(AccessFacilityEnumeration... values) {
        if (values!= null) {
            for (AccessFacilityEnumeration value: values) {
                getAccessFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withAccessFacility(Collection<AccessFacilityEnumeration> values) {
        if (values!= null) {
            getAccessFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withSanitaryFacility(SanitaryFacilityEnumeration... values) {
        if (values!= null) {
            for (SanitaryFacilityEnumeration value: values) {
                getSanitaryFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withSanitaryFacility(Collection<SanitaryFacilityEnumeration> values) {
        if (values!= null) {
            getSanitaryFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withLuggageFacility(LuggageFacilityEnumeration... values) {
        if (values!= null) {
            for (LuggageFacilityEnumeration value: values) {
                getLuggageFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withLuggageFacility(Collection<LuggageFacilityEnumeration> values) {
        if (values!= null) {
            getLuggageFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withAccommodationFacility(AccommodationFacilityEnumeration... values) {
        if (values!= null) {
            for (AccommodationFacilityEnumeration value: values) {
                getAccommodationFacility().add(value);
            }
        }
        return this;
    }

    public TripInfoResultStructure withAccommodationFacility(Collection<AccommodationFacilityEnumeration> values) {
        if (values!= null) {
            getAccommodationFacility().addAll(values);
        }
        return this;
    }

    public TripInfoResultStructure withJourneyTrack(LegTrackStructure value) {
        setJourneyTrack(value);
        return this;
    }

    public TripInfoResultStructure withExtension(Object value) {
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
