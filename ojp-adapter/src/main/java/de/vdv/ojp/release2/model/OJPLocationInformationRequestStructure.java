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
 * <p>Java-Klasse für OJPLocationInformationRequestStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="OJPLocationInformationRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.vdv.de/ojp}AbstractOJPServiceRequestStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.vdv.de/ojp}LocationInformationRequestGroup"/&gt;
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
@XmlType(name = "OJPLocationInformationRequestStructure", propOrder = {
    "initialInput",
    "placeRef",
    "restrictions",
    "extensions"
})
public class OJPLocationInformationRequestStructure
    extends AbstractOJPServiceRequestStructure
{

    @XmlElement(name = "InitialInput")
    protected InitialLocationInputStructure initialInput;
    @XmlElement(name = "PlaceRef")
    protected PlaceRefStructure placeRef;
    @XmlElement(name = "Restrictions")
    protected PlaceParamStructure restrictions;
    @XmlElement(name = "Extensions", namespace = "http://www.siri.org.uk/siri")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der initialInput-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public InitialLocationInputStructure getInitialInput() {
        return initialInput;
    }

    /**
     * Legt den Wert der initialInput-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialLocationInputStructure }
     *     
     */
    public void setInitialInput(InitialLocationInputStructure value) {
        this.initialInput = value;
    }

    /**
     * Ruft den Wert der placeRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceRefStructure }
     *     
     */
    public PlaceRefStructure getPlaceRef() {
        return placeRef;
    }

    /**
     * Legt den Wert der placeRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceRefStructure }
     *     
     */
    public void setPlaceRef(PlaceRefStructure value) {
        this.placeRef = value;
    }

    /**
     * Ruft den Wert der restrictions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlaceParamStructure }
     *     
     */
    public PlaceParamStructure getRestrictions() {
        return restrictions;
    }

    /**
     * Legt den Wert der restrictions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceParamStructure }
     *     
     */
    public void setRestrictions(PlaceParamStructure value) {
        this.restrictions = value;
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

    public OJPLocationInformationRequestStructure withInitialInput(InitialLocationInputStructure value) {
        setInitialInput(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withPlaceRef(PlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withRestrictions(PlaceParamStructure value) {
        setRestrictions(value);
        return this;
    }

    public OJPLocationInformationRequestStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public OJPLocationInformationRequestStructure withRequestTimestamp(ZonedDateTime value) {
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
