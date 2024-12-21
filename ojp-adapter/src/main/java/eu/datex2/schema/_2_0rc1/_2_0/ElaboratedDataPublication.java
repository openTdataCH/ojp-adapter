//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;


/**
 * <p>Java-Klasse für ElaboratedDataPublication complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="forecastDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="periodDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}Seconds" minOccurs="0"/&gt;
 *         &lt;element name="timeDefault" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="referenceSettings" type="{http://datex2.eu/schema/2_0RC1/2_0}ReferenceSettings" minOccurs="0"/&gt;
 *         &lt;element name="elaboratedData" type="{http://datex2.eu/schema/2_0RC1/2_0}ElaboratedData" maxOccurs="unbounded"/&gt;
 *         &lt;element name="elaboratedDataPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataPublication", propOrder = {
    "forecastDefault",
    "periodDefault",
    "timeDefault",
    "headerInformation",
    "referenceSettings",
    "elaboratedData",
    "elaboratedDataPublicationExtension"
})
public class ElaboratedDataPublication
    extends PayloadPublication
{

    protected Boolean forecastDefault;
    protected Float periodDefault;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime timeDefault;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    protected ReferenceSettings referenceSettings;
    @XmlElement(required = true)
    protected List<ElaboratedData> elaboratedData;
    protected ExtensionType elaboratedDataPublicationExtension;

    /**
     * Ruft den Wert der forecastDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastDefault() {
        return forecastDefault;
    }

    /**
     * Legt den Wert der forecastDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastDefault(Boolean value) {
        this.forecastDefault = value;
    }

    /**
     * Ruft den Wert der periodDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPeriodDefault() {
        return periodDefault;
    }

    /**
     * Legt den Wert der periodDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPeriodDefault(Float value) {
        this.periodDefault = value;
    }

    /**
     * Ruft den Wert der timeDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public ZonedDateTime getTimeDefault() {
        return timeDefault;
    }

    /**
     * Legt den Wert der timeDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeDefault(ZonedDateTime value) {
        this.timeDefault = value;
    }

    /**
     * Ruft den Wert der headerInformation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Legt den Wert der headerInformation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Ruft den Wert der referenceSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceSettings }
     *     
     */
    public ReferenceSettings getReferenceSettings() {
        return referenceSettings;
    }

    /**
     * Legt den Wert der referenceSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceSettings }
     *     
     */
    public void setReferenceSettings(ReferenceSettings value) {
        this.referenceSettings = value;
    }

    /**
     * Gets the value of the elaboratedData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the elaboratedData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElaboratedData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElaboratedData }
     * 
     * 
     */
    public List<ElaboratedData> getElaboratedData() {
        if (elaboratedData == null) {
            elaboratedData = new ArrayList<ElaboratedData>();
        }
        return this.elaboratedData;
    }

    /**
     * Ruft den Wert der elaboratedDataPublicationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataPublicationExtension() {
        return elaboratedDataPublicationExtension;
    }

    /**
     * Legt den Wert der elaboratedDataPublicationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataPublicationExtension(ExtensionType value) {
        this.elaboratedDataPublicationExtension = value;
    }

    public ElaboratedDataPublication withForecastDefault(Boolean value) {
        setForecastDefault(value);
        return this;
    }

    public ElaboratedDataPublication withPeriodDefault(Float value) {
        setPeriodDefault(value);
        return this;
    }

    public ElaboratedDataPublication withTimeDefault(ZonedDateTime value) {
        setTimeDefault(value);
        return this;
    }

    public ElaboratedDataPublication withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public ElaboratedDataPublication withReferenceSettings(ReferenceSettings value) {
        setReferenceSettings(value);
        return this;
    }

    public ElaboratedDataPublication withElaboratedData(ElaboratedData... values) {
        if (values!= null) {
            for (ElaboratedData value: values) {
                getElaboratedData().add(value);
            }
        }
        return this;
    }

    public ElaboratedDataPublication withElaboratedData(Collection<ElaboratedData> values) {
        if (values!= null) {
            getElaboratedData().addAll(values);
        }
        return this;
    }

    public ElaboratedDataPublication withElaboratedDataPublicationExtension(ExtensionType value) {
        setElaboratedDataPublicationExtension(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withPublicationTime(ZonedDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public ElaboratedDataPublication withLang(String value) {
        setLang(value);
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
