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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für ConsequenceContentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ConsequenceContentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsequenceText" type="{http://www.siri.org.uk/siri}DefaultedTextStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ConsequencePriority" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsequenceContentStructure", propOrder = {
    "consequenceText",
    "consequencePriority"
})
public class ConsequenceContentStructure {

    @XmlElement(name = "ConsequenceText", required = true)
    protected List<DefaultedTextStructure> consequenceText;
    @XmlElement(name = "ConsequencePriority")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consequencePriority;

    /**
     * Gets the value of the consequenceText property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the consequenceText property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsequenceText().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DefaultedTextStructure }
     */
    public List<DefaultedTextStructure> getConsequenceText() {
        if (consequenceText == null) {
            consequenceText = new ArrayList<DefaultedTextStructure>();
        }
        return this.consequenceText;
    }

    /**
     * Ruft den Wert der consequencePriority-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getConsequencePriority() {
        return consequencePriority;
    }

    /**
     * Legt den Wert der consequencePriority-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setConsequencePriority(BigInteger value) {
        this.consequencePriority = value;
    }

    public ConsequenceContentStructure withConsequenceText(DefaultedTextStructure... values) {
        if (values != null) {
            for (DefaultedTextStructure value : values) {
                getConsequenceText().add(value);
            }
        }
        return this;
    }

    public ConsequenceContentStructure withConsequenceText(Collection<DefaultedTextStructure> values) {
        if (values != null) {
            getConsequenceText().addAll(values);
        }
        return this;
    }

    public ConsequenceContentStructure withConsequencePriority(BigInteger value) {
        setConsequencePriority(value);
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
