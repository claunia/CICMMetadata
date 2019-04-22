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
 * <p>Clase Java para CaseScanType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CaseScanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseScanElement"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="sleeve"/&gt;
 *               &lt;enumeration value="inner"/&gt;
 *               &lt;enumeration value="inlay"/&gt;
 *               &lt;enumeration value="frontback"/&gt;
 *               &lt;enumeration value="frontfull"/&gt;
 *               &lt;enumeration value="boxfront"/&gt;
 *               &lt;enumeration value="boxback"/&gt;
 *               &lt;enumeration value="boxspine"/&gt;
 *               &lt;enumeration value="external"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Scan" type="{}ScanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseScanType", propOrder = {
    "caseScanElement",
    "scan"
})
public class CaseScanType {

    @XmlElement(name = "CaseScanElement", required = true)
    protected String caseScanElement;
    @XmlElement(name = "Scan", required = true)
    protected ScanType scan;

    /**
     * Obtiene el valor de la propiedad caseScanElement.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseScanElement() {
        return caseScanElement;
    }

    /**
     * Define el valor de la propiedad caseScanElement.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseScanElement(String value) {
        this.caseScanElement = value;
    }

    /**
     * Obtiene el valor de la propiedad scan.
     * 
     * @return
     *     possible object is
     *     {@link ScanType }
     *     
     */
    public ScanType getScan() {
        return scan;
    }

    /**
     * Define el valor de la propiedad scan.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType }
     *     
     */
    public void setScan(ScanType value) {
        this.scan = value;
    }

}
