//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.07 at 05:27:06 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DumpHardwareArrayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DumpHardwareArrayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DumpHardware" type="{}DumpHardwareType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DumpHardwareArrayType", propOrder = {
    "dumpHardware"
})
public class DumpHardwareArrayType {

    @XmlElement(name = "DumpHardware", required = true)
    protected DumpHardwareType dumpHardware;

    /**
     * Gets the value of the dumpHardware property.
     * 
     * @return
     *     possible object is
     *     {@link DumpHardwareType }
     *     
     */
    public DumpHardwareType getDumpHardware() {
        return dumpHardware;
    }

    /**
     * Sets the value of the dumpHardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpHardwareType }
     *     
     */
    public void setDumpHardware(DumpHardwareType value) {
        this.dumpHardware = value;
    }

}
