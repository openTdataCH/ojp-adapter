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
import uk.org.ifopt.acsb.AccessibilityAssessmentStructure;
import uk.org.ifopt.ifopt.LinkProjectionStructure;
import uk.org.ifopt.ifopt.PointProjectionStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentRefStructure;
import uk.org.ifopt.ifopt.StopPlaceComponentTypeEnumeration;
import uk.org.ifopt.ifopt.ZoneProjectionStructure;


/**
 * Type for information about the quays affected by an SITUATION.
 * 
 * <p>Java-Klasse für AffectedStopPlaceComponentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedStopPlaceComponentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AffectedStopPlaceElementStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentRef" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentRefStructure"/&gt;
 *         &lt;element name="ComponentName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ComponentType" type="{http://www.ifopt.org.uk/ifopt}StopPlaceComponentTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.ifopt.org.uk/ifopt}PlaceProjectionGroup" minOccurs="0"/&gt;
 *         &lt;element name="Offset" type="{http://www.siri.org.uk/siri}OffsetStructure" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureType" type="{http://www.siri.org.uk/siri}AccessibilityFeatureEnumeration" minOccurs="0"/&gt;
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
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedStopPlaceComponentStructure", propOrder = {
    "componentRef",
    "componentName",
    "componentType",
    "pointProjection",
    "linkProjection",
    "zoneProjection",
    "offset",
    "accessFeatureType",
    "affectedFacilities",
    "extensions"
})
public class AffectedStopPlaceComponentStructure
    extends AffectedStopPlaceElementStructure
{

    @XmlElement(name = "ComponentRef", required = true)
    protected StopPlaceComponentRefStructure componentRef;
    @XmlElement(name = "ComponentName")
    protected List<NaturalLanguageStringStructure> componentName;
    @XmlElement(name = "ComponentType")
    @XmlSchemaType(name = "string")
    protected StopPlaceComponentTypeEnumeration componentType;
    @XmlElement(name = "PointProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected PointProjectionStructure pointProjection;
    @XmlElement(name = "LinkProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected LinkProjectionStructure linkProjection;
    @XmlElement(name = "ZoneProjection", namespace = "http://www.ifopt.org.uk/ifopt")
    protected ZoneProjectionStructure zoneProjection;
    @XmlElement(name = "Offset")
    protected OffsetStructure offset;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessibilityFeatureEnumeration accessFeatureType;
    @XmlElement(name = "AffectedFacilities")
    protected AffectedStopPlaceComponentStructure.AffectedFacilities affectedFacilities;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der componentRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public StopPlaceComponentRefStructure getComponentRef() {
        return componentRef;
    }

    /**
     * Legt den Wert der componentRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentRefStructure }
     *     
     */
    public void setComponentRef(StopPlaceComponentRefStructure value) {
        this.componentRef = value;
    }

    /**
     * Gets the value of the componentName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the componentName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getComponentName() {
        if (componentName == null) {
            componentName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.componentName;
    }

    /**
     * Ruft den Wert der componentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public StopPlaceComponentTypeEnumeration getComponentType() {
        return componentType;
    }

    /**
     * Legt den Wert der componentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StopPlaceComponentTypeEnumeration }
     *     
     */
    public void setComponentType(StopPlaceComponentTypeEnumeration value) {
        this.componentType = value;
    }

    /**
     * Ruft den Wert der pointProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointProjectionStructure }
     *     
     */
    public PointProjectionStructure getPointProjection() {
        return pointProjection;
    }

    /**
     * Legt den Wert der pointProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointProjectionStructure }
     *     
     */
    public void setPointProjection(PointProjectionStructure value) {
        this.pointProjection = value;
    }

    /**
     * Ruft den Wert der linkProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public LinkProjectionStructure getLinkProjection() {
        return linkProjection;
    }

    /**
     * Legt den Wert der linkProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkProjectionStructure }
     *     
     */
    public void setLinkProjection(LinkProjectionStructure value) {
        this.linkProjection = value;
    }

    /**
     * Ruft den Wert der zoneProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public ZoneProjectionStructure getZoneProjection() {
        return zoneProjection;
    }

    /**
     * Legt den Wert der zoneProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ZoneProjectionStructure }
     *     
     */
    public void setZoneProjection(ZoneProjectionStructure value) {
        this.zoneProjection = value;
    }

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OffsetStructure }
     *     
     */
    public OffsetStructure getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OffsetStructure }
     *     
     */
    public void setOffset(OffsetStructure value) {
        this.offset = value;
    }

    /**
     * Ruft den Wert der accessFeatureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public AccessibilityFeatureEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Legt den Wert der accessFeatureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessibilityFeatureEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessibilityFeatureEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Ruft den Wert der affectedFacilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public AffectedStopPlaceComponentStructure.AffectedFacilities getAffectedFacilities() {
        return affectedFacilities;
    }

    /**
     * Legt den Wert der affectedFacilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedStopPlaceComponentStructure.AffectedFacilities }
     *     
     */
    public void setAffectedFacilities(AffectedStopPlaceComponentStructure.AffectedFacilities value) {
        this.affectedFacilities = value;
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

    public AffectedStopPlaceComponentStructure withComponentRef(StopPlaceComponentRefStructure value) {
        setComponentRef(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getComponentName().add(value);
            }
        }
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getComponentName().addAll(values);
        }
        return this;
    }

    public AffectedStopPlaceComponentStructure withComponentType(StopPlaceComponentTypeEnumeration value) {
        setComponentType(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withPointProjection(PointProjectionStructure value) {
        setPointProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withLinkProjection(LinkProjectionStructure value) {
        setLinkProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withZoneProjection(ZoneProjectionStructure value) {
        setZoneProjection(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withOffset(OffsetStructure value) {
        setOffset(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withAccessFeatureType(AccessibilityFeatureEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withAffectedFacilities(AffectedStopPlaceComponentStructure.AffectedFacilities value) {
        setAffectedFacilities(value);
        return this;
    }

    public AffectedStopPlaceComponentStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public AffectedStopPlaceComponentStructure withAccessibilityAssessment(AccessibilityAssessmentStructure value) {
        setAccessibilityAssessment(value);
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
     *         &lt;element name="AffectedFacility" type="{http://www.siri.org.uk/siri}AffectedFacilityStructure" maxOccurs="unbounded"/&gt;
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
        "affectedFacility"
    })
    public static class AffectedFacilities {

        @XmlElement(name = "AffectedFacility", required = true)
        protected List<AffectedFacilityStructure> affectedFacility;

        /**
         * Gets the value of the affectedFacility property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
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
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedFacilityStructure }
         * 
         * 
         */
        public List<AffectedFacilityStructure> getAffectedFacility() {
            if (affectedFacility == null) {
                affectedFacility = new ArrayList<AffectedFacilityStructure>();
            }
            return this.affectedFacility;
        }

        public AffectedStopPlaceComponentStructure.AffectedFacilities withAffectedFacility(AffectedFacilityStructure... values) {
            if (values!= null) {
                for (AffectedFacilityStructure value: values) {
                    getAffectedFacility().add(value);
                }
            }
            return this;
        }

        public AffectedStopPlaceComponentStructure.AffectedFacilities withAffectedFacility(Collection<AffectedFacilityStructure> values) {
            if (values!= null) {
                getAffectedFacility().addAll(values);
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
