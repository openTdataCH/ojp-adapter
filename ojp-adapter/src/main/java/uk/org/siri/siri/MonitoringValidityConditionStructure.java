//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

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
 * Allowed values for the type for Description of the monitoring conditions (frequency of mesurement, etc): an automatic monitoring of the status of a lift with pushed alert in case of incident is very different from a daily manual/visual check.
 * 
 * <p>Java-Klasse für MonitoringValidityConditionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MonitoringValidityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Timeband" type="{http://www.siri.org.uk/siri}HalfOpenTimeRangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DayType" type="{http://www.siri.org.uk/siri}DaysOfWeekEnumerationx" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="HolidayType" type="{http://www.siri.org.uk/siri}HolidayTypeEnumerationx" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoringValidityConditionStructure", propOrder = {
    "period",
    "timeband",
    "dayType",
    "holidayType"
})
public class MonitoringValidityConditionStructure {

    @XmlElement(name = "Period")
    protected List<HalfOpenTimestampOutputRangeStructure> period;
    @XmlElement(name = "Timeband")
    protected List<HalfOpenTimeRangeStructure> timeband;
    @XmlElement(name = "DayType")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<DaysOfWeekEnumerationx> dayType;
    @XmlElement(name = "HolidayType")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<HolidayTypeEnumerationx> holidayType;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getPeriod() {
        if (period == null) {
            period = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.period;
    }

    /**
     * Gets the value of the timeband property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timeband property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeband().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimeRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimeRangeStructure> getTimeband() {
        if (timeband == null) {
            timeband = new ArrayList<HalfOpenTimeRangeStructure>();
        }
        return this.timeband;
    }

    /**
     * Gets the value of the dayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DaysOfWeekEnumerationx }
     * 
     * 
     */
    public List<DaysOfWeekEnumerationx> getDayType() {
        if (dayType == null) {
            dayType = new ArrayList<DaysOfWeekEnumerationx>();
        }
        return this.dayType;
    }

    /**
     * Gets the value of the holidayType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the holidayType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHolidayType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HolidayTypeEnumerationx }
     * 
     * 
     */
    public List<HolidayTypeEnumerationx> getHolidayType() {
        if (holidayType == null) {
            holidayType = new ArrayList<HolidayTypeEnumerationx>();
        }
        return this.holidayType;
    }

    public MonitoringValidityConditionStructure withPeriod(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getPeriod().add(value);
            }
        }
        return this;
    }

    public MonitoringValidityConditionStructure withPeriod(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getPeriod().addAll(values);
        }
        return this;
    }

    public MonitoringValidityConditionStructure withTimeband(HalfOpenTimeRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimeRangeStructure value: values) {
                getTimeband().add(value);
            }
        }
        return this;
    }

    public MonitoringValidityConditionStructure withTimeband(Collection<HalfOpenTimeRangeStructure> values) {
        if (values!= null) {
            getTimeband().addAll(values);
        }
        return this;
    }

    public MonitoringValidityConditionStructure withDayType(DaysOfWeekEnumerationx... values) {
        if (values!= null) {
            for (DaysOfWeekEnumerationx value: values) {
                getDayType().add(value);
            }
        }
        return this;
    }

    public MonitoringValidityConditionStructure withDayType(Collection<DaysOfWeekEnumerationx> values) {
        if (values!= null) {
            getDayType().addAll(values);
        }
        return this;
    }

    public MonitoringValidityConditionStructure withHolidayType(HolidayTypeEnumerationx... values) {
        if (values!= null) {
            for (HolidayTypeEnumerationx value: values) {
                getHolidayType().add(value);
            }
        }
        return this;
    }

    public MonitoringValidityConditionStructure withHolidayType(Collection<HolidayTypeEnumerationx> values) {
        if (values!= null) {
            getHolidayType().addAll(values);
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
