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
 * <p>Java-Klasse für OverallPeriod complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OverallPeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallStartTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="overallEndTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="validPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exceptionPeriod" type="{http://datex2.eu/schema/2_0RC1/2_0}Period" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="overallPeriodExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallPeriod", propOrder = {
    "overallStartTime",
    "overallEndTime",
    "validPeriod",
    "exceptionPeriod",
    "overallPeriodExtension"
})
public class OverallPeriod {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime overallStartTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime overallEndTime;
    protected List<Period> validPeriod;
    protected List<Period> exceptionPeriod;
    protected ExtensionType overallPeriodExtension;

    /**
     * Ruft den Wert der overallStartTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getOverallStartTime() {
        return overallStartTime;
    }

    /**
     * Legt den Wert der overallStartTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setOverallStartTime(ZonedDateTime value) {
        this.overallStartTime = value;
    }

    /**
     * Ruft den Wert der overallEndTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getOverallEndTime() {
        return overallEndTime;
    }

    /**
     * Legt den Wert der overallEndTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setOverallEndTime(ZonedDateTime value) {
        this.overallEndTime = value;
    }

    /**
     * Gets the value of the validPeriod property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the validPeriod property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidPeriod().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Period }
     */
    public List<Period> getValidPeriod() {
        if (validPeriod == null) {
            validPeriod = new ArrayList<Period>();
        }
        return this.validPeriod;
    }

    /**
     * Gets the value of the exceptionPeriod property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the exceptionPeriod property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptionPeriod().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link Period }
     */
    public List<Period> getExceptionPeriod() {
        if (exceptionPeriod == null) {
            exceptionPeriod = new ArrayList<Period>();
        }
        return this.exceptionPeriod;
    }

    /**
     * Ruft den Wert der overallPeriodExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getOverallPeriodExtension() {
        return overallPeriodExtension;
    }

    /**
     * Legt den Wert der overallPeriodExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setOverallPeriodExtension(ExtensionType value) {
        this.overallPeriodExtension = value;
    }

    public OverallPeriod withOverallStartTime(ZonedDateTime value) {
        setOverallStartTime(value);
        return this;
    }

    public OverallPeriod withOverallEndTime(ZonedDateTime value) {
        setOverallEndTime(value);
        return this;
    }

    public OverallPeriod withValidPeriod(Period... values) {
        if (values != null) {
            for (Period value : values) {
                getValidPeriod().add(value);
            }
        }
        return this;
    }

    public OverallPeriod withValidPeriod(Collection<Period> values) {
        if (values != null) {
            getValidPeriod().addAll(values);
        }
        return this;
    }

    public OverallPeriod withExceptionPeriod(Period... values) {
        if (values != null) {
            for (Period value : values) {
                getExceptionPeriod().add(value);
            }
        }
        return this;
    }

    public OverallPeriod withExceptionPeriod(Collection<Period> values) {
        if (values != null) {
            getExceptionPeriod().addAll(values);
        }
        return this;
    }

    public OverallPeriod withOverallPeriodExtension(ExtensionType value) {
        setOverallPeriodExtension(value);
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
