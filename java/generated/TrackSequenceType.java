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
 * Sequence information about a track
 *             
 * 
 * <p>Clase Java para TrackSequenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TrackSequenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Session"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
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
