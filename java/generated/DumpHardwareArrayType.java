//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:40:52 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Array of drives information
 * 
 * <p>Clase Java para DumpHardwareArrayType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DumpHardwareArrayType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DumpHardware" type="{}DumpHardwareType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DumpHardwareArrayType", propOrder = {
    "dumpHardware"
})
public class DumpHardwareArrayType {

    @XmlElement(name = "DumpHardware", required = true)
    protected List<DumpHardwareType> dumpHardware;

    /**
     * Gets the value of the dumpHardware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dumpHardware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDumpHardware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DumpHardwareType }
     * 
     * 
     */
    public List<DumpHardwareType> getDumpHardware() {
        if (dumpHardware == null) {
            dumpHardware = new ArrayList<DumpHardwareType>();
        }
        return this.dumpHardware;
    }

}
