//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.ifopt.ifopt;

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
 * A collection of one or more validity conditions.
 *
 * <p>Java-Klasse für ValidityConditionsStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ValidityConditionsStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ValidityCondition" type="{http://www.ifopt.org.uk/ifopt}ValidityConditionStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidityConditionsStructure", propOrder = {
    "validityCondition"
})
public class ValidityConditionsStructure {

    @XmlElement(name = "ValidityCondition", required = true)
    protected List<ValidityConditionStructure> validityCondition;

    /**
     * Gets the value of the validityCondition property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the validityCondition property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidityCondition().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link ValidityConditionStructure }
     */
    public List<ValidityConditionStructure> getValidityCondition() {
        if (validityCondition == null) {
            validityCondition = new ArrayList<ValidityConditionStructure>();
        }
        return this.validityCondition;
    }

    public ValidityConditionsStructure withValidityCondition(ValidityConditionStructure... values) {
        if (values != null) {
            for (ValidityConditionStructure value : values) {
                getValidityCondition().add(value);
            }
        }
        return this;
    }

    public ValidityConditionsStructure withValidityCondition(Collection<ValidityConditionStructure> values) {
        if (values != null) {
            getValidityCondition().addAll(values);
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
