//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * <p>Java-Klasse für Period complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Period"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="endOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="periodName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="recurringTimePeriodOfDay" type="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="recurringDayWeekMonthPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}DayWeekMonth" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="periodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Period", propOrder = {
    "startOfPeriod",
    "endOfPeriod",
    "periodName",
    "recurringTimePeriodOfDay",
    "recurringDayWeekMonthPeriod",
    "periodExtension"
})
public class Period {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime startOfPeriod;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime endOfPeriod;
    protected MultilingualString periodName;
    protected List<TimePeriodOfDay> recurringTimePeriodOfDay;
    protected List<DayWeekMonth> recurringDayWeekMonthPeriod;
    protected ExtensionType periodExtension;

    /**
     * Ruft den Wert der startOfPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getStartOfPeriod() {
        return startOfPeriod;
    }

    /**
     * Legt den Wert der startOfPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setStartOfPeriod(ZonedDateTime value) {
        this.startOfPeriod = value;
    }

    /**
     * Ruft den Wert der endOfPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getEndOfPeriod() {
        return endOfPeriod;
    }

    /**
     * Legt den Wert der endOfPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setEndOfPeriod(ZonedDateTime value) {
        this.endOfPeriod = value;
    }

    /**
     * Ruft den Wert der periodName-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getPeriodName() {
        return periodName;
    }

    /**
     * Legt den Wert der periodName-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setPeriodName(MultilingualString value) {
        this.periodName = value;
    }

    /**
     * Gets the value of the recurringTimePeriodOfDay property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the recurringTimePeriodOfDay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringTimePeriodOfDay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TimePeriodOfDay }
     */
    public List<TimePeriodOfDay> getRecurringTimePeriodOfDay() {
        if (recurringTimePeriodOfDay == null) {
            recurringTimePeriodOfDay = new ArrayList<TimePeriodOfDay>();
        }
        return this.recurringTimePeriodOfDay;
    }

    /**
     * Gets the value of the recurringDayWeekMonthPeriod property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the recurringDayWeekMonthPeriod property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringDayWeekMonthPeriod().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DayWeekMonth }
     */
    public List<DayWeekMonth> getRecurringDayWeekMonthPeriod() {
        if (recurringDayWeekMonthPeriod == null) {
            recurringDayWeekMonthPeriod = new ArrayList<DayWeekMonth>();
        }
        return this.recurringDayWeekMonthPeriod;
    }

    /**
     * Ruft den Wert der periodExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getPeriodExtension() {
        return periodExtension;
    }

    /**
     * Legt den Wert der periodExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setPeriodExtension(ExtensionType value) {
        this.periodExtension = value;
    }

    public Period withStartOfPeriod(ZonedDateTime value) {
        setStartOfPeriod(value);
        return this;
    }

    public Period withEndOfPeriod(ZonedDateTime value) {
        setEndOfPeriod(value);
        return this;
    }

    public Period withPeriodName(MultilingualString value) {
        setPeriodName(value);
        return this;
    }

    public Period withRecurringTimePeriodOfDay(TimePeriodOfDay... values) {
        if (values != null) {
            for (TimePeriodOfDay value : values) {
                getRecurringTimePeriodOfDay().add(value);
            }
        }
        return this;
    }

    public Period withRecurringTimePeriodOfDay(Collection<TimePeriodOfDay> values) {
        if (values != null) {
            getRecurringTimePeriodOfDay().addAll(values);
        }
        return this;
    }

    public Period withRecurringDayWeekMonthPeriod(DayWeekMonth... values) {
        if (values != null) {
            for (DayWeekMonth value : values) {
                getRecurringDayWeekMonthPeriod().add(value);
            }
        }
        return this;
    }

    public Period withRecurringDayWeekMonthPeriod(Collection<DayWeekMonth> values) {
        if (values != null) {
            getRecurringDayWeekMonthPeriod().addAll(values);
        }
        return this;
    }

    public Period withPeriodExtension(ExtensionType value) {
        setPeriodExtension(value);
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
