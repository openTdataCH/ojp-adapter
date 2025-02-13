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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.acsb.AccessibilityStructure;
import uk.org.ifopt.acsb.SuitabilityStructure;

/**
 * Type for description of the MONITORED FACILITY itself.
 *
 * <p>Java-Klasse für FacilityStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="FacilityStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacilityCode" type="{http://www.siri.org.uk/siri}FacilityCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FacilityClass" type="{http://www.siri.org.uk/siri}FacilityCategoryEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Features" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OwnerRef" type="{http://www.siri.org.uk/siri}OrganisationRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" minOccurs="0"/&gt;
 *         &lt;element name="ValidityCondition" type="{http://www.siri.org.uk/siri}MonitoringValidityConditionStructure" minOccurs="0"/&gt;
 *         &lt;element name="FacilityLocation" type="{http://www.siri.org.uk/siri}FacilityLocationStructure" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}FacilityAccessibilityGroup"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityStructure", propOrder = {
    "facilityCode",
    "description",
    "facilityClass",
    "features",
    "ownerRef",
    "ownerName",
    "validityCondition",
    "facilityLocation",
    "limitations",
    "suitabilities",
    "accessibilityAssessment",
    "extensions"
})
public class FacilityStructure {

    @XmlElement(name = "FacilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String facilityCode;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "FacilityClass")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<FacilityCategoryEnumeration> facilityClass;
    @XmlElement(name = "Features")
    protected FacilityStructure.Features features;
    @XmlElement(name = "OwnerRef")
    protected OrganisationRefStructure ownerRef;
    @XmlElement(name = "OwnerName")
    protected NaturalLanguageStringStructure ownerName;
    @XmlElement(name = "ValidityCondition")
    protected MonitoringValidityConditionStructure validityCondition;
    @XmlElement(name = "FacilityLocation")
    protected FacilityLocationStructure facilityLocation;
    @XmlElement(name = "Limitations")
    protected FacilityStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected FacilityStructure.Suitabilities suitabilities;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der facilityCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFacilityCode() {
        return facilityCode;
    }

    /**
     * Legt den Wert der facilityCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFacilityCode(String value) {
        this.facilityCode = value;
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
     * Gets the value of the facilityClass property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the facilityClass property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityClass().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link FacilityCategoryEnumeration }
     */
    public List<FacilityCategoryEnumeration> getFacilityClass() {
        if (facilityClass == null) {
            facilityClass = new ArrayList<FacilityCategoryEnumeration>();
        }
        return this.facilityClass;
    }

    /**
     * Ruft den Wert der features-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStructure.Features }
     */
    public FacilityStructure.Features getFeatures() {
        return features;
    }

    /**
     * Legt den Wert der features-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStructure.Features }
     */
    public void setFeatures(FacilityStructure.Features value) {
        this.features = value;
    }

    /**
     * Ruft den Wert der ownerRef-Eigenschaft ab.
     *
     * @return possible object is {@link OrganisationRefStructure }
     */
    public OrganisationRefStructure getOwnerRef() {
        return ownerRef;
    }

    /**
     * Legt den Wert der ownerRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link OrganisationRefStructure }
     */
    public void setOwnerRef(OrganisationRefStructure value) {
        this.ownerRef = value;
    }

    /**
     * Ruft den Wert der ownerName-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getOwnerName() {
        return ownerName;
    }

    /**
     * Legt den Wert der ownerName-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setOwnerName(NaturalLanguageStringStructure value) {
        this.ownerName = value;
    }

    /**
     * Ruft den Wert der validityCondition-Eigenschaft ab.
     *
     * @return possible object is {@link MonitoringValidityConditionStructure }
     */
    public MonitoringValidityConditionStructure getValidityCondition() {
        return validityCondition;
    }

    /**
     * Legt den Wert der validityCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link MonitoringValidityConditionStructure }
     */
    public void setValidityCondition(MonitoringValidityConditionStructure value) {
        this.validityCondition = value;
    }

    /**
     * Ruft den Wert der facilityLocation-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityLocationStructure }
     */
    public FacilityLocationStructure getFacilityLocation() {
        return facilityLocation;
    }

    /**
     * Legt den Wert der facilityLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityLocationStructure }
     */
    public void setFacilityLocation(FacilityLocationStructure value) {
        this.facilityLocation = value;
    }

    /**
     * Ruft den Wert der limitations-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStructure.Limitations }
     */
    public FacilityStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Legt den Wert der limitations-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStructure.Limitations }
     */
    public void setLimitations(FacilityStructure.Limitations value) {
        this.limitations = value;
    }

    /**
     * Ruft den Wert der suitabilities-Eigenschaft ab.
     *
     * @return possible object is {@link FacilityStructure.Suitabilities }
     */
    public FacilityStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Legt den Wert der suitabilities-Eigenschaft fest.
     *
     * @param value allowed object is {@link FacilityStructure.Suitabilities }
     */
    public void setSuitabilities(FacilityStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     *
     * @return possible object is {@link AccessibilityAssessmentStructure }
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessibilityAssessmentStructure }
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
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

    public FacilityStructure withFacilityCode(String value) {
        setFacilityCode(value);
        return this;
    }

    public FacilityStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public FacilityStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public FacilityStructure withFacilityClass(FacilityCategoryEnumeration... values) {
        if (values != null) {
            for (FacilityCategoryEnumeration value : values) {
                getFacilityClass().add(value);
            }
        }
        return this;
    }

    public FacilityStructure withFacilityClass(Collection<FacilityCategoryEnumeration> values) {
        if (values != null) {
            getFacilityClass().addAll(values);
        }
        return this;
    }

    public FacilityStructure withFeatures(FacilityStructure.Features value) {
        setFeatures(value);
        return this;
    }

    public FacilityStructure withOwnerRef(OrganisationRefStructure value) {
        setOwnerRef(value);
        return this;
    }

    public FacilityStructure withOwnerName(NaturalLanguageStringStructure value) {
        setOwnerName(value);
        return this;
    }

    public FacilityStructure withValidityCondition(MonitoringValidityConditionStructure value) {
        setValidityCondition(value);
        return this;
    }

    public FacilityStructure withFacilityLocation(FacilityLocationStructure value) {
        setFacilityLocation(value);
        return this;
    }

    public FacilityStructure withLimitations(FacilityStructure.Limitations value) {
        setLimitations(value);
        return this;
    }

    public FacilityStructure withSuitabilities(FacilityStructure.Suitabilities value) {
        setSuitabilities(value);
        return this;
    }

    public FacilityStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public FacilityStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="Feature" type="{http://www.siri.org.uk/siri}AllFacilitiesFeatureStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "feature"
    })
    public static class Features {

        @XmlElement(name = "Feature", required = true)
        protected List<AllFacilitiesFeatureStructure> feature;

        /**
         * Gets the value of the feature property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the feature property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeature().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AllFacilitiesFeatureStructure }
         */
        public List<AllFacilitiesFeatureStructure> getFeature() {
            if (feature == null) {
                feature = new ArrayList<AllFacilitiesFeatureStructure>();
            }
            return this.feature;
        }

        public FacilityStructure.Features withFeature(AllFacilitiesFeatureStructure... values) {
            if (values != null) {
                for (AllFacilitiesFeatureStructure value : values) {
                    getFeature().add(value);
                }
            }
            return this;
        }

        public FacilityStructure.Features withFeature(Collection<AllFacilitiesFeatureStructure> values) {
            if (values != null) {
                getFeature().addAll(values);
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
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}MobilityLimitationGroup"/&gt;
     *         &lt;group ref="{http://www.ifopt.org.uk/acsb}SensoryLimitationGroup"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "wheelchairAccess",
        "stepFreeAccess",
        "escalatorFreeAccess",
        "liftFreeAccess",
        "audibleSignalsAvailable",
        "visualSignsAvailable"
    })
    public static class Limitations {

        @XmlElement(name = "WheelchairAccess", namespace = "http://www.ifopt.org.uk/acsb", required = true, defaultValue = "false")
        protected AccessibilityStructure wheelchairAccess;
        @XmlElement(name = "StepFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure stepFreeAccess;
        @XmlElement(name = "EscalatorFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure escalatorFreeAccess;
        @XmlElement(name = "LiftFreeAccess", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure liftFreeAccess;
        @XmlElement(name = "AudibleSignalsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "false")
        protected AccessibilityStructure audibleSignalsAvailable;
        @XmlElement(name = "VisualSignsAvailable", namespace = "http://www.ifopt.org.uk/acsb", defaultValue = "unknown")
        protected AccessibilityStructure visualSignsAvailable;

        /**
         * Ruft den Wert der wheelchairAccess-Eigenschaft ab.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getWheelchairAccess() {
            return wheelchairAccess;
        }

        /**
         * Legt den Wert der wheelchairAccess-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setWheelchairAccess(AccessibilityStructure value) {
            this.wheelchairAccess = value;
        }

        /**
         * Ruft den Wert der stepFreeAccess-Eigenschaft ab.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getStepFreeAccess() {
            return stepFreeAccess;
        }

        /**
         * Legt den Wert der stepFreeAccess-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setStepFreeAccess(AccessibilityStructure value) {
            this.stepFreeAccess = value;
        }

        /**
         * Ruft den Wert der escalatorFreeAccess-Eigenschaft ab.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getEscalatorFreeAccess() {
            return escalatorFreeAccess;
        }

        /**
         * Legt den Wert der escalatorFreeAccess-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setEscalatorFreeAccess(AccessibilityStructure value) {
            this.escalatorFreeAccess = value;
        }

        /**
         * Ruft den Wert der liftFreeAccess-Eigenschaft ab.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getLiftFreeAccess() {
            return liftFreeAccess;
        }

        /**
         * Legt den Wert der liftFreeAccess-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setLiftFreeAccess(AccessibilityStructure value) {
            this.liftFreeAccess = value;
        }

        /**
         * Whether a PLACE / SITE ELEMENT has Audible signals for the visually impaired. Default is 'false'.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getAudibleSignalsAvailable() {
            return audibleSignalsAvailable;
        }

        /**
         * Legt den Wert der audibleSignalsAvailable-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setAudibleSignalsAvailable(AccessibilityStructure value) {
            this.audibleSignalsAvailable = value;
        }

        /**
         * Whether a PLACE / SITE ELEMENT has Visual signals for the hearing impaired. Default is 'unknown'.
         *
         * @return possible object is {@link AccessibilityStructure }
         */
        public AccessibilityStructure getVisualSignsAvailable() {
            return visualSignsAvailable;
        }

        /**
         * Legt den Wert der visualSignsAvailable-Eigenschaft fest.
         *
         * @param value allowed object is {@link AccessibilityStructure }
         */
        public void setVisualSignsAvailable(AccessibilityStructure value) {
            this.visualSignsAvailable = value;
        }

        public FacilityStructure.Limitations withWheelchairAccess(AccessibilityStructure value) {
            setWheelchairAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withStepFreeAccess(AccessibilityStructure value) {
            setStepFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withEscalatorFreeAccess(AccessibilityStructure value) {
            setEscalatorFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withLiftFreeAccess(AccessibilityStructure value) {
            setLiftFreeAccess(value);
            return this;
        }

        public FacilityStructure.Limitations withAudibleSignalsAvailable(AccessibilityStructure value) {
            setAudibleSignalsAvailable(value);
            return this;
        }

        public FacilityStructure.Limitations withVisualSignsAvailable(AccessibilityStructure value) {
            setVisualSignsAvailable(value);
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
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
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
         * Objects of the following type(s) are allowed in the list {@link SuitabilityStructure }
         */
        public List<SuitabilityStructure> getSuitability() {
            if (suitability == null) {
                suitability = new ArrayList<SuitabilityStructure>();
            }
            return this.suitability;
        }

        public FacilityStructure.Suitabilities withSuitability(SuitabilityStructure... values) {
            if (values != null) {
                for (SuitabilityStructure value : values) {
                    getSuitability().add(value);
                }
            }
            return this;
        }

        public FacilityStructure.Suitabilities withSuitability(Collection<SuitabilityStructure> values) {
            if (values != null) {
                getSuitability().addAll(values);
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
