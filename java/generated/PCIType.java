//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.17 at 02:08:03 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains PCI/PCI-X/PCIe card information
 * 
 * <p>Java class for PCIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PCIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VendorID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="65534"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DeviceID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="65534"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Configuration" type="{}DumpType" minOccurs="0"/>
 *         &lt;element name="ExpansionROM" type="{}LinearMediaType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCIType", propOrder = {
    "vendorID",
    "deviceID",
    "configuration",
    "expansionROM"
})
public class PCIType {

    @XmlElement(name = "VendorID")
    protected int vendorID;
    @XmlElement(name = "DeviceID")
    protected int deviceID;
    @XmlElement(name = "Configuration")
    protected DumpType configuration;
    @XmlElement(name = "ExpansionROM")
    protected LinearMediaType expansionROM;

    /**
     * Gets the value of the vendorID property.
     * 
     */
    public int getVendorID() {
        return vendorID;
    }

    /**
     * Sets the value of the vendorID property.
     * 
     */
    public void setVendorID(int value) {
        this.vendorID = value;
    }

    /**
     * Gets the value of the deviceID property.
     * 
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     * Sets the value of the deviceID property.
     * 
     */
    public void setDeviceID(int value) {
        this.deviceID = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setConfiguration(DumpType value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the expansionROM property.
     * 
     * @return
     *     possible object is
     *     {@link LinearMediaType }
     *     
     */
    public LinearMediaType getExpansionROM() {
        return expansionROM;
    }

    /**
     * Sets the value of the expansionROM property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearMediaType }
     *     
     */
    public void setExpansionROM(LinearMediaType value) {
        this.expansionROM = value;
    }

}
