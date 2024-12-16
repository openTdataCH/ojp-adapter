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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für MeasurementSiteTablePublication complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTablePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="measurementSiteTable" type="{http://datex2.eu/schema/2_0RC1/2_0}MeasurementSiteTable" maxOccurs="unbounded"/&gt;
 *         &lt;element name="measurementSiteTablePublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSiteTablePublication", propOrder = {
    "headerInformation",
    "measurementSiteTable",
    "measurementSiteTablePublicationExtension"
})
public class MeasurementSiteTablePublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<MeasurementSiteTable> measurementSiteTable;
    protected ExtensionType measurementSiteTablePublicationExtension;

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
     * Gets the value of the measurementSiteTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteTable }
     * 
     * 
     */
    public List<MeasurementSiteTable> getMeasurementSiteTable() {
        if (measurementSiteTable == null) {
            measurementSiteTable = new ArrayList<MeasurementSiteTable>();
        }
        return this.measurementSiteTable;
    }

    /**
     * Ruft den Wert der measurementSiteTablePublicationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTablePublicationExtension() {
        return measurementSiteTablePublicationExtension;
    }

    /**
     * Legt den Wert der measurementSiteTablePublicationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTablePublicationExtension(ExtensionType value) {
        this.measurementSiteTablePublicationExtension = value;
    }

    public MeasurementSiteTablePublication withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public MeasurementSiteTablePublication withMeasurementSiteTable(MeasurementSiteTable... values) {
        if (values!= null) {
            for (MeasurementSiteTable value: values) {
                getMeasurementSiteTable().add(value);
            }
        }
        return this;
    }

    public MeasurementSiteTablePublication withMeasurementSiteTable(Collection<MeasurementSiteTable> values) {
        if (values!= null) {
            getMeasurementSiteTable().addAll(values);
        }
        return this;
    }

    public MeasurementSiteTablePublication withMeasurementSiteTablePublicationExtension(ExtensionType value) {
        setMeasurementSiteTablePublicationExtension(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withPublicationTime(ZonedDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public MeasurementSiteTablePublication withLang(String value) {
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
