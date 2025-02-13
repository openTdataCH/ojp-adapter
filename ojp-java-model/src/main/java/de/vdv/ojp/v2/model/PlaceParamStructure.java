//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.LocationStructure;

/**
 * <p>Java-Klasse für PlaceParamStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PlaceParamStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlaceDataFilterGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlacePolicyGroup"/&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}PlaceSortingGroup"/&gt;
 *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceParamStructure", propOrder = {
    "type",
    "usage",
    "modes",
    "operatorFilter",
    "topographicPlaceRef",
    "pointOfInterestFilter",
    "language",
    "numberOfResults",
    "continueAt",
    "includePtModes",
    "includeOperators",
    "sortingMethod",
    "geoPosition",
    "minimalProbability",
    "extension"
})
public class PlaceParamStructure {

    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected List<PlaceTypeEnumeration> type;
    @XmlElement(name = "Usage")
    @XmlSchemaType(name = "string")
    protected PlaceUsageEnumeration usage;
    @XmlElement(name = "Modes")
    protected ModeFilterStructure modes;
    @XmlElement(name = "OperatorFilter")
    protected OperatorFilterStructure operatorFilter;
    @XmlElement(name = "TopographicPlaceRef")
    protected List<TopographicPlaceRefStructure> topographicPlaceRef;
    @XmlElement(name = "PointOfInterestFilter")
    protected PointOfInterestFilterStructure pointOfInterestFilter;
    @XmlElement(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected List<String> language;
    @XmlElement(name = "NumberOfResults")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfResults;
    @XmlElement(name = "ContinueAt")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger continueAt;
    @XmlElement(name = "IncludePtModes", defaultValue = "false")
    protected Boolean includePtModes;
    @XmlElement(name = "IncludeOperators", defaultValue = "false")
    protected Boolean includeOperators;
    @XmlElement(name = "SortingMethod")
    protected String sortingMethod;
    @XmlElement(name = "GeoPosition")
    protected LocationStructure geoPosition;
    @XmlElement(name = "MinimalProbability")
    protected Float minimalProbability;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Gets the value of the type property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the type property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PlaceTypeEnumeration }
     */
    public List<PlaceTypeEnumeration> getType() {
        if (type == null) {
            type = new ArrayList<PlaceTypeEnumeration>();
        }
        return this.type;
    }

    /**
     * Ruft den Wert der usage-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceUsageEnumeration }
     */
    public PlaceUsageEnumeration getUsage() {
        return usage;
    }

    /**
     * Legt den Wert der usage-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceUsageEnumeration }
     */
    public void setUsage(PlaceUsageEnumeration value) {
        this.usage = value;
    }

    /**
     * Ruft den Wert der modes-Eigenschaft ab.
     *
     * @return possible object is {@link ModeFilterStructure }
     */
    public ModeFilterStructure getModes() {
        return modes;
    }

    /**
     * Legt den Wert der modes-Eigenschaft fest.
     *
     * @param value allowed object is {@link ModeFilterStructure }
     */
    public void setModes(ModeFilterStructure value) {
        this.modes = value;
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
     * Gets the value of the topographicPlaceRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the topographicPlaceRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopographicPlaceRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TopographicPlaceRefStructure }
     */
    public List<TopographicPlaceRefStructure> getTopographicPlaceRef() {
        if (topographicPlaceRef == null) {
            topographicPlaceRef = new ArrayList<TopographicPlaceRefStructure>();
        }
        return this.topographicPlaceRef;
    }

    /**
     * Ruft den Wert der pointOfInterestFilter-Eigenschaft ab.
     *
     * @return possible object is {@link PointOfInterestFilterStructure }
     */
    public PointOfInterestFilterStructure getPointOfInterestFilter() {
        return pointOfInterestFilter;
    }

    /**
     * Legt den Wert der pointOfInterestFilter-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointOfInterestFilterStructure }
     */
    public void setPointOfInterestFilter(PointOfInterestFilterStructure value) {
        this.pointOfInterestFilter = value;
    }

    /**
     * Gets the value of the language property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the language property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getLanguage() {
        if (language == null) {
            language = new ArrayList<String>();
        }
        return this.language;
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
     * Ruft den Wert der continueAt-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getContinueAt() {
        return continueAt;
    }

    /**
     * Legt den Wert der continueAt-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setContinueAt(BigInteger value) {
        this.continueAt = value;
    }

    /**
     * Ruft den Wert der includePtModes-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludePtModes() {
        return includePtModes;
    }

    /**
     * Legt den Wert der includePtModes-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludePtModes(Boolean value) {
        this.includePtModes = value;
    }

    /**
     * Ruft den Wert der includeOperators-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isIncludeOperators() {
        return includeOperators;
    }

    /**
     * Legt den Wert der includeOperators-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setIncludeOperators(Boolean value) {
        this.includeOperators = value;
    }

    /**
     * Ruft den Wert der sortingMethod-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSortingMethod() {
        return sortingMethod;
    }

    /**
     * Legt den Wert der sortingMethod-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSortingMethod(String value) {
        this.sortingMethod = value;
    }

    /**
     * Ruft den Wert der geoPosition-Eigenschaft ab.
     *
     * @return possible object is {@link LocationStructure }
     */
    public LocationStructure getGeoPosition() {
        return geoPosition;
    }

    /**
     * Legt den Wert der geoPosition-Eigenschaft fest.
     *
     * @param value allowed object is {@link LocationStructure }
     */
    public void setGeoPosition(LocationStructure value) {
        this.geoPosition = value;
    }

    /**
     * Ruft den Wert der minimalProbability-Eigenschaft ab.
     *
     * @return possible object is {@link Float }
     */
    public Float getMinimalProbability() {
        return minimalProbability;
    }

    /**
     * Legt den Wert der minimalProbability-Eigenschaft fest.
     *
     * @param value allowed object is {@link Float }
     */
    public void setMinimalProbability(Float value) {
        this.minimalProbability = value;
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

    public PlaceParamStructure withType(PlaceTypeEnumeration... values) {
        if (values != null) {
            for (PlaceTypeEnumeration value : values) {
                getType().add(value);
            }
        }
        return this;
    }

    public PlaceParamStructure withType(Collection<PlaceTypeEnumeration> values) {
        if (values != null) {
            getType().addAll(values);
        }
        return this;
    }

    public PlaceParamStructure withUsage(PlaceUsageEnumeration value) {
        setUsage(value);
        return this;
    }

    public PlaceParamStructure withModes(ModeFilterStructure value) {
        setModes(value);
        return this;
    }

    public PlaceParamStructure withOperatorFilter(OperatorFilterStructure value) {
        setOperatorFilter(value);
        return this;
    }

    public PlaceParamStructure withTopographicPlaceRef(TopographicPlaceRefStructure... values) {
        if (values != null) {
            for (TopographicPlaceRefStructure value : values) {
                getTopographicPlaceRef().add(value);
            }
        }
        return this;
    }

    public PlaceParamStructure withTopographicPlaceRef(Collection<TopographicPlaceRefStructure> values) {
        if (values != null) {
            getTopographicPlaceRef().addAll(values);
        }
        return this;
    }

    public PlaceParamStructure withPointOfInterestFilter(PointOfInterestFilterStructure value) {
        setPointOfInterestFilter(value);
        return this;
    }

    public PlaceParamStructure withLanguage(String... values) {
        if (values != null) {
            for (String value : values) {
                getLanguage().add(value);
            }
        }
        return this;
    }

    public PlaceParamStructure withLanguage(Collection<String> values) {
        if (values != null) {
            getLanguage().addAll(values);
        }
        return this;
    }

    public PlaceParamStructure withNumberOfResults(BigInteger value) {
        setNumberOfResults(value);
        return this;
    }

    public PlaceParamStructure withContinueAt(BigInteger value) {
        setContinueAt(value);
        return this;
    }

    public PlaceParamStructure withIncludePtModes(Boolean value) {
        setIncludePtModes(value);
        return this;
    }

    public PlaceParamStructure withIncludeOperators(Boolean value) {
        setIncludeOperators(value);
        return this;
    }

    public PlaceParamStructure withSortingMethod(String value) {
        setSortingMethod(value);
        return this;
    }

    public PlaceParamStructure withGeoPosition(LocationStructure value) {
        setGeoPosition(value);
        return this;
    }

    public PlaceParamStructure withMinimalProbability(Float value) {
        setMinimalProbability(value);
        return this;
    }

    public PlaceParamStructure withExtension(Object value) {
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
