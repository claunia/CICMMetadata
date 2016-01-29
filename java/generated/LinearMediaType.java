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
 * Describes a dump of a linear media, that is, a media that is read byte-by-byte like for example, a ROM chip, a game cartridge, a PCMCIA SRAM card, etc...
 * 
 * <p>Java class for LinearMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearMediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Image" type="{}ImageType"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ImageChecksums" type="{}ChecksumsType"/>
 *         &lt;element name="Checksums" type="{}ChecksumsType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ImageInterleave" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Interleave" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Package" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Interface" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dimensions" type="{}DimensionsType" minOccurs="0"/>
 *         &lt;element name="Scans" type="{}ScansType" minOccurs="0"/>
 *         &lt;element name="DumpHardwareArray" type="{}DumpHardwareArrayType" minOccurs="0"/>
 *         &lt;element name="PCMCIA" type="{}PCMCIAType" minOccurs="0"/>
 *         &lt;element name="CopyProtection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearMediaType", propOrder = {
    "image",
    "size",
    "imageChecksums",
    "checksums",
    "title",
    "sequence",
    "imageInterleave",
    "interleave",
    "manufacturer",
    "model",
    "_package",
    "_interface",
    "dimensions",
    "scans",
    "dumpHardwareArray",
    "pcmcia",
    "copyProtection"
})
public class LinearMediaType {

    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "ImageChecksums", required = true)
    protected ChecksumsType imageChecksums;
    @XmlElement(name = "Checksums")
    protected ChecksumsType checksums;
    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "ImageInterleave")
    protected Integer imageInterleave;
    @XmlElement(name = "Interleave")
    protected Integer interleave;
    @XmlElement(name = "Manufacturer")
    protected String manufacturer;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Package", required = true)
    protected String _package;
    @XmlElement(name = "Interface")
    protected String _interface;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "Scans")
    protected ScansType scans;
    @XmlElement(name = "DumpHardwareArray")
    protected DumpHardwareArrayType dumpHardwareArray;
    @XmlElement(name = "PCMCIA")
    protected PCMCIAType pcmcia;
    @XmlElement(name = "CopyProtection")
    protected String copyProtection;

    /**
     * Gets the value of the image property.
     * 
     * @return
     *     possible object is
     *     {@link ImageType }
     *     
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * Sets the value of the image property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *     
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    /**
     * Gets the value of the size property.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Gets the value of the imageChecksums property.
     * 
     * @return
     *     possible object is
     *     {@link ChecksumsType }
     *     
     */
    public ChecksumsType getImageChecksums() {
        return imageChecksums;
    }

    /**
     * Sets the value of the imageChecksums property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecksumsType }
     *     
     */
    public void setImageChecksums(ChecksumsType value) {
        this.imageChecksums = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the imageInterleave property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImageInterleave() {
        return imageInterleave;
    }

    /**
     * Sets the value of the imageInterleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImageInterleave(Integer value) {
        this.imageInterleave = value;
    }

    /**
     * Gets the value of the interleave property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterleave() {
        return interleave;
    }

    /**
     * Sets the value of the interleave property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterleave(Integer value) {
        this.interleave = value;
    }

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
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *     
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *     
     */
    public void setDimensions(DimensionsType value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the scans property.
     * 
     * @return
     *     possible object is
     *     {@link ScansType }
     *     
     */
    public ScansType getScans() {
        return scans;
    }

    /**
     * Sets the value of the scans property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScansType }
     *     
     */
    public void setScans(ScansType value) {
        this.scans = value;
    }

    /**
     * Gets the value of the dumpHardwareArray property.
     * 
     * @return
     *     possible object is
     *     {@link DumpHardwareArrayType }
     *     
     */
    public DumpHardwareArrayType getDumpHardwareArray() {
        return dumpHardwareArray;
    }

    /**
     * Sets the value of the dumpHardwareArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpHardwareArrayType }
     *     
     */
    public void setDumpHardwareArray(DumpHardwareArrayType value) {
        this.dumpHardwareArray = value;
    }

    /**
     * Gets the value of the pcmcia property.
     * 
     * @return
     *     possible object is
     *     {@link PCMCIAType }
     *     
     */
    public PCMCIAType getPCMCIA() {
        return pcmcia;
    }

    /**
     * Sets the value of the pcmcia property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCMCIAType }
     *     
     */
    public void setPCMCIA(PCMCIAType value) {
        this.pcmcia = value;
    }

    /**
     * Gets the value of the copyProtection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyProtection() {
        return copyProtection;
    }

    /**
     * Sets the value of the copyProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyProtection(String value) {
        this.copyProtection = value;
    }

}
