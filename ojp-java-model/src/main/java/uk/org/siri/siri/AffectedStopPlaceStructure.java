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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.ifopt.NavigationPathRefStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;

/**
 * Type for information about the STOP PLACEs affected by an SITUATION.
 *
 * <p>Java-Klasse für AffectedStopPlaceStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AffectedStopPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StopPlaceType" type="{http://www.siri.org.uk/siri}StopPlaceTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AffectedFacilities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AffectedComponents" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AffectedNavigationPaths" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Lines" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedLine" type="{http://www.siri.org.uk/siri}AffectedLineStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopPlaceStructure", propOrder = {
    "stopPlaceRef",
    "placeName",
    "stopPlaceType",
    "affectedFacilities",
    "affectedComponents",
    "affectedNavigationPaths",
    "lines",
    "extensions"
})
public class AffectedStopPlaceStructure
    extends AffectedStopPlaceElementStructure {

    @XmlElement(name = "StopPlaceRef", required = true)
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "StopPlaceType")
    @XmlSchemaType(name = "string")
    protected StopPlaceTypeEnumeration stopPlaceType;
    @XmlElement(name = "AffectedFacilities")
    protected AffectedStopPlaceStructure.AffectedFacilities affectedFacilities;
    @XmlElement(name = "AffectedComponents")
    protected AffectedStopPlaceStructure.AffectedComponents affectedComponents;
    @XmlElement(name = "AffectedNavigationPaths")
    protected AffectedStopPlaceStructure.AffectedNavigationPaths affectedNavigationPaths;
    @XmlElement(name = "Lines")
    protected AffectedStopPlaceStructure.Lines lines;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceRefStructure }
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceRefStructure }
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Gets the value of the placeName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the placeName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.placeName;
    }

    /**
     * Ruft den Wert der stopPlaceType-Eigenschaft ab.
     *
     * @return possible object is {@link StopPlaceTypeEnumeration }
     */
    public StopPlaceTypeEnumeration getStopPlaceType() {
        return stopPlaceType;
    }

    /**
     * Legt den Wert der stopPlaceType-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopPlaceTypeEnumeration }
     */
    public void setStopPlaceType(StopPlaceTypeEnumeration value) {
        this.stopPlaceType = value;
    }

    /**
     * Ruft den Wert der affectedFacilities-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedStopPlaceStructure.AffectedFacilities }
     */
    public AffectedStopPlaceStructure.AffectedFacilities getAffectedFacilities() {
        return affectedFacilities;
    }

    /**
     * Legt den Wert der affectedFacilities-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedStopPlaceStructure.AffectedFacilities }
     */
    public void setAffectedFacilities(AffectedStopPlaceStructure.AffectedFacilities value) {
        this.affectedFacilities = value;
    }

    /**
     * Ruft den Wert der affectedComponents-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedStopPlaceStructure.AffectedComponents }
     */
    public AffectedStopPlaceStructure.AffectedComponents getAffectedComponents() {
        return affectedComponents;
    }

    /**
     * Legt den Wert der affectedComponents-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedStopPlaceStructure.AffectedComponents }
     */
    public void setAffectedComponents(AffectedStopPlaceStructure.AffectedComponents value) {
        this.affectedComponents = value;
    }

    /**
     * Ruft den Wert der affectedNavigationPaths-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     */
    public AffectedStopPlaceStructure.AffectedNavigationPaths getAffectedNavigationPaths() {
        return affectedNavigationPaths;
    }

    /**
     * Legt den Wert der affectedNavigationPaths-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedStopPlaceStructure.AffectedNavigationPaths }
     */
    public void setAffectedNavigationPaths(AffectedStopPlaceStructure.AffectedNavigationPaths value) {
        this.affectedNavigationPaths = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     *
     * @return possible object is {@link AffectedStopPlaceStructure.Lines }
     */
    public AffectedStopPlaceStructure.Lines getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     *
     * @param value allowed object is {@link AffectedStopPlaceStructure.Lines }
     */
    public void setLines(AffectedStopPlaceStructure.Lines value) {
        this.lines = value;
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

    public AffectedStopPlaceStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public AffectedStopPlaceStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPlaceStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public AffectedStopPlaceStructure withStopPlaceType(StopPlaceTypeEnumeration value) {
        setStopPlaceType(value);
        return this;
    }

    public AffectedStopPlaceStructure withAffectedFacilities(AffectedStopPlaceStructure.AffectedFacilities value) {
        setAffectedFacilities(value);
        return this;
    }

    public AffectedStopPlaceStructure withAffectedComponents(AffectedStopPlaceStructure.AffectedComponents value) {
        setAffectedComponents(value);
        return this;
    }

    public AffectedStopPlaceStructure withAffectedNavigationPaths(AffectedStopPlaceStructure.AffectedNavigationPaths value) {
        setAffectedNavigationPaths(value);
        return this;
    }

    public AffectedStopPlaceStructure withLines(AffectedStopPlaceStructure.Lines value) {
        setLines(value);
        return this;
    }

    public AffectedStopPlaceStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AffectedStopPlaceStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
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
     *         &lt;element name="AffectedComponent" type="{http://www.siri.org.uk/siri}AffectedStopPlaceComponentStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedComponent"
    })
    public static class AffectedComponents {

        @XmlElement(name = "AffectedComponent")
        protected List<AffectedStopPlaceComponentStructure> affectedComponent;

        /**
         * Gets the value of the affectedComponent property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedComponent property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedComponent().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedStopPlaceComponentStructure }
         */
        public List<AffectedStopPlaceComponentStructure> getAffectedComponent() {
            if (affectedComponent == null) {
                affectedComponent = new ArrayList<AffectedStopPlaceComponentStructure>();
            }
            return this.affectedComponent;
        }

        public AffectedStopPlaceStructure.AffectedComponents withAffectedComponent(AffectedStopPlaceComponentStructure... values) {
            if (values != null) {
                for (AffectedStopPlaceComponentStructure value : values) {
                    getAffectedComponent().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceStructure.AffectedComponents withAffectedComponent(Collection<AffectedStopPlaceComponentStructure> values) {
            if (values != null) {
                getAffectedComponent().addAll(values);
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedFacility"
    })
    public static class AffectedFacilities {

        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedFacility property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedFacility().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedFacilityStructure }
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public AffectedStopPlaceStructure.AffectedFacilities withAffectedFacility(AffectedFacilityStructure... values) {
            if (values != null) {
                for (AffectedFacilityStructure value : values) {
                    getAffectedFacility().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceStructure.AffectedFacilities withAffectedFacility(Collection<AffectedFacilityStructure> values) {
            if (values != null) {
                getAffectedFacility().addAll(values);
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
     *         &lt;element name="NavigationPathRef" type="{http://www.ifopt.org.uk/ifopt}NavigationPathRefStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "navigationPathRef"
    })
    public static class AffectedNavigationPaths {

        @XmlElement(name = "NavigationPathRef", required = true)
        protected List<NavigationPathRefStructure> navigationPathRef;

        /**
         * Gets the value of the navigationPathRef property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the navigationPathRef property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNavigationPathRef().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link NavigationPathRefStructure }
         */
        public List<NavigationPathRefStructure> getNavigationPathRef() {
            if (navigationPathRef == null) {
                navigationPathRef = new ArrayList<NavigationPathRefStructure>();
            }
            return this.navigationPathRef;
        }

        public AffectedStopPlaceStructure.AffectedNavigationPaths withNavigationPathRef(NavigationPathRefStructure... values) {
            if (values != null) {
                for (NavigationPathRefStructure value : values) {
                    getNavigationPathRef().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceStructure.AffectedNavigationPaths withNavigationPathRef(Collection<NavigationPathRefStructure> values) {
            if (values != null) {
                getNavigationPathRef().addAll(values);
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
     *         &lt;element name="AffectedLine" type="{http://www.siri.org.uk/siri}AffectedLineStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedLine"
    })
    public static class Lines {

        @XmlElement(name = "AffectedLine", required = true)
        protected List<AffectedLineStructure> affectedLine;

        /**
         * Gets the value of the affectedLine property.
         *
         * <p>
         * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedLine property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedLine().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list {@link AffectedLineStructure }
         */
        public List<AffectedLineStructure> getAffectedLine() {
            if (affectedLine == null) {
                affectedLine = new ArrayList<AffectedLineStructure>();
            }
            return this.affectedLine;
        }

        public AffectedStopPlaceStructure.Lines withAffectedLine(AffectedLineStructure... values) {
            if (values != null) {
                for (AffectedLineStructure value : values) {
                    getAffectedLine().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceStructure.Lines withAffectedLine(Collection<AffectedLineStructure> values) {
            if (values != null) {
                getAffectedLine().addAll(values);
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
