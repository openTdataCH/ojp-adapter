//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * TripInfo request parameter structure.
 * 
 * <p>Java-Klasse für TripInfoParamStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TripInfoParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripInfoContentFilterGroup"/&gt;
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
@XmlType(name = "TripInfoParamStructure", propOrder = {
    "useRealTimeData",
    "includeCalls",
    "includePosition",
    "includeService",
    "includeTrackSections",
    "includeTrackProjection",
    "includePlacesContext",
    "includeFormation",
    "includeSituationsContext",
    "extension"
})
public class TripInfoParamStructure {

    @XmlElement(name = "UseRealTimeData", defaultValue = "full")
    @XmlSchemaType(name = "string")
    protected UseRealtimeDataEnumeration useRealTimeData;
    @XmlElement(name = "IncludeCalls", defaultValue = "true")
    protected Boolean includeCalls;
    @XmlElement(name = "IncludePosition", defaultValue = "true")
    protected Boolean includePosition;
    @XmlElement(name = "IncludeService", defaultValue = "true")
    protected Boolean includeService;
    @XmlElement(name = "IncludeTrackSections", defaultValue = "false")
    protected Boolean includeTrackSections;
    @XmlElement(name = "IncludeTrackProjection", defaultValue = "false")
    protected Boolean includeTrackProjection;
    @XmlElement(name = "IncludePlacesContext", defaultValue = "true")
    protected Boolean includePlacesContext;
    @XmlElement(name = "IncludeFormation", defaultValue = "none")
    @XmlSchemaType(name = "string")
    protected IncludeFormationEnumeration includeFormation;
    @XmlElement(name = "IncludeSituationsContext", defaultValue = "true")
    protected Boolean includeSituationsContext;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der useRealTimeData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UseRealtimeDataEnumeration }
     *     
     */
    public UseRealtimeDataEnumeration getUseRealTimeData() {
        return useRealTimeData;
    }

    /**
     * Legt den Wert der useRealTimeData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UseRealtimeDataEnumeration }
     *     
     */
    public void setUseRealTimeData(UseRealtimeDataEnumeration value) {
        this.useRealTimeData = value;
    }

    /**
     * Ruft den Wert der includeCalls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCalls() {
        return includeCalls;
    }

    /**
     * Legt den Wert der includeCalls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCalls(Boolean value) {
        this.includeCalls = value;
    }

    /**
     * Ruft den Wert der includePosition-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePosition() {
        return includePosition;
    }

    /**
     * Legt den Wert der includePosition-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePosition(Boolean value) {
        this.includePosition = value;
    }

    /**
     * Ruft den Wert der includeService-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeService() {
        return includeService;
    }

    /**
     * Legt den Wert der includeService-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeService(Boolean value) {
        this.includeService = value;
    }

    /**
     * Ruft den Wert der includeTrackSections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackSections() {
        return includeTrackSections;
    }

    /**
     * Legt den Wert der includeTrackSections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackSections(Boolean value) {
        this.includeTrackSections = value;
    }

    /**
     * Ruft den Wert der includeTrackProjection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeTrackProjection() {
        return includeTrackProjection;
    }

    /**
     * Legt den Wert der includeTrackProjection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeTrackProjection(Boolean value) {
        this.includeTrackProjection = value;
    }

    /**
     * Ruft den Wert der includePlacesContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludePlacesContext() {
        return includePlacesContext;
    }

    /**
     * Legt den Wert der includePlacesContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludePlacesContext(Boolean value) {
        this.includePlacesContext = value;
    }

    /**
     * Ruft den Wert der includeFormation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IncludeFormationEnumeration }
     *     
     */
    public IncludeFormationEnumeration getIncludeFormation() {
        return includeFormation;
    }

    /**
     * Legt den Wert der includeFormation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeFormationEnumeration }
     *     
     */
    public void setIncludeFormation(IncludeFormationEnumeration value) {
        this.includeFormation = value;
    }

    /**
     * Ruft den Wert der includeSituationsContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSituationsContext() {
        return includeSituationsContext;
    }

    /**
     * Legt den Wert der includeSituationsContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSituationsContext(Boolean value) {
        this.includeSituationsContext = value;
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

    public TripInfoParamStructure withUseRealTimeData(UseRealtimeDataEnumeration value) {
        setUseRealTimeData(value);
        return this;
    }

    public TripInfoParamStructure withIncludeCalls(Boolean value) {
        setIncludeCalls(value);
        return this;
    }

    public TripInfoParamStructure withIncludePosition(Boolean value) {
        setIncludePosition(value);
        return this;
    }

    public TripInfoParamStructure withIncludeService(Boolean value) {
        setIncludeService(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackSections(Boolean value) {
        setIncludeTrackSections(value);
        return this;
    }

    public TripInfoParamStructure withIncludeTrackProjection(Boolean value) {
        setIncludeTrackProjection(value);
        return this;
    }

    public TripInfoParamStructure withIncludePlacesContext(Boolean value) {
        setIncludePlacesContext(value);
        return this;
    }

    public TripInfoParamStructure withIncludeFormation(IncludeFormationEnumeration value) {
        setIncludeFormation(value);
        return this;
    }

    public TripInfoParamStructure withIncludeSituationsContext(Boolean value) {
        setIncludeSituationsContext(value);
        return this;
    }

    public TripInfoParamStructure withExtension(Object value) {
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
