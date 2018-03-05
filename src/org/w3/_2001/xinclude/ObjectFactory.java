//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.19 at 02:54:07 PM EST 
//


package org.w3._2001.xinclude;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2001.xinclude package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Include_QNAME = new QName("http://www.w3.org/2001/XInclude", "include");
    private final static QName _Fallback_QNAME = new QName("http://www.w3.org/2001/XInclude", "fallback");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2001.xinclude
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncludeType }
     * 
     */
    public IncludeType createIncludeType() {
        return new IncludeType();
    }

    /**
     * Create an instance of {@link FallbackType }
     * 
     */
    public FallbackType createFallbackType() {
        return new FallbackType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncludeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XInclude", name = "include")
    public JAXBElement<IncludeType> createInclude(IncludeType value) {
        return new JAXBElement<IncludeType>(_Include_QNAME, IncludeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FallbackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/XInclude", name = "fallback")
    public JAXBElement<FallbackType> createFallback(FallbackType value) {
        return new JAXBElement<FallbackType>(_Fallback_QNAME, FallbackType.class, null, value);
    }

}