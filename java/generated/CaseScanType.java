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
 * <p>Java class for CaseScanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseScanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CaseScanElement">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="sleeve"/>
 *               &lt;enumeration value="inner"/>
 *               &lt;enumeration value="inlay"/>
 *               &lt;enumeration value="frontback"/>
 *               &lt;enumeration value="frontfull"/>
 *               &lt;enumeration value="boxfront"/>
 *               &lt;enumeration value="boxback"/>
 *               &lt;enumeration value="boxspine"/>
 *               &lt;enumeration value="external"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Scan" type="{}ScanType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseScanType", propOrder = {
    "caseScanElement",
    "scan"
})
public class CaseScanType {

    @XmlElement(name = "CaseScanElement", required = true)
    protected String caseScanElement;
    @XmlElement(name = "Scan", required = true)
    protected ScanType scan;

    /**
     * Gets the value of the caseScanElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseScanElement() {
        return caseScanElement;
    }

    /**
     * Sets the value of the caseScanElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseScanElement(String value) {
        this.caseScanElement = value;
    }

    /**
     * Gets the value of the scan property.
     * 
     * @return
     *     possible object is
     *     {@link ScanType }
     *     
     */
    public ScanType getScan() {
        return scan;
    }

    /**
     * Sets the value of the scan property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType }
     *     
     */
    public void setScan(ScanType value) {
        this.scan = value;
    }

}
