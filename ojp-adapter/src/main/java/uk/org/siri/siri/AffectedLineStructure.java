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
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * Information about the individual LINEs in the network that are affected by a SITUATION. If not explicitly overridden, modes and submodes will be defaulted to any values present (i) in the AffectedNetwork (ii) in the general context. 
 * 
 * <p>Java-Klasse für AffectedLineStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AffectedLineStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffectedOperator" type="{http://www.siri.org.uk/siri}AffectedOperatorStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.siri.org.uk/siri}LineGroup"/&gt;
 *         &lt;element name="Origins" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Destinations" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Direction" type="{http://www.siri.org.uk/siri}DirectionStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Routes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sections" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StopPlaces" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.siri.org.uk/siri}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedLineStructure", propOrder = {
    "affectedOperator",
    "lineRef",
    "publishedLineName",
    "origins",
    "destinations",
    "direction",
    "routes",
    "sections",
    "stopPoints",
    "stopPlaces",
    "extensions"
})
public class AffectedLineStructure {

    @XmlElement(name = "AffectedOperator")
    protected List<AffectedOperatorStructure> affectedOperator;
    @XmlElement(name = "LineRef", required = true)
    protected LineRefStructure lineRef;
    @XmlElement(name = "PublishedLineName")
    protected List<NaturalLanguageStringStructure> publishedLineName;
    @XmlElement(name = "Origins")
    protected List<AffectedStopPointStructure> origins;
    @XmlElement(name = "Destinations")
    protected List<AffectedStopPointStructure> destinations;
    @XmlElement(name = "Direction")
    protected List<DirectionStructure> direction;
    @XmlElement(name = "Routes")
    protected AffectedLineStructure.Routes routes;
    @XmlElement(name = "Sections")
    protected AffectedLineStructure.Sections sections;
    @XmlElement(name = "StopPoints")
    protected AffectedLineStructure.StopPoints stopPoints;
    @XmlElement(name = "StopPlaces")
    protected AffectedLineStructure.StopPlaces stopPlaces;
    @XmlElement(name = "Extensions")
    protected ExtensionsStructure extensions;

    /**
     * Gets the value of the affectedOperator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedOperator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedOperator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedOperatorStructure }
     * 
     * 
     */
    public List<AffectedOperatorStructure> getAffectedOperator() {
        if (affectedOperator == null) {
            affectedOperator = new ArrayList<AffectedOperatorStructure>();
        }
        return this.affectedOperator;
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
     * Gets the value of the publishedLineName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the publishedLineName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublishedLineName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NaturalLanguageStringStructure }
     * 
     * 
     */
    public List<NaturalLanguageStringStructure> getPublishedLineName() {
        if (publishedLineName == null) {
            publishedLineName = new ArrayList<NaturalLanguageStringStructure>();
        }
        return this.publishedLineName;
    }

    /**
     * Gets the value of the origins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the origins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrigins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getOrigins() {
        if (origins == null) {
            origins = new ArrayList<AffectedStopPointStructure>();
        }
        return this.origins;
    }

    /**
     * Gets the value of the destinations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the destinations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedStopPointStructure }
     * 
     * 
     */
    public List<AffectedStopPointStructure> getDestinations() {
        if (destinations == null) {
            destinations = new ArrayList<AffectedStopPointStructure>();
        }
        return this.destinations;
    }

    /**
     * Gets the value of the direction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the direction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectionStructure }
     * 
     * 
     */
    public List<DirectionStructure> getDirection() {
        if (direction == null) {
            direction = new ArrayList<DirectionStructure>();
        }
        return this.direction;
    }

    /**
     * Ruft den Wert der routes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.Routes }
     *     
     */
    public AffectedLineStructure.Routes getRoutes() {
        return routes;
    }

    /**
     * Legt den Wert der routes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.Routes }
     *     
     */
    public void setRoutes(AffectedLineStructure.Routes value) {
        this.routes = value;
    }

    /**
     * Ruft den Wert der sections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.Sections }
     *     
     */
    public AffectedLineStructure.Sections getSections() {
        return sections;
    }

    /**
     * Legt den Wert der sections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.Sections }
     *     
     */
    public void setSections(AffectedLineStructure.Sections value) {
        this.sections = value;
    }

    /**
     * Ruft den Wert der stopPoints-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.StopPoints }
     *     
     */
    public AffectedLineStructure.StopPoints getStopPoints() {
        return stopPoints;
    }

    /**
     * Legt den Wert der stopPoints-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.StopPoints }
     *     
     */
    public void setStopPoints(AffectedLineStructure.StopPoints value) {
        this.stopPoints = value;
    }

    /**
     * Ruft den Wert der stopPlaces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AffectedLineStructure.StopPlaces }
     *     
     */
    public AffectedLineStructure.StopPlaces getStopPlaces() {
        return stopPlaces;
    }

    /**
     * Legt den Wert der stopPlaces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedLineStructure.StopPlaces }
     *     
     */
    public void setStopPlaces(AffectedLineStructure.StopPlaces value) {
        this.stopPlaces = value;
    }

    /**
     * Ruft den Wert der extensions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsStructure }
     *     
     */
    public ExtensionsStructure getExtensions() {
        return extensions;
    }

    /**
     * Legt den Wert der extensions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsStructure }
     *     
     */
    public void setExtensions(ExtensionsStructure value) {
        this.extensions = value;
    }

    public AffectedLineStructure withAffectedOperator(AffectedOperatorStructure... values) {
        if (values!= null) {
            for (AffectedOperatorStructure value: values) {
                getAffectedOperator().add(value);
            }
        }
        return this;
    }

    public AffectedLineStructure withAffectedOperator(Collection<AffectedOperatorStructure> values) {
        if (values!= null) {
            getAffectedOperator().addAll(values);
        }
        return this;
    }

    public AffectedLineStructure withLineRef(LineRefStructure value) {
        setLineRef(value);
        return this;
    }

    public AffectedLineStructure withPublishedLineName(NaturalLanguageStringStructure... values) {
        if (values!= null) {
            for (NaturalLanguageStringStructure value: values) {
                getPublishedLineName().add(value);
            }
        }
        return this;
    }

    public AffectedLineStructure withPublishedLineName(Collection<NaturalLanguageStringStructure> values) {
        if (values!= null) {
            getPublishedLineName().addAll(values);
        }
        return this;
    }

    public AffectedLineStructure withOrigins(AffectedStopPointStructure... values) {
        if (values!= null) {
            for (AffectedStopPointStructure value: values) {
                getOrigins().add(value);
            }
        }
        return this;
    }

    public AffectedLineStructure withOrigins(Collection<AffectedStopPointStructure> values) {
        if (values!= null) {
            getOrigins().addAll(values);
        }
        return this;
    }

    public AffectedLineStructure withDestinations(AffectedStopPointStructure... values) {
        if (values!= null) {
            for (AffectedStopPointStructure value: values) {
                getDestinations().add(value);
            }
        }
        return this;
    }

    public AffectedLineStructure withDestinations(Collection<AffectedStopPointStructure> values) {
        if (values!= null) {
            getDestinations().addAll(values);
        }
        return this;
    }

    public AffectedLineStructure withDirection(DirectionStructure... values) {
        if (values!= null) {
            for (DirectionStructure value: values) {
                getDirection().add(value);
            }
        }
        return this;
    }

    public AffectedLineStructure withDirection(Collection<DirectionStructure> values) {
        if (values!= null) {
            getDirection().addAll(values);
        }
        return this;
    }

    public AffectedLineStructure withRoutes(AffectedLineStructure.Routes value) {
        setRoutes(value);
        return this;
    }

    public AffectedLineStructure withSections(AffectedLineStructure.Sections value) {
        setSections(value);
        return this;
    }

    public AffectedLineStructure withStopPoints(AffectedLineStructure.StopPoints value) {
        setStopPoints(value);
        return this;
    }

    public AffectedLineStructure withStopPlaces(AffectedLineStructure.StopPlaces value) {
        setStopPlaces(value);
        return this;
    }

    public AffectedLineStructure withExtensions(ExtensionsStructure value) {
        setExtensions(value);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedRoute" type="{http://www.siri.org.uk/siri}AffectedRouteStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedRoute"
    })
    public static class Routes {

        @XmlElement(name = "AffectedRoute", required = true)
        protected List<AffectedRouteStructure> affectedRoute;

        /**
         * Gets the value of the affectedRoute property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedRoute property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedRoute().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedRouteStructure }
         * 
         * 
         */
        public List<AffectedRouteStructure> getAffectedRoute() {
            if (affectedRoute == null) {
                affectedRoute = new ArrayList<AffectedRouteStructure>();
            }
            return this.affectedRoute;
        }

        public AffectedLineStructure.Routes withAffectedRoute(AffectedRouteStructure... values) {
            if (values!= null) {
                for (AffectedRouteStructure value: values) {
                    getAffectedRoute().add(value);
                }
            }
            return this;
        }

        public AffectedLineStructure.Routes withAffectedRoute(Collection<AffectedRouteStructure> values) {
            if (values!= null) {
                getAffectedRoute().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedSection" type="{http://www.siri.org.uk/siri}AffectedSectionStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedSection"
    })
    public static class Sections {

        @XmlElement(name = "AffectedSection", required = true)
        protected List<AffectedSectionStructure> affectedSection;

        /**
         * Gets the value of the affectedSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedSectionStructure }
         * 
         * 
         */
        public List<AffectedSectionStructure> getAffectedSection() {
            if (affectedSection == null) {
                affectedSection = new ArrayList<AffectedSectionStructure>();
            }
            return this.affectedSection;
        }

        public AffectedLineStructure.Sections withAffectedSection(AffectedSectionStructure... values) {
            if (values!= null) {
                for (AffectedSectionStructure value: values) {
                    getAffectedSection().add(value);
                }
            }
            return this;
        }

        public AffectedLineStructure.Sections withAffectedSection(Collection<AffectedSectionStructure> values) {
            if (values!= null) {
                getAffectedSection().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedStopPlace" type="{http://www.siri.org.uk/siri}AffectedStopPlaceStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedStopPlace"
    })
    public static class StopPlaces {

        @XmlElement(name = "AffectedStopPlace", required = true)
        protected List<AffectedStopPlaceStructure> affectedStopPlace;

        /**
         * Gets the value of the affectedStopPlace property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPlace property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPlaceStructure }
         * 
         * 
         */
        public List<AffectedStopPlaceStructure> getAffectedStopPlace() {
            if (affectedStopPlace == null) {
                affectedStopPlace = new ArrayList<AffectedStopPlaceStructure>();
            }
            return this.affectedStopPlace;
        }

        public AffectedLineStructure.StopPlaces withAffectedStopPlace(AffectedStopPlaceStructure... values) {
            if (values!= null) {
                for (AffectedStopPlaceStructure value: values) {
                    getAffectedStopPlace().add(value);
                }
            }
            return this;
        }

        public AffectedLineStructure.StopPlaces withAffectedStopPlace(Collection<AffectedStopPlaceStructure> values) {
            if (values!= null) {
                getAffectedStopPlace().addAll(values);
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


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AffectedStopPoint" type="{http://www.siri.org.uk/siri}AffectedStopPointStructure" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "affectedStopPoint"
    })
    public static class StopPoints {

        @XmlElement(name = "AffectedStopPoint", required = true)
        protected List<AffectedStopPointStructure> affectedStopPoint;

        /**
         * Gets the value of the affectedStopPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the affectedStopPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAffectedStopPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AffectedStopPointStructure }
         * 
         * 
         */
        public List<AffectedStopPointStructure> getAffectedStopPoint() {
            if (affectedStopPoint == null) {
                affectedStopPoint = new ArrayList<AffectedStopPointStructure>();
            }
            return this.affectedStopPoint;
        }

        public AffectedLineStructure.StopPoints withAffectedStopPoint(AffectedStopPointStructure... values) {
            if (values!= null) {
                for (AffectedStopPointStructure value: values) {
                    getAffectedStopPoint().add(value);
                }
            }
            return this;
        }

        public AffectedLineStructure.StopPoints withAffectedStopPoint(Collection<AffectedStopPointStructure> values) {
            if (values!= null) {
                getAffectedStopPoint().addAll(values);
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

}
