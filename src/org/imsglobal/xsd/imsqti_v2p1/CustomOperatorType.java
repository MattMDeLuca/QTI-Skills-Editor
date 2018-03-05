//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.imsglobal.xsd.imsqti_v2p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;


/**
 * 
 *                 The custom operator provides a namespaced extension mechanism for defining operations not currently supported by this specification.
 *             
 * 
 * <p>Java class for CustomOperator.Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomOperator.Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}and"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}gt"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}not"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}lt"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}gte"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}lte"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}or"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}sum"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}durationLT"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}durationGTE"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}subtract"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}divide"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}multiple"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}ordered"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}customOperator"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}random"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}numberIncorrect"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}numberCorrect"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}numberPresented"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}numberResponded"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}numberSelected"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}substring"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}equalRounded"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}null"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}delete"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}match"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}index"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}power"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}equal"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}contains"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}containerSize"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}correct"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}default"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}anyN"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}integerDivide"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}integerModulus"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}isNull"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}member"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}product"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}round"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}truncate"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}fieldValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}randomInteger"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}randomFloat"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}variable"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeMinimum"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}outcomeMaximum"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}testVariables"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}integerToFloat"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}inside"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}baseValue"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}patternMatch"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mapResponsePoint"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mapResponse"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}stringMatch"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}repeat"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}roundTo"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}lcm"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}gcd"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}min"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}max"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mathConstant"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}statsOperator"/>
 *           &lt;element ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}mathOperator"/>
 *         &lt;/choice>
 *         &lt;group ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}grpLax.any"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}class.CustomOperator.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}extension.CustomOperator.Attr"/>
 *       &lt;attGroup ref="{http://www.imsglobal.org/xsd/imsqti_v2p1}definition.CustomOperator.Attr"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomOperator.Type", propOrder = {
    "andOrGtOrNot",
    "any"
})
public class CustomOperatorType {

    @XmlElementRefs({
        @XmlElementRef(name = "mapResponse", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "not", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customOperator", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "null", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equal", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "durationGTE", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "max", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "product", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "correct", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "random", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "patternMatch", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mapResponsePoint", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fieldValue", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mathOperator", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "repeat", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contains", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "durationLT", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "variable", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mathConstant", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "divide", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "anyN", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "integerModulus", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "member", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "testVariables", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "stringMatch", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "and", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberIncorrect", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lt", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "min", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcomeMinimum", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lte", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "inside", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ordered", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gcd", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "index", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "default", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "truncate", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberResponded", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "subtract", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "outcomeMaximum", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "statsOperator", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "integerDivide", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "multiple", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "equalRounded", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "randomInteger", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isNull", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberSelected", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "integerToFloat", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "substring", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "containerSize", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sum", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "power", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "baseValue", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "delete", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberPresented", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gt", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gte", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "round", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "randomFloat", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "or", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "roundTo", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lcm", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "match", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numberCorrect", namespace = "http://www.imsglobal.org/xsd/imsqti_v2p1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> andOrGtOrNot;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "class")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String clazz;
    @XmlAttribute(name = "definition")
    @XmlSchemaType(name = "anyURI")
    protected String definition;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the andOrGtOrNot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the andOrGtOrNot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAndOrGtOrNot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MapResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link CustomOperatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link EmptyPrimitiveTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link EqualType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link CorrectType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link PatternMatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link MapResponseType }{@code >}
     * {@link JAXBElement }{@code <}{@link FieldValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link MathOperatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link RepeatType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link VariableType }{@code >}
     * {@link JAXBElement }{@code <}{@link MathConstantType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnyNType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link TestVariablesType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringMatchType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link OutcomeMinMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link InsideType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic0ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link IndexType }{@code >}
     * {@link JAXBElement }{@code <}{@link DefaultType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link OutcomeMinMaxType }{@code >}
     * {@link JAXBElement }{@code <}{@link StatsOperatorType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic0ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link EqualRoundedType }{@code >}
     * {@link JAXBElement }{@code <}{@link RandomIntegerType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link SubstringType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumericLogic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicSingleType }{@code >}
     * {@link JAXBElement }{@code <}{@link RandomFloatType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundToType }{@code >}
     * {@link JAXBElement }{@code <}{@link Logic1ToManyType }{@code >}
     * {@link JAXBElement }{@code <}{@link LogicPairType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getAndOrGtOrNot() {
        if (andOrGtOrNot == null) {
            andOrGtOrNot = new ArrayList<JAXBElement<?>>();
        }
        return this.andOrGtOrNot;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
