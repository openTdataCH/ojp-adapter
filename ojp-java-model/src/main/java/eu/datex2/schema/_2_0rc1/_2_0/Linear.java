//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package eu.datex2.schema._2_0rc1._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import java.util.Collection;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * <p>Java-Klasse für Linear complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Linear"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegLinearLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCLinear" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePointLinear" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePointLinear" minOccurs="0"/&gt;
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "roadsideReferencePointLinear",
    "linearExtension"
})
public class Linear
    extends NetworkLocation {

    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected RoadsideReferencePointLinear roadsideReferencePointLinear;
    protected ExtensionType linearExtension;

    /**
     * Ruft den Wert der tpegLinearLocation-Eigenschaft ab.
     *
     * @return possible object is {@link TpegLinearLocation }
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Legt den Wert der tpegLinearLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegLinearLocation }
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Ruft den Wert der alertCLinear-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCLinear }
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Legt den Wert der alertCLinear-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCLinear }
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePointLinear-Eigenschaft ab.
     *
     * @return possible object is {@link RoadsideReferencePointLinear }
     */
    public RoadsideReferencePointLinear getRoadsideReferencePointLinear() {
        return roadsideReferencePointLinear;
    }

    /**
     * Legt den Wert der roadsideReferencePointLinear-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadsideReferencePointLinear }
     */
    public void setRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        this.roadsideReferencePointLinear = value;
    }

    /**
     * Ruft den Wert der linearExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Legt den Wert der linearExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setLinearExtension(ExtensionType value) {
        this.linearExtension = value;
    }

    public Linear withTpegLinearLocation(TpegLinearLocation value) {
        setTpegLinearLocation(value);
        return this;
    }

    public Linear withAlertCLinear(AlertCLinear value) {
        setAlertCLinear(value);
        return this;
    }

    public Linear withRoadsideReferencePointLinear(RoadsideReferencePointLinear value) {
        setRoadsideReferencePointLinear(value);
        return this;
    }

    public Linear withLinearExtension(ExtensionType value) {
        setLinearExtension(value);
        return this;
    }

    @Override
    public Linear withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    @Override
    public Linear withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    @Override
    public Linear withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public Linear withExternalReferencing(ExternalReferencing... values) {
        if (values != null) {
            for (ExternalReferencing value : values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Linear withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values != null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Linear withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Linear withLocationExtension(ExtensionType value) {
        setLocationExtension(value);
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
