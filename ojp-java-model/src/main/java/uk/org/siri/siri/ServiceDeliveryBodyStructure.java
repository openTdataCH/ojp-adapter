//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package uk.org.siri.siri;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import de.vdv.ojp.v2.model.OJPAvailabilityDeliveryStructure;
import de.vdv.ojp.v2.model.OJPExchangePointsDeliveryStructure;
import de.vdv.ojp.v2.model.OJPFareDeliveryStructure;
import de.vdv.ojp.v2.model.OJPLineInformationDeliveryStructure;
import de.vdv.ojp.v2.model.OJPLocationInformationDeliveryStructure;
import de.vdv.ojp.v2.model.OJPMultiPointTripDeliveryStructure;
import de.vdv.ojp.v2.model.OJPStatusDeliveryStructure;
import de.vdv.ojp.v2.model.OJPStopEventDeliveryStructure;
import de.vdv.ojp.v2.model.OJPTripChangeDeliveryStructure;
import de.vdv.ojp.v2.model.OJPTripDeliveryStructure;
import de.vdv.ojp.v2.model.OJPTripInfoDeliveryStructure;
import de.vdv.ojp.v2.model.OJPTripRefineDeliveryStructure;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;

/**
 * Type for SIRI Service Delivery type.
 *
 * <p>Java-Klasse für ServiceDeliveryBodyStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="ServiceDeliveryBodyStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}ServiceDeliveryBodyGroup"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srsName" type="{http://www.siri.org.uk/siri}SrsNameType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDeliveryBodyStructure", propOrder = {
    "status",
    "errorCondition",
    "moreData",
    "abstractFunctionalServiceDelivery"
})
public class ServiceDeliveryBodyStructure {

    @XmlElement(name = "Status", defaultValue = "true")
    protected Boolean status;
    @XmlElement(name = "ErrorCondition")
    protected uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition errorCondition;
    @XmlElement(name = "MoreData", defaultValue = "false")
    protected Boolean moreData;
    @XmlElementRef(name = "AbstractFunctionalServiceDelivery", namespace = "http://www.siri.org.uk/siri", type = JAXBElement.class)
    protected List<JAXBElement<? extends AbstractServiceDeliveryStructure>> abstractFunctionalServiceDelivery;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Ruft den Wert der status-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isStatus() {
        return status;
    }

    /**
     * Legt den Wert der status-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setStatus(Boolean value) {
        this.status = value;
    }

    /**
     * Ruft den Wert der errorCondition-Eigenschaft ab.
     *
     * @return possible object is {@link uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition }
     */
    public uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition getErrorCondition() {
        return errorCondition;
    }

    /**
     * Legt den Wert der errorCondition-Eigenschaft fest.
     *
     * @param value allowed object is {@link uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition }
     */
    public void setErrorCondition(uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition value) {
        this.errorCondition = value;
    }

    /**
     * Ruft den Wert der moreData-Eigenschaft ab.
     *
     * @return possible object is {@link Boolean }
     */
    public Boolean isMoreData() {
        return moreData;
    }

    /**
     * Legt den Wert der moreData-Eigenschaft fest.
     *
     * @param value allowed object is {@link Boolean }
     */
    public void setMoreData(Boolean value) {
        this.moreData = value;
    }

    /**
     * Gets the value of the abstractFunctionalServiceDelivery property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the Jakarta XML Binding object. This
     * is why there is not a <CODE>set</CODE> method for the abstractFunctionalServiceDelivery property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractFunctionalServiceDelivery().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list {@link JAXBElement }{@code <}{@link OJPAvailabilityDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPExchangePointsDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link OJPFareDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPLineInformationDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link OJPLocationInformationDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPMultiPointTripDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link OJPStatusDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPStopEventDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link OJPTripChangeDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link OJPTripInfoDeliveryStructure }{@code >}
     * {@link JAXBElement }{@code <}{@link OJPTripRefineDeliveryStructure }{@code >} {@link JAXBElement }{@code <}{@link AbstractServiceDeliveryStructure }{@code >}
     */
    public List<JAXBElement<? extends AbstractServiceDeliveryStructure>> getAbstractFunctionalServiceDelivery() {
        if (abstractFunctionalServiceDelivery == null) {
            abstractFunctionalServiceDelivery = new ArrayList<JAXBElement<? extends AbstractServiceDeliveryStructure>>();
        }
        return this.abstractFunctionalServiceDelivery;
    }

    /**
     * Ruft den Wert der srsName-Eigenschaft ab.
     *
     * @return possible object is {@link String }
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Legt den Wert der srsName-Eigenschaft fest.
     *
     * @param value allowed object is {@link String }
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    public ServiceDeliveryBodyStructure withStatus(Boolean value) {
        setStatus(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withErrorCondition(uk.org.siri.siri.ServiceDeliveryStructure.ErrorCondition value) {
        setErrorCondition(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withMoreData(Boolean value) {
        setMoreData(value);
        return this;
    }

    public ServiceDeliveryBodyStructure withAbstractFunctionalServiceDelivery(JAXBElement<? extends AbstractServiceDeliveryStructure>... values) {
        if (values != null) {
            for (JAXBElement<? extends AbstractServiceDeliveryStructure> value : values) {
                getAbstractFunctionalServiceDelivery().add(value);
            }
        }
        return this;
    }

    public ServiceDeliveryBodyStructure withAbstractFunctionalServiceDelivery(Collection<JAXBElement<? extends AbstractServiceDeliveryStructure>> values) {
        if (values != null) {
            getAbstractFunctionalServiceDelivery().addAll(values);
        }
        return this;
    }

    public ServiceDeliveryBodyStructure withSrsName(String value) {
        setSrsName(value);
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
