//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.18 at 01:26:23 PM JST 
//


package de.hybris.platform.print.comet.notes.definition.xml;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for placeholder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="placeholder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{http://comet.werk-ii.com/base}record"/>
 *         &lt;element name="newValue" type="{http://comet.werk-ii.com/psc_notes}newValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pid" use="required" type="{http://comet.werk-ii.com/base}idType" />
 *       &lt;attribute name="stdAction" use="required" type="{http://comet.werk-ii.com/psc_notes}standardAction" />
 *       &lt;attribute name="actionID" type="{http://comet.werk-ii.com/base}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "placeholder", namespace = "http://comet.werk-ii.com/psc_notes", propOrder = {
    "record",
    "newValue"
})
public class Placeholder {

    @XmlElement(required = true)
    protected Record record;
    @XmlElement(required = true)
    protected NewValue newValue;
    @XmlAttribute(name = "pid", required = true)
    protected String pid;
    @XmlAttribute(name = "stdAction", required = true)
    protected StandardAction stdAction;
    @XmlAttribute(name = "actionID")
    protected BigInteger actionID;

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link Record }
     *     
     */
    public Record getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link Record }
     *     
     */
    public void setRecord(Record value) {
        this.record = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link NewValue }
     *     
     */
    public NewValue getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewValue }
     *     
     */
    public void setNewValue(NewValue value) {
        this.newValue = value;
    }

    /**
     * Gets the value of the pid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPid(String value) {
        this.pid = value;
    }

    /**
     * Gets the value of the stdAction property.
     * 
     * @return
     *     possible object is
     *     {@link StandardAction }
     *     
     */
    public StandardAction getStdAction() {
        return stdAction;
    }

    /**
     * Sets the value of the stdAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardAction }
     *     
     */
    public void setStdAction(StandardAction value) {
        this.stdAction = value;
    }

    /**
     * Gets the value of the actionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActionID() {
        return actionID;
    }

    /**
     * Sets the value of the actionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActionID(BigInteger value) {
        this.actionID = value;
    }

}
