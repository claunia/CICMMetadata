//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="BlockSize" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="StartBlock" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
 *         &lt;element name="EndBlock" type="{http://www.w3.org/2001/XMLSchema}unsignedLong"/&gt;
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
    @XmlElement(name = "Size", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger size;
    @XmlElement(name = "Sequence", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger sequence;
    @XmlElement(name = "BlockSize", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger blockSize;
    @XmlElement(name = "StartBlock", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger startBlock;
    @XmlElement(name = "EndBlock", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger endBlock;
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
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Define el valor de la propiedad size.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Obtiene el valor de la propiedad sequence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequence(BigInteger value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad blockSize.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBlockSize() {
        return blockSize;
    }

    /**
     * Define el valor de la propiedad blockSize.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBlockSize(BigInteger value) {
        this.blockSize = value;
    }

    /**
     * Obtiene el valor de la propiedad startBlock.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartBlock() {
        return startBlock;
    }

    /**
     * Define el valor de la propiedad startBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartBlock(BigInteger value) {
        this.startBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad endBlock.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndBlock() {
        return endBlock;
    }

    /**
     * Define el valor de la propiedad endBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndBlock(BigInteger value) {
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
