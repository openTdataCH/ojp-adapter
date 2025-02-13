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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Service Feature description.
 *
 * <p>Java-Klasse für ServiceFeatureStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ServiceFeatureStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceFeatureCode" type="{http://www.siri.org.uk/siri}ServiceFeatureCodeType"/&gt;
 *         &lt;element name="Name" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Icon" type="{http://www.w3.org/2001/XMLSchema}anyURI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceFeatureStructure", propOrder = {
    "serviceFeatureCode",
    "name",
    "icon"
})
public class ServiceFeatureStructure {

    @XmlElement(name = "ServiceFeatureCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String serviceFeatureCode;
    @XmlElement(name = "Name", required = true)
    protected List<NaturalLanguageStringStructure> name;
    @XmlElement(name = "Icon", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String icon;

    /**
     * Ruft den Wert der serviceFeatureCode-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getServiceFeatureCode() {
        return serviceFeatureCode;
    }

    /**
     * Legt den Wert der serviceFeatureCode-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setServiceFeatureCode(String value) {
        this.serviceFeatureCode = value;
    }

    /**
     * Gets the value of the name property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the name property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getName() {
        if (name == null) {
            name = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.name;
    }

    /**
     * Ruft den Wert der icon-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Legt den Wert der icon-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    public ServiceFeatureStructure withServiceFeatureCode(String value) {
        setServiceFeatureCode(value);
        return this;
    }

    public ServiceFeatureStructure withName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getName().add(value);
            }
        }
        return this;
    }

    public ServiceFeatureStructure withName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getName().addAll(values);
        }
        return this;
    }

    public ServiceFeatureStructure withIcon(String value) {
        setIcon(value);
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
