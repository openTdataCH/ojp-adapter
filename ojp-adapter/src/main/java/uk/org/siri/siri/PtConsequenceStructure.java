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
import uk.org.ifopt.acsb.SuitabilityStructure;


/**
 * Type for disruption.
 * 
 * <p>Java-Klasse für PtConsequenceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PtConsequenceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Period" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ConditionGroup"/&gt;
 *         &lt;element name="Severity" type="{http://www.siri.org.uk/siri}SeverityEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure" minOccurs="0"/&gt;
 *         &lt;element name="Suitabilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Advice" type="{http://www.siri.org.uk/siri}PtAdviceStructure" minOccurs="0"/&gt;
 *         &lt;element name="Blocking" type="{http://www.siri.org.uk/siri}BlockingStructure" minOccurs="0"/&gt;
 *         &lt;element name="Boarding" type="{http://www.siri.org.uk/siri}BoardingStructure" minOccurs="0"/&gt;
 *         &lt;element name="Delays" type="{http://www.siri.org.uk/siri}DelaysStructure" minOccurs="0"/&gt;
 *         &lt;element name="Casualties" type="{http://www.siri.org.uk/siri}CasualtiesStructure" minOccurs="0"/&gt;
 *         &lt;element name="Easements" type="{http://www.siri.org.uk/siri}EasementsStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequenceStructure", propOrder = {
    "period",
    "condition",
    "conditionName",
    "severity",
    "affects",
    "suitabilities",
    "advice",
    "blocking",
    "boarding",
    "delays",
    "casualties",
    "easements",
    "extensions"
})
public class PtConsequenceStructure {

    @XmlElement(name = "Period")
    protected List<HalfOpenTimestampOutputRangeStructure> period;
    @XmlElement(name = "Condition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<ServiceConditionEnumeration> condition;
    @XmlElement(name = "ConditionName")
    protected List<NaturalLanguageStringStructure> conditionName;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "NMTOKEN")
    protected SeverityEnumeration severity;
    @XmlElement(name = "Affects")
    protected AffectsScopeStructure affects;
    @XmlElement(name = "Suitabilities")
    protected PtConsequenceStructure.Suitabilities suitabilities;
    @XmlElement(name = "Advice")
    protected PtAdviceStructure advice;
    @XmlElement(name = "Blocking")
    protected BlockingStructure blocking;
    @XmlElement(name = "Boarding")
    protected BoardingStructure boarding;
    @XmlElement(name = "Delays")
    protected DelaysStructure delays;
    @XmlElement(name = "Casualties")
    protected CasualtiesStructure casualties;
    @XmlElement(name = "Easements")
    protected List<EasementsStructure> easements;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the period property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the period property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalfOpenTimestampOutputRangeStructure }
     * 
     * 
     */
    public List<HalfOpenTimestampOutputRangeStructure> getPeriod() {
        if (period == null) {
            period = new ArrayList<HalfOpenTimestampOutputRangeStructure>();
        }
        return this.period;
    }

    /**
     * Structured classification(s) of effect on service, from which a standardized message can be generated.Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceConditionEnumeration }
     * 
     * 
     */
    public List<ServiceConditionEnumeration> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ServiceConditionEnumeration>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the conditionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the conditionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getConditionName() {
        if (conditionName == null) {
            conditionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.conditionName;
    }

    /**
     * Ruft den Wert der severity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnumeration }
     *     
     */
    public SeverityEnumeration getSeverity() {
        return severity;
    }

    /**
     * Legt den Wert der severity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnumeration }
     *     
     */
    public void setSeverity(SeverityEnumeration value) {
        this.severity = value;
    }

    /**
     * Ruft den Wert der affects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public AffectsScopeStructure getAffects() {
        return affects;
    }

    /**
     * Legt den Wert der affects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectsScopeStructure }
     *     
     */
    public void setAffects(AffectsScopeStructure value) {
        this.affects = value;
    }

    /**
     * Ruft den Wert der suitabilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public PtConsequenceStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Legt den Wert der suitabilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PtConsequenceStructure.Suitabilities }
     *     
     */
    public void setSuitabilities(PtConsequenceStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Ruft den Wert der advice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PtAdviceStructure }
     *     
     */
    public PtAdviceStructure getAdvice() {
        return advice;
    }

    /**
     * Legt den Wert der advice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PtAdviceStructure }
     *     
     */
    public void setAdvice(PtAdviceStructure value) {
        this.advice = value;
    }

    /**
     * Ruft den Wert der blocking-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlockingStructure }
     *     
     */
    public BlockingStructure getBlocking() {
        return blocking;
    }

    /**
     * Legt den Wert der blocking-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockingStructure }
     *     
     */
    public void setBlocking(BlockingStructure value) {
        this.blocking = value;
    }

    /**
     * Ruft den Wert der boarding-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingStructure }
     *     
     */
    public BoardingStructure getBoarding() {
        return boarding;
    }

    /**
     * Legt den Wert der boarding-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingStructure }
     *     
     */
    public void setBoarding(BoardingStructure value) {
        this.boarding = value;
    }

    /**
     * Ruft den Wert der delays-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DelaysStructure }
     *     
     */
    public DelaysStructure getDelays() {
        return delays;
    }

    /**
     * Legt den Wert der delays-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DelaysStructure }
     *     
     */
    public void setDelays(DelaysStructure value) {
        this.delays = value;
    }

    /**
     * Ruft den Wert der casualties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CasualtiesStructure }
     *     
     */
    public CasualtiesStructure getCasualties() {
        return casualties;
    }

    /**
     * Legt den Wert der casualties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CasualtiesStructure }
     *     
     */
    public void setCasualties(CasualtiesStructure value) {
        this.casualties = value;
    }

    /**
     * Gets the value of the easements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the easements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEasements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EasementsStructure }
     * 
     * 
     */
    public List<EasementsStructure> getEasements() {
        if (easements == null) {
            easements = new ArrayList<EasementsStructure>();
        }
        return this.easements;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public PtConsequenceStructure withPeriod(HalfOpenTimestampOutputRangeStructure... values) {
        if (values!= null) {
            for (HalfOpenTimestampOutputRangeStructure value: values) {
                getPeriod().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withPeriod(Collection<HalfOpenTimestampOutputRangeStructure> values) {
        if (values!= null) {
            getPeriod().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withCondition(ServiceConditionEnumeration... values) {
        if (values!= null) {
            for (ServiceConditionEnumeration value: values) {
                getCondition().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withCondition(Collection<ServiceConditionEnumeration> values) {
        if (values!= null) {
            getCondition().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withConditionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getConditionName().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withConditionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getConditionName().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withSeverity(SeverityEnumeration value) {
        setSeverity(value);
        return this;
    }

    public PtConsequenceStructure withAffects(AffectsScopeStructure value) {
        setAffects(value);
        return this;
    }

    public PtConsequenceStructure withSuitabilities(PtConsequenceStructure.Suitabilities value) {
        setSuitabilities(value);
        return this;
    }

    public PtConsequenceStructure withAdvice(PtAdviceStructure value) {
        setAdvice(value);
        return this;
    }

    public PtConsequenceStructure withBlocking(BlockingStructure value) {
        setBlocking(value);
        return this;
    }

    public PtConsequenceStructure withBoarding(BoardingStructure value) {
        setBoarding(value);
        return this;
    }

    public PtConsequenceStructure withDelays(DelaysStructure value) {
        setDelays(value);
        return this;
    }

    public PtConsequenceStructure withCasualties(CasualtiesStructure value) {
        setCasualties(value);
        return this;
    }

    public PtConsequenceStructure withEasements(EasementsStructure... values) {
        if (values!= null) {
            for (EasementsStructure value: values) {
                getEasements().add(value);
            }
        }
        return this;
    }

    public PtConsequenceStructure withEasements(Collection<EasementsStructure> values) {
        if (values!= null) {
            getEasements().addAll(values);
        }
        return this;
    }

    public PtConsequenceStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
     *         &lt;element name="Suitability" type="{http://www.ifopt.org.uk/acsb}SuitabilityStructure" maxOccurs="unbounded"/&gt;
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
        "suitability"
    })
    public static class Suitabilities {

        @XmlElement(name = "Suitability", required = true)
        protected List<SuitabilityStructure> suitability;

        /**
         * Gets the value of the suitability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the suitability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSuitability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuitabilityStructure }
         * 
         * 
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public PtConsequenceStructure.Suitabilities withSuitability(SuitabilityStructure... values) {
            if (values!= null) {
                for (SuitabilityStructure value: values) {
                    getSuitability().add(value);
                }
            }
            return this;
        }

        public PtConsequenceStructure.Suitabilities withSuitability(Collection<SuitabilityStructure> values) {
            if (values!= null) {
                getSuitability().addAll(values);
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
