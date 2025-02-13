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
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Description of any change concerning a MONITORED FACILITY New structure defined in SIRI XSD 1.1 for Facilities Management.
 *
 * <p>Java-Klasse für FacilityConditionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FacilityConditionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/&gt;
 *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FacilityStatus" type="{http://www.siri.org.uk/siri}FacilityStatusStructure"/&gt;
 *         &lt;element name="MonitoredCounting" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.siri.org.uk/siri}MonitoredCountingStructure"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FacilityUpdatedPosition" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}SituationRef" minOccurs="0"/&gt;
 *         &lt;element name="Remedy" type="{http://www.siri.org.uk/siri}RemedyStructure" minOccurs="0"/&gt;
 *         &lt;element name="MonitoringInfo" type="{http://www.siri.org.uk/siri}MonitoringInformationStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampOutputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityConditionStructure", propOrder = {
    "facility",
    "facilityRef",
    "facilityStatus",
    "monitoredCounting",
    "facilityUpdatedPosition",
    "situationRef",
    "remedy",
    "monitoringInfo",
    "validityPeriod",
    "extensions"
})
public class FacilityConditionStructure {

    @XmlElement(name = "Facility")
    protected FacilityStructure facility;
    @XmlElement(name = "FacilityRef")
    protected FacilityRefStructure facilityRef;
    @XmlElement(name = "FacilityStatus", required = true)
    protected FacilityStatusStructure facilityStatus;
    @XmlElement(name = "MonitoredCounting")
    protected List<FacilityConditionStructure.MonitoredCounting> monitoredCounting;
    @XmlElement(name = "FacilityUpdatedPosition")
    protected LocationStructure facilityUpdatedPosition;
    @XmlElement(name = "SituationRef")
    protected SituationRefStructure situationRef;
    @XmlElement(name = "Remedy")
    protected RemedyStructure remedy;
    @XmlElement(name = "MonitoringInfo")
    protected MonitoringInformationStructure monitoringInfo;
    @XmlElement(name = "ValidityPeriod")
    protected HalfOpenTimestampOutputRangeStructure validityPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der facility-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStructure }
     */
    public FacilityStructure getFacility() {
        return facility;
    }

    /**
     * Legt den Wert der facility-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStructure }
     */
    public void setFacility(FacilityStructure value) {
        this.facility = value;
    }

    /**
     * Ruft den Wert der facilityRef-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityRefStructure }
     */
    public FacilityRefStructure getFacilityRef() {
        return facilityRef;
    }

    /**
     * Legt den Wert der facilityRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityRefStructure }
     */
    public void setFacilityRef(FacilityRefStructure value) {
        this.facilityRef = value;
    }

    /**
     * Ruft den Wert der facilityStatus-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStatusStructure }
     */
    public FacilityStatusStructure getFacilityStatus() {
        return facilityStatus;
    }

    /**
     * Legt den Wert der facilityStatus-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStatusStructure }
     */
    public void setFacilityStatus(FacilityStatusStructure value) {
        this.facilityStatus = value;
    }

    /**
     * Gets the value of the monitoredCounting property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the monitoredCounting property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonitoredCounting().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FacilityConditionStructure.MonitoredCounting }
     */
    public List<FacilityConditionStructure.MonitoredCounting> getMonitoredCounting() {
        if (monitoredCounting == null) {
            monitoredCounting = new ArrayList<FacilityConditionStructure.MonitoredCounting>();
        }
        return this.monitoredCounting;
    }

    /**
     * Ruft den Wert der facilityUpdatedPosition-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getFacilityUpdatedPosition() {
        return facilityUpdatedPosition;
    }

    /**
     * Legt den Wert der facilityUpdatedPosition-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setFacilityUpdatedPosition(LocationStructure value) {
        this.facilityUpdatedPosition = value;
    }

    /**
     * Ruft den Wert der situationRef-Eigenschaft ab.
     *
     * @return possible object is {@link SituationRefStructure }
     */
    public SituationRefStructure getSituationRef() {
        return situationRef;
    }

    /**
     * Legt den Wert der situationRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link SituationRefStructure }
     */
    public void setSituationRef(SituationRefStructure value) {
        this.situationRef = value;
    }

    /**
     * Ruft den Wert der remedy-Eigenschaft ab.
     *
     * @return possible object is {@link RemedyStructure }
     */
    public RemedyStructure getRemedy() {
        return remedy;
    }

    /**
     * Legt den Wert der remedy-Eigenschaft fest.
     *
     * @param value allowed object is {@link RemedyStructure }
     */
    public void setRemedy(RemedyStructure value) {
        this.remedy = value;
    }

    /**
     * Ruft den Wert der monitoringInfo-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoringInformationStructure }
     */
    public MonitoringInformationStructure getMonitoringInfo() {
        return monitoringInfo;
    }

    /**
     * Legt den Wert der monitoringInfo-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoringInformationStructure }
     */
    public void setMonitoringInfo(MonitoringInformationStructure value) {
        this.monitoringInfo = value;
    }

    /**
     * Ruft den Wert der validityPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link HalfOpenTimestampOutputRangeStructure }
     */
    public HalfOpenTimestampOutputRangeStructure getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Legt den Wert der validityPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link HalfOpenTimestampOutputRangeStructure }
     */
    public void setValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        this.validityPeriod = value;
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

    public FacilityConditionStructure withFacility(FacilityStructure value) {
        setFacility(value);
        return this;
    }

    public FacilityConditionStructure withFacilityRef(FacilityRefStructure value) {
        setFacilityRef(value);
        return this;
    }

    public FacilityConditionStructure withFacilityStatus(FacilityStatusStructure value) {
        setFacilityStatus(value);
        return this;
    }

    public FacilityConditionStructure withMonitoredCounting(FacilityConditionStructure.MonitoredCounting... values) {
        if (values != null) {
            for (FacilityConditionStructure.MonitoredCounting value : values) {
                getMonitoredCounting().add(value);
            }
        }
        return this;
    }

    public FacilityConditionStructure withMonitoredCounting(Collection<FacilityConditionStructure.MonitoredCounting> values) {
        if (values != null) {
            getMonitoredCounting().addAll(values);
        }
        return this;
    }

    public FacilityConditionStructure withFacilityUpdatedPosition(LocationStructure value) {
        setFacilityUpdatedPosition(value);
        return this;
    }

    public FacilityConditionStructure withSituationRef(SituationRefStructure value) {
        setSituationRef(value);
        return this;
    }

    public FacilityConditionStructure withRemedy(RemedyStructure value) {
        setRemedy(value);
        return this;
    }

    public FacilityConditionStructure withMonitoringInfo(MonitoringInformationStructure value) {
        setMonitoringInfo(value);
        return this;
    }

    public FacilityConditionStructure withValidityPeriod(HalfOpenTimestampOutputRangeStructure value) {
        setValidityPeriod(value);
        return this;
    }

    public FacilityConditionStructure withExtensions(ExtensionsStructure value) {
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
     *     &lt;extension base="{http://www.siri.org.uk/siri}MonitoredCountingStructure"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MonitoredCounting
        extends MonitoredCountingStructure {

        @Override
        public FacilityConditionStructure.MonitoredCounting withCountingType(CountingTypeEnumeration value) {
            setCountingType(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withCountedFeatureUnit(CountedFeatureUnitEnumeration value) {
            setCountedFeatureUnit(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withTypeOfCountedFeature(TypeOfValueStructure value) {
            setTypeOfCountedFeature(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withCount(BigInteger value) {
            setCount(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withPercentage(BigDecimal value) {
            setPercentage(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withTrend(CountingTrendEnumeration value) {
            setTrend(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withAccuracy(BigDecimal value) {
            setAccuracy(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withDescription(NaturalLanguageStringStructure... values) {
            if (values != null) {
                for (NaturalLanguageStringStructure value : values) {
                    getDescription().add(value);
                }
            }
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withDescription(Collection<NaturalLanguageStringStructure> values) {
            if (values != null) {
                getDescription().addAll(values);
            }
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withCountedItemsIdList(MonitoredCountingStructure.CountedItemsIdList value) {
            setCountedItemsIdList(value);
            return this;
        }

        @Override
        public FacilityConditionStructure.MonitoredCounting withExtensions(ExtensionsStructure value) {
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

    }

}
