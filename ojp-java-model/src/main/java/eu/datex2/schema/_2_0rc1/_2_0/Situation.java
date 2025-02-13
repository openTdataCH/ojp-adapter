//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import org.rutebanken.util.ZonedDateTimeISO8601XmlAdapter;

/**
 * <p>Java-Klasse für Situation complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Situation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="overallSeverity" type="{http://datex2.eu/schema/2_0RC1/2_0}OverallSeverityEnum" minOccurs="0"/&gt;
 *         &lt;element name="relatedSituation" type="{http://datex2.eu/schema/2_0RC1/2_0}Reference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="situationVersion" type="{http://datex2.eu/schema/2_0RC1/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="situationVersionTime" type="{http://datex2.eu/schema/2_0RC1/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2_0RC1/2_0}HeaderInformation"/&gt;
 *         &lt;element name="situationRecord" type="{http://datex2.eu/schema/2_0RC1/2_0}SituationRecord" maxOccurs="unbounded"/&gt;
 *         &lt;element name="situationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Situation", propOrder = {
    "overallSeverity",
    "relatedSituation",
    "situationVersion",
    "situationVersionTime",
    "headerInformation",
    "situationRecord",
    "situationExtension"
})
public class Situation {

    @XmlSchemaType(name = "string")
    protected OverallSeverityEnum overallSeverity;
    protected List<String> relatedSituation;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger situationVersion;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(ZonedDateTimeISO8601XmlAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected ZonedDateTime situationVersionTime;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<SituationRecord> situationRecord;
    protected ExtensionType situationExtension;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Ruft den Wert der overallSeverity-Eigenschaft ab.
     *
     * @return possible object is {@link OverallSeverityEnum }
     */
    public OverallSeverityEnum getOverallSeverity() {
        return overallSeverity;
    }

    /**
     * Legt den Wert der overallSeverity-Eigenschaft fest.
     *
     * @param value allowed object is {@link OverallSeverityEnum }
     */
    public void setOverallSeverity(OverallSeverityEnum value) {
        this.overallSeverity = value;
    }

    /**
     * Gets the value of the relatedSituation property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the relatedSituation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedSituation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getRelatedSituation() {
        if (relatedSituation == null) {
            relatedSituation = new ArrayList<String>();
        }
        return this.relatedSituation;
    }

    /**
     * Ruft den Wert der situationVersion-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getSituationVersion() {
        return situationVersion;
    }

    /**
     * Legt den Wert der situationVersion-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setSituationVersion(BigInteger value) {
        this.situationVersion = value;
    }

    /**
     * Ruft den Wert der situationVersionTime-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public ZonedDateTime getSituationVersionTime() {
        return situationVersionTime;
    }

    /**
     * Legt den Wert der situationVersionTime-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSituationVersionTime(ZonedDateTime value) {
        this.situationVersionTime = value;
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
     * Gets the value of the situationRecord property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the situationRecord property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituationRecord().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link SituationRecord }
     */
    public List<SituationRecord> getSituationRecord() {
        if (situationRecord == null) {
            situationRecord = new ArrayList<SituationRecord>();
        }
        return this.situationRecord;
    }

    /**
     * Ruft den Wert der situationExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getSituationExtension() {
        return situationExtension;
    }

    /**
     * Legt den Wert der situationExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setSituationExtension(ExtensionType value) {
        this.situationExtension = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    public Situation withOverallSeverity(OverallSeverityEnum value) {
        setOverallSeverity(value);
        return this;
    }

    public Situation withRelatedSituation(String... values) {
        if (values != null) {
            for (String value : values) {
                getRelatedSituation().add(value);
            }
        }
        return this;
    }

    public Situation withRelatedSituation(Collection<String> values) {
        if (values != null) {
            getRelatedSituation().addAll(values);
        }
        return this;
    }

    public Situation withSituationVersion(BigInteger value) {
        setSituationVersion(value);
        return this;
    }

    public Situation withSituationVersionTime(ZonedDateTime value) {
        setSituationVersionTime(value);
        return this;
    }

    public Situation withHeaderInformation(HeaderInformation value) {
        setHeaderInformation(value);
        return this;
    }

    public Situation withSituationRecord(SituationRecord... values) {
        if (values != null) {
            for (SituationRecord value : values) {
                getSituationRecord().add(value);
            }
        }
        return this;
    }

    public Situation withSituationRecord(Collection<SituationRecord> values) {
        if (values != null) {
            getSituationRecord().addAll(values);
        }
        return this;
    }

    public Situation withSituationExtension(ExtensionType value) {
        setSituationExtension(value);
        return this;
    }

    public Situation withId(String value) {
        setId(value);
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
