//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import java.math.BigInteger;
import java.time.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.DurationXmlAdapter;

/**
 * Request specific parameters (parameters which define what is to be included in a Stop  Event result)
 *
 * <p>Java-Klasse für StopEventParamStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="StopEventParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventPolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}StopEventContentFilterGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopEventParamStructure", propOrder = {
    "modeFilter",
    "lineFilter",
    "operatorFilter",
    "includeAllRestrictedLines",
    "numberOfResults",
    "timeWindow",
    "stopEventType",
    "includePreviousCalls",
    "includeOnwardCalls",
    "includeOperatingDays",
    "useRealtimeData",
    "includePlacesContext",
    "includeSituationsContext",
    "includeStopHierarchy",
    "extension"
})
public class StopEventParamStructure {

    @XmlElement(name = "ModeFilter")
    protected ModeFilterStructure modeFilter;
    @XmlElement(name = "LineFilter")
    protected LineDirectionFilterStructure lineFilter;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "IncludeAllRestrictedLines", defaultValue = "false")
    protected Boolean includeAllRestrictedLines;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "TimeWindow", type = String.class)
    @XmlJavaTypeAdapter(DurationXmlAdapter.class)
    @XmlSchemaType(name = "duration")
    protected Duration timeWindow;
    @XmlElement(name = "StopEventType")
    @XmlSchemaType(name = "string")
    protected StopEventTypeEnumeration stopEventType;
    @XmlElement(name = "IncludePreviousCalls", defaultValue = "false")
    protected Boolean includePreviousCalls;
    @XmlElement(name = "IncludeOnwardCalls", defaultValue = "false")
    protected Boolean includeOnwardCalls;
    @XmlElement(name = "IncludeOperatingDays", defaultValue = "false")
    protected Boolean includeOperatingDays;
    @XmlElement(name = "UseRealtimeData", defaultValue = "full")
    @XmlSchemaType(name = "string")
    protected UseRealtimeDataEnumeration useRealtimeData;
    @XmlElement(name = "IncludePlacesContext", defaultValue = "true")
    protected Boolean includePlacesContext;
    @XmlElement(name = "IncludeSituationsContext", defaultValue = "true")
    protected Boolean includeSituationsContext;
    @XmlElement(name = "IncludeStopHierarchy", defaultValue = "local")
    @XmlSchemaType(name = "NMTOKEN")
    protected HierarchyEnumeration includeStopHierarchy;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der modeFilter-Eigenschaft ab.
     *
     * @return possible object is {@link ModeFilterStructure }
     */
    public ModeFilterStructure getModeFilter() {
        return modeFilter;
    }

    /**
     * Legt den Wert der modeFilter-Eigenschaft fest.
     *
     * @param value allowed object is {@link ModeFilterStructure }
     */
    public void setModeFilter(ModeFilterStructure value) {
        this.modeFilter = value;
    }

    /**
     * Ruft den Wert der lineFilter-Eigenschaft ab.
     *
     * @return possible object is {@link LineDirectionFilterStructure }
     */
    public LineDirectionFilterStructure getLineFilter() {
        return lineFilter;
    }

    /**
     * Legt den Wert der lineFilter-Eigenschaft fest.
     *
     * @param value allowed object is {@link LineDirectionFilterStructure }
     */
    public void setLineFilter(LineDirectionFilterStructure value) {
        this.lineFilter = value;
    }

    /**
     * Ruft den Wert der operatorFilter-Eigenschaft ab.
     *
     * @return possible object is {@link OperatorFilterStructure }
     */
    public OperatorFilterStructure getOperatorFilter() {
        return operatorFilter;
    }

    /**
     * Legt den Wert der operatorFilter-Eigenschaft fest.
     *
     * @param value allowed object is {@link OperatorFilterStructure }
     */
    public void setOperatorFilter(OperatorFilterStructure value) {
        this.operatorFilter = value;
    }

    /**
     * Ruft den Wert der includeAllRestrictedLines-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludeAllRestrictedLines() {
        return includeAllRestrictedLines;
    }

    /**
     * Legt den Wert der includeAllRestrictedLines-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludeAllRestrictedLines(Boolean value) {
        this.includeAllRestrictedLines = value;
    }

    /**
     * Ruft den Wert der numberOfResults-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getNumberOfResults() {
        return numberOfResults;
    }

    /**
     * Legt den Wert der numberOfResults-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setNumberOfResults(BigInteger value) {
        this.numberOfResults = value;
    }

    /**
     * Ruft den Wert der timeWindow-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public Duration getTimeWindow() {
        return timeWindow;
    }

    /**
     * Legt den Wert der timeWindow-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTimeWindow(Duration value) {
        this.timeWindow = value;
    }

    /**
     * Ruft den Wert der stopEventType-Eigenschaft ab.
     *
     * @return possible object is {@link StopEventTypeEnumeration }
     */
    public StopEventTypeEnumeration getStopEventType() {
        return stopEventType;
    }

    /**
     * Legt den Wert der stopEventType-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopEventTypeEnumeration }
     */
    public void setStopEventType(StopEventTypeEnumeration value) {
        this.stopEventType = value;
    }

    /**
     * Ruft den Wert der includePreviousCalls-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludePreviousCalls() {
        return includePreviousCalls;
    }

    /**
     * Legt den Wert der includePreviousCalls-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludePreviousCalls(Boolean value) {
        this.includePreviousCalls = value;
    }

    /**
     * Ruft den Wert der includeOnwardCalls-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludeOnwardCalls() {
        return includeOnwardCalls;
    }

    /**
     * Legt den Wert der includeOnwardCalls-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludeOnwardCalls(Boolean value) {
        this.includeOnwardCalls = value;
    }

    /**
     * Ruft den Wert der includeOperatingDays-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludeOperatingDays() {
        return includeOperatingDays;
    }

    /**
     * Legt den Wert der includeOperatingDays-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludeOperatingDays(Boolean value) {
        this.includeOperatingDays = value;
    }

    /**
     * Ruft den Wert der useRealtimeData-Eigenschaft ab.
     *
     * @return possible object is {@link UseRealtimeDataEnumeration }
     */
    public UseRealtimeDataEnumeration getUseRealtimeData() {
        return useRealtimeData;
    }

    /**
     * Legt den Wert der useRealtimeData-Eigenschaft fest.
     *
     * @param value allowed object is {@link UseRealtimeDataEnumeration }
     */
    public void setUseRealtimeData(UseRealtimeDataEnumeration value) {
        this.useRealtimeData = value;
    }

    /**
     * Ruft den Wert der includePlacesContext-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludePlacesContext() {
        return includePlacesContext;
    }

    /**
     * Legt den Wert der includePlacesContext-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludePlacesContext(Boolean value) {
        this.includePlacesContext = value;
    }

    /**
     * Ruft den Wert der includeSituationsContext-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludeSituationsContext() {
        return includeSituationsContext;
    }

    /**
     * Legt den Wert der includeSituationsContext-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludeSituationsContext(Boolean value) {
        this.includeSituationsContext = value;
    }

    /**
     * Ruft den Wert der includeStopHierarchy-Eigenschaft ab.
     *
     * @return possible object is {@link HierarchyEnumeration }
     */
    public HierarchyEnumeration getIncludeStopHierarchy() {
        return includeStopHierarchy;
    }

    /**
     * Legt den Wert der includeStopHierarchy-Eigenschaft fest.
     *
     * @param value allowed object is {@link HierarchyEnumeration }
     */
    public void setIncludeStopHierarchy(HierarchyEnumeration value) {
        this.includeStopHierarchy = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public StopEventParamStructure withModeFilter(ModeFilterStructure value) {
        setModeFilter(value);
        return this;
    }

    public StopEventParamStructure withLineFilter(LineDirectionFilterStructure value) {
        setLineFilter(value);
        return this;
    }

    public StopEventParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public StopEventParamStructure withIncludeAllRestrictedLines(Boolean value) {
        setIncludeAllRestrictedLines(value);
        return this;
    }

    public StopEventParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public StopEventParamStructure withTimeWindow(Duration value) {
        setTimeWindow(value);
        return this;
    }

    public StopEventParamStructure withStopEventType(StopEventTypeEnumeration value) {
        setStopEventType(value);
        return this;
    }

    public StopEventParamStructure withIncludePreviousCalls(Boolean value) {
        setIncludePreviousCalls(value);
        return this;
    }

    public StopEventParamStructure withIncludeOnwardCalls(Boolean value) {
        setIncludeOnwardCalls(value);
        return this;
    }

    public StopEventParamStructure withIncludeOperatingDays(Boolean value) {
        setIncludeOperatingDays(value);
        return this;
    }

    public StopEventParamStructure withUseRealtimeData(UseRealtimeDataEnumeration value) {
        setUseRealtimeData(value);
        return this;
    }

    public StopEventParamStructure withIncludePlacesContext(Boolean value) {
        setIncludePlacesContext(value);
        return this;
    }

    public StopEventParamStructure withIncludeSituationsContext(Boolean value) {
        setIncludeSituationsContext(value);
        return this;
    }

    public StopEventParamStructure withIncludeStopHierarchy(HierarchyEnumeration value) {
        setIncludeStopHierarchy(value);
        return this;
    }

    public StopEventParamStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    /**
     * Generates a String representation of the contents of this type. This is an extension method, produced by the 'ts' xjc plugin
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
