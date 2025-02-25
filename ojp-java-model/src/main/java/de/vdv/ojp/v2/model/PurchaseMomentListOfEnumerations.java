//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

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
 * List of Purchase Moment values.
 *
 * <p>Java-Klasse für PurchaseMomentListOfEnumerations complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PurchaseMomentListOfEnumerations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PurchaseMoment" type="{http://www.vdv.de/ojp}PurchaseMomentEnumeration" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchaseMomentListOfEnumerations", propOrder = {
    "purchaseMoment"
})
public class PurchaseMomentListOfEnumerations {

    @XmlElement(name = "PurchaseMoment", required = true)
    @XmlSchemaType(name = "normalizedString")
    protected List<PurchaseMomentEnumeration> purchaseMoment;

    /**
     * Gets the value of the purchaseMoment property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the purchaseMoment property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseMoment().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PurchaseMomentEnumeration }
     */
    public List<PurchaseMomentEnumeration> getPurchaseMoment() {
        if (purchaseMoment == null) {
            purchaseMoment = new ArrayList<PurchaseMomentEnumeration>();
        }
        return this.purchaseMoment;
    }

    public PurchaseMomentListOfEnumerations withPurchaseMoment(PurchaseMomentEnumeration... values) {
        if (values != null) {
            for (PurchaseMomentEnumeration value : values) {
                getPurchaseMoment().add(value);
            }
        }
        return this;
    }

    public PurchaseMomentListOfEnumerations withPurchaseMoment(Collection<PurchaseMomentEnumeration> values) {
        if (values != null) {
            getPurchaseMoment().addAll(values);
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
