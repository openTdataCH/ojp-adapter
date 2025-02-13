//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Duration;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * Abstract supertype fro discovery responses.
 *
 * <p>Java-Klasse für AbstractDiscoveryDeliveryStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractDiscoveryDeliveryStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ResponseStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}DeliveryStatusGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractDiscoveryDeliveryStructure", propOrder = {
    "status",
    "errorCondition",
    "validUntil",
    "shortestPossibleCycle"
})
public class AbstractDiscoveryDeliveryStructure
    extends ResponseStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected ServiceDeliveryErrorConditionStructure errorCondition;
    @XmlElement(name = "ValidUntil", type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime validUntil;
    @XmlElement(name = "ShortestPossibleCycle", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration shortestPossibleCycle;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is {@link ServiceDeliveryErrorConditionStructure }
     */
    public ServiceDeliveryErrorConditionStructure getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link ServiceDeliveryErrorConditionStructure }
     */
    public void setErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der validUntil-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getValidUntil() {
        return validUntil;
    }

    /**
     * Legt den Wert der validUntil-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValidUntil(ZonedDateTime value) {
        this.validUntil = value;
    }

    /**
     * Ruft den Wert der shortestPossibleCycle-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getShortestPossibleCycle() {
        return shortestPossibleCycle;
    }

    /**
     * Legt den Wert der shortestPossibleCycle-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setShortestPossibleCycle(Duration value) {
        this.shortestPossibleCycle = value;
    }

    public AbstractDiscoveryDeliveryStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public AbstractDiscoveryDeliveryStructure withErrorCondition(ServiceDeliveryErrorConditionStructure value) {
        setErrorCondition(value);
        return this;
    }

    public AbstractDiscoveryDeliveryStructure withValidUntil(ZonedDateTime value) {
        setValidUntil(value);
        return this;
    }

    public AbstractDiscoveryDeliveryStructure withShortestPossibleCycle(Duration value) {
        setShortestPossibleCycle(value);
        return this;
    }

    @Override
    public AbstractDiscoveryDeliveryStructure withResponseTimestamp(ZonedDateTime value) {
        setResponseTimestamp(value);
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
