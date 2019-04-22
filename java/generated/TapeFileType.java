//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:40:52 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tape file information
 * 
 * <p>Clase Java para TapeFileType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TapeFileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{}ImageType"/&gt;
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="BlockSize" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="StartBlock" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="EndBlock" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="Checksums" type="{}ChecksumsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TapeFileType", propOrder = {
    "image",
    "size",
    "sequence",
    "blockSize",
    "startBlock",
    "endBlock",
    "checksums"
})
public class TapeFileType {

    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "Size")
    protected long size;
    @XmlElement(name = "Sequence")
    protected long sequence;
    @XmlElement(name = "BlockSize")
    protected long blockSize;
    @XmlElement(name = "StartBlock")
    protected long startBlock;
    @XmlElement(name = "EndBlock")
    protected long endBlock;
    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;

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
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     */
    public void setSequence(long value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad blockSize.
     * 
     */
    public long getBlockSize() {
        return blockSize;
    }

    /**
     * Define el valor de la propiedad blockSize.
     * 
     */
    public void setBlockSize(long value) {
        this.blockSize = value;
    }

    /**
     * Obtiene el valor de la propiedad startBlock.
     * 
     */
    public long getStartBlock() {
        return startBlock;
    }

    /**
     * Define el valor de la propiedad startBlock.
     * 
     */
    public void setStartBlock(long value) {
        this.startBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad endBlock.
     * 
     */
    public long getEndBlock() {
        return endBlock;
    }

    /**
     * Define el valor de la propiedad endBlock.
     * 
     */
    public void setEndBlock(long value) {
        this.endBlock = value;
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

}
