//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for a VALUE SET. Used to define open classifications of value types. (since SIRI 2.1)
 *
 * <p>Java-Klasse für ValueSetStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ValueSetStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValueSetCode" type="{http://www.siri.org.uk/siri}ValueSetCodeType"/&gt;
 *         &lt;element name="ClassOfValues" type="{http://www.siri.org.uk/siri}NameOfClassType"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ValueSetGroup"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueSetStructure", propOrder = {
    "valueSetCode",
    "classOfValues",
    "name",
    "values"
})
public class ValueSetStructure {

    @XmlElement(name = "ValueSetCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String valueSetCode;
    @XmlElement(name = "ClassOfValues", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String classOfValues;
    @XmlElement(name = "Name")
    protected NaturalLanguageStringStructure name;
    @XmlElement(name = "Values", required = true)
    protected ValuesStructure values;

    /**
     * Ruft den Wert der valueSetCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getValueSetCode() {
        return valueSetCode;
    }

    /**
     * Legt den Wert der valueSetCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setValueSetCode(String value) {
        this.valueSetCode = value;
    }

    /**
     * Ruft den Wert der classOfValues-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getClassOfValues() {
        return classOfValues;
    }

    /**
     * Legt den Wert der classOfValues-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setClassOfValues(String value) {
        this.classOfValues = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     *
     * @return possible object is {@link NaturalLanguageStringStructure }
     */
    public NaturalLanguageStringStructure getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     *
     * @param value allowed object is {@link NaturalLanguageStringStructure }
     */
    public void setName(NaturalLanguageStringStructure value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der values-Eigenschaft ab.
     *
     * @return possible object is {@link ValuesStructure }
     */
    public ValuesStructure getValues() {
        return values;
    }

    /**
     * Legt den Wert der values-Eigenschaft fest.
     *
     * @param value allowed object is {@link ValuesStructure }
     */
    public void setValues(ValuesStructure value) {
        this.values = value;
    }

    public ValueSetStructure withValueSetCode(String value) {
        setValueSetCode(value);
        return this;
    }

    public ValueSetStructure withClassOfValues(String value) {
        setClassOfValues(value);
        return this;
    }

    public ValueSetStructure withName(NaturalLanguageStringStructure value) {
        setName(value);
        return this;
    }

    public ValueSetStructure withValues(ValuesStructure value) {
        setValues(value);
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
