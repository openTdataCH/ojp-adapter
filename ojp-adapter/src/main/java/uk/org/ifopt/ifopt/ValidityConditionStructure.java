//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.ifopt.ifopt;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * Type for a validity condition.
 * 
 * <p>Java-Klasse für ValidityConditionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ValidityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ToDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DayType" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *         &lt;element name="Timebands" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityConditionStructure", propOrder = {
    "fromDateTime",
    "toDateTime",
    "dayType",
    "timebands"
})
public class ValidityConditionStructure {

    @XmlElement(name = "FromDateTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime fromDateTime;
    @XmlElement(name = "ToDateTime", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime toDateTime;
    @XmlElement(name = "DayType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String dayType;
    @XmlElement(name = "Timebands")
    protected List<ValidityConditionStructure.Timebands> timebands;

    /**
     * Ruft den Wert der fromDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Legt den Wert der fromDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromDateTime(ZonedDateTime value) {
        this.fromDateTime = value;
    }

    /**
     * Ruft den Wert der toDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getToDateTime() {
        return toDateTime;
    }

    /**
     * Legt den Wert der toDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToDateTime(ZonedDateTime value) {
        this.toDateTime = value;
    }

    /**
     * Ruft den Wert der dayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * Legt den Wert der dayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayType(String value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the timebands property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the timebands property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimebands().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValidityConditionStructure.Timebands }
     * 
     * 
     */
    public List<ValidityConditionStructure.Timebands> getTimebands() {
        if (timebands == null) {
            timebands = new ArrayList<ValidityConditionStructure.Timebands>();
        }
        return this.timebands;
    }

    public ValidityConditionStructure withFromDateTime(ZonedDateTime value) {
        setFromDateTime(value);
        return this;
    }

    public ValidityConditionStructure withToDateTime(ZonedDateTime value) {
        setToDateTime(value);
        return this;
    }

    public ValidityConditionStructure withDayType(String value) {
        setDayType(value);
        return this;
    }

    public ValidityConditionStructure withTimebands(ValidityConditionStructure.Timebands... values) {
        if (values!= null) {
            for (ValidityConditionStructure.Timebands value: values) {
                getTimebands().add(value);
            }
        }
        return this;
    }

    public ValidityConditionStructure withTimebands(Collection<ValidityConditionStructure.Timebands> values) {
        if (values!= null) {
            getTimebands().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Timeband" type="{http://www.ifopt.org.uk/ifopt}TimebandStructure"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeband"
    })
    public static class Timebands {

        @XmlElement(name = "Timeband", required = true)
        protected TimebandStructure timeband;

        /**
         * Ruft den Wert der timeband-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TimebandStructure }
         *     
         */
        public TimebandStructure getTimeband() {
            return timeband;
        }

        /**
         * Legt den Wert der timeband-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TimebandStructure }
         *     
         */
        public void setTimeband(TimebandStructure value) {
            this.timeband = value;
        }

        public ValidityConditionStructure.Timebands withTimeband(TimebandStructure value) {
            setTimeband(value);
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

}
