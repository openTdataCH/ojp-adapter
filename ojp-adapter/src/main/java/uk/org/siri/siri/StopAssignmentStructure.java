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
 * Type for assignment of a SCHEDULED STOP POINT to a physical location, in particular to a QUAY or BOARDING POSITION. (since SIRI 2.0).
 * 
 * <p>Java-Klasse für StopAssignmentStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopAssignmentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}QuayAssignmentGroup"/&gt;
 *           &lt;group ref="{http://www.siri.org.uk/siri}BoardingPositionAssignmentGroup"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}FlexibleStopLocationGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopAssignmentStructure", propOrder = {
    "aimedQuayRef",
    "aimedQuayName",
    "expectedQuayRef",
    "expectedQuayName",
    "actualQuayRef",
    "actualQuayName",
    "quayType",
    "aimedBoardingPositionRef",
    "aimedBoardingPositionName",
    "expectedBoardingPositionRef",
    "expectedBoardingPositionName",
    "actualBoardingPositionRef",
    "actualBoardingPositionName",
    "aimedFlexibleArea",
    "aimedFlexibleAreaRef",
    "aimedLocationName",
    "expectedFlexibleArea",
    "expectedFlexibleAreaRef",
    "expectedLocationName",
    "actualFlexibleArea",
    "actualFlexibleAreaRef",
    "actualLocationName"
})
public class StopAssignmentStructure {

    @XmlElement(name = "AimedQuayRef")
    protected QuayRefStructure aimedQuayRef;
    @XmlElement(name = "AimedQuayName")
    protected List<NaturalLanguageStringStructure> aimedQuayName;
    @XmlElement(name = "ExpectedQuayRef")
    protected QuayRefStructure expectedQuayRef;
    @XmlElement(name = "ExpectedQuayName")
    protected List<NaturalLanguageStringStructure> expectedQuayName;
    @XmlElement(name = "ActualQuayRef")
    protected QuayRefStructure actualQuayRef;
    @XmlElement(name = "ActualQuayName")
    protected List<NaturalLanguageStringStructure> actualQuayName;
    @XmlElement(name = "QuayType")
    @XmlSchemaType(name = "NMTOKEN")
    protected TypeOfNestedQuayEnumeration quayType;
    @XmlElement(name = "AimedBoardingPositionRef")
    protected BoardingPositionRefStructure aimedBoardingPositionRef;
    @XmlElement(name = "AimedBoardingPositionName")
    protected List<NaturalLanguageStringStructure> aimedBoardingPositionName;
    @XmlElement(name = "ExpectedBoardingPositionRef")
    protected BoardingPositionRefStructure expectedBoardingPositionRef;
    @XmlElement(name = "ExpectedBoardingPositionName")
    protected List<NaturalLanguageStringStructure> expectedBoardingPositionName;
    @XmlElement(name = "ActualBoardingPositionRef")
    protected BoardingPositionRefStructure actualBoardingPositionRef;
    @XmlElement(name = "ActualBoardingPositionName")
    protected List<NaturalLanguageStringStructure> actualBoardingPositionName;
    @XmlElement(name = "AimedFlexibleArea")
    protected FlexibleAreaStructure aimedFlexibleArea;
    @XmlElement(name = "AimedFlexibleAreaRef")
    protected FlexibleAreaRefStructure aimedFlexibleAreaRef;
    @XmlElement(name = "AimedLocationName")
    protected List<NaturalLanguageStringStructure> aimedLocationName;
    @XmlElement(name = "ExpectedFlexibleArea")
    protected FlexibleAreaStructure expectedFlexibleArea;
    @XmlElement(name = "ExpectedFlexibleAreaRef")
    protected FlexibleAreaRefStructure expectedFlexibleAreaRef;
    @XmlElement(name = "ExpectedLocationName")
    protected List<NaturalLanguageStringStructure> expectedLocationName;
    @XmlElement(name = "ActualFlexibleArea")
    protected FlexibleAreaStructure actualFlexibleArea;
    @XmlElement(name = "ActualFlexibleAreaRef")
    protected FlexibleAreaRefStructure actualFlexibleAreaRef;
    @XmlElement(name = "ActualLocationName")
    protected List<NaturalLanguageStringStructure> actualLocationName;

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
     * Ruft den Wert der expectedQuayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getExpectedQuayRef() {
        return expectedQuayRef;
    }

    /**
     * Legt den Wert der expectedQuayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setExpectedQuayRef(QuayRefStructure value) {
        this.expectedQuayRef = value;
    }

    /**
     * Gets the value of the expectedQuayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedQuayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedQuayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getExpectedQuayName() {
        if (expectedQuayName == null) {
            expectedQuayName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.expectedQuayName;
    }

    /**
     * Ruft den Wert der actualQuayRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuayRefStructure }
     *     
     */
    public QuayRefStructure getActualQuayRef() {
        return actualQuayRef;
    }

    /**
     * Legt den Wert der actualQuayRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuayRefStructure }
     *     
     */
    public void setActualQuayRef(QuayRefStructure value) {
        this.actualQuayRef = value;
    }

    /**
     * Gets the value of the actualQuayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actualQuayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualQuayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getActualQuayName() {
        if (actualQuayName == null) {
            actualQuayName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.actualQuayName;
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
     * Ruft den Wert der expectedBoardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getExpectedBoardingPositionRef() {
        return expectedBoardingPositionRef;
    }

    /**
     * Legt den Wert der expectedBoardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setExpectedBoardingPositionRef(BoardingPositionRefStructure value) {
        this.expectedBoardingPositionRef = value;
    }

    /**
     * Gets the value of the expectedBoardingPositionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedBoardingPositionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedBoardingPositionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getExpectedBoardingPositionName() {
        if (expectedBoardingPositionName == null) {
            expectedBoardingPositionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.expectedBoardingPositionName;
    }

    /**
     * Ruft den Wert der actualBoardingPositionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public BoardingPositionRefStructure getActualBoardingPositionRef() {
        return actualBoardingPositionRef;
    }

    /**
     * Legt den Wert der actualBoardingPositionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingPositionRefStructure }
     *     
     */
    public void setActualBoardingPositionRef(BoardingPositionRefStructure value) {
        this.actualBoardingPositionRef = value;
    }

    /**
     * Gets the value of the actualBoardingPositionName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actualBoardingPositionName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualBoardingPositionName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getActualBoardingPositionName() {
        if (actualBoardingPositionName == null) {
            actualBoardingPositionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.actualBoardingPositionName;
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

    /**
     * Ruft den Wert der expectedFlexibleArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public FlexibleAreaStructure getExpectedFlexibleArea() {
        return expectedFlexibleArea;
    }

    /**
     * Legt den Wert der expectedFlexibleArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public void setExpectedFlexibleArea(FlexibleAreaStructure value) {
        this.expectedFlexibleArea = value;
    }

    /**
     * Ruft den Wert der expectedFlexibleAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public FlexibleAreaRefStructure getExpectedFlexibleAreaRef() {
        return expectedFlexibleAreaRef;
    }

    /**
     * Legt den Wert der expectedFlexibleAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public void setExpectedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        this.expectedFlexibleAreaRef = value;
    }

    /**
     * Gets the value of the expectedLocationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the expectedLocationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpectedLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getExpectedLocationName() {
        if (expectedLocationName == null) {
            expectedLocationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.expectedLocationName;
    }

    /**
     * Ruft den Wert der actualFlexibleArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public FlexibleAreaStructure getActualFlexibleArea() {
        return actualFlexibleArea;
    }

    /**
     * Legt den Wert der actualFlexibleArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaStructure }
     *     
     */
    public void setActualFlexibleArea(FlexibleAreaStructure value) {
        this.actualFlexibleArea = value;
    }

    /**
     * Ruft den Wert der actualFlexibleAreaRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public FlexibleAreaRefStructure getActualFlexibleAreaRef() {
        return actualFlexibleAreaRef;
    }

    /**
     * Legt den Wert der actualFlexibleAreaRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexibleAreaRefStructure }
     *     
     */
    public void setActualFlexibleAreaRef(FlexibleAreaRefStructure value) {
        this.actualFlexibleAreaRef = value;
    }

    /**
     * Gets the value of the actualLocationName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the actualLocationName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualLocationName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getActualLocationName() {
        if (actualLocationName == null) {
            actualLocationName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.actualLocationName;
    }

    public StopAssignmentStructure withAimedQuayRef(QuayRefStructure value) {
        setAimedQuayRef(value);
        return this;
    }

    public StopAssignmentStructure withAimedQuayName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedQuayName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withAimedQuayName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedQuayName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withExpectedQuayRef(QuayRefStructure value) {
        setExpectedQuayRef(value);
        return this;
    }

    public StopAssignmentStructure withExpectedQuayName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getExpectedQuayName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withExpectedQuayName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getExpectedQuayName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withActualQuayRef(QuayRefStructure value) {
        setActualQuayRef(value);
        return this;
    }

    public StopAssignmentStructure withActualQuayName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getActualQuayName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withActualQuayName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getActualQuayName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withQuayType(TypeOfNestedQuayEnumeration value) {
        setQuayType(value);
        return this;
    }

    public StopAssignmentStructure withAimedBoardingPositionRef(BoardingPositionRefStructure value) {
        setAimedBoardingPositionRef(value);
        return this;
    }

    public StopAssignmentStructure withAimedBoardingPositionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedBoardingPositionName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withAimedBoardingPositionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedBoardingPositionName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withExpectedBoardingPositionRef(BoardingPositionRefStructure value) {
        setExpectedBoardingPositionRef(value);
        return this;
    }

    public StopAssignmentStructure withExpectedBoardingPositionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getExpectedBoardingPositionName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withExpectedBoardingPositionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getExpectedBoardingPositionName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withActualBoardingPositionRef(BoardingPositionRefStructure value) {
        setActualBoardingPositionRef(value);
        return this;
    }

    public StopAssignmentStructure withActualBoardingPositionName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getActualBoardingPositionName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withActualBoardingPositionName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getActualBoardingPositionName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withAimedFlexibleArea(FlexibleAreaStructure value) {
        setAimedFlexibleArea(value);
        return this;
    }

    public StopAssignmentStructure withAimedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        setAimedFlexibleAreaRef(value);
        return this;
    }

    public StopAssignmentStructure withAimedLocationName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getAimedLocationName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withAimedLocationName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getAimedLocationName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withExpectedFlexibleArea(FlexibleAreaStructure value) {
        setExpectedFlexibleArea(value);
        return this;
    }

    public StopAssignmentStructure withExpectedFlexibleAreaRef(FlexibleAreaRefStructure value) {
        setExpectedFlexibleAreaRef(value);
        return this;
    }

    public StopAssignmentStructure withExpectedLocationName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getExpectedLocationName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withExpectedLocationName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getExpectedLocationName().addAll(values);
        }
        return this;
    }

    public StopAssignmentStructure withActualFlexibleArea(FlexibleAreaStructure value) {
        setActualFlexibleArea(value);
        return this;
    }

    public StopAssignmentStructure withActualFlexibleAreaRef(FlexibleAreaRefStructure value) {
        setActualFlexibleAreaRef(value);
        return this;
    }

    public StopAssignmentStructure withActualLocationName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getActualLocationName().add(value);
            }
        }
        return this;
    }

    public StopAssignmentStructure withActualLocationName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getActualLocationName().addAll(values);
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
