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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.rutebanken.netex.OmitNullsToStringStyle;


/**
 * An extended definition of a NAVIGATION PATH in TMv6 and PATH GUIDANCE to include the textual navigation instructions. Description of a part of a TRIP. May include geographic information, turn instructions and accessibility information.
 * 
 * <p>Java-Klasse für PathGuidanceSectionStructure complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PathGuidanceSectionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackSection" type="{http://www.vdv.de/ojp}TrackSectionStructure" minOccurs="0"/&gt;
 *         &lt;element name="TurnDescription" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="GuidanceAdvice" type="{http://www.vdv.de/ojp}GuidanceAdviceEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="TurnAction" type="{http://www.vdv.de/ojp}TurnActionEnumeration" minOccurs="0"/&gt;
 *         &lt;element name="RoadName" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="Follow" type="{http://www.vdv.de/ojp}FollowStructure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DirectionHint" type="{http://www.vdv.de/ojp}InternationalTextStructure" minOccurs="0"/&gt;
 *         &lt;element name="AbsoluteBearing" type="{http://www.siri.org.uk/siri}AbsoluteBearingType" minOccurs="0"/&gt;
 *         &lt;element name="PathLink" type="{http://www.vdv.de/ojp}PathLinkStructure" minOccurs="0"/&gt;
 *         &lt;element name="SituationFullRefs" type="{http://www.vdv.de/ojp}SituationRefList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathGuidanceSectionStructure", propOrder = {
    "trackSection",
    "turnDescription",
    "guidanceAdvice",
    "turnAction",
    "roadName",
    "follow",
    "directionHint",
    "absoluteBearing",
    "pathLink",
    "situationFullRefs"
})
public class PathGuidanceSectionStructure {

    @XmlElement(name = "TrackSection")
    protected TrackSectionStructure trackSection;
    @XmlElement(name = "TurnDescription")
    protected InternationalTextStructure turnDescription;
    @XmlElement(name = "GuidanceAdvice")
    @XmlSchemaType(name = "string")
    protected GuidanceAdviceEnumeration guidanceAdvice;
    @XmlElement(name = "TurnAction")
    @XmlSchemaType(name = "string")
    protected TurnActionEnumeration turnAction;
    @XmlElement(name = "RoadName")
    protected InternationalTextStructure roadName;
    @XmlElement(name = "Follow")
    protected List<FollowStructure> follow;
    @XmlElement(name = "DirectionHint")
    protected InternationalTextStructure directionHint;
    @XmlElement(name = "AbsoluteBearing")
    protected Float absoluteBearing;
    @XmlElement(name = "PathLink")
    protected PathLinkStructure pathLink;
    @XmlElement(name = "SituationFullRefs")
    protected SituationRefList situationFullRefs;

    /**
     * Ruft den Wert der trackSection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TrackSectionStructure }
     *     
     */
    public TrackSectionStructure getTrackSection() {
        return trackSection;
    }

    /**
     * Legt den Wert der trackSection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSectionStructure }
     *     
     */
    public void setTrackSection(TrackSectionStructure value) {
        this.trackSection = value;
    }

    /**
     * Ruft den Wert der turnDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getTurnDescription() {
        return turnDescription;
    }

    /**
     * Legt den Wert der turnDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setTurnDescription(InternationalTextStructure value) {
        this.turnDescription = value;
    }

    /**
     * Ruft den Wert der guidanceAdvice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GuidanceAdviceEnumeration }
     *     
     */
    public GuidanceAdviceEnumeration getGuidanceAdvice() {
        return guidanceAdvice;
    }

    /**
     * Legt den Wert der guidanceAdvice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidanceAdviceEnumeration }
     *     
     */
    public void setGuidanceAdvice(GuidanceAdviceEnumeration value) {
        this.guidanceAdvice = value;
    }

    /**
     * Ruft den Wert der turnAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TurnActionEnumeration }
     *     
     */
    public TurnActionEnumeration getTurnAction() {
        return turnAction;
    }

    /**
     * Legt den Wert der turnAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TurnActionEnumeration }
     *     
     */
    public void setTurnAction(TurnActionEnumeration value) {
        this.turnAction = value;
    }

    /**
     * Ruft den Wert der roadName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getRoadName() {
        return roadName;
    }

    /**
     * Legt den Wert der roadName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setRoadName(InternationalTextStructure value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the follow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the follow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFollow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FollowStructure }
     * 
     * 
     */
    public List<FollowStructure> getFollow() {
        if (follow == null) {
            follow = new ArrayList<FollowStructure>();
        }
        return this.follow;
    }

    /**
     * Ruft den Wert der directionHint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link InternationalTextStructure }
     *     
     */
    public InternationalTextStructure getDirectionHint() {
        return directionHint;
    }

    /**
     * Legt den Wert der directionHint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link InternationalTextStructure }
     *     
     */
    public void setDirectionHint(InternationalTextStructure value) {
        this.directionHint = value;
    }

    /**
     * Ruft den Wert der absoluteBearing-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAbsoluteBearing() {
        return absoluteBearing;
    }

    /**
     * Legt den Wert der absoluteBearing-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAbsoluteBearing(Float value) {
        this.absoluteBearing = value;
    }

    /**
     * Ruft den Wert der pathLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PathLinkStructure }
     *     
     */
    public PathLinkStructure getPathLink() {
        return pathLink;
    }

    /**
     * Legt den Wert der pathLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PathLinkStructure }
     *     
     */
    public void setPathLink(PathLinkStructure value) {
        this.pathLink = value;
    }

    /**
     * Ruft den Wert der situationFullRefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SituationRefList }
     *     
     */
    public SituationRefList getSituationFullRefs() {
        return situationFullRefs;
    }

    /**
     * Legt den Wert der situationFullRefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRefList }
     *     
     */
    public void setSituationFullRefs(SituationRefList value) {
        this.situationFullRefs = value;
    }

    public PathGuidanceSectionStructure withTrackSection(TrackSectionStructure value) {
        setTrackSection(value);
        return this;
    }

    public PathGuidanceSectionStructure withTurnDescription(InternationalTextStructure value) {
        setTurnDescription(value);
        return this;
    }

    public PathGuidanceSectionStructure withGuidanceAdvice(GuidanceAdviceEnumeration value) {
        setGuidanceAdvice(value);
        return this;
    }

    public PathGuidanceSectionStructure withTurnAction(TurnActionEnumeration value) {
        setTurnAction(value);
        return this;
    }

    public PathGuidanceSectionStructure withRoadName(InternationalTextStructure value) {
        setRoadName(value);
        return this;
    }

    public PathGuidanceSectionStructure withFollow(FollowStructure... values) {
        if (values!= null) {
            for (FollowStructure value: values) {
                getFollow().add(value);
            }
        }
        return this;
    }

    public PathGuidanceSectionStructure withFollow(Collection<FollowStructure> values) {
        if (values!= null) {
            getFollow().addAll(values);
        }
        return this;
    }

    public PathGuidanceSectionStructure withDirectionHint(InternationalTextStructure value) {
        setDirectionHint(value);
        return this;
    }

    public PathGuidanceSectionStructure withAbsoluteBearing(Float value) {
        setAbsoluteBearing(value);
        return this;
    }

    public PathGuidanceSectionStructure withPathLink(PathLinkStructure value) {
        setPathLink(value);
        return this;
    }

    public PathGuidanceSectionStructure withSituationFullRefs(SituationRefList value) {
        setSituationFullRefs(value);
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
