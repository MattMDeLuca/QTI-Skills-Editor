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
 *                 When items are referenced as part of a test, the test may impose constraints on how many attempts, and which states are allowed. These constraints can be specified for individual items, for whole sections or for an entire testPart. By default, a setting at testPart level affects all items in that part unless the setting is overridden at the assessmentSection level or ultimately at the individual assessmentItemRef. The defaults given below are used only in the absence of any applicable constraint. This complexType is intentionally empty.
 *             
 * 
 * <p>Java class for ItemSessionControl.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSessionControl.Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.imsglobal.org/xsd/imsqti_v2p1}EmptyPrimitiveType.Type">
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}showSolution.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}allowComment.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}showFeedback.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}allowSkipping.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}maxAttempts.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}allowReview.ItemSessionControl.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}validateResponses.ItemSessionControl.Attr"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSessionControl.Type")
public class ItemSessionControlType
    extends EmptyPrimitiveTypeType
{

    @XmlAttribute(name = "showSolution")
    protected Boolean showSolution;
    @XmlAttribute(name = "allowComment")
    protected Boolean allowComment;
    @XmlAttribute(name = "showFeedback")
    protected Boolean showFeedback;
    @XmlAttribute(name = "allowSkipping")
    protected Boolean allowSkipping;
    @XmlAttribute(name = "maxAttempts")
    protected Integer maxAttempts;
    @XmlAttribute(name = "allowReview")
    protected Boolean allowReview;
    @XmlAttribute(name = "validateResponses")
    protected Boolean validateResponses;

    /**
     * Gets the value of the showSolution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowSolution() {
        if (showSolution == null) {
            return false;
        } else {
            return showSolution;
        }
    }

    /**
     * Sets the value of the showSolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSolution(Boolean value) {
        this.showSolution = value;
    }

    /**
     * Gets the value of the allowComment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowComment() {
        return allowComment;
    }

    /**
     * Sets the value of the allowComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowComment(Boolean value) {
        this.allowComment = value;
    }

    /**
     * Gets the value of the showFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowFeedback() {
        if (showFeedback == null) {
            return false;
        } else {
            return showFeedback;
        }
    }

    /**
     * Sets the value of the showFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowFeedback(Boolean value) {
        this.showFeedback = value;
    }

    /**
     * Gets the value of the allowSkipping property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowSkipping() {
        if (allowSkipping == null) {
            return true;
        } else {
            return allowSkipping;
        }
    }

    /**
     * Sets the value of the allowSkipping property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowSkipping(Boolean value) {
        this.allowSkipping = value;
    }

    /**
     * Gets the value of the maxAttempts property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * Sets the value of the maxAttempts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxAttempts(Integer value) {
        this.maxAttempts = value;
    }

    /**
     * Gets the value of the allowReview property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowReview() {
        if (allowReview == null) {
            return true;
        } else {
            return allowReview;
        }
    }

    /**
     * Sets the value of the allowReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowReview(Boolean value) {
        this.allowReview = value;
    }

    /**
     * Gets the value of the validateResponses property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidateResponses() {
        return validateResponses;
    }

    /**
     * Sets the value of the validateResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidateResponses(Boolean value) {
        this.validateResponses = value;
    }

}
