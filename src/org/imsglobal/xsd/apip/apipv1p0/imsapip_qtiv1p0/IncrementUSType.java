//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.apip.apipv1p0.imsapip_qtiv1p0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 The IncrementUS complexType is the container for the simple specification of the Protractor, using US units, to be used with the set of APIP Items. The Protractor is defined in terms of its increment resolutions.
 *             
 * 
 * <p>Java class for IncrementUS.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncrementUS.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minorIncrement" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}RadialUSValue.Type" minOccurs="0"/>
 *         &lt;element name="majorIncrement" type="{http://www.imsglobal.org/xsd/apip/apipv1p0/imsapip_qtiv1p0}RadialUSValue.Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncrementUS.Type", propOrder = {
    "minorIncrement",
    "majorIncrement"
})
public class IncrementUSType {

    protected RadialUSValueType minorIncrement;
    @XmlElement(required = true)
    protected RadialUSValueType majorIncrement;

    /**
     * Gets the value of the minorIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link RadialUSValueType }
     *     
     */
    public RadialUSValueType getMinorIncrement() {
        return minorIncrement;
    }

    /**
     * Sets the value of the minorIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadialUSValueType }
     *     
     */
    public void setMinorIncrement(RadialUSValueType value) {
        this.minorIncrement = value;
    }

    /**
     * Gets the value of the majorIncrement property.
     * 
     * @return
     *     possible object is
     *     {@link RadialUSValueType }
     *     
     */
    public RadialUSValueType getMajorIncrement() {
        return majorIncrement;
    }

    /**
     * Sets the value of the majorIncrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadialUSValueType }
     *     
     */
    public void setMajorIncrement(RadialUSValueType value) {
        this.majorIncrement = value;
    }

}
