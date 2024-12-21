//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for CALL at previous stop.
 * 
 * <p>Java-Klasse für PreviousCallStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PreviousCallStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractMonitoredCallStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}VehicleAtStop" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleArrivalTimesGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleDepartureTimesGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RecordedDepartureOccupancy" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RecordedDepartureCapacities" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousCallStructure", propOrder = {
    "vehicleAtStop",
    "aimedArrivalTime",
    "actualArrivalTime",
    "expectedArrivalTime",
    "aimedDepartureTime",
    "actualDepartureTime",
    "expectedDepartureTime",
    "recordedDepartureOccupancy",
    "recordedDepartureCapacities",
    "extensions"
})
public class PreviousCallStructure
    extends AbstractMonitoredCallStructure
{

    @XmlElement(name = "VehicleAtStop", defaultValue = "false")
    protected Boolean vehicleAtStop;
    @XmlElement(name = "AimedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedArrivalTime;
    @XmlElement(name = "ActualArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualArrivalTime;
    @XmlElement(name = "ExpectedArrivalTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedArrivalTime;
    @XmlElement(name = "AimedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime aimedDepartureTime;
    @XmlElement(name = "ActualDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime actualDepartureTime;
    @XmlElement(name = "ExpectedDepartureTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime expectedDepartureTime;
    @XmlElement(name = "RecordedDepartureOccupancy")
    protected List<VehicleOccupancyStructure> recordedDepartureOccupancy;
    @XmlElement(name = "RecordedDepartureCapacities")
    protected List<PassengerCapacityStructure> recordedDepartureCapacities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der vehicleAtStop-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVehicleAtStop() {
        return vehicleAtStop;
    }

    /**
     * Legt den Wert der vehicleAtStop-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVehicleAtStop(Boolean value) {
        this.vehicleAtStop = value;
    }

    /**
     * Ruft den Wert der aimedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedArrivalTime() {
        return aimedArrivalTime;
    }

    /**
     * Legt den Wert der aimedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedArrivalTime(ZonedDateTime value) {
        this.aimedArrivalTime = value;
    }

    /**
     * Ruft den Wert der actualArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualArrivalTime() {
        return actualArrivalTime;
    }

    /**
     * Legt den Wert der actualArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualArrivalTime(ZonedDateTime value) {
        this.actualArrivalTime = value;
    }

    /**
     * Ruft den Wert der expectedArrivalTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedArrivalTime() {
        return expectedArrivalTime;
    }

    /**
     * Legt den Wert der expectedArrivalTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedArrivalTime(ZonedDateTime value) {
        this.expectedArrivalTime = value;
    }

    /**
     * Ruft den Wert der aimedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getAimedDepartureTime() {
        return aimedDepartureTime;
    }

    /**
     * Legt den Wert der aimedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimedDepartureTime(ZonedDateTime value) {
        this.aimedDepartureTime = value;
    }

    /**
     * Ruft den Wert der actualDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getActualDepartureTime() {
        return actualDepartureTime;
    }

    /**
     * Legt den Wert der actualDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualDepartureTime(ZonedDateTime value) {
        this.actualDepartureTime = value;
    }

    /**
     * Ruft den Wert der expectedDepartureTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getExpectedDepartureTime() {
        return expectedDepartureTime;
    }

    /**
     * Legt den Wert der expectedDepartureTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedDepartureTime(ZonedDateTime value) {
        this.expectedDepartureTime = value;
    }

    /**
     * Gets the value of the recordedDepartureOccupancy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recordedDepartureOccupancy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureOccupancy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleOccupancyStructure }
     * 
     * 
     */
    public List<VehicleOccupancyStructure> getRecordedDepartureOccupancy() {
        if (recordedDepartureOccupancy == null) {
            recordedDepartureOccupancy = new ArrayList<VehicleOccupancyStructure>();
        }
        return this.recordedDepartureOccupancy;
    }

    /**
     * Gets the value of the recordedDepartureCapacities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the recordedDepartureCapacities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordedDepartureCapacities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerCapacityStructure }
     * 
     * 
     */
    public List<PassengerCapacityStructure> getRecordedDepartureCapacities() {
        if (recordedDepartureCapacities == null) {
            recordedDepartureCapacities = new ArrayList<PassengerCapacityStructure>();
        }
        return this.recordedDepartureCapacities;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public PreviousCallStructure withVehicleAtStop(Boolean value) {
        setVehicleAtStop(value);
        return this;
    }

    public PreviousCallStructure withAimedArrivalTime(ZonedDateTime value) {
        setAimedArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withActualArrivalTime(ZonedDateTime value) {
        setActualArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withExpectedArrivalTime(ZonedDateTime value) {
        setExpectedArrivalTime(value);
        return this;
    }

    public PreviousCallStructure withAimedDepartureTime(ZonedDateTime value) {
        setAimedDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withActualDepartureTime(ZonedDateTime value) {
        setActualDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withExpectedDepartureTime(ZonedDateTime value) {
        setExpectedDepartureTime(value);
        return this;
    }

    public PreviousCallStructure withRecordedDepartureOccupancy(VehicleOccupancyStructure... values) {
        if (values!= null) {
            for (VehicleOccupancyStructure value: values) {
                getRecordedDepartureOccupancy().add(value);
            }
        }
        return this;
    }

    public PreviousCallStructure withRecordedDepartureOccupancy(Collection<VehicleOccupancyStructure> values) {
        if (values!= null) {
            getRecordedDepartureOccupancy().addAll(values);
        }
        return this;
    }

    public PreviousCallStructure withRecordedDepartureCapacities(PassengerCapacityStructure... values) {
        if (values!= null) {
            for (PassengerCapacityStructure value: values) {
                getRecordedDepartureCapacities().add(value);
            }
        }
        return this;
    }

    public PreviousCallStructure withRecordedDepartureCapacities(Collection<PassengerCapacityStructure> values) {
        if (values!= null) {
            getRecordedDepartureCapacities().addAll(values);
        }
        return this;
    }

    public PreviousCallStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    @Override
    public PreviousCallStructure withVisitNumber(BigInteger value) {
        setVisitNumber(value);
        return this;
    }

    @Override
    public PreviousCallStructure withOrder(BigInteger value) {
        setOrder(value);
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    @Override
    public PreviousCallStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
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
