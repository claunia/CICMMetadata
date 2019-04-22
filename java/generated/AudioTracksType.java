//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 12:13:17 AM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AudioTracksType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AudioTracksType"&gt;
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
 *       &lt;attribute name="AccoustID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Codec" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Channels" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *       &lt;attribute name="SampleRate" use="required" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *       &lt;attribute name="MeanBitrate" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AudioTracksType", propOrder = {
    "languages"
})
public class AudioTracksType {

    @XmlElement(name = "Languages")
    protected LanguagesType languages;
    @XmlAttribute(name = "TrackNumber", required = true)
    protected long trackNumber;
    @XmlAttribute(name = "AccoustID")
    protected String accoustID;
    @XmlAttribute(name = "Codec", required = true)
    protected String codec;
    @XmlAttribute(name = "Channels", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long channels;
    @XmlAttribute(name = "SampleRate", required = true)
    protected double sampleRate;
    @XmlAttribute(name = "MeanBitrate", required = true)
    protected long meanBitrate;

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
     * Obtiene el valor de la propiedad channels.
     * 
     */
    public long getChannels() {
        return channels;
    }

    /**
     * Define el valor de la propiedad channels.
     * 
     */
    public void setChannels(long value) {
        this.channels = value;
    }

    /**
     * Obtiene el valor de la propiedad sampleRate.
     * 
     */
    public double getSampleRate() {
        return sampleRate;
    }

    /**
     * Define el valor de la propiedad sampleRate.
     * 
     */
    public void setSampleRate(double value) {
        this.sampleRate = value;
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

}
