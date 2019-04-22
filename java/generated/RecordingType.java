//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 12:13:17 AM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RecordingType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RecordingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Broadcaster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BroadcastPlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceFormat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ITU-A"/&gt;
 *               &lt;enumeration value="ITU-B"/&gt;
 *               &lt;enumeration value="ITU-C"/&gt;
 *               &lt;enumeration value="ITU-D"/&gt;
 *               &lt;enumeration value="ITU-E"/&gt;
 *               &lt;enumeration value="ITU-F"/&gt;
 *               &lt;enumeration value="ITU-G"/&gt;
 *               &lt;enumeration value="ITU-H"/&gt;
 *               &lt;enumeration value="ITU-I"/&gt;
 *               &lt;enumeration value="ITU-J"/&gt;
 *               &lt;enumeration value="ITU-K"/&gt;
 *               &lt;enumeration value="ITU-L"/&gt;
 *               &lt;enumeration value="ITU-M"/&gt;
 *               &lt;enumeration value="ITU-N"/&gt;
 *               &lt;enumeration value="PAL-B"/&gt;
 *               &lt;enumeration value="SECAM-B"/&gt;
 *               &lt;enumeration value="PAL-D"/&gt;
 *               &lt;enumeration value="SECAM-D"/&gt;
 *               &lt;enumeration value="PAL-G"/&gt;
 *               &lt;enumeration value="SECAM-G"/&gt;
 *               &lt;enumeration value="PAL-H"/&gt;
 *               &lt;enumeration value="PAL-I"/&gt;
 *               &lt;enumeration value="PAL-K"/&gt;
 *               &lt;enumeration value="SECAM-K"/&gt;
 *               &lt;enumeration value="NTSC-M"/&gt;
 *               &lt;enumeration value="PAL-N"/&gt;
 *               &lt;enumeration value="PAL-M"/&gt;
 *               &lt;enumeration value="SECAM-M"/&gt;
 *               &lt;enumeration value="MUSE"/&gt;
 *               &lt;enumeration value="PALplus"/&gt;
 *               &lt;enumeration value="FM"/&gt;
 *               &lt;enumeration value="AM"/&gt;
 *               &lt;enumeration value="COFDM"/&gt;
 *               &lt;enumeration value="CAM-D"/&gt;
 *               &lt;enumeration value="DAB"/&gt;
 *               &lt;enumeration value="DAB+"/&gt;
 *               &lt;enumeration value="DRM"/&gt;
 *               &lt;enumeration value="DRM+"/&gt;
 *               &lt;enumeration value="FMeXtra"/&gt;
 *               &lt;enumeration value="ATSC"/&gt;
 *               &lt;enumeration value="ATSC2"/&gt;
 *               &lt;enumeration value="ATSC3"/&gt;
 *               &lt;enumeration value="ATSC-M/H"/&gt;
 *               &lt;enumeration value="DVB-T"/&gt;
 *               &lt;enumeration value="DVB-T2"/&gt;
 *               &lt;enumeration value="DVB-S"/&gt;
 *               &lt;enumeration value="DVB-S2"/&gt;
 *               &lt;enumeration value="DVB-S2X"/&gt;
 *               &lt;enumeration value="DVB-C"/&gt;
 *               &lt;enumeration value="DVB-C2"/&gt;
 *               &lt;enumeration value="DVB-H"/&gt;
 *               &lt;enumeration value="DVB-NGH"/&gt;
 *               &lt;enumeration value="DVB-SH"/&gt;
 *               &lt;enumeration value="ISDB-T"/&gt;
 *               &lt;enumeration value="ISDB-Tb"/&gt;
 *               &lt;enumeration value="ISDB-S"/&gt;
 *               &lt;enumeration value="ISDB-C"/&gt;
 *               &lt;enumeration value="1seg"/&gt;
 *               &lt;enumeration value="DTMB"/&gt;
 *               &lt;enumeration value="CCMB"/&gt;
 *               &lt;enumeration value="T-DMB"/&gt;
 *               &lt;enumeration value="S-DMB"/&gt;
 *               &lt;enumeration value="IPTV"/&gt;
 *               &lt;enumeration value="DVB-MT"/&gt;
 *               &lt;enumeration value="DVB-MC"/&gt;
 *               &lt;enumeration value="DVB-MS"/&gt;
 *               &lt;enumeration value="ADR"/&gt;
 *               &lt;enumeration value="SDR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Software" type="{}SoftwareType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Coordinates" type="{}CoordinatesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordingType", propOrder = {
    "broadcaster",
    "broadcastPlatform",
    "sourceFormat",
    "timestamp",
    "software",
    "coordinates"
})
public class RecordingType {

    @XmlElement(name = "Broadcaster")
    protected String broadcaster;
    @XmlElement(name = "BroadcastPlatform")
    protected String broadcastPlatform;
    @XmlElement(name = "SourceFormat", required = true)
    protected String sourceFormat;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "Software")
    protected List<SoftwareType> software;
    @XmlElement(name = "Coordinates")
    protected CoordinatesType coordinates;

    /**
     * Obtiene el valor de la propiedad broadcaster.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadcaster() {
        return broadcaster;
    }

    /**
     * Define el valor de la propiedad broadcaster.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadcaster(String value) {
        this.broadcaster = value;
    }

    /**
     * Obtiene el valor de la propiedad broadcastPlatform.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroadcastPlatform() {
        return broadcastPlatform;
    }

    /**
     * Define el valor de la propiedad broadcastPlatform.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroadcastPlatform(String value) {
        this.broadcastPlatform = value;
    }

    /**
     * Obtiene el valor de la propiedad sourceFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFormat() {
        return sourceFormat;
    }

    /**
     * Define el valor de la propiedad sourceFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFormat(String value) {
        this.sourceFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Define el valor de la propiedad timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareType }
     * 
     * 
     */
    public List<SoftwareType> getSoftware() {
        if (software == null) {
            software = new ArrayList<SoftwareType>();
        }
        return this.software;
    }

    /**
     * Obtiene el valor de la propiedad coordinates.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesType }
     *     
     */
    public CoordinatesType getCoordinates() {
        return coordinates;
    }

    /**
     * Define el valor de la propiedad coordinates.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesType }
     *     
     */
    public void setCoordinates(CoordinatesType value) {
        this.coordinates = value;
    }

}
