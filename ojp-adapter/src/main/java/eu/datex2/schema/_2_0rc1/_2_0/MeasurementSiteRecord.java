//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für MeasurementSiteRecord complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteRecordVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteRecordVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="computationMethod" type="{http://datex2.eu/schema/2_0RC1/2_0}ComputationMethodEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentReference" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementEquipmentTypeUsed" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteName" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteNumberOfLanes" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="measurementSiteIdentification" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="measurementSide" type="{http://datex2.eu/schema/2_0RC1/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="measurementSpecificCharacteristics" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics"&gt;
 *                 &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="measurementSiteLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}Location"/&gt;
 *         &lt;element name="measurementSiteRecordExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSiteRecord", propOrder = {
    "measurementSiteRecordVersion",
    "measurementSiteRecordVersionTime",
    "computationMethod",
    "measurementEquipmentReference",
    "measurementEquipmentTypeUsed",
    "measurementSiteName",
    "measurementSiteNumberOfLanes",
    "measurementSiteIdentification",
    "measurementSide",
    "measurementSpecificCharacteristics",
    "measurementSiteLocation",
    "measurementSiteRecordExtension"
})
public class MeasurementSiteRecord {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteRecordVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime measurementSiteRecordVersionTime;
    @XmlSchemaType(name = "string")
    protected ComputationMethodEnum computationMethod;
    protected String measurementEquipmentReference;
    protected MultilingualString measurementEquipmentTypeUsed;
    protected MultilingualString measurementSiteName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger measurementSiteNumberOfLanes;
    protected String measurementSiteIdentification;
    @XmlSchemaType(name = "string")
    protected DirectionEnum measurementSide;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> measurementSpecificCharacteristics;
    @XmlElement(required = true)
    protected Location measurementSiteLocation;
    protected ExtensionType measurementSiteRecordExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der measurementSiteRecordVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteRecordVersion() {
        return measurementSiteRecordVersion;
    }

    /**
     * Legt den Wert der measurementSiteRecordVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteRecordVersion(BigInteger value) {
        this.measurementSiteRecordVersion = value;
    }

    /**
     * Ruft den Wert der measurementSiteRecordVersionTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getMeasurementSiteRecordVersionTime() {
        return measurementSiteRecordVersionTime;
    }

    /**
     * Legt den Wert der measurementSiteRecordVersionTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteRecordVersionTime(ZonedDateTime value) {
        this.measurementSiteRecordVersionTime = value;
    }

    /**
     * Ruft den Wert der computationMethod-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public ComputationMethodEnum getComputationMethod() {
        return computationMethod;
    }

    /**
     * Legt den Wert der computationMethod-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputationMethodEnum }
     *     
     */
    public void setComputationMethod(ComputationMethodEnum value) {
        this.computationMethod = value;
    }

    /**
     * Ruft den Wert der measurementEquipmentReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementEquipmentReference() {
        return measurementEquipmentReference;
    }

    /**
     * Legt den Wert der measurementEquipmentReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementEquipmentReference(String value) {
        this.measurementEquipmentReference = value;
    }

    /**
     * Ruft den Wert der measurementEquipmentTypeUsed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementEquipmentTypeUsed() {
        return measurementEquipmentTypeUsed;
    }

    /**
     * Legt den Wert der measurementEquipmentTypeUsed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementEquipmentTypeUsed(MultilingualString value) {
        this.measurementEquipmentTypeUsed = value;
    }

    /**
     * Ruft den Wert der measurementSiteName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getMeasurementSiteName() {
        return measurementSiteName;
    }

    /**
     * Legt den Wert der measurementSiteName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setMeasurementSiteName(MultilingualString value) {
        this.measurementSiteName = value;
    }

    /**
     * Ruft den Wert der measurementSiteNumberOfLanes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementSiteNumberOfLanes() {
        return measurementSiteNumberOfLanes;
    }

    /**
     * Legt den Wert der measurementSiteNumberOfLanes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementSiteNumberOfLanes(BigInteger value) {
        this.measurementSiteNumberOfLanes = value;
    }

    /**
     * Ruft den Wert der measurementSiteIdentification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteIdentification() {
        return measurementSiteIdentification;
    }

    /**
     * Legt den Wert der measurementSiteIdentification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteIdentification(String value) {
        this.measurementSiteIdentification = value;
    }

    /**
     * Ruft den Wert der measurementSide-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getMeasurementSide() {
        return measurementSide;
    }

    /**
     * Legt den Wert der measurementSide-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setMeasurementSide(DirectionEnum value) {
        this.measurementSide = value;
    }

    /**
     * Gets the value of the measurementSpecificCharacteristics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSpecificCharacteristics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSpecificCharacteristics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord.MeasurementSpecificCharacteristics }
     * 
     * 
     */
    public List<MeasurementSiteRecord.MeasurementSpecificCharacteristics> getMeasurementSpecificCharacteristics() {
        if (measurementSpecificCharacteristics == null) {
            measurementSpecificCharacteristics = new ArrayList<MeasurementSiteRecord.MeasurementSpecificCharacteristics>();
        }
        return this.measurementSpecificCharacteristics;
    }

    /**
     * Ruft den Wert der measurementSiteLocation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getMeasurementSiteLocation() {
        return measurementSiteLocation;
    }

    /**
     * Legt den Wert der measurementSiteLocation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setMeasurementSiteLocation(Location value) {
        this.measurementSiteLocation = value;
    }

    /**
     * Ruft den Wert der measurementSiteRecordExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteRecordExtension() {
        return measurementSiteRecordExtension;
    }

    /**
     * Legt den Wert der measurementSiteRecordExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteRecordExtension(ExtensionType value) {
        this.measurementSiteRecordExtension = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordVersion(BigInteger value) {
        setMeasurementSiteRecordVersion(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordVersionTime(ZonedDateTime value) {
        setMeasurementSiteRecordVersionTime(value);
        return this;
    }

    public MeasurementSiteRecord withComputationMethod(ComputationMethodEnum value) {
        setComputationMethod(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementEquipmentReference(String value) {
        setMeasurementEquipmentReference(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementEquipmentTypeUsed(MultilingualString value) {
        setMeasurementEquipmentTypeUsed(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteName(MultilingualString value) {
        setMeasurementSiteName(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteNumberOfLanes(BigInteger value) {
        setMeasurementSiteNumberOfLanes(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteIdentification(String value) {
        setMeasurementSiteIdentification(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSide(DirectionEnum value) {
        setMeasurementSide(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSpecificCharacteristics(MeasurementSiteRecord.MeasurementSpecificCharacteristics... values) {
        if (values!= null) {
            for (MeasurementSiteRecord.MeasurementSpecificCharacteristics value: values) {
                getMeasurementSpecificCharacteristics().add(value);
            }
        }
        return this;
    }

    public MeasurementSiteRecord withMeasurementSpecificCharacteristics(Collection<MeasurementSiteRecord.MeasurementSpecificCharacteristics> values) {
        if (values!= null) {
            getMeasurementSpecificCharacteristics().addAll(values);
        }
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteLocation(Location value) {
        setMeasurementSiteLocation(value);
        return this;
    }

    public MeasurementSiteRecord withMeasurementSiteRecordExtension(ExtensionType value) {
        setMeasurementSiteRecordExtension(value);
        return this;
    }

    public MeasurementSiteRecord withId(String value) {
        setId(value);
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
     *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSpecificCharacteristics"&gt;
     *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementSpecificCharacteristics
        extends eu.datex2.schema._2_0rc1._2_0.MeasurementSpecificCharacteristics
    {

        @XmlAttribute(name = "index", required = true)
        protected int index;

        /**
         * Ruft den Wert der index-Eigenschaft ab.
         * 
         */
        public int getIndex() {
            return index;
        }

        /**
         * Legt den Wert der index-Eigenschaft fest.
         * 
         */
        public void setIndex(int value) {
            this.index = value;
        }

        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withIndex(int value) {
            setIndex(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withAccuracy(Float value) {
            setAccuracy(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withPeriod(Float value) {
            setPeriod(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSmoothingFactor(Float value) {
            setSmoothingFactor(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificLane(LaneEnum value) {
            setSpecificLane(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificMeasurementValueType(MeasuredOrDerivedDataTypeEnum value) {
            setSpecificMeasurementValueType(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withSpecificVehicleCharacteristics(VehicleCharacteristics value) {
            setSpecificVehicleCharacteristics(value);
            return this;
        }

        @Override
        public MeasurementSiteRecord.MeasurementSpecificCharacteristics withMeasurementSpecificCharacteristicsExtension(ExtensionType value) {
            setMeasurementSpecificCharacteristicsExtension(value);
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
