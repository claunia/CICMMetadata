//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.09 at 03:41:35 AM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AudioTracksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the languages property.
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
     * Sets the value of the languages property.
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
     * Gets the value of the trackNumber property.
     * 
     */
    public int getTrackNumber() {
        return trackNumber;
    }

    /**
     * Sets the value of the trackNumber property.
     * 
     */
    public void setTrackNumber(int value) {
        this.trackNumber = value;
    }

    /**
     * Gets the value of the accoustID property.
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
     * Sets the value of the accoustID property.
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
     * Gets the value of the codec property.
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
     * Sets the value of the codec property.
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
     * Gets the value of the channels property.
     * 
     */
    public int getChannels() {
        return channels;
    }

    /**
     * Sets the value of the channels property.
     * 
     */
    public void setChannels(int value) {
        this.channels = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     */
    public int getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     */
    public void setSampleRate(int value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the meanBitrate property.
     * 
     */
    public long getMeanBitrate() {
        return meanBitrate;
    }

    /**
     * Sets the value of the meanBitrate property.
     * 
     */
    public void setMeanBitrate(long value) {
        this.meanBitrate = value;
    }

}
