//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für DayWeekMonth complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DayWeekMonth"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="applicableDay" type="{http://datex2.eu/schema/2_0RC1/2_0}DayEnum" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="applicableWeek" type="{http://datex2.eu/schema/2_0RC1/2_0}WeekOfMonthEnum" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="applicableMonth" type="{http://datex2.eu/schema/2_0RC1/2_0}MonthOfYearEnum" maxOccurs="12" minOccurs="0"/&gt;
 *         &lt;element name="dayWeekMonthExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayWeekMonth", propOrder = {
    "applicableDay",
    "applicableWeek",
    "applicableMonth",
    "dayWeekMonthExtension"
})
public class DayWeekMonth {

    @XmlSchemaType(name = "string")
    protected List<DayEnum> applicableDay;
    @XmlSchemaType(name = "string")
    protected List<WeekOfMonthEnum> applicableWeek;
    @XmlSchemaType(name = "string")
    protected List<MonthOfYearEnum> applicableMonth;
    protected ExtensionType dayWeekMonthExtension;

    /**
     * Gets the value of the applicableDay property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the applicableDay property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableDay().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DayEnum }
     */
    public List<DayEnum> getApplicableDay() {
        if (applicableDay == null) {
            applicableDay = new ArrayList<DayEnum>();
        }
        return this.applicableDay;
    }

    /**
     * Gets the value of the applicableWeek property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the applicableWeek property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableWeek().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link WeekOfMonthEnum }
     */
    public List<WeekOfMonthEnum> getApplicableWeek() {
        if (applicableWeek == null) {
            applicableWeek = new ArrayList<WeekOfMonthEnum>();
        }
        return this.applicableWeek;
    }

    /**
     * Gets the value of the applicableMonth property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the applicableMonth property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableMonth().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link MonthOfYearEnum }
     */
    public List<MonthOfYearEnum> getApplicableMonth() {
        if (applicableMonth == null) {
            applicableMonth = new ArrayList<MonthOfYearEnum>();
        }
        return this.applicableMonth;
    }

    /**
     * Ruft den Wert der dayWeekMonthExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getDayWeekMonthExtension() {
        return dayWeekMonthExtension;
    }

    /**
     * Legt den Wert der dayWeekMonthExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setDayWeekMonthExtension(ExtensionType value) {
        this.dayWeekMonthExtension = value;
    }

    public DayWeekMonth withApplicableDay(DayEnum... values) {
        if (values != null) {
            for (DayEnum value : values) {
                getApplicableDay().add(value);
            }
        }
        return this;
    }

    public DayWeekMonth withApplicableDay(Collection<DayEnum> values) {
        if (values != null) {
            getApplicableDay().addAll(values);
        }
        return this;
    }

    public DayWeekMonth withApplicableWeek(WeekOfMonthEnum... values) {
        if (values != null) {
            for (WeekOfMonthEnum value : values) {
                getApplicableWeek().add(value);
            }
        }
        return this;
    }

    public DayWeekMonth withApplicableWeek(Collection<WeekOfMonthEnum> values) {
        if (values != null) {
            getApplicableWeek().addAll(values);
        }
        return this;
    }

    public DayWeekMonth withApplicableMonth(MonthOfYearEnum... values) {
        if (values != null) {
            for (MonthOfYearEnum value : values) {
                getApplicableMonth().add(value);
            }
        }
        return this;
    }

    public DayWeekMonth withApplicableMonth(Collection<MonthOfYearEnum> values) {
        if (values != null) {
            getApplicableMonth().addAll(values);
        }
        return this;
    }

    public DayWeekMonth withDayWeekMonthExtension(ExtensionType value) {
        setDayWeekMonthExtension(value);
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
