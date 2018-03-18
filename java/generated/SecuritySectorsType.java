//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.03.18 a las 09:28:50 PM WET 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Start and end of XGD's security sectors
 * 			
 * 
 * <p>Clase Java para SecuritySectorsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SecuritySectorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritySectorsType", propOrder = {
    "start",
    "end"
})
public class SecuritySectorsType {

    @XmlElement(name = "Start")
    protected long start;
    @XmlElement(name = "End")
    protected long end;

    /**
     * Obtiene el valor de la propiedad start.
     * 
     */
    public long getStart() {
        return start;
    }

    /**
     * Define el valor de la propiedad start.
     * 
     */
    public void setStart(long value) {
        this.start = value;
    }

    /**
     * Obtiene el valor de la propiedad end.
     * 
     */
    public long getEnd() {
        return end;
    }

    /**
     * Define el valor de la propiedad end.
     * 
     */
    public void setEnd(long value) {
        this.end = value;
    }

}
