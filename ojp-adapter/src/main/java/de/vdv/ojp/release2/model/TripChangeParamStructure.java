//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;


/**
 * Trip change request parameter structure.
 * 
 * <p>Java-Klasse für TripChangeParamStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripChangeParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeLegRef" type="{http://www.vdv.de/ojp}LegObjectIdType"/&gt;
 *         &lt;element name="SystemId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *         &lt;element name="ExtendToFrontOrBack" type="{http://www.vdv.de/ojp}ExtendToFrontOrBackType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalWaitingTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="TripParams" type="{http://www.vdv.de/ojp}TripParamStructure" minOccurs="0"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripChangeParamStructure", propOrder = {
    "changeLegRef",
    "systemId",
    "extendToFrontOrBack",
    "additionalWaitingTime",
    "tripParams",
    "extension"
})
public class TripChangeParamStructure {

    @XmlElement(name = "ChangeLegRef", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String changeLegRef;
    @XmlElement(name = "SystemId")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String systemId;
    @XmlElement(name = "ExtendToFrontOrBack", defaultValue = "extendToFront")
    @XmlSchemaType(name = "string")
    protected ExtendToFrontOrBackType extendToFrontOrBack;
    @XmlElement(name = "AdditionalWaitingTime", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration additionalWaitingTime;
    @XmlElement(name = "TripParams")
    protected TripParamStructure tripParams;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der changeLegRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeLegRef() {
        return changeLegRef;
    }

    /**
     * Legt den Wert der changeLegRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeLegRef(String value) {
        this.changeLegRef = value;
    }

    /**
     * Ruft den Wert der systemId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemId() {
        return systemId;
    }

    /**
     * Legt den Wert der systemId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemId(String value) {
        this.systemId = value;
    }

    /**
     * Ruft den Wert der extendToFrontOrBack-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtendToFrontOrBackType }
     *     
     */
    public ExtendToFrontOrBackType getExtendToFrontOrBack() {
        return extendToFrontOrBack;
    }

    /**
     * Legt den Wert der extendToFrontOrBack-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendToFrontOrBackType }
     *     
     */
    public void setExtendToFrontOrBack(ExtendToFrontOrBackType value) {
        this.extendToFrontOrBack = value;
    }

    /**
     * Ruft den Wert der additionalWaitingTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Duration getAdditionalWaitingTime() {
        return additionalWaitingTime;
    }

    /**
     * Legt den Wert der additionalWaitingTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalWaitingTime(Duration value) {
        this.additionalWaitingTime = value;
    }

    /**
     * Ruft den Wert der tripParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripParamStructure }
     *     
     */
    public TripParamStructure getTripParams() {
        return tripParams;
    }

    /**
     * Legt den Wert der tripParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripParamStructure }
     *     
     */
    public void setTripParams(TripParamStructure value) {
        this.tripParams = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public TripChangeParamStructure withChangeLegRef(String value) {
        setChangeLegRef(value);
        return this;
    }

    public TripChangeParamStructure withSystemId(String value) {
        setSystemId(value);
        return this;
    }

    public TripChangeParamStructure withExtendToFrontOrBack(ExtendToFrontOrBackType value) {
        setExtendToFrontOrBack(value);
        return this;
    }

    public TripChangeParamStructure withAdditionalWaitingTime(Duration value) {
        setAdditionalWaitingTime(value);
        return this;
    }

    public TripChangeParamStructure withTripParams(TripParamStructure value) {
        setTripParams(value);
        return this;
    }

    public TripChangeParamStructure withExtension(Object value) {
        setExtension(value);
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
