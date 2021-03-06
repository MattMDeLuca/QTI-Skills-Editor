//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 The templateDeclaration complexType is the container for template declarations. Template declarations declare item variables that are to be used specifically for the purposes of cloning items. They can have their value set only during templateProcessing. They are referred to within the itemBody in order to individualize the clone and possibily also within the responseProcessing rules if the cloning process affects the way the item is scored.
 *             
 * 
 * <p>Java class for TemplateDeclaration.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemplateDeclaration.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}defaultValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.TemplateDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}baseType.TemplateDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mathVariable.TemplateDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}paramVariable.TemplateDeclaration.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}cardinality.TemplateDeclaration.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateDeclaration.Type", propOrder = {
    "defaultValue"
})
public class TemplateDeclarationType {

    protected DefaultValueType defaultValue;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String identifier;
    @XmlAttribute(name = "baseType")
    protected String baseType;
    @XmlAttribute(name = "mathVariable")
    protected Boolean mathVariable;
    @XmlAttribute(name = "paramVariable")
    protected Boolean paramVariable;
    @XmlAttribute(name = "cardinality", required = true)
    protected String cardinality;

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
     * Gets the value of the mathVariable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMathVariable() {
        if (mathVariable == null) {
            return false;
        } else {
            return mathVariable;
        }
    }

    /**
     * Sets the value of the mathVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMathVariable(Boolean value) {
        this.mathVariable = value;
    }

    /**
     * Gets the value of the paramVariable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isParamVariable() {
        if (paramVariable == null) {
            return false;
        } else {
            return paramVariable;
        }
    }

    /**
     * Sets the value of the paramVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setParamVariable(Boolean value) {
        this.paramVariable = value;
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

}
