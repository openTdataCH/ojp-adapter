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
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.ifopt.StopPlaceRefStructure;


/**
 * Type for an SCHEDULED STOP POINT affected by a SITUATION.
 * 
 * <p>Java-Klasse für AffectedStopPointStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPointStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}StopPointRef" minOccurs="0"/&gt;
 *         &lt;element name="PrivateRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StopPointName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="StopPointType" type="{http://www.siri.org.uk/siri}StopPointTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://www.siri.org.uk/siri}LocationStructure" minOccurs="0"/&gt;
 *         &lt;element name="StopPlaceRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="StopPlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AffectedModes" type="{http://www.siri.org.uk/siri}AffectedModesStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceRef" type="{http://www.siri.org.uk/siri}ZoneRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="PlaceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityAssessment" type="{http://www.ifopt.org.uk/acsb}AccessibilityAssessmentStructure" minOccurs="0"/&gt;
 *         &lt;element name="StopCondition" type="{http://www.siri.org.uk/siri}RoutePointTypeEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionLinks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopPointStructure", propOrder = {
    "stopPointRef",
    "privateRef",
    "stopPointName",
    "stopPointType",
    "location",
    "stopPlaceRef",
    "stopPlaceName",
    "affectedModes",
    "placeRef",
    "placeName",
    "accessibilityAssessment",
    "stopCondition",
    "connectionLinks",
    "lines",
    "extensions"
})
@XmlSeeAlso({
    AffectedCallStructure.class
})
public class AffectedStopPointStructure {

    @XmlElement(name = "StopPointRef")
    protected StopPointRefStructure stopPointRef;
    @XmlElement(name = "PrivateRef")
    protected String privateRef;
    @XmlElement(name = "StopPointName")
    protected List<NaturalLanguageStringStructure> stopPointName;
    @XmlElement(name = "StopPointType")
    @XmlSchemaType(name = "NMTOKEN")
    protected StopPointTypeEnumeration stopPointType;
    @XmlElement(name = "Location")
    protected LocationStructure location;
    @XmlElement(name = "StopPlaceRef")
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlaceName")
    protected List<NaturalLanguageStringStructure> stopPlaceName;
    @XmlElement(name = "AffectedModes")
    protected AffectedModesStructure affectedModes;
    @XmlElement(name = "PlaceRef")
    protected ZoneRefStructure placeRef;
    @XmlElement(name = "PlaceName")
    protected List<NaturalLanguageStringStructure> placeName;
    @XmlElement(name = "AccessibilityAssessment")
    protected AccessibilityAssessmentStructure accessibilityAssessment;
    @XmlElement(name = "StopCondition")
    @XmlSchemaType(name = "NMTOKEN")
    protected List<RoutePointTypeEnumeration> stopCondition;
    @XmlElement(name = "ConnectionLinks")
    protected AffectedStopPointStructure.ConnectionLinks connectionLinks;
    @XmlElement(name = "Lines")
    protected AffectedStopPointStructure.Lines lines;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der stopPointRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointRefStructure }
     *     
     */
    public StopPointRefStructure getStopPointRef() {
        return stopPointRef;
    }

    /**
     * Legt den Wert der stopPointRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointRefStructure }
     *     
     */
    public void setStopPointRef(StopPointRefStructure value) {
        this.stopPointRef = value;
    }

    /**
     * Ruft den Wert der privateRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateRef() {
        return privateRef;
    }

    /**
     * Legt den Wert der privateRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateRef(String value) {
        this.privateRef = value;
    }

    /**
     * Gets the value of the stopPointName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopPointName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPointName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPointName() {
        if (stopPointName == null) {
            stopPointName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPointName;
    }

    /**
     * Ruft den Wert der stopPointType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public StopPointTypeEnumeration getStopPointType() {
        return stopPointType;
    }

    /**
     * Legt den Wert der stopPointType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPointTypeEnumeration }
     *     
     */
    public void setStopPointType(StopPointTypeEnumeration value) {
        this.stopPointType = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocationStructure }
     *     
     */
    public LocationStructure getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStructure }
     *     
     */
    public void setLocation(LocationStructure value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der stopPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public StopPlaceRefStructure getStopPlaceRef() {
        return stopPlaceRef;
    }

    /**
     * Legt den Wert der stopPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceRefStructure }
     *     
     */
    public void setStopPlaceRef(StopPlaceRefStructure value) {
        this.stopPlaceRef = value;
    }

    /**
     * Gets the value of the stopPlaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopPlaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getStopPlaceName() {
        if (stopPlaceName == null) {
            stopPlaceName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.stopPlaceName;
    }

    /**
     * Ruft den Wert der affectedModes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedModesStructure }
     *     
     */
    public AffectedModesStructure getAffectedModes() {
        return affectedModes;
    }

    /**
     * Legt den Wert der affectedModes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedModesStructure }
     *     
     */
    public void setAffectedModes(AffectedModesStructure value) {
        this.affectedModes = value;
    }

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneRefStructure }
     *     
     */
    public ZoneRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneRefStructure }
     *     
     */
    public void setPlaceRef(ZoneRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Gets the value of the placeName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the placeName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPlaceName() {
        if (placeName == null) {
            placeName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.placeName;
    }

    /**
     * Ruft den Wert der accessibilityAssessment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public AccessibilityAssessmentStructure getAccessibilityAssessment() {
        return accessibilityAssessment;
    }

    /**
     * Legt den Wert der accessibilityAssessment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityAssessmentStructure }
     *     
     */
    public void setAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        this.accessibilityAssessment = value;
    }

    /**
     * Gets the value of the stopCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the stopCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutePointTypeEnumeration }
     * 
     * 
     */
    public List<RoutePointTypeEnumeration> getStopCondition() {
        if (stopCondition == null) {
            stopCondition = new ArrayList<RoutePointTypeEnumeration>();
        }
        return this.stopCondition;
    }

    /**
     * Ruft den Wert der connectionLinks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public AffectedStopPointStructure.ConnectionLinks getConnectionLinks() {
        return connectionLinks;
    }

    /**
     * Legt den Wert der connectionLinks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPointStructure.ConnectionLinks }
     *     
     */
    public void setConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        this.connectionLinks = value;
    }

    /**
     * Ruft den Wert der lines-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPointStructure.Lines }
     *     
     */
    public AffectedStopPointStructure.Lines getLines() {
        return lines;
    }

    /**
     * Legt den Wert der lines-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPointStructure.Lines }
     *     
     */
    public void setLines(AffectedStopPointStructure.Lines value) {
        this.lines = value;
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

    public AffectedStopPointStructure withStopPointRef(StopPointRefStructure value) {
        setStopPointRef(value);
        return this;
    }

    public AffectedStopPointStructure withPrivateRef(String value) {
        setPrivateRef(value);
        return this;
    }

    public AffectedStopPointStructure withStopPointName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPointName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withStopPointName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPointName().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withStopPointType(StopPointTypeEnumeration value) {
        setStopPointType(value);
        return this;
    }

    public AffectedStopPointStructure withLocation(LocationStructure value) {
        setLocation(value);
        return this;
    }

    public AffectedStopPointStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public AffectedStopPointStructure withStopPlaceName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getStopPlaceName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withStopPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getStopPlaceName().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withAffectedModes(AffectedModesStructure value) {
        setAffectedModes(value);
        return this;
    }

    public AffectedStopPointStructure withPlaceRef(ZoneRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public AffectedStopPointStructure withPlaceName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withPlaceName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
        return this;
    }

    public AffectedStopPointStructure withStopCondition(RoutePointTypeEnumeration... values) {
        if (values!= null) {
            for (RoutePointTypeEnumeration value: values) {
                getStopCondition().add(value);
            }
        }
        return this;
    }

    public AffectedStopPointStructure withStopCondition(Collection<RoutePointTypeEnumeration> values) {
        if (values!= null) {
            getStopCondition().addAll(values);
        }
        return this;
    }

    public AffectedStopPointStructure withConnectionLinks(AffectedStopPointStructure.ConnectionLinks value) {
        setConnectionLinks(value);
        return this;
    }

    public AffectedStopPointStructure withLines(AffectedStopPointStructure.Lines value) {
        setLines(value);
        return this;
    }

    public AffectedStopPointStructure withExtensions(ExtensionsStructure value) {
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
     *         &lt;element name="AffectedConnectionLink" type="{http://www.siri.org.uk/siri}AffectedConnectionLinkStructure" maxOccurs="unbounded"/&gt;
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
        "affectedConnectionLink"
    })
    public static class ConnectionLinks {

        @XmlElement(name = "AffectedConnectionLink", required = true)
        protected List<AffectedConnectionLinkStructure> affectedConnectionLink;

        /**
         * Gets the value of the affectedConnectionLink property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedConnectionLink property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedConnectionLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedConnectionLinkStructure }
         * 
         * 
         */
        public List<AffectedConnectionLinkStructure> getAffectedConnectionLink() {
            if (affectedConnectionLink == null) {
                affectedConnectionLink = new ArrayList<AffectedConnectionLinkStructure>();
            }
            return this.affectedConnectionLink;
        }

        public AffectedStopPointStructure.ConnectionLinks withAffectedConnectionLink(AffectedConnectionLinkStructure... values) {
            if (values!= null) {
                for (AffectedConnectionLinkStructure value: values) {
                    getAffectedConnectionLink().add(value);
                }
            }
            return this;
        }

        public AffectedStopPointStructure.ConnectionLinks withAffectedConnectionLink(Collection<AffectedConnectionLinkStructure> values) {
            if (values!= null) {
                getAffectedConnectionLink().addAll(values);
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
     * 
     * 
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
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
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
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedLineStructure }
         * 
         * 
         */
        public List<AffectedLineStructure> getAffectedLine() {
            if (affectedLine == null) {
                affectedLine = new ArrayList<AffectedLineStructure>();
            }
            return this.affectedLine;
        }

        public AffectedStopPointStructure.Lines withAffectedLine(AffectedLineStructure... values) {
            if (values!= null) {
                for (AffectedLineStructure value: values) {
                    getAffectedLine().add(value);
                }
            }
            return this;
        }

        public AffectedStopPointStructure.Lines withAffectedLine(Collection<AffectedLineStructure> values) {
            if (values!= null) {
                getAffectedLine().addAll(values);
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
