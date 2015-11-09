//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.09 at 03:41:35 AM WET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{}FileType"/>
 *         &lt;element name="Checksums" type="{}ChecksumsType"/>
 *         &lt;element name="Scanner" type="{}ScannerType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ScanProcessing" type="{}ScanProcessingType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OCR" type="{}OCRType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanType", propOrder = {
    "file",
    "checksums",
    "scanner",
    "scanProcessing",
    "ocr"
})
public class ScanType {

    @XmlElement(name = "File", required = true)
    protected FileType file;
    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;
    @XmlElement(name = "Scanner")
    protected List<ScannerType> scanner;
    @XmlElement(name = "ScanProcessing")
    protected List<ScanProcessingType> scanProcessing;
    @XmlElement(name = "OCR")
    protected List<OCRType> ocr;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFile(FileType value) {
        this.file = value;
    }

    /**
     * Gets the value of the checksums property.
     * 
     * @return
     *     possible object is
     *     {@link ChecksumsType }
     *     
     */
    public ChecksumsType getChecksums() {
        return checksums;
    }

    /**
     * Sets the value of the checksums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecksumsType }
     *     
     */
    public void setChecksums(ChecksumsType value) {
        this.checksums = value;
    }

    /**
     * Gets the value of the scanner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scanner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScanner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScannerType }
     * 
     * 
     */
    public List<ScannerType> getScanner() {
        if (scanner == null) {
            scanner = new ArrayList<ScannerType>();
        }
        return this.scanner;
    }

    /**
     * Gets the value of the scanProcessing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scanProcessing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScanProcessing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScanProcessingType }
     * 
     * 
     */
    public List<ScanProcessingType> getScanProcessing() {
        if (scanProcessing == null) {
            scanProcessing = new ArrayList<ScanProcessingType>();
        }
        return this.scanProcessing;
    }

    /**
     * Gets the value of the ocr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOCR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCRType }
     * 
     * 
     */
    public List<OCRType> getOCR() {
        if (ocr == null) {
            ocr = new ArrayList<OCRType>();
        }
        return this.ocr;
    }

}
