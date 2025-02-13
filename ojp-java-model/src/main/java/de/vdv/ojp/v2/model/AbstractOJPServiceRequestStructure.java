//
// Diese Datei wurde mit der Eclipse Implementation of JAXB, v3.0.2 generiert 
// Siehe https://eclipse-ee4j.github.io/jaxb-ri 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2024.11.16 um 06:10:16 PM CET 
//

package de.vdv.ojp.v2.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;
import uk.org.siri.siri.AbstractFunctionalServiceRequestStructure;
import uk.org.siri.siri.DataFrameRefStructure;
import uk.org.siri.siri.MessageQualifierStructure;

/**
 * Basic request structure common for all OJP service requests.
 *
 * <p>Java-Klasse für AbstractOJPServiceRequestStructure complex type.
 *
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * <pre>
 * &lt;complexType name="AbstractOJPServiceRequestStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.siri.org.uk/siri}AbstractFunctionalServiceRequestStructure"&gt;
 *       &lt;group ref="{http://www.vdv.de/ojp}ServiceRequestContextGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractOJPServiceRequestStructure", propOrder = {
    "dataFrameRef",
    "extension"
})
@XmlSeeAlso({
    OJPFareRequestStructure.class,
    OJPLocationInformationRequestStructure.class,
    OJPExchangePointsRequestStructure.class,
    OJPStopEventRequestStructure.class,
    OJPTripInfoRequestStructure.class,
    OJPTripRequestStructure.class,
    OJPMultiPointTripRequestStructure.class,
    OJPStatusRequestStructure.class,
    OJPTripRefineRequestStructure.class,
    OJPAvailabilityRequestStructure.class,
    OJPLineInformationRequestStructure.class,
    OJPTripChangeRequestStructure.class
})
public class AbstractOJPServiceRequestStructure
    extends AbstractFunctionalServiceRequestStructure {

    @XmlElement(name = "DataFrameRef")
    protected DataFrameRefStructure dataFrameRef;
    @XmlElement(name = "Extension")
    protected Object extension;

    /**
     * Ruft den Wert der dataFrameRef-Eigenschaft ab.
     *
     * @return possible object is {@link DataFrameRefStructure }
     */
    public DataFrameRefStructure getDataFrameRef() {
        return dataFrameRef;
    }

    /**
     * Legt den Wert der dataFrameRef-Eigenschaft fest.
     *
     * @param value allowed object is {@link DataFrameRefStructure }
     */
    public void setDataFrameRef(DataFrameRefStructure value) {
        this.dataFrameRef = value;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     *
     * @return possible object is {@link Object }
     */
    public Object getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     *
     * @param value allowed object is {@link Object }
     */
    public void setExtension(Object value) {
        this.extension = value;
    }

    public AbstractOJPServiceRequestStructure withDataFrameRef(DataFrameRefStructure value) {
        setDataFrameRef(value);
        return this;
    }

    public AbstractOJPServiceRequestStructure withExtension(Object value) {
        setExtension(value);
        return this;
    }

    @Override
    public AbstractOJPServiceRequestStructure withMessageIdentifier(MessageQualifierStructure value) {
        setMessageIdentifier(value);
        return this;
    }

    @Override
    public AbstractOJPServiceRequestStructure withRequestTimestamp(ZonedDateTime value) {
        setRequestTimestamp(value);
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
