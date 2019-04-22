//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CPU architectures this set is intended to be run on
 *             
 * 
 * <p>Clase Java para ArchitecturesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArchitecturesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Architecture" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="4004"/&gt;
 *               &lt;enumeration value="4040"/&gt;
 *               &lt;enumeration value="6502"/&gt;
 *               &lt;enumeration value="65816"/&gt;
 *               &lt;enumeration value="8008"/&gt;
 *               &lt;enumeration value="8051"/&gt;
 *               &lt;enumeration value="8080"/&gt;
 *               &lt;enumeration value="8085"/&gt;
 *               &lt;enumeration value="aarch64"/&gt;
 *               &lt;enumeration value="am29000"/&gt;
 *               &lt;enumeration value="amd64"/&gt;
 *               &lt;enumeration value="apx432"/&gt;
 *               &lt;enumeration value="arm"/&gt;
 *               &lt;enumeration value="avr"/&gt;
 *               &lt;enumeration value="avr32"/&gt;
 *               &lt;enumeration value="axp"/&gt;
 *               &lt;enumeration value="clipper"/&gt;
 *               &lt;enumeration value="cray"/&gt;
 *               &lt;enumeration value="esa390"/&gt;
 *               &lt;enumeration value="hobbit"/&gt;
 *               &lt;enumeration value="i86"/&gt;
 *               &lt;enumeration value="i860"/&gt;
 *               &lt;enumeration value="i960"/&gt;
 *               &lt;enumeration value="ia32"/&gt;
 *               &lt;enumeration value="ia64"/&gt;
 *               &lt;enumeration value="m56k"/&gt;
 *               &lt;enumeration value="m6800"/&gt;
 *               &lt;enumeration value="m6801"/&gt;
 *               &lt;enumeration value="m6805"/&gt;
 *               &lt;enumeration value="m6809"/&gt;
 *               &lt;enumeration value="m68k"/&gt;
 *               &lt;enumeration value="m88k"/&gt;
 *               &lt;enumeration value="mcs41"/&gt;
 *               &lt;enumeration value="mcs48"/&gt;
 *               &lt;enumeration value="mips32"/&gt;
 *               &lt;enumeration value="mips64"/&gt;
 *               &lt;enumeration value="msp430"/&gt;
 *               &lt;enumeration value="nios2"/&gt;
 *               &lt;enumeration value="openrisc"/&gt;
 *               &lt;enumeration value="parisc"/&gt;
 *               &lt;enumeration value="pdp1"/&gt;
 *               &lt;enumeration value="pdp10"/&gt;
 *               &lt;enumeration value="pdp11"/&gt;
 *               &lt;enumeration value="pdp7"/&gt;
 *               &lt;enumeration value="pdp8"/&gt;
 *               &lt;enumeration value="pic"/&gt;
 *               &lt;enumeration value="power"/&gt;
 *               &lt;enumeration value="ppc"/&gt;
 *               &lt;enumeration value="ppc64"/&gt;
 *               &lt;enumeration value="prism"/&gt;
 *               &lt;enumeration value="renesasrx"/&gt;
 *               &lt;enumeration value="riscv"/&gt;
 *               &lt;enumeration value="s360"/&gt;
 *               &lt;enumeration value="s370"/&gt;
 *               &lt;enumeration value="sh"/&gt;
 *               &lt;enumeration value="sh1"/&gt;
 *               &lt;enumeration value="sh2"/&gt;
 *               &lt;enumeration value="sh3"/&gt;
 *               &lt;enumeration value="sh4"/&gt;
 *               &lt;enumeration value="sh5"/&gt;
 *               &lt;enumeration value="sh64"/&gt;
 *               &lt;enumeration value="sparc"/&gt;
 *               &lt;enumeration value="sparc64"/&gt;
 *               &lt;enumeration value="transputer"/&gt;
 *               &lt;enumeration value="vax"/&gt;
 *               &lt;enumeration value="we32000"/&gt;
 *               &lt;enumeration value="x32"/&gt;
 *               &lt;enumeration value="z80"/&gt;
 *               &lt;enumeration value="z800"/&gt;
 *               &lt;enumeration value="z8000"/&gt;
 *               &lt;enumeration value="z80000"/&gt;
 *               &lt;enumeration value="zarch"/&gt;
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
@XmlType(name = "ArchitecturesType", propOrder = {
    "architecture"
})
public class ArchitecturesType {

    @XmlElement(name = "Architecture", required = true)
    protected List<String> architecture;

    /**
     * Gets the value of the architecture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the architecture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchitecture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArchitecture() {
        if (architecture == null) {
            architecture = new ArrayList<String>();
        }
        return this.architecture;
    }

}
