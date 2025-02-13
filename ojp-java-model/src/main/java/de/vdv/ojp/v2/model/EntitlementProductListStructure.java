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
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * A list of ENTITLEMENT PRODUCTs
 *
 * <p>Java-Klasse für EntitlementProductListStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="EntitlementProductListStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EntitlementProduct" type="{http://www.vdv.de/ojp}EntitlementProductStructure" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitlementProductListStructure", propOrder = {
    "entitlementProduct"
})
public class EntitlementProductListStructure {

    @XmlElement(name = "EntitlementProduct", required = true)
    protected List<EntitlementProductStructure> entitlementProduct;

    /**
     * Gets the value of the entitlementProduct property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the entitlementProduct property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntitlementProduct().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link EntitlementProductStructure }
     */
    public List<EntitlementProductStructure> getEntitlementProduct() {
        if (entitlementProduct == null) {
            entitlementProduct = new ArrayList<EntitlementProductStructure>();
        }
        return this.entitlementProduct;
    }

    public EntitlementProductListStructure withEntitlementProduct(EntitlementProductStructure... values) {
        if (values != null) {
            for (EntitlementProductStructure value : values) {
                getEntitlementProduct().add(value);
            }
        }
        return this;
    }

    public EntitlementProductListStructure withEntitlementProduct(Collection<EntitlementProductStructure> values) {
        if (values != null) {
            getEntitlementProduct().addAll(values);
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
