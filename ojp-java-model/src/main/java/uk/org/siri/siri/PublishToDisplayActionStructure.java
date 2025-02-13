//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for Action Publish SITUATION To Display channel.
 *
 * <p>Java-Klasse für PublishToDisplayActionStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="PublishToDisplayActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OnPlace" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OnBoard" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToDisplayActionStructure", propOrder = {
    "onPlace",
    "onBoard"
})
public class PublishToDisplayActionStructure
    extends ParameterisedActionStructure {

    @XmlElement(name = "OnPlace", defaultValue = "true")
    protected Boolean onPlace;
    @XmlElement(name = "OnBoard", defaultValue = "false")
    protected Boolean onBoard;

    /**
     * Ruft den Wert der onPlace-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isOnPlace() {
        return onPlace;
    }

    /**
     * Legt den Wert der onPlace-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setOnPlace(Boolean value) {
        this.onPlace = value;
    }

    /**
     * Ruft den Wert der onBoard-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isOnBoard() {
        return onBoard;
    }

    /**
     * Legt den Wert der onBoard-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setOnBoard(Boolean value) {
        this.onBoard = value;
    }

    public PublishToDisplayActionStructure withOnPlace(Boolean value) {
        setOnPlace(value);
        return this;
    }

    public PublishToDisplayActionStructure withOnBoard(Boolean value) {
        setOnBoard(value);
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionData(ActionDataStructure... values) {
        if (values != null) {
            for (ActionDataStructure value : values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values != null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values != null) {
            for (ClosedTimestampRangeStructure value : values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values != null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToDisplayActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
