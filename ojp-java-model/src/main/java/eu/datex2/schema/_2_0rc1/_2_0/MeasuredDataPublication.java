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
 * <p>Java-Klasse für MeasuredDataPublication complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="MeasuredDataPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measurementSiteTableReference" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="siteMeasurements" type="{http://datex2.eu/schema/2_0RC1/2_0}SiteMeasurements" maxOccurs="unbounded"/&gt;
 *         &lt;element name="measuredDataPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasuredDataPublication", propOrder = {
    "measurementSiteTableReference",
    "headerInformation",
    "siteMeasurements",
    "measuredDataPublicationExtension"
})
public class MeasuredDataPublication
    extends PayloadPublication {

    @XmlElement(required = true)
    protected String measurementSiteTableReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SiteMeasurements> siteMeasurements;
    protected ExtensionType measuredDataPublicationExtension;

    /**
     * Ruft den Wert der measurementSiteTableReference-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getMeasurementSiteTableReference() {
        return measurementSiteTableReference;
    }

    /**
     * Legt den Wert der measurementSiteTableReference-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setMeasurementSiteTableReference(String value) {
        this.measurementSiteTableReference = value;
    }

    /**
     * Ruft den Wert der headerInformation-Eigenschaft ab.
     *
     * @return possible object is {@link HeaderInformation }
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Legt den Wert der headerInformation-Eigenschaft fest.
     *
     * @param value allowed object is {@link HeaderInformation }
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the siteMeasurements property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the siteMeasurements property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSiteMeasurements().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SiteMeasurements }
     */
    public List<SiteMeasurements> getSiteMeasurements() {
        if (siteMeasurements == null) {
            siteMeasurements = new ArrayList<SiteMeasurements>();
        }
        return this.siteMeasurements;
    }

    /**
     * Ruft den Wert der measuredDataPublicationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getMeasuredDataPublicationExtension() {
        return measuredDataPublicationExtension;
    }

    /**
     * Legt den Wert der measuredDataPublicationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setMeasuredDataPublicationExtension(ExtensionType value) {
        this.measuredDataPublicationExtension = value;
    }

    public MeasuredDataPublication withMeasurementSiteTableReference(String value) {
        setMeasurementSiteTableReference(value);
        return this;
    }

    public MeasuredDataPublication withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public MeasuredDataPublication withSiteMeasurements(SiteMeasurements... values) {
        if (values != null) {
            for (SiteMeasurements value : values) {
                getSiteMeasurements().add(value);
            }
        }
        return this;
    }

    public MeasuredDataPublication withSiteMeasurements(Collection<SiteMeasurements> values) {
        if (values != null) {
            getSiteMeasurements().addAll(values);
        }
        return this;
    }

    public MeasuredDataPublication withMeasuredDataPublicationExtension(ExtensionType value) {
        setMeasuredDataPublicationExtension(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPublicationTime(ZonedDateTime value) {
        setPublicationTime(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    @Override
    public MeasuredDataPublication withLang(String value) {
        setLang(value);
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
