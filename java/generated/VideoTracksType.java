//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para VideoTracksType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VideoTracksType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Languages" type="{}LanguagesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="TrackNumber" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *             &lt;minInclusive value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Codec" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Horizontal" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="Vertical" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="MeanBitrate" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="ThreeD" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoTracksType", propOrder = {
    "languages"
})
public class VideoTracksType {

    @XmlElement(name = "Languages")
    protected LanguagesType languages;
    @XmlAttribute(name = "TrackNumber", required = true)
    protected long trackNumber;
    @XmlAttribute(name = "Codec", required = true)
    protected String codec;
    @XmlAttribute(name = "Horizontal", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long horizontal;
    @XmlAttribute(name = "Vertical", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long vertical;
    @XmlAttribute(name = "MeanBitrate", required = true)
    protected long meanBitrate;
    @XmlAttribute(name = "ThreeD", required = true)
    protected boolean threeD;

    /**
     * Obtiene el valor de la propiedad languages.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguages() {
        return languages;
    }

    /**
     * Define el valor de la propiedad languages.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguages(LanguagesType value) {
        this.languages = value;
    }

    /**
     * Obtiene el valor de la propiedad trackNumber.
     * 
     */
    public long getTrackNumber() {
        return trackNumber;
    }

    /**
     * Define el valor de la propiedad trackNumber.
     * 
     */
    public void setTrackNumber(long value) {
        this.trackNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad codec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Define el valor de la propiedad codec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodec(String value) {
        this.codec = value;
    }

    /**
     * Obtiene el valor de la propiedad horizontal.
     * 
     */
    public long getHorizontal() {
        return horizontal;
    }

    /**
     * Define el valor de la propiedad horizontal.
     * 
     */
    public void setHorizontal(long value) {
        this.horizontal = value;
    }

    /**
     * Obtiene el valor de la propiedad vertical.
     * 
     */
    public long getVertical() {
        return vertical;
    }

    /**
     * Define el valor de la propiedad vertical.
     * 
     */
    public void setVertical(long value) {
        this.vertical = value;
    }

    /**
     * Obtiene el valor de la propiedad meanBitrate.
     * 
     */
    public long getMeanBitrate() {
        return meanBitrate;
    }

    /**
     * Define el valor de la propiedad meanBitrate.
     * 
     */
    public void setMeanBitrate(long value) {
        this.meanBitrate = value;
    }

    /**
     * Obtiene el valor de la propiedad threeD.
     * 
     */
    public boolean isThreeD() {
        return threeD;
    }

    /**
     * Define el valor de la propiedad threeD.
     * 
     */
    public void setThreeD(boolean value) {
        this.threeD = value;
    }

}
