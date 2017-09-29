//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.29 a las 02:23:35 PM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AudioTracksType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AudioTracksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Languages" type="{}LanguagesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TrackNumber" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AccoustID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Codec" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Channels" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SampleRate" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MeanBitrate" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected int trackNumber;
    @XmlAttribute(name = "AccoustID")
    protected String accoustID;
    @XmlAttribute(name = "Codec", required = true)
    protected String codec;
    @XmlAttribute(name = "Channels", required = true)
    protected int channels;
    @XmlAttribute(name = "SampleRate", required = true)
    protected int sampleRate;
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
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Define el valor de la propiedad trackNumber.
     * 
     */
    public void setTrackNumber(int value) {
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
    public int getChannels() {
        return channels;
    }

    /**
     * Define el valor de la propiedad channels.
     * 
     */
    public void setChannels(int value) {
        this.channels = value;
    }

    /**
     * Obtiene el valor de la propiedad sampleRate.
     * 
     */
    public int getSampleRate() {
        return sampleRate;
    }

    /**
     * Define el valor de la propiedad sampleRate.
     * 
     */
    public void setSampleRate(int value) {
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
