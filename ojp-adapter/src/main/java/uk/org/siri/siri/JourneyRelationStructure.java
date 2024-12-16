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
 * <p>Java-Klasse für JourneyRelationStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="JourneyRelationStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JourneyRelationType" type="{http://www.siri.org.uk/siri}JourneyRelationTypeEnumeration"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}JourneyRelationInfoGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}RelatedJourney" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneyRelationStructure", propOrder = {
    "journeyRelationType",
    "callInfo",
    "journeyParts",
    "relatedJourney"
})
public class JourneyRelationStructure {

    @XmlElement(name = "JourneyRelationType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected JourneyRelationTypeEnumeration journeyRelationType;
    @XmlElement(name = "CallInfo")
    protected RelatedCallStructure callInfo;
    @XmlElement(name = "JourneyParts")
    protected JourneyRelationStructure.JourneyParts journeyParts;
    @XmlElement(name = "RelatedJourney", required = true)
    protected List<RelatedJourneyStructure> relatedJourney;

    /**
     * Ruft den Wert der journeyRelationType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRelationTypeEnumeration }
     *     
     */
    public JourneyRelationTypeEnumeration getJourneyRelationType() {
        return journeyRelationType;
    }

    /**
     * Legt den Wert der journeyRelationType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRelationTypeEnumeration }
     *     
     */
    public void setJourneyRelationType(JourneyRelationTypeEnumeration value) {
        this.journeyRelationType = value;
    }

    /**
     * Ruft den Wert der callInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RelatedCallStructure }
     *     
     */
    public RelatedCallStructure getCallInfo() {
        return callInfo;
    }

    /**
     * Legt den Wert der callInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedCallStructure }
     *     
     */
    public void setCallInfo(RelatedCallStructure value) {
        this.callInfo = value;
    }

    /**
     * Ruft den Wert der journeyParts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JourneyRelationStructure.JourneyParts }
     *     
     */
    public JourneyRelationStructure.JourneyParts getJourneyParts() {
        return journeyParts;
    }

    /**
     * Legt den Wert der journeyParts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyRelationStructure.JourneyParts }
     *     
     */
    public void setJourneyParts(JourneyRelationStructure.JourneyParts value) {
        this.journeyParts = value;
    }

    /**
     * Gets the value of the relatedJourney property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relatedJourney property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedJourney().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedJourneyStructure }
     * 
     * 
     */
    public List<RelatedJourneyStructure> getRelatedJourney() {
        if (relatedJourney == null) {
            relatedJourney = new ArrayList<RelatedJourneyStructure>();
        }
        return this.relatedJourney;
    }

    public JourneyRelationStructure withJourneyRelationType(JourneyRelationTypeEnumeration value) {
        setJourneyRelationType(value);
        return this;
    }

    public JourneyRelationStructure withCallInfo(RelatedCallStructure value) {
        setCallInfo(value);
        return this;
    }

    public JourneyRelationStructure withJourneyParts(JourneyRelationStructure.JourneyParts value) {
        setJourneyParts(value);
        return this;
    }

    public JourneyRelationStructure withRelatedJourney(RelatedJourneyStructure... values) {
        if (values!= null) {
            for (RelatedJourneyStructure value: values) {
                getRelatedJourney().add(value);
            }
        }
        return this;
    }

    public JourneyRelationStructure withRelatedJourney(Collection<RelatedJourneyStructure> values) {
        if (values!= null) {
            getRelatedJourney().addAll(values);
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
     *         &lt;element name="JourneyPartInfo" type="{http://www.siri.org.uk/siri}RelatedJourneyPartStructure" maxOccurs="unbounded"/&gt;
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
        "journeyPartInfo"
    })
    public static class JourneyParts {

        @XmlElement(name = "JourneyPartInfo", required = true)
        protected List<RelatedJourneyPartStructure> journeyPartInfo;

        /**
         * Gets the value of the journeyPartInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the journeyPartInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJourneyPartInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedJourneyPartStructure }
         * 
         * 
         */
        public List<RelatedJourneyPartStructure> getJourneyPartInfo() {
            if (journeyPartInfo == null) {
                journeyPartInfo = new ArrayList<RelatedJourneyPartStructure>();
            }
            return this.journeyPartInfo;
        }

        public JourneyRelationStructure.JourneyParts withJourneyPartInfo(RelatedJourneyPartStructure... values) {
            if (values!= null) {
                for (RelatedJourneyPartStructure value: values) {
                    getJourneyPartInfo().add(value);
                }
            }
            return this;
        }

        public JourneyRelationStructure.JourneyParts withJourneyPartInfo(Collection<RelatedJourneyPartStructure> values) {
            if (values!= null) {
                getJourneyPartInfo().addAll(values);
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

    }

}
