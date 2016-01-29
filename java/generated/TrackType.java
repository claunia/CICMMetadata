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
 * Track information
 * 
 * <p>Java class for TrackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Image" type="{}ImageType"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sequence" type="{}TrackSequenceType"/>
 *         &lt;element name="StartMSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndMSF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartSector" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EndSector" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TrackType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="audio"/>
 *               &lt;enumeration value="mode0"/>
 *               &lt;enumeration value="mode1"/>
 *               &lt;enumeration value="mode2"/>
 *               &lt;enumeration value="m2f1"/>
 *               &lt;enumeration value="m2f2"/>
 *               &lt;enumeration value="dvd"/>
 *               &lt;enumeration value="hddvd"/>
 *               &lt;enumeration value="bluray"/>
 *               &lt;enumeration value="ddcd"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BytesPerSector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccoustID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Checksums" type="{}ChecksumsType"/>
 *         &lt;element name="SubChannel" type="{}SubChannelType" minOccurs="0"/>
 *         &lt;element name="FileSystemInformation" type="{}FileSystemInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackType", propOrder = {
    "image",
    "size",
    "sequence",
    "startMSF",
    "endMSF",
    "startSector",
    "endSector",
    "trackType",
    "bytesPerSector",
    "accoustID",
    "checksums",
    "subChannel",
    "fileSystemInformation"
})
public class TrackType {

    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "Sequence", required = true)
    protected TrackSequenceType sequence;
    @XmlElement(name = "StartMSF")
    protected String startMSF;
    @XmlElement(name = "EndMSF")
    protected String endMSF;
    @XmlElement(name = "StartSector")
    protected long startSector;
    @XmlElement(name = "EndSector")
    protected long endSector;
    @XmlElement(name = "TrackType", required = true)
    protected String trackType;
    @XmlElement(name = "BytesPerSector")
    protected int bytesPerSector;
    @XmlElement(name = "AccoustID")
    protected String accoustID;
    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;
    @XmlElement(name = "SubChannel")
    protected SubChannelType subChannel;
    @XmlElement(name = "FileSystemInformation")
    protected FileSystemInformationType fileSystemInformation;

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
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link TrackSequenceType }
     *     
     */
    public TrackSequenceType getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackSequenceType }
     *     
     */
    public void setSequence(TrackSequenceType value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the startMSF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMSF() {
        return startMSF;
    }

    /**
     * Sets the value of the startMSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMSF(String value) {
        this.startMSF = value;
    }

    /**
     * Gets the value of the endMSF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndMSF() {
        return endMSF;
    }

    /**
     * Sets the value of the endMSF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndMSF(String value) {
        this.endMSF = value;
    }

    /**
     * Gets the value of the startSector property.
     * 
     */
    public long getStartSector() {
        return startSector;
    }

    /**
     * Sets the value of the startSector property.
     * 
     */
    public void setStartSector(long value) {
        this.startSector = value;
    }

    /**
     * Gets the value of the endSector property.
     * 
     */
    public long getEndSector() {
        return endSector;
    }

    /**
     * Sets the value of the endSector property.
     * 
     */
    public void setEndSector(long value) {
        this.endSector = value;
    }

    /**
     * Gets the value of the trackType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackType() {
        return trackType;
    }

    /**
     * Sets the value of the trackType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackType(String value) {
        this.trackType = value;
    }

    /**
     * Gets the value of the bytesPerSector property.
     * 
     */
    public int getBytesPerSector() {
        return bytesPerSector;
    }

    /**
     * Sets the value of the bytesPerSector property.
     * 
     */
    public void setBytesPerSector(int value) {
        this.bytesPerSector = value;
    }

    /**
     * Gets the value of the accoustID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccoustID() {
        return accoustID;
    }

    /**
     * Sets the value of the accoustID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccoustID(String value) {
        this.accoustID = value;
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
     * Gets the value of the subChannel property.
     * 
     * @return
     *     possible object is
     *     {@link SubChannelType }
     *     
     */
    public SubChannelType getSubChannel() {
        return subChannel;
    }

    /**
     * Sets the value of the subChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubChannelType }
     *     
     */
    public void setSubChannel(SubChannelType value) {
        this.subChannel = value;
    }

    /**
     * Gets the value of the fileSystemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FileSystemInformationType }
     *     
     */
    public FileSystemInformationType getFileSystemInformation() {
        return fileSystemInformation;
    }

    /**
     * Sets the value of the fileSystemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSystemInformationType }
     *     
     */
    public void setFileSystemInformation(FileSystemInformationType value) {
        this.fileSystemInformation = value;
    }

}
