//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.20 a las 06:21:52 AM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Track information
 * 
 * <p>Clase Java para TrackType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad image.
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
     * Define el valor de la propiedad image.
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
     * Obtiene el valor de la propiedad size.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Obtiene el valor de la propiedad sequence.
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
     * Define el valor de la propiedad sequence.
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
     * Obtiene el valor de la propiedad startMSF.
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
     * Define el valor de la propiedad startMSF.
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
     * Obtiene el valor de la propiedad endMSF.
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
     * Define el valor de la propiedad endMSF.
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
     * Obtiene el valor de la propiedad startSector.
     * 
     */
    public long getStartSector() {
        return startSector;
    }

    /**
     * Define el valor de la propiedad startSector.
     * 
     */
    public void setStartSector(long value) {
        this.startSector = value;
    }

    /**
     * Obtiene el valor de la propiedad endSector.
     * 
     */
    public long getEndSector() {
        return endSector;
    }

    /**
     * Define el valor de la propiedad endSector.
     * 
     */
    public void setEndSector(long value) {
        this.endSector = value;
    }

    /**
     * Obtiene el valor de la propiedad trackType.
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
     * Define el valor de la propiedad trackType.
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
     * Obtiene el valor de la propiedad bytesPerSector.
     * 
     */
    public int getBytesPerSector() {
        return bytesPerSector;
    }

    /**
     * Define el valor de la propiedad bytesPerSector.
     * 
     */
    public void setBytesPerSector(int value) {
        this.bytesPerSector = value;
    }

    /**
     * Obtiene el valor de la propiedad accoustID.
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
     * Define el valor de la propiedad accoustID.
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
     * Obtiene el valor de la propiedad checksums.
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
     * Define el valor de la propiedad checksums.
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
     * Obtiene el valor de la propiedad subChannel.
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
     * Define el valor de la propiedad subChannel.
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
     * Obtiene el valor de la propiedad fileSystemInformation.
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
     * Define el valor de la propiedad fileSystemInformation.
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
