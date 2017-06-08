//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.08 a las 09:53:11 PM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ExtentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ExtentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtentType", propOrder = {
    "start",
    "end"
})
public class ExtentType {

    @XmlElement(name = "Start")
    protected int start;
    @XmlElement(name = "End")
    protected int end;

    /**
     * Obtiene el valor de la propiedad start.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Define el valor de la propiedad start.
     * 
     */
    public void setStart(int value) {
        this.start = value;
    }

    /**
     * Obtiene el valor de la propiedad end.
     * 
     */
    public int getEnd() {
        return end;
    }

    /**
     * Define el valor de la propiedad end.
     * 
     */
    public void setEnd(int value) {
        this.end = value;
    }

}
