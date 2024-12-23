//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.LocalTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für TimePeriodByHour complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TimePeriodByHour"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}TimePeriodOfDay"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/&gt;
 *         &lt;element name="endTimeOfPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Time"/&gt;
 *         &lt;element name="timePeriodByHourExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimePeriodByHour", propOrder = {
    "startTimeOfPeriod",
    "endTimeOfPeriod",
    "timePeriodByHourExtension"
})
public class TimePeriodByHour
    extends TimePeriodOfDay
{

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime startTimeOfPeriod;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "time")
    protected LocalTime endTimeOfPeriod;
    protected ExtensionType timePeriodByHourExtension;

    /**
     * Ruft den Wert der startTimeOfPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getStartTimeOfPeriod() {
        return startTimeOfPeriod;
    }

    /**
     * Legt den Wert der startTimeOfPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTimeOfPeriod(LocalTime value) {
        this.startTimeOfPeriod = value;
    }

    /**
     * Ruft den Wert der endTimeOfPeriod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalTime getEndTimeOfPeriod() {
        return endTimeOfPeriod;
    }

    /**
     * Legt den Wert der endTimeOfPeriod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTimeOfPeriod(LocalTime value) {
        this.endTimeOfPeriod = value;
    }

    /**
     * Ruft den Wert der timePeriodByHourExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTimePeriodByHourExtension() {
        return timePeriodByHourExtension;
    }

    /**
     * Legt den Wert der timePeriodByHourExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTimePeriodByHourExtension(ExtensionType value) {
        this.timePeriodByHourExtension = value;
    }

    public TimePeriodByHour withStartTimeOfPeriod(LocalTime value) {
        setStartTimeOfPeriod(value);
        return this;
    }

    public TimePeriodByHour withEndTimeOfPeriod(LocalTime value) {
        setEndTimeOfPeriod(value);
        return this;
    }

    public TimePeriodByHour withTimePeriodByHourExtension(ExtensionType value) {
        setTimePeriodByHourExtension(value);
        return this;
    }

    @Override
    public TimePeriodByHour withTimePeriodOfDayExtension(ExtensionType value) {
        setTimePeriodOfDayExtension(value);
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
