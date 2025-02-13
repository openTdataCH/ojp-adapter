//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.acsb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.ifopt.Extensions;

/**
 * Type for Assesment.
 *
 * <p>Java-Klasse für AccessibilityAssessmentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AccessibilityAssessmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MobilityImpairedAccess" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Limitations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccessibilityLimitation" type="{http://www.ifopt.org.uk/acsb}AccessibilityLimitationStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element ref="{http://www.ifopt.org.uk/ifopt}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccessibilityAssessmentStructure", propOrder = {
    "mobilityImpairedAccess",
    "limitations",
    "suitabilities",
    "extensions"
})
public class AccessibilityAssessmentStructure {

    @XmlElement(name = "MobilityImpairedAccess")
    protected boolean mobilityImpairedAccess;
    @XmlElement(name = "Limitations")
    protected AccessibilityAssessmentStructure.Limitations limitations;
    @XmlElement(name = "Suitabilities")
    protected AccessibilityAssessmentStructure.Suitabilities suitabilities;
    @XmlElement(name = "Extensions", namespace = "http://www.ifopt.org.uk/ifopt")
    protected Extensions extensions;

    /**
     * Ruft den Wert der mobilityImpairedAccess-Eigenschaft ab.
     */
    public boolean isMobilityImpairedAccess() {
        return mobilityImpairedAccess;
    }

    /**
     * Legt den Wert der mobilityImpairedAccess-Eigenschaft fest.
     */
    public void setMobilityImpairedAccess(boolean value) {
        this.mobilityImpairedAccess = value;
    }

    /**
     * Ruft den Wert der limitations-Eigenschaft ab.
     *
     * @return possible object is {@link AccessibilityAssessmentStructure.Limitations }
     */
    public AccessibilityAssessmentStructure.Limitations getLimitations() {
        return limitations;
    }

    /**
     * Legt den Wert der limitations-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessibilityAssessmentStructure.Limitations }
     */
    public void setLimitations(AccessibilityAssessmentStructure.Limitations value) {
        this.limitations = value;
    }

    /**
     * Ruft den Wert der suitabilities-Eigenschaft ab.
     *
     * @return possible object is {@link AccessibilityAssessmentStructure.Suitabilities }
     */
    public AccessibilityAssessmentStructure.Suitabilities getSuitabilities() {
        return suitabilities;
    }

    /**
     * Legt den Wert der suitabilities-Eigenschaft fest.
     *
     * @param value allowed object is {@link AccessibilityAssessmentStructure.Suitabilities }
     */
    public void setSuitabilities(AccessibilityAssessmentStructure.Suitabilities value) {
        this.suitabilities = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link Extensions }
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link Extensions }
     */
    public void setExtensions(Extensions value) {
        this.extensions = value;
    }

    public AccessibilityAssessmentStructure withMobilityImpairedAccess(boolean value) {
        setMobilityImpairedAccess(value);
        return this;
    }

    public AccessibilityAssessmentStructure withLimitations(AccessibilityAssessmentStructure.Limitations value) {
        setLimitations(value);
        return this;
    }

    public AccessibilityAssessmentStructure withSuitabilities(AccessibilityAssessmentStructure.Suitabilities value) {
        setSuitabilities(value);
        return this;
    }

    public AccessibilityAssessmentStructure withExtensions(Extensions value) {
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
     *         &lt;element name="AccessibilityLimitation" type="{http://www.ifopt.org.uk/acsb}AccessibilityLimitationStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accessibilityLimitation"
    })
    public static class Limitations {

        @XmlElement(name = "AccessibilityLimitation", required = true)
        protected List<AccessibilityLimitationStructure> accessibilityLimitation;

        /**
         * Gets the value of the accessibilityLimitation property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the accessibilityLimitation property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAccessibilityLimitation().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AccessibilityLimitationStructure }
         */
        public List<AccessibilityLimitationStructure> getAccessibilityLimitation() {
            if (accessibilityLimitation == null) {
                accessibilityLimitation = new ArrayList<AccessibilityLimitationStructure>();
            }
            return this.accessibilityLimitation;
        }

        public AccessibilityAssessmentStructure.Limitations withAccessibilityLimitation(AccessibilityLimitationStructure... values) {
            if (values != null) {
                for (AccessibilityLimitationStructure value : values) {
                    getAccessibilityLimitation().add(value);
                }
            }
            return this;
        }

        public AccessibilityAssessmentStructure.Limitations withAccessibilityLimitation(Collection<AccessibilityLimitationStructure> values) {
            if (values != null) {
                getAccessibilityLimitation().addAll(values);
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

        public AccessibilityAssessmentStructure.Suitabilities withSuitability(SuitabilityStructure... values) {
            if (values != null) {
                for (SuitabilityStructure value : values) {
                    getSuitability().add(value);
                }
            }
            return this;
        }

        public AccessibilityAssessmentStructure.Suitabilities withSuitability(Collection<SuitabilityStructure> values) {
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
