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
 * <p>Java-Klasse für OJPTripChangeRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPTripChangeRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}TripChangeRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPTripChangeRequestStructure", propOrder = {
    "changeParams",
    "tripResult",
    "tripResponseContext",
    "extensions"
})
public class OJPTripChangeRequestStructure
    extends AbstractOJPServiceRequestStructure {

    @XmlElement(name = "ChangeParams")
    protected TripChangeParamStructure changeParams;
    @XmlElement(name = "TripResult", required = true)
    protected TripResultStructure tripResult;
    @XmlElement(name = "TripResponseContext")
    protected ResponseContextStructure tripResponseContext;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der changeParams-Eigenschaft ab.
     *
     * @return possible object is {@link TripChangeParamStructure }
     */
    public TripChangeParamStructure getChangeParams() {
        return changeParams;
    }

    /**
     * Legt den Wert der changeParams-Eigenschaft fest.
     *
     * @param value allowed object is {@link TripChangeParamStructure }
     */
    public void setChangeParams(TripChangeParamStructure value) {
        this.changeParams = value;
    }

    /**
     * Ruft den Wert der tripResult-Eigenschaft ab.
     *
     * @return possible object is {@link TripResultStructure }
     */
    public TripResultStructure getTripResult() {
        return tripResult;
    }

    /**
     * Legt den Wert der tripResult-Eigenschaft fest.
     *
     * @param value allowed object is {@link TripResultStructure }
     */
    public void setTripResult(TripResultStructure value) {
        this.tripResult = value;
    }

    /**
     * Ruft den Wert der tripResponseContext-Eigenschaft ab.
     *
     * @return possible object is {@link ResponseContextStructure }
     */
    public ResponseContextStructure getTripResponseContext() {
        return tripResponseContext;
    }

    /**
     * Legt den Wert der tripResponseContext-Eigenschaft fest.
     *
     * @param value allowed object is {@link ResponseContextStructure }
     */
    public void setTripResponseContext(ResponseContextStructure value) {
        this.tripResponseContext = value;
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

    public OJPTripChangeRequestStructure withChangeParams(TripChangeParamStructure value) {
        setChangeParams(value);
        return this;
    }

    public OJPTripChangeRequestStructure withTripResult(TripResultStructure value) {
        setTripResult(value);
        return this;
    }

    public OJPTripChangeRequestStructure withTripResponseContext(ResponseContextStructure value) {
        setTripResponseContext(value);
        return this;
    }

    public OJPTripChangeRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPTripChangeRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPTripChangeRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPTripChangeRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPTripChangeRequestStructure withRequestTimestamp(ZonedDateTime value) {
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
