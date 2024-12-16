//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.math.BigInteger;
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
 * [TMv6] a link within a PLACE of or between two PLACEs (that is STOP PLACEs, ACCESS SPACEs or QUAYs, BOARDING POSITIONs, POINTs OF INTEREST etc. or PATH JUNCTIONs) that represents a step in a possible route for pedestrians, cyclists, or other out-of-vehicle passengers within or between a PLACE. Here we use a reduced form of a PATH LINK containing the description of the type of accessibility on this navigation section.
 * 
 * <p>Java-Klasse für PathLinkStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathLinkStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transition" type="{http://www.vdv.de/ojp}TransitionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureType" type="{http://www.vdv.de/ojp}AccessFeatureTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureStatus" type="{http://www.vdv.de/ojp}AccessFeatureStatusEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AccessFeatureStatusText" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="AccessibilityFeature" type="{http://www.vdv.de/ojp}AccessibilityFeatureTypesEnumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}SituationFullRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="From" type="{http://www.vdv.de/ojp}PathLinkEndStructure" minOccurs="0"/&gt;
 *         &lt;element name="To" type="{http://www.vdv.de/ojp}PathLinkEndStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathLinkStructure", propOrder = {
    "transition",
    "accessFeatureType",
    "count",
    "accessFeatureStatus",
    "accessFeatureStatusText",
    "accessibilityFeature",
    "situationFullRef",
    "from",
    "to"
})
public class PathLinkStructure {

    @XmlElement(name = "Transition")
    @XmlSchemaType(name = "string")
    protected TransitionEnumeration transition;
    @XmlElement(name = "AccessFeatureType")
    @XmlSchemaType(name = "string")
    protected AccessFeatureTypeEnumeration accessFeatureType;
    @XmlElement(name = "Count")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger count;
    @XmlElement(name = "AccessFeatureStatus")
    @XmlSchemaType(name = "string")
    protected AccessFeatureStatusEnumeration accessFeatureStatus;
    @XmlElement(name = "AccessFeatureStatusText")
    protected InternationalTextStructure accessFeatureStatusText;
    @XmlElement(name = "AccessibilityFeature")
    @XmlSchemaType(name = "string")
    protected List<AccessibilityFeatureTypesEnumeration> accessibilityFeature;
    @XmlElement(name = "SituationFullRef")
    protected List<SituationFullRefStructure> situationFullRef;
    @XmlElement(name = "From")
    protected PathLinkEndStructure from;
    @XmlElement(name = "To")
    protected PathLinkEndStructure to;

    /**
     * Ruft den Wert der transition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TransitionEnumeration }
     *     
     */
    public TransitionEnumeration getTransition() {
        return transition;
    }

    /**
     * Legt den Wert der transition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionEnumeration }
     *     
     */
    public void setTransition(TransitionEnumeration value) {
        this.transition = value;
    }

    /**
     * Ruft den Wert der accessFeatureType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureTypeEnumeration }
     *     
     */
    public AccessFeatureTypeEnumeration getAccessFeatureType() {
        return accessFeatureType;
    }

    /**
     * Legt den Wert der accessFeatureType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureTypeEnumeration }
     *     
     */
    public void setAccessFeatureType(AccessFeatureTypeEnumeration value) {
        this.accessFeatureType = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCount() {
        return count;
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCount(BigInteger value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der accessFeatureStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AccessFeatureStatusEnumeration }
     *     
     */
    public AccessFeatureStatusEnumeration getAccessFeatureStatus() {
        return accessFeatureStatus;
    }

    /**
     * Legt den Wert der accessFeatureStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessFeatureStatusEnumeration }
     *     
     */
    public void setAccessFeatureStatus(AccessFeatureStatusEnumeration value) {
        this.accessFeatureStatus = value;
    }

    /**
     * Ruft den Wert der accessFeatureStatusText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getAccessFeatureStatusText() {
        return accessFeatureStatusText;
    }

    /**
     * Legt den Wert der accessFeatureStatusText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setAccessFeatureStatusText(InternationalTextStructure value) {
        this.accessFeatureStatusText = value;
    }

    /**
     * Gets the value of the accessibilityFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilityFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilityFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessibilityFeatureTypesEnumeration }
     * 
     * 
     */
    public List<AccessibilityFeatureTypesEnumeration> getAccessibilityFeature() {
        if (accessibilityFeature == null) {
            accessibilityFeature = new ArrayList<AccessibilityFeatureTypesEnumeration>();
        }
        return this.accessibilityFeature;
    }

    /**
     * Reference to a situation that affects the availability of the access feature.Gets the value of the situationFullRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the situationFullRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationFullRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituationFullRefStructure }
     * 
     * 
     */
    public List<SituationFullRefStructure> getSituationFullRef() {
        if (situationFullRef == null) {
            situationFullRef = new ArrayList<SituationFullRefStructure>();
        }
        return this.situationFullRef;
    }

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinkEndStructure }
     *     
     */
    public PathLinkEndStructure getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinkEndStructure }
     *     
     */
    public void setFrom(PathLinkEndStructure value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinkEndStructure }
     *     
     */
    public PathLinkEndStructure getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinkEndStructure }
     *     
     */
    public void setTo(PathLinkEndStructure value) {
        this.to = value;
    }

    public PathLinkStructure withTransition(TransitionEnumeration value) {
        setTransition(value);
        return this;
    }

    public PathLinkStructure withAccessFeatureType(AccessFeatureTypeEnumeration value) {
        setAccessFeatureType(value);
        return this;
    }

    public PathLinkStructure withCount(BigInteger value) {
        setCount(value);
        return this;
    }

    public PathLinkStructure withAccessFeatureStatus(AccessFeatureStatusEnumeration value) {
        setAccessFeatureStatus(value);
        return this;
    }

    public PathLinkStructure withAccessFeatureStatusText(InternationalTextStructure value) {
        setAccessFeatureStatusText(value);
        return this;
    }

    public PathLinkStructure withAccessibilityFeature(AccessibilityFeatureTypesEnumeration... values) {
        if (values!= null) {
            for (AccessibilityFeatureTypesEnumeration value: values) {
                getAccessibilityFeature().add(value);
            }
        }
        return this;
    }

    public PathLinkStructure withAccessibilityFeature(Collection<AccessibilityFeatureTypesEnumeration> values) {
        if (values!= null) {
            getAccessibilityFeature().addAll(values);
        }
        return this;
    }

    public PathLinkStructure withSituationFullRef(SituationFullRefStructure... values) {
        if (values!= null) {
            for (SituationFullRefStructure value: values) {
                getSituationFullRef().add(value);
            }
        }
        return this;
    }

    public PathLinkStructure withSituationFullRef(Collection<SituationFullRefStructure> values) {
        if (values!= null) {
            getSituationFullRef().addAll(values);
        }
        return this;
    }

    public PathLinkStructure withFrom(PathLinkEndStructure value) {
        setFrom(value);
        return this;
    }

    public PathLinkStructure withTo(PathLinkEndStructure value) {
        setTo(value);
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
