//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//


package net.opengis.gml._3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * <p>Java-Klasse für LineStringType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineStringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractCurveType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="2"&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pos"/&gt;
 *             &lt;element ref="{http://www.opengis.net/gml/3.2}pointProperty"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}posList"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineStringType", propOrder = {
    "posOrPointProperty",
    "posList"
})
public class LineStringType
    extends AbstractCurveType
{

    @XmlElements({
        @XmlElement(name = "pos", type = DirectPositionType.class),
        @XmlElement(name = "pointProperty", type = PointPropertyType.class)
    })
    protected List<Object> posOrPointProperty;
    protected DirectPositionListType posList;

    /**
     * Gets the value of the posOrPointProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the posOrPointProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosOrPointProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectPositionType }
     * {@link PointPropertyType }
     * 
     * 
     */
    public List<Object> getPosOrPointProperty() {
        if (posOrPointProperty == null) {
            posOrPointProperty = new ArrayList<Object>();
        }
        return this.posOrPointProperty;
    }

    /**
     * Ruft den Wert der posList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DirectPositionListType }
     *     
     */
    public DirectPositionListType getPosList() {
        return posList;
    }

    /**
     * Legt den Wert der posList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectPositionListType }
     *     
     */
    public void setPosList(DirectPositionListType value) {
        this.posList = value;
    }

    public LineStringType withPosOrPointProperty(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getPosOrPointProperty().add(value);
            }
        }
        return this;
    }

    public LineStringType withPosOrPointProperty(Collection<Object> values) {
        if (values!= null) {
            getPosOrPointProperty().addAll(values);
        }
        return this;
    }

    public LineStringType withPosList(DirectPositionListType value) {
        setPosList(value);
        return this;
    }

    @Override
    public LineStringType withSrsName(String value) {
        setSrsName(value);
        return this;
    }

    @Override
    public LineStringType withSrsDimension(BigInteger value) {
        setSrsDimension(value);
        return this;
    }

    @Override
    public LineStringType withDescriptionReference(ReferenceType value) {
        setDescriptionReference(value);
        return this;
    }

    @Override
    public LineStringType withIdentifier(CodeWithAuthorityType value) {
        setIdentifier(value);
        return this;
    }

    @Override
    public LineStringType withName(CodeType... values) {
        if (values!= null) {
            for (CodeType value: values) {
                getName().add(value);
            }
        }
        return this;
    }

    @Override
    public LineStringType withName(Collection<CodeType> values) {
        if (values!= null) {
            getName().addAll(values);
        }
        return this;
    }

    @Override
    public LineStringType withId(String value) {
        setId(value);
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
