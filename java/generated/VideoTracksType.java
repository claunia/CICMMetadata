//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.12 at 12:03:44 AM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VideoTracksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VideoTracksType">
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
 *       &lt;attribute name="Codec" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Horizontal" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Vertical" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MeanBitrate" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ThreeD" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected int trackNumber;
    @XmlAttribute(name = "Codec", required = true)
    protected String codec;
    @XmlAttribute(name = "Horizontal", required = true)
    protected int horizontal;
    @XmlAttribute(name = "Vertical", required = true)
    protected int vertical;
    @XmlAttribute(name = "MeanBitrate", required = true)
    protected long meanBitrate;
    @XmlAttribute(name = "ThreeD", required = true)
    protected boolean threeD;

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
     * Gets the value of the horizontal property.
     * 
     */
    public int getHorizontal() {
        return horizontal;
    }

    /**
     * Sets the value of the horizontal property.
     * 
     */
    public void setHorizontal(int value) {
        this.horizontal = value;
    }

    /**
     * Gets the value of the vertical property.
     * 
     */
    public int getVertical() {
        return vertical;
    }

    /**
     * Sets the value of the vertical property.
     * 
     */
    public void setVertical(int value) {
        this.vertical = value;
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

    /**
     * Gets the value of the threeD property.
     * 
     */
    public boolean isThreeD() {
        return threeD;
    }

    /**
     * Sets the value of the threeD property.
     * 
     */
    public void setThreeD(boolean value) {
        this.threeD = value;
    }

}
