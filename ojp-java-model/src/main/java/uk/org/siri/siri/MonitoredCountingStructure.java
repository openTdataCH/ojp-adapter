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
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Monitored counted values.
 *
 * <p>Java-Klasse für MonitoredCountingStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MonitoredCountingStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountingType" type="{http://www.siri.org.uk/siri}CountingTypeEnumeration"/&gt;
 *         &lt;element name="CountedFeatureUnit" type="{http://www.siri.org.uk/siri}CountedFeatureUnitEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="TypeOfCountedFeature" type="{http://www.siri.org.uk/siri}TypeOfValueStructure" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *           &lt;element name="Percentage" type="{http://www.siri.org.uk/siri}PercentageType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Trend" type="{http://www.siri.org.uk/siri}CountingTrendEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Accuracy" type="{http://www.siri.org.uk/siri}PercentageType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountedItemsIdList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemId" type="{http://www.siri.org.uk/siri}IdType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonitoredCountingStructure", propOrder = {
    "countingType",
    "countedFeatureUnit",
    "typeOfCountedFeature",
    "count",
    "percentage",
    "trend",
    "accuracy",
    "description",
    "countedItemsIdList",
    "extensions"
})
@XmlSeeAlso({
    uk.org.siri.siri.FacilityConditionStructure.MonitoredCounting.class
})
public class MonitoredCountingStructure {

    @XmlElement(name = "CountingType", required = true)
    @XmlSchemaType(name = "NMTOKEN")
    protected CountingTypeEnumeration countingType;
    @XmlElement(name = "CountedFeatureUnit")
    @XmlSchemaType(name = "NMTOKEN")
    protected CountedFeatureUnitEnumeration countedFeatureUnit;
    @XmlElement(name = "TypeOfCountedFeature")
    protected TypeOfValueStructure typeOfCountedFeature;
    @XmlElement(name = "Count")
    protected BigInteger count;
    @XmlElement(name = "Percentage")
    protected BigDecimal percentage;
    @XmlElement(name = "Trend")
    @XmlSchemaType(name = "NMTOKEN")
    protected CountingTrendEnumeration trend;
    @XmlElement(name = "Accuracy")
    protected BigDecimal accuracy;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "CountedItemsIdList")
    protected MonitoredCountingStructure.CountedItemsIdList countedItemsIdList;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der countingType-Eigenschaft ab.
     *
     * @return possible object is {@link CountingTypeEnumeration }
     */
    public CountingTypeEnumeration getCountingType() {
        return countingType;
    }

    /**
     * Legt den Wert der countingType-Eigenschaft fest.
     *
     * @param value allowed object is {@link CountingTypeEnumeration }
     */
    public void setCountingType(CountingTypeEnumeration value) {
        this.countingType = value;
    }

    /**
     * Ruft den Wert der countedFeatureUnit-Eigenschaft ab.
     *
     * @return possible object is {@link CountedFeatureUnitEnumeration }
     */
    public CountedFeatureUnitEnumeration getCountedFeatureUnit() {
        return countedFeatureUnit;
    }

    /**
     * Legt den Wert der countedFeatureUnit-Eigenschaft fest.
     *
     * @param value allowed object is {@link CountedFeatureUnitEnumeration }
     */
    public void setCountedFeatureUnit(CountedFeatureUnitEnumeration value) {
        this.countedFeatureUnit = value;
    }

    /**
     * Ruft den Wert der typeOfCountedFeature-Eigenschaft ab.
     *
     * @return possible object is {@link TypeOfValueStructure }
     */
    public TypeOfValueStructure getTypeOfCountedFeature() {
        return typeOfCountedFeature;
    }

    /**
     * Legt den Wert der typeOfCountedFeature-Eigenschaft fest.
     *
     * @param value allowed object is {@link TypeOfValueStructure }
     */
    public void setTypeOfCountedFeature(TypeOfValueStructure value) {
        this.typeOfCountedFeature = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der percentage-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getPercentage() {
        return percentage;
    }

    /**
     * Legt den Wert der percentage-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setPercentage(BigDecimal value) {
        this.percentage = value;
    }

    /**
     * Ruft den Wert der trend-Eigenschaft ab.
     *
     * @return possible object is {@link CountingTrendEnumeration }
     */
    public CountingTrendEnumeration getTrend() {
        return trend;
    }

    /**
     * Legt den Wert der trend-Eigenschaft fest.
     *
     * @param value allowed object is {@link CountingTrendEnumeration }
     */
    public void setTrend(CountingTrendEnumeration value) {
        this.trend = value;
    }

    /**
     * Ruft den Wert der accuracy-Eigenschaft ab.
     *
     * @return possible object is {@link BigDecimal }
     */
    public BigDecimal getAccuracy() {
        return accuracy;
    }

    /**
     * Legt den Wert der accuracy-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigDecimal }
     */
    public void setAccuracy(BigDecimal value) {
        this.accuracy = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    /**
     * Ruft den Wert der countedItemsIdList-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoredCountingStructure.CountedItemsIdList }
     */
    public MonitoredCountingStructure.CountedItemsIdList getCountedItemsIdList() {
        return countedItemsIdList;
    }

    /**
     * Legt den Wert der countedItemsIdList-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoredCountingStructure.CountedItemsIdList }
     */
    public void setCountedItemsIdList(MonitoredCountingStructure.CountedItemsIdList value) {
        this.countedItemsIdList = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public MonitoredCountingStructure withCountingType(CountingTypeEnumeration value) {
        setCountingType(value);
        return this;
    }

    public MonitoredCountingStructure withCountedFeatureUnit(CountedFeatureUnitEnumeration value) {
        setCountedFeatureUnit(value);
        return this;
    }

    public MonitoredCountingStructure withTypeOfCountedFeature(TypeOfValueStructure value) {
        setTypeOfCountedFeature(value);
        return this;
    }

    public MonitoredCountingStructure withCount(BigInteger value) {
        setCount(value);
        return this;
    }

    public MonitoredCountingStructure withPercentage(BigDecimal value) {
        setPercentage(value);
        return this;
    }

    public MonitoredCountingStructure withTrend(CountingTrendEnumeration value) {
        setTrend(value);
        return this;
    }

    public MonitoredCountingStructure withAccuracy(BigDecimal value) {
        setAccuracy(value);
        return this;
    }

    public MonitoredCountingStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public MonitoredCountingStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public MonitoredCountingStructure withCountedItemsIdList(MonitoredCountingStructure.CountedItemsIdList value) {
        setCountedItemsIdList(value);
        return this;
    }

    public MonitoredCountingStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
     *         &lt;element name="ItemId" type="{http://www.siri.org.uk/siri}IdType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemId"
    })
    public static class CountedItemsIdList {

        @XmlElement(name = "ItemId", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NMTOKEN")
        protected List<String> itemId;

        /**
         * Gets the value of the itemId property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the itemId property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemId().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link String }
         */
        public List<String> getItemId() {
            if (itemId == null) {
                itemId = new ArrayList<String>();
            }
            return this.itemId;
        }

        public MonitoredCountingStructure.CountedItemsIdList withItemId(String... values) {
            if (values != null) {
                for (String value : values) {
                    getItemId().add(value);
                }
            }
            return this;
        }

        public MonitoredCountingStructure.CountedItemsIdList withItemId(Collection<String> values) {
            if (values != null) {
                getItemId().addAll(values);
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
