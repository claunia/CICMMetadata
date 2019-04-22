//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains MultiMediaCard device information
 * 
 * <p>Clase Java para MultiMediaCardType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MultiMediaCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CID" type="{}DumpType"/&gt;
 *         &lt;element name="CSD" type="{}DumpType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedCSD" type="{}DumpType" minOccurs="0"/&gt;
 *         &lt;element name="OCR" type="{}DumpType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiMediaCardType", propOrder = {
    "cid",
    "csd",
    "extendedCSD",
    "ocr"
})
public class MultiMediaCardType {

    @XmlElement(name = "CID", required = true)
    protected DumpType cid;
    @XmlElement(name = "CSD")
    protected DumpType csd;
    @XmlElement(name = "ExtendedCSD")
    protected DumpType extendedCSD;
    @XmlElement(name = "OCR")
    protected DumpType ocr;

    /**
     * Obtiene el valor de la propiedad cid.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getCID() {
        return cid;
    }

    /**
     * Define el valor de la propiedad cid.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setCID(DumpType value) {
        this.cid = value;
    }

    /**
     * Obtiene el valor de la propiedad csd.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getCSD() {
        return csd;
    }

    /**
     * Define el valor de la propiedad csd.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setCSD(DumpType value) {
        this.csd = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedCSD.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getExtendedCSD() {
        return extendedCSD;
    }

    /**
     * Define el valor de la propiedad extendedCSD.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setExtendedCSD(DumpType value) {
        this.extendedCSD = value;
    }

    /**
     * Obtiene el valor de la propiedad ocr.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getOCR() {
        return ocr;
    }

    /**
     * Define el valor de la propiedad ocr.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setOCR(DumpType value) {
        this.ocr = value;
    }

}
