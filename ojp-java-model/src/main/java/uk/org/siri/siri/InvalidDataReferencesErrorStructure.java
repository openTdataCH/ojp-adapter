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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for InvalidDataReferencesError:. (since SIRI 2.0).
 *
 * <p>Java-Klasse für InvalidDataReferencesErrorStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="InvalidDataReferencesErrorStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ErrorCodeStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvalidRef" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDataReferencesErrorStructure", propOrder = {
    "invalidRef"
})
public class InvalidDataReferencesErrorStructure
    extends ErrorCodeStructure {

    @XmlElement(name = "InvalidRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected List<String> invalidRef;

    /**
     * Gets the value of the invalidRef property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the invalidRef property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvalidRef().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     */
    public List<String> getInvalidRef() {
        if (invalidRef == null) {
            invalidRef = new ArrayList<String>();
        }
        return this.invalidRef;
    }

    public InvalidDataReferencesErrorStructure withInvalidRef(String... values) {
        if (values != null) {
            for (String value : values) {
                getInvalidRef().add(value);
            }
        }
        return this;
    }

    public InvalidDataReferencesErrorStructure withInvalidRef(Collection<String> values) {
        if (values != null) {
            getInvalidRef().addAll(values);
        }
        return this;
    }

    @Override
    public InvalidDataReferencesErrorStructure withErrorText(String value) {
        setErrorText(value);
        return this;
    }

    @Override
    public InvalidDataReferencesErrorStructure withNumber(BigInteger value) {
        setNumber(value);
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
