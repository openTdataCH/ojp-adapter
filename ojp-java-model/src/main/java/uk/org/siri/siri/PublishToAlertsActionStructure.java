//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Action Publish SITUATION To Alert channel.
 *
 * <p>Java-Klasse für PublishToAlertsActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PublishToAlertsActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PushedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ByMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToAlertsActionStructure", propOrder = {
    "byEmail",
    "byMobile"
})
public class PublishToAlertsActionStructure
    extends PushedActionStructure {

    @XmlElement(name = "ByEmail", defaultValue = "true")
    protected Boolean byEmail;
    @XmlElement(name = "ByMobile", defaultValue = "true")
    protected Boolean byMobile;

    /**
     * Ruft den Wert der byEmail-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isByEmail() {
        return byEmail;
    }

    /**
     * Legt den Wert der byEmail-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setByEmail(Boolean value) {
        this.byEmail = value;
    }

    /**
     * Ruft den Wert der byMobile-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isByMobile() {
        return byMobile;
    }

    /**
     * Legt den Wert der byMobile-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setByMobile(Boolean value) {
        this.byMobile = value;
    }

    public PublishToAlertsActionStructure withByEmail(Boolean value) {
        setByEmail(value);
        return this;
    }

    public PublishToAlertsActionStructure withByMobile(Boolean value) {
        setByMobile(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToAlertsActionStructure withActionStatus(ActionStatusEnumeration value) {
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
