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


/**
 * 
 *                 In the context of a specific assessmentTest an item, or group of items, may be subject to a time constraint. The QTI specification supports both minimum and maximum time constraints. The controlled time for a single item is simply the duration of the item session as defined by the builtin response variable duration. For assessmentSections, testParts and whole assessmentTests the time limits relate to the durations of all the item sessions plus any other time spent navigating that part of the test. In other words, the time includes time spent in states where no item is being interacted with, such as dedicated navigation screens. This complexType is intentionally empty.
 *             
 * 
 * <p>Java class for TimeLimits.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeLimits.Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.imsglobal.org/xsd/imsqti_v2p1}EmptyPrimitiveType.Type">
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}minTime.TimeLimits.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}allowLateSubmission.TimeLimits.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}maxTime.TimeLimits.Attr"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeLimits.Type")
public class TimeLimitsType
    extends EmptyPrimitiveTypeType
{

    @XmlAttribute(name = "minTime")
    protected Double minTime;
    @XmlAttribute(name = "allowLateSubmission")
    protected Boolean allowLateSubmission;
    @XmlAttribute(name = "maxTime")
    protected Double maxTime;

    /**
     * Gets the value of the minTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinTime(Double value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the allowLateSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowLateSubmission() {
        if (allowLateSubmission == null) {
            return false;
        } else {
            return allowLateSubmission;
        }
    }

    /**
     * Sets the value of the allowLateSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowLateSubmission(Boolean value) {
        this.allowLateSubmission = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxTime(Double value) {
        this.maxTime = value;
    }

}
