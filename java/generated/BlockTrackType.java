//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.29 a las 02:23:35 PM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about track in non-abstracted block based media
 * 
 * <p>Clase Java para BlockTrackType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BlockTrackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Image" type="{}ImageType"/>
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Head" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cylinder" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StartSector" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EndSector" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sectors" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BytesPerSector" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Checksums" type="{}ChecksumsType"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockTrackType", propOrder = {
    "image",
    "size",
    "head",
    "cylinder",
    "startSector",
    "endSector",
    "sectors",
    "bytesPerSector",
    "checksums",
    "format"
})
public class BlockTrackType {

    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "Head")
    protected long head;
    @XmlElement(name = "Cylinder")
    protected long cylinder;
    @XmlElement(name = "StartSector")
    protected long startSector;
    @XmlElement(name = "EndSector")
    protected long endSector;
    @XmlElement(name = "Sectors")
    protected long sectors;
    @XmlElement(name = "BytesPerSector")
    protected int bytesPerSector;
    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;
    @XmlElement(name = "Format")
    protected String format;

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
     * Obtiene el valor de la propiedad head.
     * 
     */
    public long getHead() {
        return head;
    }

    /**
     * Define el valor de la propiedad head.
     * 
     */
    public void setHead(long value) {
        this.head = value;
    }

    /**
     * Obtiene el valor de la propiedad cylinder.
     * 
     */
    public long getCylinder() {
        return cylinder;
    }

    /**
     * Define el valor de la propiedad cylinder.
     * 
     */
    public void setCylinder(long value) {
        this.cylinder = value;
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
     * Obtiene el valor de la propiedad sectors.
     * 
     */
    public long getSectors() {
        return sectors;
    }

    /**
     * Define el valor de la propiedad sectors.
     * 
     */
    public void setSectors(long value) {
        this.sectors = value;
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
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

}
