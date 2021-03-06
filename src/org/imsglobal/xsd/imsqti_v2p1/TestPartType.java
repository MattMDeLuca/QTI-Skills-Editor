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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *                 A Test is composed of one or more Test Parts. Each Test Part is used to control the presentation of a part of the Test - this allows a Test to be undertaken in several related but separated stages. A TestPart conatins one or more assessmentSections (either included or through external reference).
 *             
 * 
 * <p>Java class for TestPart.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestPart.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}preCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}branchRule" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}itemSessionControl" minOccurs="0"/>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}timeLimits" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}assessmentSection"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}assessmentSectionRef"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}testFeedback" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}identifier.TestPart.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}submissionMode.TestPart.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}navigationMode.TestPart.Attr"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestPart.Type", propOrder = {
    "preCondition",
    "branchRule",
    "itemSessionControl",
    "timeLimits",
    "assessmentSectionOrAssessmentSectionRef",
    "testFeedback"
})
public class TestPartType {

    protected List<LogicSingleType> preCondition;
    protected List<BranchRuleType> branchRule;
    protected ItemSessionControlType itemSessionControl;
    protected TimeLimitsType timeLimits;
    @XmlElements({
        @XmlElement(name = "assessmentSection", type = AssessmentSectionType.class),
        @XmlElement(name = "assessmentSectionRef", type = AssessmentSectionRefType.class)
    })
    protected List<Object> assessmentSectionOrAssessmentSectionRef;
    protected List<TestFeedbackType> testFeedback;
    @XmlAttribute(name = "identifier", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifier;
    @XmlAttribute(name = "submissionMode", required = true)
    protected String submissionMode;
    @XmlAttribute(name = "navigationMode", required = true)
    protected String navigationMode;

    /**
     * Gets the value of the preCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LogicSingleType }
     * 
     * 
     */
    public List<LogicSingleType> getPreCondition() {
        if (preCondition == null) {
            preCondition = new ArrayList<LogicSingleType>();
        }
        return this.preCondition;
    }

    /**
     * Gets the value of the branchRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchRuleType }
     * 
     * 
     */
    public List<BranchRuleType> getBranchRule() {
        if (branchRule == null) {
            branchRule = new ArrayList<BranchRuleType>();
        }
        return this.branchRule;
    }

    /**
     * Gets the value of the itemSessionControl property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSessionControlType }
     *     
     */
    public ItemSessionControlType getItemSessionControl() {
        return itemSessionControl;
    }

    /**
     * Sets the value of the itemSessionControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSessionControlType }
     *     
     */
    public void setItemSessionControl(ItemSessionControlType value) {
        this.itemSessionControl = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TimeLimitsType }
     *     
     */
    public TimeLimitsType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeLimitsType }
     *     
     */
    public void setTimeLimits(TimeLimitsType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the assessmentSectionOrAssessmentSectionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentSectionOrAssessmentSectionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentSectionOrAssessmentSectionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentSectionType }
     * {@link AssessmentSectionRefType }
     * 
     * 
     */
    public List<Object> getAssessmentSectionOrAssessmentSectionRef() {
        if (assessmentSectionOrAssessmentSectionRef == null) {
            assessmentSectionOrAssessmentSectionRef = new ArrayList<Object>();
        }
        return this.assessmentSectionOrAssessmentSectionRef;
    }

    /**
     * Gets the value of the testFeedback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testFeedback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestFeedback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestFeedbackType }
     * 
     * 
     */
    public List<TestFeedbackType> getTestFeedback() {
        if (testFeedback == null) {
            testFeedback = new ArrayList<TestFeedbackType>();
        }
        return this.testFeedback;
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
     * Gets the value of the submissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionMode() {
        return submissionMode;
    }

    /**
     * Sets the value of the submissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionMode(String value) {
        this.submissionMode = value;
    }

    /**
     * Gets the value of the navigationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigationMode() {
        return navigationMode;
    }

    /**
     * Sets the value of the navigationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigationMode(String value) {
        this.navigationMode = value;
    }

}
