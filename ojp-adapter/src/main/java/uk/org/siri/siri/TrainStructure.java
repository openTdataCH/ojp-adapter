//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for TRAIN. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für TrainStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TrainStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrainCode" type="{http://www.siri.org.uk/siri}TrainCodeType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleTypeGroup"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}TrainGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainStructure", propOrder = {
    "trainCode",
    "name",
    "shortName",
    "description",
    "privateCode",
    "reversingDirection",
    "selfPropelled",
    "typeOfFuel",
    "euroClass",
    "maximumPassengerCapacities",
    "lowFloor",
    "hasLiftOrRamp",
    "hasHoist",
    "length",
    "width",
    "height",
    "weight",
    "facilities",
    "numberOfCars",
    "trainSizeType",
    "trainComponents"
})
public class TrainStructure {

    @XmlElement(name = "TrainCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String trainCode;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "ShortName")
    protected NaturalLanguageStringStructure shortName;
    @XmlElement(name = "Description")
    protected NaturalLanguageStringStructure description;
    @XmlElement(name = "PrivateCode")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String privateCode;
    @XmlElement(name = "ReversingDirection", defaultValue = "true")
    protected Boolean reversingDirection;
    @XmlElement(name = "SelfPropelled", defaultValue = "true")
    protected Boolean selfPropelled;
    @XmlElement(name = "TypeOfFuel")
    @XmlSchemaType(name = "normalizedString")
    protected TypeOfFuelEnumeration typeOfFuel;
    @XmlElement(name = "EuroClass")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String euroClass;
    @XmlElement(name = "MaximumPassengerCapacities")
    protected uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities maximumPassengerCapacities;
    @XmlElement(name = "LowFloor")
    protected Boolean lowFloor;
    @XmlElement(name = "HasLiftOrRamp")
    protected Boolean hasLiftOrRamp;
    @XmlElement(name = "HasHoist")
    protected Boolean hasHoist;
    @XmlElement(name = "Length")
    protected BigDecimal length;
    @XmlElement(name = "Width")
    protected BigDecimal width;
    @XmlElement(name = "Height")
    protected BigDecimal height;
    @XmlElement(name = "Weight")
    protected BigDecimal weight;
    @XmlElement(name = "Facilities")
    protected uk.org.siri.siri.CompoundTrainStructure.Facilities facilities;
    @XmlElement(name = "NumberOfCars")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfCars;
    @XmlElement(name = "TrainSizeType", defaultValue = "normal")
    @XmlSchemaType(name = "NMTOKEN")
    protected TrainSizeEnumeration trainSizeType;
    @XmlElement(name = "TrainComponents")
    protected TrainStructure.TrainComponents trainComponents;

    /**
     * Ruft den Wert der trainCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrainCode() {
        return trainCode;
    }

    /**
     * Legt den Wert der trainCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrainCode(String value) {
        this.trainCode = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der shortName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getShortName() {
        return shortName;
    }

    /**
     * Legt den Wert der shortName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setShortName(NaturalLanguageStringStructure value) {
        this.shortName = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setDescription(NaturalLanguageStringStructure value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der privateCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der reversingDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReversingDirection() {
        return reversingDirection;
    }

    /**
     * Legt den Wert der reversingDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReversingDirection(Boolean value) {
        this.reversingDirection = value;
    }

    /**
     * Ruft den Wert der selfPropelled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * Legt den Wert der selfPropelled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelfPropelled(Boolean value) {
        this.selfPropelled = value;
    }

    /**
     * Ruft den Wert der typeOfFuel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public TypeOfFuelEnumeration getTypeOfFuel() {
        return typeOfFuel;
    }

    /**
     * Legt den Wert der typeOfFuel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFuelEnumeration }
     *     
     */
    public void setTypeOfFuel(TypeOfFuelEnumeration value) {
        this.typeOfFuel = value;
    }

    /**
     * Ruft den Wert der euroClass-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuroClass() {
        return euroClass;
    }

    /**
     * Legt den Wert der euroClass-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuroClass(String value) {
        this.euroClass = value;
    }

    /**
     * Ruft den Wert der maximumPassengerCapacities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities }
     *     
     */
    public uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities getMaximumPassengerCapacities() {
        return maximumPassengerCapacities;
    }

    /**
     * Legt den Wert der maximumPassengerCapacities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities }
     *     
     */
    public void setMaximumPassengerCapacities(uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities value) {
        this.maximumPassengerCapacities = value;
    }

    /**
     * Ruft den Wert der lowFloor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLowFloor() {
        return lowFloor;
    }

    /**
     * Legt den Wert der lowFloor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLowFloor(Boolean value) {
        this.lowFloor = value;
    }

    /**
     * Ruft den Wert der hasLiftOrRamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLiftOrRamp() {
        return hasLiftOrRamp;
    }

    /**
     * Legt den Wert der hasLiftOrRamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLiftOrRamp(Boolean value) {
        this.hasLiftOrRamp = value;
    }

    /**
     * Ruft den Wert der hasHoist-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasHoist() {
        return hasHoist;
    }

    /**
     * Legt den Wert der hasHoist-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasHoist(Boolean value) {
        this.hasHoist = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLength(BigDecimal value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWidth(BigDecimal value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHeight(BigDecimal value) {
        this.height = value;
    }

    /**
     * Ruft den Wert der weight-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * Legt den Wert der weight-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeight(BigDecimal value) {
        this.weight = value;
    }

    /**
     * Ruft den Wert der facilities-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link uk.org.siri.siri.CompoundTrainStructure.Facilities }
     *     
     */
    public uk.org.siri.siri.CompoundTrainStructure.Facilities getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link uk.org.siri.siri.CompoundTrainStructure.Facilities }
     *     
     */
    public void setFacilities(uk.org.siri.siri.CompoundTrainStructure.Facilities value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der numberOfCars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfCars() {
        return numberOfCars;
    }

    /**
     * Legt den Wert der numberOfCars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfCars(BigInteger value) {
        this.numberOfCars = value;
    }

    /**
     * Ruft den Wert der trainSizeType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public TrainSizeEnumeration getTrainSizeType() {
        return trainSizeType;
    }

    /**
     * Legt den Wert der trainSizeType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainSizeEnumeration }
     *     
     */
    public void setTrainSizeType(TrainSizeEnumeration value) {
        this.trainSizeType = value;
    }

    /**
     * Ruft den Wert der trainComponents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrainStructure.TrainComponents }
     *     
     */
    public TrainStructure.TrainComponents getTrainComponents() {
        return trainComponents;
    }

    /**
     * Legt den Wert der trainComponents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainStructure.TrainComponents }
     *     
     */
    public void setTrainComponents(TrainStructure.TrainComponents value) {
        this.trainComponents = value;
    }

    public TrainStructure withTrainCode(String value) {
        setTrainCode(value);
        return this;
    }

    public TrainStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public TrainStructure withShortName(NaturalLanguageStringStructure value) {
        setShortName(value);
        return this;
    }

    public TrainStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public TrainStructure withPrivateCode(String value) {
        setPrivateCode(value);
        return this;
    }

    public TrainStructure withReversingDirection(Boolean value) {
        setReversingDirection(value);
        return this;
    }

    public TrainStructure withSelfPropelled(Boolean value) {
        setSelfPropelled(value);
        return this;
    }

    public TrainStructure withTypeOfFuel(TypeOfFuelEnumeration value) {
        setTypeOfFuel(value);
        return this;
    }

    public TrainStructure withEuroClass(String value) {
        setEuroClass(value);
        return this;
    }

    public TrainStructure withMaximumPassengerCapacities(uk.org.siri.siri.CompoundTrainStructure.MaximumPassengerCapacities value) {
        setMaximumPassengerCapacities(value);
        return this;
    }

    public TrainStructure withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    public TrainStructure withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    public TrainStructure withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    public TrainStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    public TrainStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    public TrainStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    public TrainStructure withWeight(BigDecimal value) {
        setWeight(value);
        return this;
    }

    public TrainStructure withFacilities(uk.org.siri.siri.CompoundTrainStructure.Facilities value) {
        setFacilities(value);
        return this;
    }

    public TrainStructure withNumberOfCars(BigInteger value) {
        setNumberOfCars(value);
        return this;
    }

    public TrainStructure withTrainSizeType(TrainSizeEnumeration value) {
        setTrainSizeType(value);
        return this;
    }

    public TrainStructure withTrainComponents(TrainStructure.TrainComponents value) {
        setTrainComponents(value);
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainComponentRef"/&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainComponent"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainComponentRefOrTrainComponent"
    })
    public static class TrainComponents {

        @XmlElements({
            @XmlElement(name = "TrainComponentRef", type = TrainComponentRefStructure.class),
            @XmlElement(name = "TrainComponent", type = TrainComponentStructure.class)
        })
        protected List<Object> trainComponentRefOrTrainComponent;

        /**
         * Gets the value of the trainComponentRefOrTrainComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainComponentRefOrTrainComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainComponentRefOrTrainComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrainComponentRefStructure }
         * {@link TrainComponentStructure }
         * 
         * 
         */
        public List<Object> getTrainComponentRefOrTrainComponent() {
            if (trainComponentRefOrTrainComponent == null) {
                trainComponentRefOrTrainComponent = new ArrayList<Object>();
            }
            return this.trainComponentRefOrTrainComponent;
        }

        public TrainStructure.TrainComponents withTrainComponentRefOrTrainComponent(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getTrainComponentRefOrTrainComponent().add(value);
                }
            }
            return this;
        }

        public TrainStructure.TrainComponents withTrainComponentRefOrTrainComponent(Collection<Object> values) {
            if (values!= null) {
                getTrainComponentRefOrTrainComponent().addAll(values);
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
