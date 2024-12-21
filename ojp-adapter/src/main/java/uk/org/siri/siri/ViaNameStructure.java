//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package uk.org.siri.siri;

import java.math.BigInteger;
import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Type for VIA NAMes structure.
 * 
 * <p>Java-Klasse für ViaNameStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViaNameStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}PlaceNameStructure"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ViaPriority" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViaNameStructure", propOrder = {
    "viaPriority"
})
public class ViaNameStructure
    extends PlaceNameStructure
{

    @XmlElement(name = "ViaPriority", defaultValue = "2")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger viaPriority;

    /**
     * Ruft den Wert der viaPriority-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getViaPriority() {
        return viaPriority;
    }

    /**
     * Legt den Wert der viaPriority-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setViaPriority(BigInteger value) {
        this.viaPriority = value;
    }

    public ViaNameStructure withViaPriority(BigInteger value) {
        setViaPriority(value);
        return this;
    }

    @Override
    public ViaNameStructure withPlaceRef(JourneyPlaceRefStructure value) {
        setPlaceRef(value);
        return this;
    }

    @Override
    public ViaNameStructure withPlaceName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceName().add(value);
            }
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceName().addAll(values);
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceShortName(NaturalLanguagePlaceNameStructure... values) {
        if (values!= null) {
            for (NaturalLanguagePlaceNameStructure value: values) {
                getPlaceShortName().add(value);
            }
        }
        return this;
    }

    @Override
    public ViaNameStructure withPlaceShortName(Collection<NaturalLanguagePlaceNameStructure> values) {
        if (values!= null) {
            getPlaceShortName().addAll(values);
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
