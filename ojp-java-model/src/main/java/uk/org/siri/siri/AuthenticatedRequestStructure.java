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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Authticated SIRI Request.
 *
 * <p>Java-Klasse für AuthenticatedRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AuthenticatedRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractRequestStructure"&gt;
 *       &lt;group ref="{http://www.siri.org.uk/siri}AuthenticatedRequestGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticatedRequestStructure", propOrder = {
    "accountId",
    "accountKey"
})
@XmlSeeAlso({
    AbstractDiscoveryRequestStructure.class,
    TerminateSubscriptionRequestStructure.class,
    ProducerRequestEndpointStructure.class,
    ConsumerRequestEndpointStructure.class,
    RequestStructure.class
})
public abstract class AuthenticatedRequestStructure
    extends AbstractRequestStructure {

    @XmlElement(name = "AccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String accountId;
    @XmlElement(name = "AccountKey")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accountKey;

    /**
     * Ruft den Wert der accountId-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Legt den Wert der accountId-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAccountId(String value) {
        this.accountId = value;
    }

    /**
     * Ruft den Wert der accountKey-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * Legt den Wert der accountKey-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setAccountKey(String value) {
        this.accountKey = value;
    }

    public AuthenticatedRequestStructure withAccountId(String value) {
        setAccountId(value);
        return this;
    }

    public AuthenticatedRequestStructure withAccountKey(String value) {
        setAccountKey(value);
        return this;
    }

    @Override
    public AuthenticatedRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
