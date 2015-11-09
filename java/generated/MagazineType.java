//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.09 at 03:41:35 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MagazineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MagazineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Barcodes" type="{}BarcodesType" minOccurs="0"/>
 *         &lt;element name="Cover" type="{}CoverType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Editorial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublicationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Language" type="{}LanguagesType" minOccurs="0"/>
 *         &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Scan" type="{}ScanType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MagazineType", propOrder = {
    "barcodes",
    "cover",
    "name",
    "editorial",
    "publicationDate",
    "number",
    "language",
    "pages",
    "pageSize",
    "scan"
})
public class MagazineType {

    @XmlElement(name = "Barcodes")
    protected BarcodesType barcodes;
    @XmlElement(name = "Cover")
    protected CoverType cover;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Editorial")
    protected String editorial;
    @XmlElement(name = "PublicationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar publicationDate;
    @XmlElement(name = "Number")
    protected Integer number;
    @XmlElement(name = "Language")
    protected LanguagesType language;
    @XmlElement(name = "Pages")
    protected Integer pages;
    @XmlElement(name = "PageSize")
    protected String pageSize;
    @XmlElement(name = "Scan")
    protected ScanType scan;

    /**
     * Gets the value of the barcodes property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodesType }
     *     
     */
    public BarcodesType getBarcodes() {
        return barcodes;
    }

    /**
     * Sets the value of the barcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodesType }
     *     
     */
    public void setBarcodes(BarcodesType value) {
        this.barcodes = value;
    }

    /**
     * Gets the value of the cover property.
     * 
     * @return
     *     possible object is
     *     {@link CoverType }
     *     
     */
    public CoverType getCover() {
        return cover;
    }

    /**
     * Sets the value of the cover property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverType }
     *     
     */
    public void setCover(CoverType value) {
        this.cover = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the editorial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Sets the value of the editorial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditorial(String value) {
        this.editorial = value;
    }

    /**
     * Gets the value of the publicationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPublicationDate() {
        return publicationDate;
    }

    /**
     * Sets the value of the publicationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPublicationDate(XMLGregorianCalendar value) {
        this.publicationDate = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguage(LanguagesType value) {
        this.language = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPages(Integer value) {
        this.pages = value;
    }

    /**
     * Gets the value of the pageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Sets the value of the pageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
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
