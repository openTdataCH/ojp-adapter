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
 * Type for Notify SITUATION to TV channel.
 * 
 * <p>Java-Klasse für PublishToTvActionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PublishToTvActionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}ParameterisedActionStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ceefax" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Teletext" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublishToTvActionStructure", propOrder = {
    "ceefax",
    "teletext"
})
public class PublishToTvActionStructure
    extends ParameterisedActionStructure
{

    @XmlElement(name = "Ceefax", defaultValue = "true")
    protected Boolean ceefax;
    @XmlElement(name = "Teletext", defaultValue = "true")
    protected Boolean teletext;

    /**
     * Ruft den Wert der ceefax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCeefax() {
        return ceefax;
    }

    /**
     * Legt den Wert der ceefax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCeefax(Boolean value) {
        this.ceefax = value;
    }

    /**
     * Ruft den Wert der teletext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTeletext() {
        return teletext;
    }

    /**
     * Legt den Wert der teletext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTeletext(Boolean value) {
        this.teletext = value;
    }

    public PublishToTvActionStructure withCeefax(Boolean value) {
        setCeefax(value);
        return this;
    }

    public PublishToTvActionStructure withTeletext(Boolean value) {
        setTeletext(value);
        return this;
    }

    @Override
    public PublishToTvActionStructure withDescription(NaturalLanguageStringStructure value) {
        setDescription(value);
        return this;
    }

    @Override
    public PublishToTvActionStructure withActionData(ActionDataStructure... values) {
        if (values!= null) {
            for (ActionDataStructure value: values) {
                getActionData().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToTvActionStructure withActionData(Collection<ActionDataStructure> values) {
        if (values!= null) {
            getActionData().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToTvActionStructure withPublicationWindow(ClosedTimestampRangeStructure... values) {
        if (values!= null) {
            for (ClosedTimestampRangeStructure value: values) {
                getPublicationWindow().add(value);
            }
        }
        return this;
    }

    @Override
    public PublishToTvActionStructure withPublicationWindow(Collection<ClosedTimestampRangeStructure> values) {
        if (values!= null) {
            getPublicationWindow().addAll(values);
        }
        return this;
    }

    @Override
    public PublishToTvActionStructure withActionStatus(ActionStatusEnumeration value) {
        setActionStatus(value);
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
