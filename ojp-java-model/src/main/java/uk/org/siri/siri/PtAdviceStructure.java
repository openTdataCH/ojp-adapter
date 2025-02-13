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
 * Type for (structured) advice. The AdviceType enumerated value can be used to generate standardized messages describing the SITUATION. If no enumerated value is given, AdviceName is used instead.
 * Note: this means that AdviceName is NOT a complete message, but only a (few) word(s) to be included in the message! Alternatively, AdviceRef can be used to reference a (complete) standardised
 * advisory message.
 *
 *
 * <p>Java-Klasse für PtAdviceStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PtAdviceStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdviceRef" type="{http://www.siri.org.uk/siri}AdviceRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="AdviceType" type="{http://www.siri.org.uk/siri}AdviceTypeEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="AdviceName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Details" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtAdviceStructure", propOrder = {
    "adviceRef",
    "adviceType",
    "adviceName",
    "details"
})
public class PtAdviceStructure {

    @XmlElement(name = "AdviceRef")
    protected AdviceRefStructure adviceRef;
    @XmlElement(name = "AdviceType")
    @XmlSchemaType(name = "NMTOKEN")
    protected AdviceTypeEnumeration adviceType;
    @XmlElement(name = "AdviceName")
    protected List<NaturalLanguageStringStructure> adviceName;
    @XmlElement(name = "Details")
    protected List<NaturalLanguageStringStructure> details;

    /**
     * Ruft den Wert der adviceRef-Eigenschaft ab.
     *
     * @return possible object is {@link AdviceRefStructure }
     */
    public AdviceRefStructure getAdviceRef() {
        return adviceRef;
    }

    /**
     * Legt den Wert der adviceRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link AdviceRefStructure }
     */
    public void setAdviceRef(AdviceRefStructure value) {
        this.adviceRef = value;
    }

    /**
     * Ruft den Wert der adviceType-Eigenschaft ab.
     *
     * @return possible object is {@link AdviceTypeEnumeration }
     */
    public AdviceTypeEnumeration getAdviceType() {
        return adviceType;
    }

    /**
     * Legt den Wert der adviceType-Eigenschaft fest.
     *
     * @param value allowed object is {@link AdviceTypeEnumeration }
     */
    public void setAdviceType(AdviceTypeEnumeration value) {
        this.adviceType = value;
    }

    /**
     * Gets the value of the adviceName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the adviceName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdviceName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getAdviceName() {
        if (adviceName == null) {
            adviceName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.adviceName;
    }

    /**
     * Gets the value of the details property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the details property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetails().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDetails() {
        if (details == null) {
            details = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.details;
    }

    public PtAdviceStructure withAdviceRef(AdviceRefStructure value) {
        setAdviceRef(value);
        return this;
    }

    public PtAdviceStructure withAdviceType(AdviceTypeEnumeration value) {
        setAdviceType(value);
        return this;
    }

    public PtAdviceStructure withAdviceName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getAdviceName().add(value);
            }
        }
        return this;
    }

    public PtAdviceStructure withAdviceName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getAdviceName().addAll(values);
        }
        return this;
    }

    public PtAdviceStructure withDetails(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDetails().add(value);
            }
        }
        return this;
    }

    public PtAdviceStructure withDetails(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDetails().addAll(values);
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
