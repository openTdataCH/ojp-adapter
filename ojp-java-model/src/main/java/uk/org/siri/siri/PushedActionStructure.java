//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;

/**
 * Type for publication action.
 *
 * <p>Java-Klasse für PushedActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PushedActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BeforeNotices" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Interval" type="{http://www.siri.org.uk/siri}DurationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ClearNotice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PushedActionStructure", propOrder = {
    "beforeNotices",
    "clearNotice"
})
@XmlSeeAlso({
    PublishToAlertsActionStructure.class,
    NotifyBySmsActionStructure.class,
    NotifyByEmailActionStructure.class,
    NotifyByPagerActionStructure.class,
    NotifyUserActionStructure.class
})
public class PushedActionStructure
    extends ParameterisedActionStructure {

    @XmlElement(name = "BeforeNotices")
    protected PushedActionStructure.BeforeNotices beforeNotices;
    @XmlElement(name = "ClearNotice")
    protected Boolean clearNotice;

    /**
     * Ruft den Wert der beforeNotices-Eigenschaft ab.
     *
     * @return possible object is {@link PushedActionStructure.BeforeNotices }
     */
    public PushedActionStructure.BeforeNotices getBeforeNotices() {
        return beforeNotices;
    }

    /**
     * Legt den Wert der beforeNotices-Eigenschaft fest.
     *
     * @param value allowed object is {@link PushedActionStructure.BeforeNotices }
     */
    public void setBeforeNotices(PushedActionStructure.BeforeNotices value) {
        this.beforeNotices = value;
    }

    /**
     * Ruft den Wert der clearNotice-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isClearNotice() {
        return clearNotice;
    }

    /**
     * Legt den Wert der clearNotice-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setClearNotice(Boolean value) {
        this.clearNotice = value;
    }

    public PushedActionStructure withBeforeNotices(PushedActionStructure.BeforeNotices value) {
        setBeforeNotices(value);
        return this;
    }

    public PushedActionStructure withClearNotice(Boolean value) {
        setClearNotice(value);
        return this;
    }

    @Override
    public PushedActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PushedActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PushedActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PushedActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PushedActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PushedActionStructure withActionStatus(ActionStatusEnumeration value) {
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
     *         &lt;element name="Interval" type="{http://www.siri.org.uk/siri}DurationType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "interval"
    })
    public static class BeforeNotices {

        @XmlElement(name = "Interval", type = String.class)
        @XmlJavaTypeAdapter(DurationXmlAdapter.class)
        @XmlSchemaType(name = "duration")
        protected List<Duration> interval;

        /**
         * Gets the value of the interval property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the interval property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInterval().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link String }
         */
        public List<Duration> getInterval() {
            if (interval == null) {
                interval = new ArrayList<Duration>();
            }
            return this.interval;
        }

        public PushedActionStructure.BeforeNotices withInterval(Duration... values) {
            if (values != null) {
                for (Duration value : values) {
                    getInterval().add(value);
                }
            }
            return this;
        }

        public PushedActionStructure.BeforeNotices withInterval(Collection<Duration> values) {
            if (values != null) {
                getInterval().addAll(values);
            }
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

}
