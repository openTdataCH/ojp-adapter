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
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for containment of VALUE SETs and/or TYPE OF VALUEs. (since SIRI 2.1)
 *
 * <p>Java-Klasse für TypesOfValueStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="TypesOfValueStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}ValueSet"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}TypeOfValue"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypesOfValueStructure", propOrder = {
    "valueSetOrTypeOfValue"
})
public class TypesOfValueStructure {

    @XmlElements({
        @XmlElement(name = "ValueSet", type = ValueSetStructure.class),
        @XmlElement(name = "TypeOfValue", type = TypeOfValueStructure.class)
    })
    protected List<Object> valueSetOrTypeOfValue;

    /**
     * Gets the value of the valueSetOrTypeOfValue property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the valueSetOrTypeOfValue property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueSetOrTypeOfValue().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link TypeOfValueStructure } {@link ValueSetStructure }
     */
    public List<Object> getValueSetOrTypeOfValue() {
        if (valueSetOrTypeOfValue == null) {
            valueSetOrTypeOfValue = new ArrayList<Object>();
        }
        return this.valueSetOrTypeOfValue;
    }

    public TypesOfValueStructure withValueSetOrTypeOfValue(Object... values) {
        if (values != null) {
            for (Object value : values) {
                getValueSetOrTypeOfValue().add(value);
            }
        }
        return this;
    }

    public TypesOfValueStructure withValueSetOrTypeOfValue(Collection<Object> values) {
        if (values != null) {
            getValueSetOrTypeOfValue().addAll(values);
        }
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
