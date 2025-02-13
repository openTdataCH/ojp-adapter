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
 * <p>Java-Klasse für OJPExchangePointsRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="OJPExchangePointsRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}ExchangePointsRequestGroup"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJPExchangePointsRequestStructure", propOrder = {
    "placeRef",
    "params",
    "extensions"
})
public class OJPExchangePointsRequestStructure
    extends AbstractOJPServiceRequestStructure {

    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "Params")
    protected ExchangePointsParamStructure params;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     *
     * @return possible object is {@link PlaceRefStructure }
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link PlaceRefStructure }
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der params-Eigenschaft ab.
     *
     * @return possible object is {@link ExchangePointsParamStructure }
     */
    public ExchangePointsParamStructure getParams() {
        return params;
    }

    /**
     * Legt den Wert der params-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExchangePointsParamStructure }
     */
    public void setParams(ExchangePointsParamStructure value) {
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

    public OJPExchangePointsRequestStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public OJPExchangePointsRequestStructure withParams(ExchangePointsParamStructure value) {
        setParams(value);
        return this;
    }

    public OJPExchangePointsRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPExchangePointsRequestStructure withRequestTimestamp(ZonedDateTime value) {
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
