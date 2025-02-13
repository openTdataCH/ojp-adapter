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
import jakarta.xml.bind.annotation.XmlType;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Notify an individual user by SMS.
 *
 * <p>Java-Klasse für NotifyBySmsActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="NotifyBySmsActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Phone" type="{http://www.siri.org.uk/siri}PhoneType" minOccurs="0"/&gt;
 *         &lt;element name="Premium" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifyBySmsActionStructure", propOrder = {
    "phone",
    "premium"
})
public class NotifyBySmsActionStructure
    extends PushedActionStructure {

    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "Premium", defaultValue = "false")
    protected Boolean premium;

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der premium-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isPremium() {
        return premium;
    }

    /**
     * Legt den Wert der premium-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setPremium(Boolean value) {
        this.premium = value;
    }

    public NotifyBySmsActionStructure withPhone(String value) {
        setPhone(value);
        return this;
    }

    public NotifyBySmsActionStructure withPremium(Boolean value) {
        setPremium(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public NotifyBySmsActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
