//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:26:23 PM JST 
//


package de.hybris.platform.print.comet.notes.definition.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for colorSpace.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="colorSpace">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;whiteSpace value="collapse"/>
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="CMYK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "colorSpace", namespace = "http://comet.werk-ii.com/base")
@XmlEnum
public enum ColorSpace {

    RGB,
    CMYK;

    public String value() {
        return name();
    }

    public static ColorSpace fromValue(String v) {
        return valueOf(v);
    }

}
