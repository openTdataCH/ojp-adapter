//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * [an extended view of STOP PLACE in TMv6] a PLACE extended by ACCESSIBILITY LIMITATION properties and some attributes of the associated equipment, comprising one or more locations where vehicles may stop and where passengers may board or leave vehicles or prepare their trip, and which will usually have one or more well-known names
 * 
 * <p>Java-Klasse für StopPlaceStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StopPlaceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopPlaceGroup"/&gt;
 *         &lt;element name="PrivateCode" type="{http://www.vdv.de/ojp}PrivateCodeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.vdv.de/ojp}TopographicPlaceRef" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopAttributesGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopPlaceStructure", propOrder = {
    "stopPlaceRef",
    "stopPlaceName",
    "nameSuffix",
    "privateCode",
    "topographicPlaceRef",
    "wheelchairAccessible",
    "lighting",
    "covered"
})
public class StopPlaceStructure {

    @XmlElement(name = "StopPlaceRef", required = true)
    protected StopPlaceRefStructure stopPlaceRef;
    @XmlElement(name = "StopPlaceName", required = true)
    protected InternationalTextStructure stopPlaceName;
    @XmlElement(name = "NameSuffix")
    protected InternationalTextStructure nameSuffix;
    @XmlElement(name = "PrivateCode")
    protected List<PrivateCodeStructure> privateCode;
    @XmlElement(name = "TopographicPlaceRef")
    protected TopographicPlaceRefStructure topographicPlaceRef;
    @XmlElement(name = "WheelchairAccessible", defaultValue = "false")
    protected Boolean wheelchairAccessible;
    @XmlElement(name = "Lighting", defaultValue = "false")
    protected Boolean lighting;
    @XmlElement(name = "Covered", defaultValue = "false")
    protected Boolean covered;

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
     * Ruft den Wert der stopPlaceName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getStopPlaceName() {
        return stopPlaceName;
    }

    /**
     * Legt den Wert der stopPlaceName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setStopPlaceName(InternationalTextStructure value) {
        this.stopPlaceName = value;
    }

    /**
     * Ruft den Wert der nameSuffix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Legt den Wert der nameSuffix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setNameSuffix(InternationalTextStructure value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the privateCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the privateCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivateCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivateCodeStructure }
     * 
     * 
     */
    public List<PrivateCodeStructure> getPrivateCode() {
        if (privateCode == null) {
            privateCode = new ArrayList<PrivateCodeStructure>();
        }
        return this.privateCode;
    }

    /**
     * Ruft den Wert der topographicPlaceRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public TopographicPlaceRefStructure getTopographicPlaceRef() {
        return topographicPlaceRef;
    }

    /**
     * Legt den Wert der topographicPlaceRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TopographicPlaceRefStructure }
     *     
     */
    public void setTopographicPlaceRef(TopographicPlaceRefStructure value) {
        this.topographicPlaceRef = value;
    }

    /**
     * Ruft den Wert der wheelchairAccessible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWheelchairAccessible() {
        return wheelchairAccessible;
    }

    /**
     * Legt den Wert der wheelchairAccessible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWheelchairAccessible(Boolean value) {
        this.wheelchairAccessible = value;
    }

    /**
     * Ruft den Wert der lighting-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLighting() {
        return lighting;
    }

    /**
     * Legt den Wert der lighting-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLighting(Boolean value) {
        this.lighting = value;
    }

    /**
     * Ruft den Wert der covered-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCovered() {
        return covered;
    }

    /**
     * Legt den Wert der covered-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCovered(Boolean value) {
        this.covered = value;
    }

    public StopPlaceStructure withStopPlaceRef(StopPlaceRefStructure value) {
        setStopPlaceRef(value);
        return this;
    }

    public StopPlaceStructure withStopPlaceName(InternationalTextStructure value) {
        setStopPlaceName(value);
        return this;
    }

    public StopPlaceStructure withNameSuffix(InternationalTextStructure value) {
        setNameSuffix(value);
        return this;
    }

    public StopPlaceStructure withPrivateCode(PrivateCodeStructure... values) {
        if (values!= null) {
            for (PrivateCodeStructure value: values) {
                getPrivateCode().add(value);
            }
        }
        return this;
    }

    public StopPlaceStructure withPrivateCode(Collection<PrivateCodeStructure> values) {
        if (values!= null) {
            getPrivateCode().addAll(values);
        }
        return this;
    }

    public StopPlaceStructure withTopographicPlaceRef(TopographicPlaceRefStructure value) {
        setTopographicPlaceRef(value);
        return this;
    }

    public StopPlaceStructure withWheelchairAccessible(Boolean value) {
        setWheelchairAccessible(value);
        return this;
    }

    public StopPlaceStructure withLighting(Boolean value) {
        setLighting(value);
        return this;
    }

    public StopPlaceStructure withCovered(Boolean value) {
        setCovered(value);
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
