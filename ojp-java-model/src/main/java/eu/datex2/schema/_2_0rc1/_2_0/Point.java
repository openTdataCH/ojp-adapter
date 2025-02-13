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
 * <p>Java-Klasse für Point complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="Point"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2_0RC1/2_0}NetworkLocation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpegPointLocation" type="{http://datex2.eu/schema/2_0RC1/2_0}TpegPointLocation" minOccurs="0"/&gt;
 *         &lt;element name="alertCPoint" type="{http://datex2.eu/schema/2_0RC1/2_0}AlertCPoint" minOccurs="0"/&gt;
 *         &lt;element name="roadsideReferencePoint" type="{http://datex2.eu/schema/2_0RC1/2_0}RoadsideReferencePoint" minOccurs="0"/&gt;
 *         &lt;element name="pointByCoordinates" type="{http://datex2.eu/schema/2_0RC1/2_0}PointByCoordinates" minOccurs="0"/&gt;
 *         &lt;element name="pointExtension" type="{http://datex2.eu/schema/2_0RC1/2_0}ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Point", propOrder = {
    "tpegPointLocation",
    "alertCPoint",
    "roadsideReferencePoint",
    "pointByCoordinates",
    "pointExtension"
})
public class Point
    extends NetworkLocation {

    protected TpegPointLocation tpegPointLocation;
    protected AlertCPoint alertCPoint;
    protected RoadsideReferencePoint roadsideReferencePoint;
    protected PointByCoordinates pointByCoordinates;
    protected ExtensionType pointExtension;

    /**
     * Ruft den Wert der tpegPointLocation-Eigenschaft ab.
     *
     * @return possible object is {@link TpegPointLocation }
     */
    public TpegPointLocation getTpegPointLocation() {
        return tpegPointLocation;
    }

    /**
     * Legt den Wert der tpegPointLocation-Eigenschaft fest.
     *
     * @param value allowed object is {@link TpegPointLocation }
     */
    public void setTpegPointLocation(TpegPointLocation value) {
        this.tpegPointLocation = value;
    }

    /**
     * Ruft den Wert der alertCPoint-Eigenschaft ab.
     *
     * @return possible object is {@link AlertCPoint }
     */
    public AlertCPoint getAlertCPoint() {
        return alertCPoint;
    }

    /**
     * Legt den Wert der alertCPoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link AlertCPoint }
     */
    public void setAlertCPoint(AlertCPoint value) {
        this.alertCPoint = value;
    }

    /**
     * Ruft den Wert der roadsideReferencePoint-Eigenschaft ab.
     *
     * @return possible object is {@link RoadsideReferencePoint }
     */
    public RoadsideReferencePoint getRoadsideReferencePoint() {
        return roadsideReferencePoint;
    }

    /**
     * Legt den Wert der roadsideReferencePoint-Eigenschaft fest.
     *
     * @param value allowed object is {@link RoadsideReferencePoint }
     */
    public void setRoadsideReferencePoint(RoadsideReferencePoint value) {
        this.roadsideReferencePoint = value;
    }

    /**
     * Ruft den Wert der pointByCoordinates-Eigenschaft ab.
     *
     * @return possible object is {@link PointByCoordinates }
     */
    public PointByCoordinates getPointByCoordinates() {
        return pointByCoordinates;
    }

    /**
     * Legt den Wert der pointByCoordinates-Eigenschaft fest.
     *
     * @param value allowed object is {@link PointByCoordinates }
     */
    public void setPointByCoordinates(PointByCoordinates value) {
        this.pointByCoordinates = value;
    }

    /**
     * Ruft den Wert der pointExtension-Eigenschaft ab.
     *
     * @return possible object is {@link ExtensionType }
     */
    public ExtensionType getPointExtension() {
        return pointExtension;
    }

    /**
     * Legt den Wert der pointExtension-Eigenschaft fest.
     *
     * @param value allowed object is {@link ExtensionType }
     */
    public void setPointExtension(ExtensionType value) {
        this.pointExtension = value;
    }

    public Point withTpegPointLocation(TpegPointLocation value) {
        setTpegPointLocation(value);
        return this;
    }

    public Point withAlertCPoint(AlertCPoint value) {
        setAlertCPoint(value);
        return this;
    }

    public Point withRoadsideReferencePoint(RoadsideReferencePoint value) {
        setRoadsideReferencePoint(value);
        return this;
    }

    public Point withPointByCoordinates(PointByCoordinates value) {
        setPointByCoordinates(value);
        return this;
    }

    public Point withPointExtension(ExtensionType value) {
        setPointExtension(value);
        return this;
    }

    @Override
    public Point withSupplementaryPositionalDescription(SupplementaryPositionalDescription value) {
        setSupplementaryPositionalDescription(value);
        return this;
    }

    @Override
    public Point withDestination(Destination value) {
        setDestination(value);
        return this;
    }

    @Override
    public Point withNetworkLocationExtension(ExtensionType value) {
        setNetworkLocationExtension(value);
        return this;
    }

    @Override
    public Point withExternalReferencing(ExternalReferencing... values) {
        if (values != null) {
            for (ExternalReferencing value : values) {
                getExternalReferencing().add(value);
            }
        }
        return this;
    }

    @Override
    public Point withExternalReferencing(Collection<ExternalReferencing> values) {
        if (values != null) {
            getExternalReferencing().addAll(values);
        }
        return this;
    }

    @Override
    public Point withLocationForDisplay(PointCoordinates value) {
        setLocationForDisplay(value);
        return this;
    }

    @Override
    public Point withLocationExtension(ExtensionType value) {
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
