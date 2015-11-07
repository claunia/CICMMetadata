//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.07 at 02:55:57 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DumpHardwareType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DumpHardwareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Firmware" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Extents" type="{}ExtentsType"/>
 *         &lt;element name="Software" type="{}SoftwareType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DumpHardwareType", propOrder = {
    "manufacturer",
    "model",
    "revision",
    "firmware",
    "serial",
    "extents",
    "software"
})
public class DumpHardwareType {

    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Revision", required = true)
    protected String revision;
    @XmlElement(name = "Firmware", required = true)
    protected String firmware;
    @XmlElement(name = "Serial", required = true)
    protected String serial;
    @XmlElement(name = "Extents", required = true)
    protected ExtentsType extents;
    @XmlElement(name = "Software", required = true)
    protected SoftwareType software;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the firmware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Sets the value of the firmware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmware(String value) {
        this.firmware = value;
    }

    /**
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Gets the value of the extents property.
     * 
     * @return
     *     possible object is
     *     {@link ExtentsType }
     *     
     */
    public ExtentsType getExtents() {
        return extents;
    }

    /**
     * Sets the value of the extents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentsType }
     *     
     */
    public void setExtents(ExtentsType value) {
        this.extents = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Sets the value of the software property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

}
