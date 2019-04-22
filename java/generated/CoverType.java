//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 12:13:17 AM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CoverType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CoverType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="File" type="{}FileType"/&gt;
 *         &lt;element name="Checksums" type="{}ChecksumsType"/&gt;
 *         &lt;element name="Thumbnail" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverType", propOrder = {
    "file",
    "checksums",
    "thumbnail"
})
public class CoverType {

    @XmlElement(name = "File", required = true)
    protected FileType file;
    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;
    @XmlElement(name = "Thumbnail", required = true)
    protected byte[] thumbnail;

    /**
     * Obtiene el valor de la propiedad file.
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
     * Define el valor de la propiedad file.
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
     * Obtiene el valor de la propiedad thumbnail.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getThumbnail() {
        return thumbnail;
    }

    /**
     * Define el valor de la propiedad thumbnail.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setThumbnail(byte[] value) {
        this.thumbnail = value;
    }

}
