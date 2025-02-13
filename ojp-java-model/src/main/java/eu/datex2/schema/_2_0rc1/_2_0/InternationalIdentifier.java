//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für InternationalIdentifier complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InternationalIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/2_0RC1/2_0}CountryEnum"/&gt;
 *         &lt;element name="nationalIdentifier" type="{http://datex2.eu/schema/2_0RC1/2_0}String"/&gt;
 *         &lt;element name="internationalIdentifierExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalIdentifier", propOrder = {
    "country",
    "nationalIdentifier",
    "internationalIdentifierExtension"
})
public class InternationalIdentifier {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CountryEnum country;
    @XmlElement(required = true)
    protected String nationalIdentifier;
    protected ExtensionType internationalIdentifierExtension;

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     *
     * @return possible object is {@link CountryEnum }
     */
    public CountryEnum getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     *
     * @param value allowed object is {@link CountryEnum }
     */
    public void setCountry(CountryEnum value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der nationalIdentifier-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getNationalIdentifier() {
        return nationalIdentifier;
    }

    /**
     * Legt den Wert der nationalIdentifier-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setNationalIdentifier(String value) {
        this.nationalIdentifier = value;
    }

    /**
     * Ruft den Wert der internationalIdentifierExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getInternationalIdentifierExtension() {
        return internationalIdentifierExtension;
    }

    /**
     * Legt den Wert der internationalIdentifierExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setInternationalIdentifierExtension(ExtensionType value) {
        this.internationalIdentifierExtension = value;
    }

    public InternationalIdentifier withCountry(CountryEnum value) {
        setCountry(value);
        return this;
    }

    public InternationalIdentifier withNationalIdentifier(String value) {
        setNationalIdentifier(value);
        return this;
    }

    public InternationalIdentifier withInternationalIdentifierExtension(ExtensionType value) {
        setInternationalIdentifierExtension(value);
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
