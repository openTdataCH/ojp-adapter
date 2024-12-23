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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for list of SITUATIONs.
 * 
 * <p>Java-Klasse für ActionDataStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ActionDataStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Prompt" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PublishAtScope" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDataStructure", propOrder = {
    "name",
    "type",
    "value",
    "prompt",
    "publishAtScope"
})
public class ActionDataStructure {

    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String name;
    @XmlElement(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String type;
    @XmlElement(name = "Value", required = true)
    protected List<Object> value;
    @XmlElement(name = "Prompt")
    protected List<NaturalLanguageStringStructure> prompt;
    @XmlElement(name = "PublishAtScope")
    protected ActionDataStructure.PublishAtScope publishAtScope;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getValue() {
        if (value == null) {
            value = new ArrayList<Object>();
        }
        return this.value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPrompt() {
        if (prompt == null) {
            prompt = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.prompt;
    }

    /**
     * Ruft den Wert der publishAtScope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ActionDataStructure.PublishAtScope }
     *     
     */
    public ActionDataStructure.PublishAtScope getPublishAtScope() {
        return publishAtScope;
    }

    /**
     * Legt den Wert der publishAtScope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDataStructure.PublishAtScope }
     *     
     */
    public void setPublishAtScope(ActionDataStructure.PublishAtScope value) {
        this.publishAtScope = value;
    }

    public ActionDataStructure withName(String value) {
        setName(value);
        return this;
    }

    public ActionDataStructure withType(String value) {
        setType(value);
        return this;
    }

    public ActionDataStructure withValue(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getValue().add(value);
            }
        }
        return this;
    }

    public ActionDataStructure withValue(Collection<Object> values) {
        if (values!= null) {
            getValue().addAll(values);
        }
        return this;
    }

    public ActionDataStructure withPrompt(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPrompt().add(value);
            }
        }
        return this;
    }

    public ActionDataStructure withPrompt(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPrompt().addAll(values);
        }
        return this;
    }

    public ActionDataStructure withPublishAtScope(ActionDataStructure.PublishAtScope value) {
        setPublishAtScope(value);
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
     *         &lt;element name="ScopeType" type="{http://www.siri.org.uk/siri}ScopeTypeEnumeration"/&gt;
     *         &lt;element name="Affects" type="{http://www.siri.org.uk/siri}AffectsScopeStructure"/&gt;
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
         * @return
         *     possible object is
         *     {@link ScopeTypeEnumeration }
         *     
         */
        public ScopeTypeEnumeration getScopeType() {
            return scopeType;
        }

        /**
         * Legt den Wert der scopeType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link ScopeTypeEnumeration }
         *     
         */
        public void setScopeType(ScopeTypeEnumeration value) {
            this.scopeType = value;
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

        public ActionDataStructure.PublishAtScope withScopeType(ScopeTypeEnumeration value) {
            setScopeType(value);
            return this;
        }

        public ActionDataStructure.PublishAtScope withAffects(AffectsScopeStructure value) {
            setAffects(value);
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
