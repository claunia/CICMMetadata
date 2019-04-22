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
 * <p>Clase Java para MediaScanType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="MediaScanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MediaScanElement"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="up"/&gt;
 *               &lt;enumeration value="down"/&gt;
 *               &lt;enumeration value="front"/&gt;
 *               &lt;enumeration value="back"/&gt;
 *               &lt;enumeration value="left"/&gt;
 *               &lt;enumeration value="right"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Scan" type="{}ScanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaScanType", propOrder = {
    "mediaScanElement",
    "scan"
})
public class MediaScanType {

    @XmlElement(name = "MediaScanElement", required = true)
    protected String mediaScanElement;
    @XmlElement(name = "Scan", required = true)
    protected ScanType scan;

    /**
     * Obtiene el valor de la propiedad mediaScanElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaScanElement() {
        return mediaScanElement;
    }

    /**
     * Define el valor de la propiedad mediaScanElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaScanElement(String value) {
        this.mediaScanElement = value;
    }

    /**
     * Obtiene el valor de la propiedad scan.
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
     * Define el valor de la propiedad scan.
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
