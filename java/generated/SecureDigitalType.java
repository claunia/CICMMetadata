//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.09 at 05:09:39 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains SD/MMC device information
 * 
 * <p>Java class for SecureDigitalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecureDigitalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CID" type="{}DumpType"/>
 *         &lt;element name="CSD" type="{}DumpType" minOccurs="0"/>
 *         &lt;element name="ExtendedCSD" type="{}DumpType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecureDigitalType", propOrder = {
    "cid",
    "csd",
    "extendedCSD"
})
public class SecureDigitalType {

    @XmlElement(name = "CID", required = true)
    protected DumpType cid;
    @XmlElement(name = "CSD")
    protected DumpType csd;
    @XmlElement(name = "ExtendedCSD")
    protected DumpType extendedCSD;

    /**
     * Gets the value of the cid property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getCID() {
        return cid;
    }

    /**
     * Sets the value of the cid property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setCID(DumpType value) {
        this.cid = value;
    }

    /**
     * Gets the value of the csd property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getCSD() {
        return csd;
    }

    /**
     * Sets the value of the csd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setCSD(DumpType value) {
        this.csd = value;
    }

    /**
     * Gets the value of the extendedCSD property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getExtendedCSD() {
        return extendedCSD;
    }

    /**
     * Sets the value of the extendedCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setExtendedCSD(DumpType value) {
        this.extendedCSD = value;
    }

}
