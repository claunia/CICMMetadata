//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.17 at 02:08:03 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ChecksumType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChecksumType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="fletcher16"/>
 *             &lt;enumeration value="fletcher32"/>
 *             &lt;enumeration value="adler32"/>
 *             &lt;enumeration value="crc16"/>
 *             &lt;enumeration value="crc16ccitt"/>
 *             &lt;enumeration value="crc32"/>
 *             &lt;enumeration value="crc64"/>
 *             &lt;enumeration value="md4"/>
 *             &lt;enumeration value="md5"/>
 *             &lt;enumeration value="dm6"/>
 *             &lt;enumeration value="ripemd128"/>
 *             &lt;enumeration value="ripemd160"/>
 *             &lt;enumeration value="ripemed320"/>
 *             &lt;enumeration value="sha1"/>
 *             &lt;enumeration value="sha224"/>
 *             &lt;enumeration value="sha256"/>
 *             &lt;enumeration value="sha384"/>
 *             &lt;enumeration value="sha512"/>
 *             &lt;enumeration value="sha3"/>
 *             &lt;enumeration value="skein"/>
 *             &lt;enumeration value="snefru"/>
 *             &lt;enumeration value="blake256"/>
 *             &lt;enumeration value="blake512"/>
 *             &lt;enumeration value="tiger"/>
 *             &lt;enumeration value="whirlpool"/>
 *             &lt;enumeration value="spamsum"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChecksumType", propOrder = {
    "value"
})
public class ChecksumType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
