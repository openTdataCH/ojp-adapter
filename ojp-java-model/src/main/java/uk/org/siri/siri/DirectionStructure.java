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
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for DIRECTION.
 *
 * <p>Java-Klasse für DirectionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="DirectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure"/&gt;
 *         &lt;element name="DirectionName" type="{http://www.siri.org.uk/siri}NaturalLanguageStringStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionStructure", propOrder = {
    "directionRef",
    "directionName"
})
public class DirectionStructure {

    @XmlElement(name = "DirectionRef", required = true)
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "DirectionName")
    protected List<NaturalLanguageStringStructure> directionName;

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     *
     * @return possible object is {@link DirectionRefStructure }
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DirectionRefStructure }
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the directionName property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the directionName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectionName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link NaturalLanguageStringStructure }
     */
    public List<NaturalLanguageStringStructure> getDirectionName() {
        if (directionName == null) {
            directionName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.directionName;
    }

    public DirectionStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public DirectionStructure withDirectionName(NaturalLanguageStringStructure... values) {
        if (values != null) {
            for (NaturalLanguageStringStructure value : values) {
                getDirectionName().add(value);
            }
        }
        return this;
    }

    public DirectionStructure withDirectionName(Collection<NaturalLanguageStringStructure> values) {
        if (values != null) {
            getDirectionName().addAll(values);
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
