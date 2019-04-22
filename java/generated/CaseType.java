//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CaseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="jewel"/&gt;
 *               &lt;enumeration value="bigjewel"/&gt;
 *               &lt;enumeration value="slimjewel"/&gt;
 *               &lt;enumeration value="sleeve"/&gt;
 *               &lt;enumeration value="qpack"/&gt;
 *               &lt;enumeration value="digisleeve"/&gt;
 *               &lt;enumeration value="discboxslider"/&gt;
 *               &lt;enumeration value="compacplus"/&gt;
 *               &lt;enumeration value="keepcase"/&gt;
 *               &lt;enumeration value="snapcase"/&gt;
 *               &lt;enumeration value="softcase"/&gt;
 *               &lt;enumeration value="ecopack"/&gt;
 *               &lt;enumeration value="liftlock"/&gt;
 *               &lt;enumeration value="spindle"/&gt;
 *               &lt;enumeration value="ps2case"/&gt;
 *               &lt;enumeration value="ps3case"/&gt;
 *               &lt;enumeration value="bluraykeepcase"/&gt;
 *               &lt;enumeration value="pscase"/&gt;
 *               &lt;enumeration value="dccase"/&gt;
 *               &lt;enumeration value="saturncase"/&gt;
 *               &lt;enumeration value="xboxcase"/&gt;
 *               &lt;enumeration value="xbox360case"/&gt;
 *               &lt;enumeration value="xboxonecase"/&gt;
 *               &lt;enumeration value="saturnbigcase"/&gt;
 *               &lt;enumeration value="gccase"/&gt;
 *               &lt;enumeration value="wiicase"/&gt;
 *               &lt;enumeration value="unknown"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Scans" type="{}ScansType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseType", propOrder = {
    "caseType",
    "scans"
})
public class CaseType {

    @XmlElement(name = "CaseType", required = true)
    protected String caseType;
    @XmlElement(name = "Scans", required = true)
    protected ScansType scans;

    /**
     * Obtiene el valor de la propiedad caseType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * Define el valor de la propiedad caseType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseType(String value) {
        this.caseType = value;
    }

    /**
     * Obtiene el valor de la propiedad scans.
     * 
     * @return
     *     possible object is
     *     {@link ScansType }
     *     
     */
    public ScansType getScans() {
        return scans;
    }

    /**
     * Define el valor de la propiedad scans.
     * 
     * @param value
     *     allowed object is
     *     {@link ScansType }
     *     
     */
    public void setScans(ScansType value) {
        this.scans = value;
    }

}
