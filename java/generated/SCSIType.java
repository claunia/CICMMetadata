//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.10 at 06:09:13 AM WET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains SCSI device information
 * 
 * <p>Java class for SCSIType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SCSIType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Inquiry" type="{}DumpType"/>
 *         &lt;element name="EVPD" type="{}EVPDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ModeSense" type="{}DumpType" minOccurs="0"/>
 *         &lt;element name="ModeSense10" type="{}DumpType" minOccurs="0"/>
 *         &lt;element name="LogSense" type="{}DumpType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SCSIType", propOrder = {
    "inquiry",
    "evpd",
    "modeSense",
    "modeSense10",
    "logSense"
})
public class SCSIType {

    @XmlElement(name = "Inquiry", required = true)
    protected DumpType inquiry;
    @XmlElement(name = "EVPD")
    protected List<EVPDType> evpd;
    @XmlElement(name = "ModeSense")
    protected DumpType modeSense;
    @XmlElement(name = "ModeSense10")
    protected DumpType modeSense10;
    @XmlElement(name = "LogSense")
    protected DumpType logSense;

    /**
     * Gets the value of the inquiry property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getInquiry() {
        return inquiry;
    }

    /**
     * Sets the value of the inquiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setInquiry(DumpType value) {
        this.inquiry = value;
    }

    /**
     * Gets the value of the evpd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evpd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEVPD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EVPDType }
     * 
     * 
     */
    public List<EVPDType> getEVPD() {
        if (evpd == null) {
            evpd = new ArrayList<EVPDType>();
        }
        return this.evpd;
    }

    /**
     * Gets the value of the modeSense property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getModeSense() {
        return modeSense;
    }

    /**
     * Sets the value of the modeSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setModeSense(DumpType value) {
        this.modeSense = value;
    }

    /**
     * Gets the value of the modeSense10 property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getModeSense10() {
        return modeSense10;
    }

    /**
     * Sets the value of the modeSense10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setModeSense10(DumpType value) {
        this.modeSense10 = value;
    }

    /**
     * Gets the value of the logSense property.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getLogSense() {
        return logSense;
    }

    /**
     * Sets the value of the logSense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setLogSense(DumpType value) {
        this.logSense = value;
    }

}
