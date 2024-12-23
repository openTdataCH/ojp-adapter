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
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for list of effects.
 * 
 * <p>Java-Klasse für PtConsequencesStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PtConsequencesStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Consequence" type="{http://www.siri.org.uk/siri}PtConsequenceStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PtConsequencesStructure", propOrder = {
    "consequence"
})
public class PtConsequencesStructure {

    @XmlElement(name = "Consequence", required = true)
    protected List<PtConsequenceStructure> consequence;

    /**
     * Gets the value of the consequence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consequence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsequence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PtConsequenceStructure }
     * 
     * 
     */
    public List<PtConsequenceStructure> getConsequence() {
        if (consequence == null) {
            consequence = new ArrayList<PtConsequenceStructure>();
        }
        return this.consequence;
    }

    public PtConsequencesStructure withConsequence(PtConsequenceStructure... values) {
        if (values!= null) {
            for (PtConsequenceStructure value: values) {
                getConsequence().add(value);
            }
        }
        return this;
    }

    public PtConsequencesStructure withConsequence(Collection<PtConsequenceStructure> values) {
        if (values!= null) {
            getConsequence().addAll(values);
        }
        return this;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, OmitNullsToStringStyle.INSTANCE);
    }

}
