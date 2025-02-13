//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package net.opengis.gml._3;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * gml:CodeType is a generalized type to be used for a term, keyword or name. It adds a XML attribute codeSpace to a term, where the value of the codeSpace attribute (if present) shall indicate a
 * dictionary, thesaurus, classification scheme, authority, or pattern for the term.
 *
 * <p>Java-Klasse für CodeType complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="CodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="codeSpace" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CodeWithAuthorityType.class
})
public class CodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "codeSpace")
    @XmlSchemaType(name = "anyURI")
    protected String codeSpace;

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der codeSpace-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getCodeSpace() {
        return codeSpace;
    }

    /**
     * Legt den Wert der codeSpace-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setCodeSpace(String value) {
        this.codeSpace = value;
    }

    public CodeType withValue(String value) {
        setValue(value);
        return this;
    }

    public CodeType withCodeSpace(String value) {
        setCodeSpace(value);
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
