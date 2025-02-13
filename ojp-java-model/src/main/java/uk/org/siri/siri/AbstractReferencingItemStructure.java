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
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for an Activity that references a previous Activity.
 *
 * <p>Java-Klasse für AbstractReferencingItemStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractReferencingItemStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractItemStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ItemRef" type="{http://www.siri.org.uk/siri}ItemRefStructure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractReferencingItemStructure", propOrder = {
    "itemRef"
})
public abstract class AbstractReferencingItemStructure
    extends AbstractItemStructure {

    @XmlElement(name = "ItemRef")
    protected ItemRefStructure itemRef;

    /**
     * Ruft den Wert der itemRef-Eigenschaft ab.
     *
     * @return possible object is {@link ItemRefStructure }
     */
    public ItemRefStructure getItemRef() {
        return itemRef;
    }

    /**
     * Legt den Wert der itemRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link ItemRefStructure }
     */
    public void setItemRef(ItemRefStructure value) {
        this.itemRef = value;
    }

    public AbstractReferencingItemStructure withItemRef(ItemRefStructure value) {
        setItemRef(value);
        return this;
    }

    @Override
    public AbstractReferencingItemStructure withRecordedAtTime(ZonedDateTime value) {
        setRecordedAtTime(value);
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
