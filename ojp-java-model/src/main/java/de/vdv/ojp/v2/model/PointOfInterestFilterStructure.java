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
 * Filter POIs by category.
 *
 * <p>Java-Klasse für PointOfInterestFilterStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PointOfInterestFilterStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exclude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PointOfInterestCategory" type="{http://www.vdv.de/ojp}PointOfInterestCategoryStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInterestFilterStructure", propOrder = {
    "exclude",
    "pointOfInterestCategory"
})
public class PointOfInterestFilterStructure {

    @XmlElement(name = "Exclude", defaultValue = "false")
    protected Boolean exclude;
    @XmlElement(name = "PointOfInterestCategory")
    protected List<PointOfInterestCategoryStructure> pointOfInterestCategory;

    /**
     * Ruft den Wert der exclude-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isExclude() {
        return exclude;
    }

    /**
     * Legt den Wert der exclude-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setExclude(Boolean value) {
        this.exclude = value;
    }

    /**
     * Gets the value of the pointOfInterestCategory property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the pointOfInterestCategory property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfInterestCategory().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link PointOfInterestCategoryStructure }
     */
    public List<PointOfInterestCategoryStructure> getPointOfInterestCategory() {
        if (pointOfInterestCategory == null) {
            pointOfInterestCategory = new ArrayList<PointOfInterestCategoryStructure>();
        }
        return this.pointOfInterestCategory;
    }

    public PointOfInterestFilterStructure withExclude(Boolean value) {
        setExclude(value);
        return this;
    }

    public PointOfInterestFilterStructure withPointOfInterestCategory(PointOfInterestCategoryStructure... values) {
        if (values != null) {
            for (PointOfInterestCategoryStructure value : values) {
                getPointOfInterestCategory().add(value);
            }
        }
        return this;
    }

    public PointOfInterestFilterStructure withPointOfInterestCategory(Collection<PointOfInterestCategoryStructure> values) {
        if (values != null) {
            getPointOfInterestCategory().addAll(values);
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
