//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.LocalDateXmlAdapter;

/**
 * [TMv6] day of public transport operation of which the characteristics are defined in a specific SERVICE CALENDAR and which may last more than 24 hours. This is useful, when the trip can be made
 * during several days. Often users search in "general" without setting a date and then refine with the actual date. By using OperatingDaysStructure the result can directly be reused without an
 * additional OJPTripRequest.
 *
 * <p>Java-Klasse für OperatingDaysStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OperatingDaysStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="From" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="To" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Pattern" type="{http://www.vdv.de/ojp}ValidDayBitType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingDaysStructure", propOrder = {
    "from",
    "to",
    "pattern"
})
public class OperatingDaysStructure {

    @XmlElement(name = "From", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime from;
    @XmlElement(name = "To", required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateXmlAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDateTime to;
    @XmlElement(name = "Pattern", required = true)
    protected String pattern;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public LocalDateTime getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFrom(LocalDateTime value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public LocalDateTime getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTo(LocalDateTime value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der pattern-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Legt den Wert der pattern-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    public OperatingDaysStructure withFrom(LocalDateTime value) {
        setFrom(value);
        return this;
    }

    public OperatingDaysStructure withTo(LocalDateTime value) {
        setTo(value);
        return this;
    }

    public OperatingDaysStructure withPattern(String value) {
        setPattern(value);
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
