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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 Provides an operator that returns the number of values that confrm to the associated constraints e.g. 'numberCorrect'.
 *             
 * 
 * <p>Java class for Number.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Number.Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.imsglobal.org/xsd/imsqti_v2p1}EmptyPrimitiveType.Type">
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}includeCategory.Number.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sectionIdentifier.Number.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}excludeCategory.Number.Attr"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Number.Type")
public class NumberType
    extends EmptyPrimitiveTypeType
{

    @XmlAttribute(name = "includeCategory")
    protected List<String> includeCategory;
    @XmlAttribute(name = "sectionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sectionIdentifier;
    @XmlAttribute(name = "excludeCategory")
    protected List<String> excludeCategory;

    /**
     * Gets the value of the includeCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeCategory() {
        if (includeCategory == null) {
            includeCategory = new ArrayList<String>();
        }
        return this.includeCategory;
    }

    /**
     * Gets the value of the sectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * Sets the value of the sectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIdentifier(String value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the excludeCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeCategory() {
        if (excludeCategory == null) {
            excludeCategory = new ArrayList<String>();
        }
        return this.excludeCategory;
    }

}
