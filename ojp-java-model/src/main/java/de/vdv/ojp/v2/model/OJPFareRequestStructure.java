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
import jakarta.xml.bind.annotation.XmlType;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageQualifierStructure;

/**
 * <p>Java-Klasse für OJPFareRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPFareRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}FareRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPFareRequestStructure", propOrder = {
    "stopFareRequest",
    "placeFareRequest",
    "staticFareRequest",
    "tripFareRequest",
    "multiTripFareRequest",
    "params",
    "extensions"
})
public class OJPFareRequestStructure
    extends AbstractOJPServiceRequestStructure {

    @XmlElement(name = "StopFareRequest")
    protected StopFareRequestStructure stopFareRequest;
    @XmlElement(name = "PlaceFareRequest")
    protected PlaceFareRequestStructure placeFareRequest;
    @XmlElement(name = "StaticFareRequest")
    protected StaticFareRequestStructure staticFareRequest;
    @XmlElement(name = "TripFareRequest")
    protected TripFareRequestStructure tripFareRequest;
    @XmlElement(name = "MultiTripFareRequest")
    protected MultiTripFareRequestStructure multiTripFareRequest;
    @XmlElement(name = "Params")
    protected FareParamStructure params;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der stopFareRequest-Eigenschaft ab.
     *
     * @return possible object is {@link StopFareRequestStructure }
     */
    public StopFareRequestStructure getStopFareRequest() {
        return stopFareRequest;
    }

    /**
     * Legt den Wert der stopFareRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link StopFareRequestStructure }
     */
    public void setStopFareRequest(StopFareRequestStructure value) {
        this.stopFareRequest = value;
    }

    /**
     * Ruft den Wert der placeFareRequest-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceFareRequestStructure }
     */
    public PlaceFareRequestStructure getPlaceFareRequest() {
        return placeFareRequest;
    }

    /**
     * Legt den Wert der placeFareRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceFareRequestStructure }
     */
    public void setPlaceFareRequest(PlaceFareRequestStructure value) {
        this.placeFareRequest = value;
    }

    /**
     * Ruft den Wert der staticFareRequest-Eigenschaft ab.
     *
     * @return possible object is {@link StaticFareRequestStructure }
     */
    public StaticFareRequestStructure getStaticFareRequest() {
        return staticFareRequest;
    }

    /**
     * Legt den Wert der staticFareRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link StaticFareRequestStructure }
     */
    public void setStaticFareRequest(StaticFareRequestStructure value) {
        this.staticFareRequest = value;
    }

    /**
     * Ruft den Wert der tripFareRequest-Eigenschaft ab.
     *
     * @return possible object is {@link TripFareRequestStructure }
     */
    public TripFareRequestStructure getTripFareRequest() {
        return tripFareRequest;
    }

    /**
     * Legt den Wert der tripFareRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link TripFareRequestStructure }
     */
    public void setTripFareRequest(TripFareRequestStructure value) {
        this.tripFareRequest = value;
    }

    /**
     * Ruft den Wert der multiTripFareRequest-Eigenschaft ab.
     *
     * @return possible object is {@link MultiTripFareRequestStructure }
     */
    public MultiTripFareRequestStructure getMultiTripFareRequest() {
        return multiTripFareRequest;
    }

    /**
     * Legt den Wert der multiTripFareRequest-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultiTripFareRequestStructure }
     */
    public void setMultiTripFareRequest(MultiTripFareRequestStructure value) {
        this.multiTripFareRequest = value;
    }

    /**
     * Ruft den Wert der params-Eigenschaft ab.
     *
     * @return possible object is {@link FareParamStructure }
     */
    public FareParamStructure getParams() {
        return params;
    }

    /**
     * Legt den Wert der params-Eigenschaft fest.
     *
     * @param value allowed object is {@link FareParamStructure }
     */
    public void setParams(FareParamStructure value) {
        this.params = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionsStructure }
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionsStructure }
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OJPFareRequestStructure withStopFareRequest(StopFareRequestStructure value) {
        setStopFareRequest(value);
        return this;
    }

    public OJPFareRequestStructure withPlaceFareRequest(PlaceFareRequestStructure value) {
        setPlaceFareRequest(value);
        return this;
    }

    public OJPFareRequestStructure withStaticFareRequest(StaticFareRequestStructure value) {
        setStaticFareRequest(value);
        return this;
    }

    public OJPFareRequestStructure withTripFareRequest(TripFareRequestStructure value) {
        setTripFareRequest(value);
        return this;
    }

    public OJPFareRequestStructure withMultiTripFareRequest(MultiTripFareRequestStructure value) {
        setMultiTripFareRequest(value);
        return this;
    }

    public OJPFareRequestStructure withParams(FareParamStructure value) {
        setParams(value);
        return this;
    }

    public OJPFareRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPFareRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPFareRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPFareRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPFareRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
