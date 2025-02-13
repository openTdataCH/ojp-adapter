//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Description of the remedy to the change of a facility status (mainly when it becomes partially or totally anavailable)
 *
 * <p>Java-Klasse für RemedyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RemedyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemedyType" type="{http://www.siri.org.uk/siri}RemedyTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemedyPeriod" type="{http://www.siri.org.uk/siri}HalfOpenTimestampInputRangeStructure" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemedyStructure", propOrder = {
    "remedyType",
    "description",
    "remedyPeriod",
    "extensions"
})
public class RemedyStructure {

    @XmlElement(name = "RemedyType")
    @XmlSchemaType(name = "NMTOKEN")
    protected RemedyTypeEnumeration remedyType;
    @XmlElement(name = "Description")
    protected List<NaturalLanguageStringStructure> description;
    @XmlElement(name = "RemedyPeriod")
    protected HalfOpenTimestampInputRangeStructure remedyPeriod;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Ruft den Wert der remedyType-Eigenschaft ab.
     *
     * @return possible object is {@link RemedyTypeEnumeration }
     */
    public RemedyTypeEnumeration getRemedyType() {
        return remedyType;
    }

    /**
     * Legt den Wert der remedyType-Eigenschaft fest.
     *
     * @param value allowed object is {@link RemedyTypeEnumeration }
     */
    public void setRemedyType(RemedyTypeEnumeration value) {
        this.remedyType = value;
    }

    /**
     * Gets the value of the description property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the description property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDescription() {
        if (description == null) {
            description = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.description;
    }

    /**
     * Ruft den Wert der remedyPeriod-Eigenschaft ab.
     *
     * @return possible object is {@link HalfOpenTimestampInputRangeStructure }
     */
    public HalfOpenTimestampInputRangeStructure getRemedyPeriod() {
        return remedyPeriod;
    }

    /**
     * Legt den Wert der remedyPeriod-Eigenschaft fest.
     *
     * @param value allowed object is {@link HalfOpenTimestampInputRangeStructure }
     */
    public void setRemedyPeriod(HalfOpenTimestampInputRangeStructure value) {
        this.remedyPeriod = value;
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

    public RemedyStructure withRemedyType(RemedyTypeEnumeration value) {
        setRemedyType(value);
        return this;
    }

    public RemedyStructure withDescription(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDescription().add(value);
            }
        }
        return this;
    }

    public RemedyStructure withDescription(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDescription().addAll(values);
        }
        return this;
    }

    public RemedyStructure withRemedyPeriod(HalfOpenTimestampInputRangeStructure value) {
        setRemedyPeriod(value);
        return this;
    }

    public RemedyStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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
