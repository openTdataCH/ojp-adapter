//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package de.vdv.ojp.release2.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.DirectionRefStructure;
import uk.org.siri.siri.LineRefStructure;
import uk.org.siri.siri.NaturalLanguageStringStructure;


/**
 * <p>Java-Klasse für LineResultStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineResultStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorCondition" type="{http://www.vdv.de/ojp}OJPErrorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineRef" type="{http://www.siri.org.uk/siri}LineRefStructure"/&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}PublishedLineName" minOccurs="0"/&gt;
 *         &lt;element name="DirectionRef" type="{http://www.siri.org.uk/siri}DirectionRefStructure" minOccurs="0"/&gt;
 *         &lt;element name="RouteGeometry" type="{http://www.vdv.de/ojp}LinearShapeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AreaGeometry" type="{http://www.vdv.de/ojp}AreaStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Mode" type="{http://www.vdv.de/ojp}ModeStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineResultStructure", propOrder = {
    "errorCondition",
    "lineRef",
    "publishedLineName",
    "directionRef",
    "routeGeometry",
    "areaGeometry",
    "mode"
})
public class LineResultStructure {

    @XmlElement(name = "ErrorCondition")
    protected List<OJPErrorStructure> errorCondition;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName", namespace = "http://www.siri.org.uk/siri")
    protected NaturalLanguageStringStructure publishedLineName;
    @XmlElement(name = "DirectionRef")
    protected DirectionRefStructure directionRef;
    @XmlElement(name = "RouteGeometry")
    protected List<LinearShapeStructure> routeGeometry;
    @XmlElement(name = "AreaGeometry")
    protected List<AreaStructure> areaGeometry;
    @XmlElement(name = "Mode")
    protected List<ModeStructure> mode;

    /**
     * Gets the value of the errorCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJPErrorStructure }
     * 
     * 
     */
    public List<OJPErrorStructure> getErrorCondition() {
        if (errorCondition == null) {
            errorCondition = new ArrayList<OJPErrorStructure>();
        }
        return this.errorCondition;
    }

    /**
     * Ruft den Wert der lineRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineRefStructure }
     *     
     */
    public LineRefStructure getLineRef() {
        return lineRef;
    }

    /**
     * Legt den Wert der lineRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineRefStructure }
     *     
     */
    public void setLineRef(LineRefStructure value) {
        this.lineRef = value;
    }

    /**
     * Name or Number by which the LINE is known to the public.
     * 
     * @return
     *     possible object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public NaturalLanguageStringStructure getPublishedLineName() {
        return publishedLineName;
    }

    /**
     * Legt den Wert der publishedLineName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link NaturalLanguageStringStructure }
     *     
     */
    public void setPublishedLineName(NaturalLanguageStringStructure value) {
        this.publishedLineName = value;
    }

    /**
     * Ruft den Wert der directionRef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectionRefStructure }
     *     
     */
    public DirectionRefStructure getDirectionRef() {
        return directionRef;
    }

    /**
     * Legt den Wert der directionRef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionRefStructure }
     *     
     */
    public void setDirectionRef(DirectionRefStructure value) {
        this.directionRef = value;
    }

    /**
     * Gets the value of the routeGeometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the routeGeometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinearShapeStructure }
     * 
     * 
     */
    public List<LinearShapeStructure> getRouteGeometry() {
        if (routeGeometry == null) {
            routeGeometry = new ArrayList<LinearShapeStructure>();
        }
        return this.routeGeometry;
    }

    /**
     * Gets the value of the areaGeometry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the areaGeometry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaGeometry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaStructure }
     * 
     * 
     */
    public List<AreaStructure> getAreaGeometry() {
        if (areaGeometry == null) {
            areaGeometry = new ArrayList<AreaStructure>();
        }
        return this.areaGeometry;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModeStructure }
     * 
     * 
     */
    public List<ModeStructure> getMode() {
        if (mode == null) {
            mode = new ArrayList<ModeStructure>();
        }
        return this.mode;
    }

    public LineResultStructure withErrorCondition(OJPErrorStructure... values) {
        if (values!= null) {
            for (OJPErrorStructure value: values) {
                getErrorCondition().add(value);
            }
        }
        return this;
    }

    public LineResultStructure withErrorCondition(Collection<OJPErrorStructure> values) {
        if (values!= null) {
            getErrorCondition().addAll(values);
        }
        return this;
    }

    public LineResultStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public LineResultStructure withPublishedLineName(NaturalLanguageStringStructure value) {
        setPublishedLineName(value);
        return this;
    }

    public LineResultStructure withDirectionRef(DirectionRefStructure value) {
        setDirectionRef(value);
        return this;
    }

    public LineResultStructure withRouteGeometry(LinearShapeStructure... values) {
        if (values!= null) {
            for (LinearShapeStructure value: values) {
                getRouteGeometry().add(value);
            }
        }
        return this;
    }

    public LineResultStructure withRouteGeometry(Collection<LinearShapeStructure> values) {
        if (values!= null) {
            getRouteGeometry().addAll(values);
        }
        return this;
    }

    public LineResultStructure withAreaGeometry(AreaStructure... values) {
        if (values!= null) {
            for (AreaStructure value: values) {
                getAreaGeometry().add(value);
            }
        }
        return this;
    }

    public LineResultStructure withAreaGeometry(Collection<AreaStructure> values) {
        if (values!= null) {
            getAreaGeometry().addAll(values);
        }
        return this;
    }

    public LineResultStructure withMode(ModeStructure... values) {
        if (values!= null) {
            for (ModeStructure value: values) {
                getMode().add(value);
            }
        }
        return this;
    }

    public LineResultStructure withMode(Collection<ModeStructure> values) {
        if (values!= null) {
            getMode().addAll(values);
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
