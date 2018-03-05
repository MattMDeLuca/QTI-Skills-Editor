//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The OutcomeDeclaration complexType is the container for the declaration of outcome variables. Outcome variables are declared by outcome declarations. Their value is set either from s default given in the declaration itself or by a 'responseRule' during 'responseProcessing'.
 *             
 * 
 * <p>Java class for OutcomeDeclaration.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutcomeDeclaration.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}defaultValue" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}matchTable"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}interpolationTable"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}baseType.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}view.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}interpretation.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}masteryValue.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}longInterpretation.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}normalMaximum.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}cardinality.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.OutcomeDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}normalMinimum.OutcomeDeclaration.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutcomeDeclaration.Type", propOrder = {
    "defaultValue",
    "matchTable",
    "interpolationTable"
})
public class OutcomeDeclarationType {

    protected DefaultValueType defaultValue;
    protected MatchTableType matchTable;
    protected InterpolationTableType interpolationTable;
    @XmlAttribute(name = "baseType")
    protected String baseType;
    @XmlAttribute(name = "view")
    protected List<ViewType> view;
    @XmlAttribute(name = "interpretation")
    protected String interpretation;
    @XmlAttribute(name = "masteryValue")
    protected Double masteryValue;
    @XmlAttribute(name = "longInterpretation")
    @XmlSchemaType(name = "anyURI")
    protected String longInterpretation;
    @XmlAttribute(name = "normalMaximum")
    protected Double normalMaximum;
    @XmlAttribute(name = "cardinality", required = true)
    protected String cardinality;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "normalMinimum")
    protected Double normalMinimum;

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultValueType }
     *     
     */
    public DefaultValueType getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultValueType }
     *     
     */
    public void setDefaultValue(DefaultValueType value) {
        this.defaultValue = value;
    }

    /**
     * Gets the value of the matchTable property.
     * 
     * @return
     *     possible object is
     *     {@link MatchTableType }
     *     
     */
    public MatchTableType getMatchTable() {
        return matchTable;
    }

    /**
     * Sets the value of the matchTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchTableType }
     *     
     */
    public void setMatchTable(MatchTableType value) {
        this.matchTable = value;
    }

    /**
     * Gets the value of the interpolationTable property.
     * 
     * @return
     *     possible object is
     *     {@link InterpolationTableType }
     *     
     */
    public InterpolationTableType getInterpolationTable() {
        return interpolationTable;
    }

    /**
     * Sets the value of the interpolationTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterpolationTableType }
     *     
     */
    public void setInterpolationTable(InterpolationTableType value) {
        this.interpolationTable = value;
    }

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the view property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the view property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getView().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewType }
     * 
     * 
     */
    public List<ViewType> getView() {
        if (view == null) {
            view = new ArrayList<ViewType>();
        }
        return this.view;
    }

    /**
     * Gets the value of the interpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterpretation() {
        return interpretation;
    }

    /**
     * Sets the value of the interpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterpretation(String value) {
        this.interpretation = value;
    }

    /**
     * Gets the value of the masteryValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMasteryValue() {
        return masteryValue;
    }

    /**
     * Sets the value of the masteryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMasteryValue(Double value) {
        this.masteryValue = value;
    }

    /**
     * Gets the value of the longInterpretation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongInterpretation() {
        return longInterpretation;
    }

    /**
     * Sets the value of the longInterpretation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongInterpretation(String value) {
        this.longInterpretation = value;
    }

    /**
     * Gets the value of the normalMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMaximum() {
        return normalMaximum;
    }

    /**
     * Sets the value of the normalMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMaximum(Double value) {
        this.normalMaximum = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardinality(String value) {
        this.cardinality = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the normalMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNormalMinimum() {
        return normalMinimum;
    }

    /**
     * Sets the value of the normalMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNormalMinimum(Double value) {
        this.normalMinimum = value;
    }

}