//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.time.ZonedDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.ExtensionsStructure;
import uk.org.siri.siri.MessageQualifierStructure;


/**
 * <p>Java-Klasse für OJPTripRefineRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPTripRefineRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripRefineRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPTripRefineRequestStructure", propOrder = {
    "refineParams",
    "tripResult",
    "tripResponseContext",
    "extensions"
})
public class OJPTripRefineRequestStructure
    extends AbstractOJPServiceRequestStructure
{

    @XmlElement(name = "RefineParams")
    protected TripRefineParamStructure refineParams;
    @XmlElement(name = "TripResult", required = true)
    protected TripResultStructure tripResult;
    @XmlElement(name = "TripResponseContext")
    protected ResponseContextStructure tripResponseContext;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der refineParams-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripRefineParamStructure }
     *     
     */
    public TripRefineParamStructure getRefineParams() {
        return refineParams;
    }

    /**
     * Legt den Wert der refineParams-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripRefineParamStructure }
     *     
     */
    public void setRefineParams(TripRefineParamStructure value) {
        this.refineParams = value;
    }

    /**
     * Ruft den Wert der tripResult-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TripResultStructure }
     *     
     */
    public TripResultStructure getTripResult() {
        return tripResult;
    }

    /**
     * Legt den Wert der tripResult-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TripResultStructure }
     *     
     */
    public void setTripResult(TripResultStructure value) {
        this.tripResult = value;
    }

    /**
     * Ruft den Wert der tripResponseContext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResponseContextStructure }
     *     
     */
    public ResponseContextStructure getTripResponseContext() {
        return tripResponseContext;
    }

    /**
     * Legt den Wert der tripResponseContext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseContextStructure }
     *     
     */
    public void setTripResponseContext(ResponseContextStructure value) {
        this.tripResponseContext = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public OJPTripRefineRequestStructure withRefineParams(TripRefineParamStructure value) {
        setRefineParams(value);
        return this;
    }

    public OJPTripRefineRequestStructure withTripResult(TripResultStructure value) {
        setTripResult(value);
        return this;
    }

    public OJPTripRefineRequestStructure withTripResponseContext(ResponseContextStructure value) {
        setTripResponseContext(value);
        return this;
    }

    public OJPTripRefineRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripRefineRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPTripRefineRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPTripRefineRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPTripRefineRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
