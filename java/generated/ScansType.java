//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.29 at 11:21:42 PM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScansType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseScan" type="{}CaseScanType" minOccurs="0"/>
 *         &lt;element name="Scan" type="{}MediaScanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScansType", propOrder = {
    "caseScan",
    "scan"
})
public class ScansType {

    @XmlElement(name = "CaseScan")
    protected CaseScanType caseScan;
    @XmlElement(name = "Scan")
    protected MediaScanType scan;

    /**
     * Gets the value of the caseScan property.
     * 
     * @return
     *     possible object is
     *     {@link CaseScanType }
     *     
     */
    public CaseScanType getCaseScan() {
        return caseScan;
    }

    /**
     * Sets the value of the caseScan property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseScanType }
     *     
     */
    public void setCaseScan(CaseScanType value) {
        this.caseScan = value;
    }

    /**
     * Gets the value of the scan property.
     * 
     * @return
     *     possible object is
     *     {@link MediaScanType }
     *     
     */
    public MediaScanType getScan() {
        return scan;
    }

    /**
     * Sets the value of the scan property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaScanType }
     *     
     */
    public void setScan(MediaScanType value) {
        this.scan = value;
    }

}
