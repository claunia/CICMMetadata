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
 * Sequence information about a disc
 *             
 * 
 * <p>Clase Java para SequenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SequenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MediaTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MediaSequence" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="TotalMedia"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Side" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Layer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceType", propOrder = {
    "mediaTitle",
    "mediaSequence",
    "totalMedia",
    "side",
    "layer"
})
public class SequenceType {

    @XmlElement(name = "MediaTitle")
    protected String mediaTitle;
    @XmlElement(name = "MediaSequence")
    protected int mediaSequence;
    @XmlElement(name = "TotalMedia")
    protected int totalMedia;
    @XmlElement(name = "Side")
    protected Integer side;
    @XmlElement(name = "Layer")
    protected Integer layer;

    /**
     * Obtiene el valor de la propiedad mediaTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTitle() {
        return mediaTitle;
    }

    /**
     * Define el valor de la propiedad mediaTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTitle(String value) {
        this.mediaTitle = value;
    }

    /**
     * Obtiene el valor de la propiedad mediaSequence.
     * 
     */
    public int getMediaSequence() {
        return mediaSequence;
    }

    /**
     * Define el valor de la propiedad mediaSequence.
     * 
     */
    public void setMediaSequence(int value) {
        this.mediaSequence = value;
    }

    /**
     * Obtiene el valor de la propiedad totalMedia.
     * 
     */
    public int getTotalMedia() {
        return totalMedia;
    }

    /**
     * Define el valor de la propiedad totalMedia.
     * 
     */
    public void setTotalMedia(int value) {
        this.totalMedia = value;
    }

    /**
     * Obtiene el valor de la propiedad side.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSide() {
        return side;
    }

    /**
     * Define el valor de la propiedad side.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSide(Integer value) {
        this.side = value;
    }

    /**
     * Obtiene el valor de la propiedad layer.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * Define el valor de la propiedad layer.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayer(Integer value) {
        this.layer = value;
    }

}
