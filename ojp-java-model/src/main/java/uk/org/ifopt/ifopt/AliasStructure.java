//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Alternative Private Code.
 *
 * <p>Java-Klasse für AliasStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AliasStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrivateCode" type="{http://www.ifopt.org.uk/ifopt}PrivateCodeType"/&gt;
 *         &lt;element name="IdentifierType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AliasStructure", propOrder = {
    "privateCode",
    "identifierType"
})
public class AliasStructure {

    @XmlElement(name = "PrivateCode", required = true)
    protected String privateCode;
    @XmlElement(name = "IdentifierType")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifierType;

    /**
     * Ruft den Wert der privateCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getPrivateCode() {
        return privateCode;
    }

    /**
     * Legt den Wert der privateCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setPrivateCode(String value) {
        this.privateCode = value;
    }

    /**
     * Ruft den Wert der identifierType-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getIdentifierType() {
        return identifierType;
    }

    /**
     * Legt den Wert der identifierType-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setIdentifierType(String value) {
        this.identifierType = value;
    }

    public AliasStructure withPrivateCode(String value) {
        setPrivateCode(value);
        return this;
    }

    public AliasStructure withIdentifierType(String value) {
        setIdentifierType(value);
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
