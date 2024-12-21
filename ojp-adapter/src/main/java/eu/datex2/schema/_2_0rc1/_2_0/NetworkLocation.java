//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package eu.datex2.schema._2_0rc1._2_0;

import java.util.Collection;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für NetworkLocation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="NetworkLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supplementaryPositionalDescription" type="{http://datex2.eu/schema/2_0RC1/2_0}SupplementaryPositionalDescription" minOccurs="0"/&gt;
 *         &lt;element name="destination" type="{http://datex2.eu/schema/2_0RC1/2_0}Destination" minOccurs="0"/&gt;
 *         &lt;element name="networkLocationExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkLocation", propOrder = {
    "supplementaryPositionalDescription",
    "destination",
    "networkLocationExtension"
})
@XmlSeeAlso({
    Linear.class,
    Point.class
})
public abstract class NetworkLocation
    extends Location
{

    protected SupplementaryPositionalDescription supplementaryPositionalDescription;
    protected Destination destination;
    protected ExtensionType networkLocationExtension;

    /**
     * Ruft den Wert der supplementaryPositionalDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public SupplementaryPositionalDescription getSupplementaryPositionalDescription() {
        return supplementaryPositionalDescription;
    }

    /**
     * Legt den Wert der supplementaryPositionalDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryPositionalDescription }
     *     
     */
    public void setSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        this.supplementaryPositionalDescription = value;
    }

    /**
     * Ruft den Wert der destination-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Destination }
     *     
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Legt den Wert der destination-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination }
     *     
     */
    public void setDestination(Destination value) {
        this.destination = value;
    }

    /**
     * Ruft den Wert der networkLocationExtension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNetworkLocationExtension() {
        return networkLocationExtension;
    }

    /**
     * Legt den Wert der networkLocationExtension-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNetworkLocationExtension(ExtensionType value) {
        this.networkLocationExtension = value;
    }

    public NetworkLocation withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    public NetworkLocation withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    public NetworkLocation withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public NetworkLocation withExternalReferencing(ExternalReferencing... values) {
        if (values!= null) {
            for (ExternalReferencing value: values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public NetworkLocation withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values!= null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public NetworkLocation withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public NetworkLocation withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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
