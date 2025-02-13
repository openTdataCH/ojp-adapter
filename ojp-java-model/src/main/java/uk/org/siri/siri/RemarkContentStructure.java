//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.math.BigInteger;
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
 * <p>Java-Klasse für RemarkContentStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="RemarkContentStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Remark" type="{http://www.siri.org.uk/siri}DefaultedTextStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RemarkPriority" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkContentStructure", propOrder = {
    "remark",
    "remarkPriority"
})
public class RemarkContentStructure {

    @XmlElement(name = "Remark", required = true)
    protected List<DefaultedTextStructure> remark;
    @XmlElement(name = "RemarkPriority")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger remarkPriority;

    /**
     * Gets the value of the remark property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the remark property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link DefaultedTextStructure }
     */
    public List<DefaultedTextStructure> getRemark() {
        if (remark == null) {
            remark = new ArrayList<DefaultedTextStructure>();
        }
        return this.remark;
    }

    /**
     * Ruft den Wert der remarkPriority-Eigenschaft ab.
     *
     * @return possible object is {@link BigInteger }
     */
    public BigInteger getRemarkPriority() {
        return remarkPriority;
    }

    /**
     * Legt den Wert der remarkPriority-Eigenschaft fest.
     *
     * @param value allowed object is {@link BigInteger }
     */
    public void setRemarkPriority(BigInteger value) {
        this.remarkPriority = value;
    }

    public RemarkContentStructure withRemark(DefaultedTextStructure... values) {
        if (values != null) {
            for (DefaultedTextStructure value : values) {
                getRemark().add(value);
            }
        }
        return this;
    }

    public RemarkContentStructure withRemark(Collection<DefaultedTextStructure> values) {
        if (values != null) {
            getRemark().addAll(values);
        }
        return this;
    }

    public RemarkContentStructure withRemarkPriority(BigInteger value) {
        setRemarkPriority(value);
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
