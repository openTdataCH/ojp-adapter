//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigDecimal;
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
 * Type for COMPOUND TRAIN. (since SIRI 2.1)
 * 
 * <p>Java-Klasse für CompoundTrainStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CompoundTrainStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompoundTrainCode" type="{http://www.siri.org.uk/siri}CompoundTrainCodeType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}VehicleTypeGroup"/&gt;
 *         &lt;element name="TrainsInCompoundTrain" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element ref="{http://www.siri.org.uk/siri}TrainInCompoundTrainRef"/&gt;
 *                   &lt;element ref="{http://www.siri.org.uk/siri}TrainInCompoundTrain"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompoundTrainStructure", propOrder = {
    "compoundTrainCode",
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
    "trainsInCompoundTrain"
})
public class CompoundTrainStructure {

    @XmlElement(name = "CompoundTrainCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String compoundTrainCode;
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
    protected CompoundTrainStructure.MaximumPassengerCapacities maximumPassengerCapacities;
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
    protected CompoundTrainStructure.Facilities facilities;
    @XmlElement(name = "TrainsInCompoundTrain")
    protected CompoundTrainStructure.TrainsInCompoundTrain trainsInCompoundTrain;

    /**
     * Ruft den Wert der compoundTrainCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundTrainCode() {
        return compoundTrainCode;
    }

    /**
     * Legt den Wert der compoundTrainCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundTrainCode(String value) {
        this.compoundTrainCode = value;
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
     *     {@link CompoundTrainStructure.MaximumPassengerCapacities }
     *     
     */
    public CompoundTrainStructure.MaximumPassengerCapacities getMaximumPassengerCapacities() {
        return maximumPassengerCapacities;
    }

    /**
     * Legt den Wert der maximumPassengerCapacities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundTrainStructure.MaximumPassengerCapacities }
     *     
     */
    public void setMaximumPassengerCapacities(CompoundTrainStructure.MaximumPassengerCapacities value) {
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
     *     {@link CompoundTrainStructure.Facilities }
     *     
     */
    public CompoundTrainStructure.Facilities getFacilities() {
        return facilities;
    }

    /**
     * Legt den Wert der facilities-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundTrainStructure.Facilities }
     *     
     */
    public void setFacilities(CompoundTrainStructure.Facilities value) {
        this.facilities = value;
    }

    /**
     * Ruft den Wert der trainsInCompoundTrain-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompoundTrainStructure.TrainsInCompoundTrain }
     *     
     */
    public CompoundTrainStructure.TrainsInCompoundTrain getTrainsInCompoundTrain() {
        return trainsInCompoundTrain;
    }

    /**
     * Legt den Wert der trainsInCompoundTrain-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundTrainStructure.TrainsInCompoundTrain }
     *     
     */
    public void setTrainsInCompoundTrain(CompoundTrainStructure.TrainsInCompoundTrain value) {
        this.trainsInCompoundTrain = value;
    }

    public CompoundTrainStructure withCompoundTrainCode(String value) {
        setCompoundTrainCode(value);
        return this;
    }

    public CompoundTrainStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public CompoundTrainStructure withShortName(NaturalLanguageStringStructure value) {
        setShortName(value);
        return this;
    }

    public CompoundTrainStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    public CompoundTrainStructure withPrivateCode(String value) {
        setPrivateCode(value);
        return this;
    }

    public CompoundTrainStructure withReversingDirection(Boolean value) {
        setReversingDirection(value);
        return this;
    }

    public CompoundTrainStructure withSelfPropelled(Boolean value) {
        setSelfPropelled(value);
        return this;
    }

    public CompoundTrainStructure withTypeOfFuel(TypeOfFuelEnumeration value) {
        setTypeOfFuel(value);
        return this;
    }

    public CompoundTrainStructure withEuroClass(String value) {
        setEuroClass(value);
        return this;
    }

    public CompoundTrainStructure withMaximumPassengerCapacities(CompoundTrainStructure.MaximumPassengerCapacities value) {
        setMaximumPassengerCapacities(value);
        return this;
    }

    public CompoundTrainStructure withLowFloor(Boolean value) {
        setLowFloor(value);
        return this;
    }

    public CompoundTrainStructure withHasLiftOrRamp(Boolean value) {
        setHasLiftOrRamp(value);
        return this;
    }

    public CompoundTrainStructure withHasHoist(Boolean value) {
        setHasHoist(value);
        return this;
    }

    public CompoundTrainStructure withLength(BigDecimal value) {
        setLength(value);
        return this;
    }

    public CompoundTrainStructure withWidth(BigDecimal value) {
        setWidth(value);
        return this;
    }

    public CompoundTrainStructure withHeight(BigDecimal value) {
        setHeight(value);
        return this;
    }

    public CompoundTrainStructure withWeight(BigDecimal value) {
        setWeight(value);
        return this;
    }

    public CompoundTrainStructure withFacilities(CompoundTrainStructure.Facilities value) {
        setFacilities(value);
        return this;
    }

    public CompoundTrainStructure withTrainsInCompoundTrain(CompoundTrainStructure.TrainsInCompoundTrain value) {
        setTrainsInCompoundTrain(value);
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
     *         &lt;choice maxOccurs="unbounded"&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}VehicleFeature"/&gt;
     *           &lt;element name="Facility" type="{http://www.siri.org.uk/siri}FacilityStructure"/&gt;
     *           &lt;element ref="{http://www.siri.org.uk/siri}FacilityRef"/&gt;
     *         &lt;/choice&gt;
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
        "vehicleFeatureOrFacilityOrFacilityRef"
    })
    public static class Facilities {

        @XmlElements({
            @XmlElement(name = "VehicleFeature", type = VehicleFeaturesStructure.class),
            @XmlElement(name = "Facility", type = FacilityStructure.class),
            @XmlElement(name = "FacilityRef", type = FacilityRefStructure.class)
        })
        protected List<Object> vehicleFeatureOrFacilityOrFacilityRef;

        /**
         * Gets the value of the vehicleFeatureOrFacilityOrFacilityRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleFeatureOrFacilityOrFacilityRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleFeatureOrFacilityOrFacilityRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacilityRefStructure }
         * {@link FacilityStructure }
         * {@link VehicleFeaturesStructure }
         * 
         * 
         */
        public List<Object> getVehicleFeatureOrFacilityOrFacilityRef() {
            if (vehicleFeatureOrFacilityOrFacilityRef == null) {
                vehicleFeatureOrFacilityOrFacilityRef = new ArrayList<Object>();
            }
            return this.vehicleFeatureOrFacilityOrFacilityRef;
        }

        public CompoundTrainStructure.Facilities withVehicleFeatureOrFacilityOrFacilityRef(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getVehicleFeatureOrFacilityOrFacilityRef().add(value);
                }
            }
            return this;
        }

        public CompoundTrainStructure.Facilities withVehicleFeatureOrFacilityOrFacilityRef(Collection<Object> values) {
            if (values!= null) {
                getVehicleFeatureOrFacilityOrFacilityRef().addAll(values);
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
     *         &lt;element name="MaximumPassengerCapacity" type="{http://www.siri.org.uk/siri}PassengerCapacityStructure" maxOccurs="unbounded"/&gt;
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
        "maximumPassengerCapacity"
    })
    public static class MaximumPassengerCapacities {

        @XmlElement(name = "MaximumPassengerCapacity", required = true)
        protected List<PassengerCapacityStructure> maximumPassengerCapacity;

        /**
         * Gets the value of the maximumPassengerCapacity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the maximumPassengerCapacity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMaximumPassengerCapacity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PassengerCapacityStructure }
         * 
         * 
         */
        public List<PassengerCapacityStructure> getMaximumPassengerCapacity() {
            if (maximumPassengerCapacity == null) {
                maximumPassengerCapacity = new ArrayList<PassengerCapacityStructure>();
            }
            return this.maximumPassengerCapacity;
        }

        public CompoundTrainStructure.MaximumPassengerCapacities withMaximumPassengerCapacity(PassengerCapacityStructure... values) {
            if (values!= null) {
                for (PassengerCapacityStructure value: values) {
                    getMaximumPassengerCapacity().add(value);
                }
            }
            return this;
        }

        public CompoundTrainStructure.MaximumPassengerCapacities withMaximumPassengerCapacity(Collection<PassengerCapacityStructure> values) {
            if (values!= null) {
                getMaximumPassengerCapacity().addAll(values);
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
     *       &lt;choice maxOccurs="unbounded"&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainInCompoundTrainRef"/&gt;
     *         &lt;element ref="{http://www.siri.org.uk/siri}TrainInCompoundTrain"/&gt;
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
        "trainInCompoundTrainRefOrTrainInCompoundTrain"
    })
    public static class TrainsInCompoundTrain {

        @XmlElements({
            @XmlElement(name = "TrainInCompoundTrainRef", type = TrainInCompoundTrainRefStructure.class),
            @XmlElement(name = "TrainInCompoundTrain", type = TrainInCompoundTrainStructure.class)
        })
        protected List<Object> trainInCompoundTrainRefOrTrainInCompoundTrain;

        /**
         * Gets the value of the trainInCompoundTrainRefOrTrainInCompoundTrain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the trainInCompoundTrainRefOrTrainInCompoundTrain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainInCompoundTrainRefOrTrainInCompoundTrain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrainInCompoundTrainRefStructure }
         * {@link TrainInCompoundTrainStructure }
         * 
         * 
         */
        public List<Object> getTrainInCompoundTrainRefOrTrainInCompoundTrain() {
            if (trainInCompoundTrainRefOrTrainInCompoundTrain == null) {
                trainInCompoundTrainRefOrTrainInCompoundTrain = new ArrayList<Object>();
            }
            return this.trainInCompoundTrainRefOrTrainInCompoundTrain;
        }

        public CompoundTrainStructure.TrainsInCompoundTrain withTrainInCompoundTrainRefOrTrainInCompoundTrain(Object... values) {
            if (values!= null) {
                for (Object value: values) {
                    getTrainInCompoundTrainRefOrTrainInCompoundTrain().add(value);
                }
            }
            return this;
        }

        public CompoundTrainStructure.TrainsInCompoundTrain withTrainInCompoundTrainRefOrTrainInCompoundTrain(Collection<Object> values) {
            if (values!= null) {
                getTrainInCompoundTrainRefOrTrainInCompoundTrain().addAll(values);
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
