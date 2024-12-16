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


/**
 * Type for assignment of a SCHEDULED STOP POINT to a physical location, in particular to a QUAY or BOARDING POSITION, according to the planned timetable. (since SIRI 2.0).
 * 
 * <p>Java-Klasse für PlannedStopAssignmentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PlannedStopAssignmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AimedQuayRef" type="{http://www.siri.org.uk/siri}QuayRefStructure" minOccurs="0"/&gt;
 *             &lt;element name="AimedQuayName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *             &lt;element ref="{http://www.siri.org.uk/siri}QuayType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="AimedBoardingPositionRef" type="{http://www.siri.org.uk/siri}BoardingPositionRefStructure" minOccurs="0"/&gt;
 *             &lt;element name="AimedBoardingPositionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedFlexibleArea" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedFlexibleAreaRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}AimedLocationName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedStopAssignmentStructure", propOrder = {
    "aimedQuayRef",
    "aimedQuayName",
    "quayType",
    "aimedBoardingPositionRef",
    "aimedBoardingPositionName",
    "aimedFlexibleArea",
    "aimedFlexibleAreaRef",
    "aimedLocationName"
})
public class PlannedStopAssignmentStructure {

    @XmlElement(name = "AimedQuayRef")
    protected QuayRefStructure aimedQuayRef;
    @XmlElement(name = "AimedQuayName")
    protected List<NaturalLanguageStringStructure> aimedQuayName;
    @XmlElement(name = "QuayType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfNestedQuayEnumeration quayType;
    @XmlElement(name = "AimedBoardingPositionRef")
    protected BoardingPositionRefStructure aimedBoardingPositionRef;
    @XmlElement(name = "AimedBoardingPositionName")
    protected List<NaturalLanguageStringStructure> aimedBoardingPositionName;
    @XmlElement(name = "AimedFlexibleArea")
    protected FlexibleAreaStructure aimedFlexibleArea;
    @XmlElement(name = "AimedFlexibleAreaRef")
    protected FlexibleAreaRefStructure aimedFlexibleAreaRef;
    @XmlElement(name = "AimedLocationName")
    protected List<NaturalLanguageStringStructure> aimedLocationName;

    /**
     * Ruft den Wert der aimedQuayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getAimedQuayRef() {
        return aimedQuayRef;
    }

    /**
     * Legt den Wert der aimedQuayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setAimedQuayRef(QuayRefStructure value) {
        this.aimedQuayRef = value;
    }

    /**
     * Gets the value of the aimedQuayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aimedQuayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAimedQuayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getAimedQuayName() {
        if (aimedQuayName == null) {
            aimedQuayName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.aimedQuayName;
    }

    /**
     * Ruft den Wert der quayType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfNestedQuayEnumeration }
     *     
     */
    public TypeOfNestedQuayEnumeration getQuayType() {
        return quayType;
    }

    /**
     * Legt den Wert der quayType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfNestedQuayEnumeration }
     *     
     */
    public void setQuayType(TypeOfNestedQuayEnumeration value) {
        this.quayType = value;
    }

    /**
     * Ruft den Wert der aimedBoardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getAimedBoardingPositionRef() {
        return aimedBoardingPositionRef;
    }

    /**
     * Legt den Wert der aimedBoardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setAimedBoardingPositionRef(BoardingPositionRefStructure value) {
        this.aimedBoardingPositionRef = value;
    }

    /**
     * Gets the value of the aimedBoardingPositionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aimedBoardingPositionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAimedBoardingPositionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getAimedBoardingPositionName() {
        if (aimedBoardingPositionName == null) {
            aimedBoardingPositionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.aimedBoardingPositionName;
    }

    /**
     * Ruft den Wert der aimedFlexibleArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public FlexibleAreaStructure getAimedFlexibleArea() {
        return aimedFlexibleArea;
    }

    /**
     * Legt den Wert der aimedFlexibleArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public void setAimedFlexibleArea(FlexibleAreaStructure value) {
        this.aimedFlexibleArea = value;
    }

    /**
     * Ruft den Wert der aimedFlexibleAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public FlexibleAreaRefStructure getAimedFlexibleAreaRef() {
        return aimedFlexibleAreaRef;
    }

    /**
     * Legt den Wert der aimedFlexibleAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public void setAimedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        this.aimedFlexibleAreaRef = value;
    }

    /**
     * Gets the value of the aimedLocationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aimedLocationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAimedLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getAimedLocationName() {
        if (aimedLocationName == null) {
            aimedLocationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.aimedLocationName;
    }

    public PlannedStopAssignmentStructure withAimedQuayRef(QuayRefStructure value) {
        setAimedQuayRef(value);
        return this;
    }

    public PlannedStopAssignmentStructure withAimedQuayName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedQuayName().add(value);
            }
        }
        return this;
    }

    public PlannedStopAssignmentStructure withAimedQuayName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedQuayName().addAll(values);
        }
        return this;
    }

    public PlannedStopAssignmentStructure withQuayType(TypeOfNestedQuayEnumeration value) {
        setQuayType(value);
        return this;
    }

    public PlannedStopAssignmentStructure withAimedBoardingPositionRef(BoardingPositionRefStructure value) {
        setAimedBoardingPositionRef(value);
        return this;
    }

    public PlannedStopAssignmentStructure withAimedBoardingPositionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedBoardingPositionName().add(value);
            }
        }
        return this;
    }

    public PlannedStopAssignmentStructure withAimedBoardingPositionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedBoardingPositionName().addAll(values);
        }
        return this;
    }

    public PlannedStopAssignmentStructure withAimedFlexibleArea(FlexibleAreaStructure value) {
        setAimedFlexibleArea(value);
        return this;
    }

    public PlannedStopAssignmentStructure withAimedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        setAimedFlexibleAreaRef(value);
        return this;
    }

    public PlannedStopAssignmentStructure withAimedLocationName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedLocationName().add(value);
            }
        }
        return this;
    }

    public PlannedStopAssignmentStructure withAimedLocationName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedLocationName().addAll(values);
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
