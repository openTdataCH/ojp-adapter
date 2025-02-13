//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.NaturalLanguageStringStructure;

/**
 * [a restricted view of ALTERNATIVE NAME in TMv6] alternative identified text to be used in specified languages.
 *
 * <p>Java-Klasse für InternationalTextStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InternationalTextStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Text" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TextId" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternationalTextStructure", propOrder = {
    "text",
    "textId"
})
public class InternationalTextStructure {

    @XmlElement(name = "Text", required = true)
    protected List<NaturalLanguageStringStructure> text;
    @XmlElement(name = "TextId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String textId;

    /**
     * Gets the value of the text property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the text property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getText() {
        if (text == null) {
            text = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.text;
    }

    /**
     * Ruft den Wert der textId-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getTextId() {
        return textId;
    }

    /**
     * Legt den Wert der textId-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setTextId(String value) {
        this.textId = value;
    }

    public InternationalTextStructure withText(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getText().add(value);
            }
        }
        return this;
    }

    public InternationalTextStructure withText(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getText().addAll(values);
        }
        return this;
    }

    public InternationalTextStructure withTextId(String value) {
        setTextId(value);
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
