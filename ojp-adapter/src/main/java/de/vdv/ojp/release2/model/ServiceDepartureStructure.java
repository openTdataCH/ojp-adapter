//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

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
import uk.org.siri.siri.FormationAssignmentStructure;


/**
 * Departure times of a service at a stop (group of attributes of TIMETABLED PASSING TIME, ESTIMATED PASSING TIME, OBSERVED PASSING TIME, equals MONITORED LEG DEPARTURE).
 * 
 * <p>Java-Klasse für ServiceDepartureStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDepartureStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ServiceTimeGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}DepartureFormationAssignment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDepartureStructure", propOrder = {
    "timetabledTime",
    "recordedAtTime",
    "estimatedTime",
    "estimatedTimeLow",
    "estimatedTimeHigh",
    "departureFormationAssignment"
})
public class ServiceDepartureStructure {

    @XmlElement(name = "TimetabledTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timetabledTime;
    @XmlElement(name = "RecordedAtTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime recordedAtTime;
    @XmlElement(name = "EstimatedTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime estimatedTime;
    @XmlElement(name = "EstimatedTimeLow", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime estimatedTimeLow;
    @XmlElement(name = "EstimatedTimeHigh", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime estimatedTimeHigh;
    @XmlElement(name = "DepartureFormationAssignment", namespace = "http://www.siri.org.uk/siri")
    protected List<FormationAssignmentStructure> departureFormationAssignment;

    /**
     * Ruft den Wert der timetabledTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimetabledTime() {
        return timetabledTime;
    }

    /**
     * Legt den Wert der timetabledTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetabledTime(ZonedDateTime value) {
        this.timetabledTime = value;
    }

    /**
     * Ruft den Wert der recordedAtTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getRecordedAtTime() {
        return recordedAtTime;
    }

    /**
     * Legt den Wert der recordedAtTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordedAtTime(ZonedDateTime value) {
        this.recordedAtTime = value;
    }

    /**
     * Ruft den Wert der estimatedTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Legt den Wert der estimatedTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTime(ZonedDateTime value) {
        this.estimatedTime = value;
    }

    /**
     * Ruft den Wert der estimatedTimeLow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEstimatedTimeLow() {
        return estimatedTimeLow;
    }

    /**
     * Legt den Wert der estimatedTimeLow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTimeLow(ZonedDateTime value) {
        this.estimatedTimeLow = value;
    }

    /**
     * Ruft den Wert der estimatedTimeHigh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getEstimatedTimeHigh() {
        return estimatedTimeHigh;
    }

    /**
     * Legt den Wert der estimatedTimeHigh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstimatedTimeHigh(ZonedDateTime value) {
        this.estimatedTimeHigh = value;
    }

    /**
     * Gets the value of the departureFormationAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the departureFormationAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureFormationAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormationAssignmentStructure }
     * 
     * 
     */
    public List<FormationAssignmentStructure> getDepartureFormationAssignment() {
        if (departureFormationAssignment == null) {
            departureFormationAssignment = new ArrayList<FormationAssignmentStructure>();
        }
        return this.departureFormationAssignment;
    }

    public ServiceDepartureStructure withTimetabledTime(ZonedDateTime value) {
        setTimetabledTime(value);
        return this;
    }

    public ServiceDepartureStructure withRecordedAtTime(ZonedDateTime value) {
        setRecordedAtTime(value);
        return this;
    }

    public ServiceDepartureStructure withEstimatedTime(ZonedDateTime value) {
        setEstimatedTime(value);
        return this;
    }

    public ServiceDepartureStructure withEstimatedTimeLow(ZonedDateTime value) {
        setEstimatedTimeLow(value);
        return this;
    }

    public ServiceDepartureStructure withEstimatedTimeHigh(ZonedDateTime value) {
        setEstimatedTimeHigh(value);
        return this;
    }

    public ServiceDepartureStructure withDepartureFormationAssignment(FormationAssignmentStructure... values) {
        if (values!= null) {
            for (FormationAssignmentStructure value: values) {
                getDepartureFormationAssignment().add(value);
            }
        }
        return this;
    }

    public ServiceDepartureStructure withDepartureFormationAssignment(Collection<FormationAssignmentStructure> values) {
        if (values!= null) {
            getDepartureFormationAssignment().addAll(values);
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
