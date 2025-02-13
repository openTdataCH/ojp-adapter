//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for description of the whole action to be published (extends SIRI-SX v2.0p).
 *
 * <p>Java-Klasse für PublishingActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PublishingActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PublishAtScope"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ScopeType" type="{http://www.siri.org.uk/siri}ScopeTypeEnumeration"/&gt;
 *                   &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PassengerInformationAction" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishingActionStructure", propOrder = {
    "publishAtScope",
    "passengerInformationAction"
})
public class PublishingActionStructure {

    @XmlElement(name = "PublishAtScope", required = true)
    protected PublishingActionStructure.PublishAtScope publishAtScope;
    @XmlElement(name = "PassengerInformationAction", required = true)
    protected List<PassengerInformationActionStructure> passengerInformationAction;

    /**
     * Ruft den Wert der publishAtScope-Eigenschaft ab.
     *
     * @return possible object is {@link PublishingActionStructure.PublishAtScope }
     */
    public PublishingActionStructure.PublishAtScope getPublishAtScope() {
        return publishAtScope;
    }

    /**
     * Legt den Wert der publishAtScope-Eigenschaft fest.
     *
     * @param value allowed object is {@link PublishingActionStructure.PublishAtScope }
     */
    public void setPublishAtScope(PublishingActionStructure.PublishAtScope value) {
        this.publishAtScope = value;
    }

    /**
     * Description of the whole passenger information of one action.Gets the value of the passengerInformationAction property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the passengerInformationAction property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInformationAction().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PassengerInformationActionStructure }
     */
    public List<PassengerInformationActionStructure> getPassengerInformationAction() {
        if (passengerInformationAction == null) {
            passengerInformationAction = new ArrayList<PassengerInformationActionStructure>();
        }
        return this.passengerInformationAction;
    }

    public PublishingActionStructure withPublishAtScope(PublishingActionStructure.PublishAtScope value) {
        setPublishAtScope(value);
        return this;
    }

    public PublishingActionStructure withPassengerInformationAction(PassengerInformationActionStructure... values) {
        if (values != null) {
            for (PassengerInformationActionStructure value : values) {
                getPassengerInformationAction().add(value);
            }
        }
        return this;
    }

    public PublishingActionStructure withPassengerInformationAction(Collection<PassengerInformationActionStructure> values) {
        if (values != null) {
            getPassengerInformationAction().addAll(values);
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
     *         &lt;element name="ScopeType" type="{http://www.siri.org.uk/siri}ScopeTypeEnumeration"/&gt;
     *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scopeType",
        "affects"
    })
    public static class PublishAtScope {

        @XmlElement(name = "ScopeType", required = true)
        @XmlSchemaType(name = "NMTOKEN")
        protected ScopeTypeEnumeration scopeType;
        @XmlElement(name = "Affects", required = true)
        protected AffectsScopeStructure affects;

        /**
         * Ruft den Wert der scopeType-Eigenschaft ab.
         *
         * @return possible object is {@link ScopeTypeEnumeration }
         */
        public ScopeTypeEnumeration getScopeType() {
            return scopeType;
        }

        /**
         * Legt den Wert der scopeType-Eigenschaft fest.
         *
         * @param value allowed object is {@link ScopeTypeEnumeration }
         */
        public void setScopeType(ScopeTypeEnumeration value) {
            this.scopeType = value;
        }

        /**
         * Ruft den Wert der affects-Eigenschaft ab.
         *
         * @return possible object is {@link AffectsScopeStructure }
         */
        public AffectsScopeStructure getAffects() {
            return affects;
        }

        /**
         * Legt den Wert der affects-Eigenschaft fest.
         *
         * @param value allowed object is {@link AffectsScopeStructure }
         */
        public void setAffects(AffectsScopeStructure value) {
            this.affects = value;
        }

        public PublishingActionStructure.PublishAtScope withScopeType(ScopeTypeEnumeration value) {
            setScopeType(value);
            return this;
        }

        public PublishingActionStructure.PublishAtScope withAffects(AffectsScopeStructure value) {
            setAffects(value);
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
