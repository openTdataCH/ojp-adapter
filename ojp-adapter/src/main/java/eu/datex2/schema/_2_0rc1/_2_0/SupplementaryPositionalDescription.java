//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für SupplementaryPositionalDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryPositionalDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2_0RC1/2_0}CarriagewayEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2_0RC1/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="locationDescriptor" type="{http://datex2.eu/schema/2_0RC1/2_0}LocationDescriptorEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="locationPrecision" type="{http://datex2.eu/schema/2_0RC1/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="sequentialRampNumber" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="supplementaryPositionalDescriptionExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryPositionalDescription", propOrder = {
    "carriageway",
    "footpath",
    "lane",
    "lengthAffected",
    "locationDescriptor",
    "locationPrecision",
    "sequentialRampNumber",
    "supplementaryPositionalDescriptionExtension"
})
public class SupplementaryPositionalDescription {

    @XmlSchemaType(name = "string")
    protected List<CarriagewayEnum> carriageway;
    protected Boolean footpath;
    @XmlSchemaType(name = "string")
    protected List<LaneEnum> lane;
    protected Float lengthAffected;
    @XmlSchemaType(name = "string")
    protected List<LocationDescriptorEnum> locationDescriptor;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger locationPrecision;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequentialRampNumber;
    protected ExtensionType supplementaryPositionalDescriptionExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carriageway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarriageway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarriagewayEnum }
     * 
     * 
     */
    public List<CarriagewayEnum> getCarriageway() {
        if (carriageway == null) {
            carriageway = new ArrayList<CarriagewayEnum>();
        }
        return this.carriageway;
    }

    /**
     * Ruft den Wert der footpath-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Legt den Wert der footpath-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    /**
     * Ruft den Wert der lengthAffected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Legt den Wert der lengthAffected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the locationDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the locationDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDescriptorEnum }
     * 
     * 
     */
    public List<LocationDescriptorEnum> getLocationDescriptor() {
        if (locationDescriptor == null) {
            locationDescriptor = new ArrayList<LocationDescriptorEnum>();
        }
        return this.locationDescriptor;
    }

    /**
     * Ruft den Wert der locationPrecision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationPrecision() {
        return locationPrecision;
    }

    /**
     * Legt den Wert der locationPrecision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationPrecision(BigInteger value) {
        this.locationPrecision = value;
    }

    /**
     * Ruft den Wert der sequentialRampNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequentialRampNumber() {
        return sequentialRampNumber;
    }

    /**
     * Legt den Wert der sequentialRampNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequentialRampNumber(BigInteger value) {
        this.sequentialRampNumber = value;
    }

    /**
     * Ruft den Wert der supplementaryPositionalDescriptionExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSupplementaryPositionalDescriptionExtension() {
        return supplementaryPositionalDescriptionExtension;
    }

    /**
     * Legt den Wert der supplementaryPositionalDescriptionExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        this.supplementaryPositionalDescriptionExtension = value;
    }

    public SupplementaryPositionalDescription withCarriageway(CarriagewayEnum... values) {
        if (values!= null) {
            for (CarriagewayEnum value: values) {
                getCarriageway().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withCarriageway(Collection<CarriagewayEnum> values) {
        if (values!= null) {
            getCarriageway().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withFootpath(Boolean value) {
        setFootpath(value);
        return this;
    }

    public SupplementaryPositionalDescription withLane(LaneEnum... values) {
        if (values!= null) {
            for (LaneEnum value: values) {
                getLane().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withLane(Collection<LaneEnum> values) {
        if (values!= null) {
            getLane().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withLengthAffected(Float value) {
        setLengthAffected(value);
        return this;
    }

    public SupplementaryPositionalDescription withLocationDescriptor(LocationDescriptorEnum... values) {
        if (values!= null) {
            for (LocationDescriptorEnum value: values) {
                getLocationDescriptor().add(value);
            }
        }
        return this;
    }

    public SupplementaryPositionalDescription withLocationDescriptor(Collection<LocationDescriptorEnum> values) {
        if (values!= null) {
            getLocationDescriptor().addAll(values);
        }
        return this;
    }

    public SupplementaryPositionalDescription withLocationPrecision(BigInteger value) {
        setLocationPrecision(value);
        return this;
    }

    public SupplementaryPositionalDescription withSequentialRampNumber(BigInteger value) {
        setSequentialRampNumber(value);
        return this;
    }

    public SupplementaryPositionalDescription withSupplementaryPositionalDescriptionExtension(ExtensionType value) {
        setSupplementaryPositionalDescriptionExtension(value);
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
