//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.09.29 a las 02:23:35 PM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sequence information about a track
 * 			
 * 
 * <p>Clase Java para TrackSequenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrackSequenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrackNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Session">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackSequenceType", propOrder = {
    "trackNumber",
    "session"
})
public class TrackSequenceType {

    @XmlElement(name = "TrackNumber")
    protected int trackNumber;
    @XmlElement(name = "Session")
    protected int session;

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
     * Obtiene el valor de la propiedad session.
     * 
     */
    public int getSession() {
        return session;
    }

    /**
     * Define el valor de la propiedad session.
     * 
     */
    public void setSession(int value) {
        this.session = value;
    }

}
