//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * <p>Java-Klasse für PayloadPublication complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PayloadPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feedDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="feedType" type="{http://datex2.eu/schema/2_0RC1/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="publicationTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime"/&gt;
 *         &lt;element name="publicationCreator" type="{http://datex2.eu/schema/2_0RC1/2_0}InternationalIdentifier"/&gt;
 *         &lt;element name="payloadPublicationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="lang" use="required" type="{http://datex2.eu/schema/2_0RC1/2_0}Language" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayloadPublication", propOrder = {
    "feedDescription",
    "feedType",
    "publicationTime",
    "publicationCreator",
    "payloadPublicationExtension"
})
@XmlSeeAlso({
    ElaboratedDataPublication.class,
    GenericPublication.class,
    MeasuredDataPublication.class,
    MeasurementSiteTablePublication.class,
    PredefinedLocationsPublication.class,
    SituationPublication.class,
    TrafficViewPublication.class
})
public abstract class PayloadPublication {

    protected MultilingualString feedDescription;
    protected String feedType;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime publicationTime;
    @XmlElement(required = true)
    protected InternationalIdentifier publicationCreator;
    protected ExtensionType payloadPublicationExtension;
    @XmlAttribute(name = "lang", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    /**
     * Ruft den Wert der feedDescription-Eigenschaft ab.
     *
     * @return possible object is {@link MultilingualString }
     */
    public MultilingualString getFeedDescription() {
        return feedDescription;
    }

    /**
     * Legt den Wert der feedDescription-Eigenschaft fest.
     *
     * @param value allowed object is {@link MultilingualString }
     */
    public void setFeedDescription(MultilingualString value) {
        this.feedDescription = value;
    }

    /**
     * Ruft den Wert der feedType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * Legt den Wert der feedType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setFeedType(String value) {
        this.feedType = value;
    }

    /**
     * Ruft den Wert der publicationTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getPublicationTime() {
        return publicationTime;
    }

    /**
     * Legt den Wert der publicationTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPublicationTime(ZonedDateTime value) {
        this.publicationTime = value;
    }

    /**
     * Ruft den Wert der publicationCreator-Eigenschaft ab.
     *
     * @return possible object is {@link InternationalIdentifier }
     */
    public InternationalIdentifier getPublicationCreator() {
        return publicationCreator;
    }

    /**
     * Legt den Wert der publicationCreator-Eigenschaft fest.
     *
     * @param value allowed object is {@link InternationalIdentifier }
     */
    public void setPublicationCreator(InternationalIdentifier value) {
        this.publicationCreator = value;
    }

    /**
     * Ruft den Wert der payloadPublicationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getPayloadPublicationExtension() {
        return payloadPublicationExtension;
    }

    /**
     * Legt den Wert der payloadPublicationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setPayloadPublicationExtension(ExtensionType value) {
        this.payloadPublicationExtension = value;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setLang(String value) {
        this.lang = value;
    }

    public PayloadPublication withFeedDescription(MultilingualString value) {
        setFeedDescription(value);
        return this;
    }

    public PayloadPublication withFeedType(String value) {
        setFeedType(value);
        return this;
    }

    public PayloadPublication withPublicationTime(ZonedDateTime value) {
        setPublicationTime(value);
        return this;
    }

    public PayloadPublication withPublicationCreator(InternationalIdentifier value) {
        setPublicationCreator(value);
        return this;
    }

    public PayloadPublication withPayloadPublicationExtension(ExtensionType value) {
        setPayloadPublicationExtension(value);
        return this;
    }

    public PayloadPublication withLang(String value) {
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
