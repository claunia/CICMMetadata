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
 * <p>Clase Java para ScansType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ScansType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseScan" type="{}CaseScanType" minOccurs="0"/&gt;
 *         &lt;element name="Scan" type="{}MediaScanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScansType", propOrder = {
    "caseScan",
    "scan"
})
public class ScansType {

    @XmlElement(name = "CaseScan")
    protected CaseScanType caseScan;
    @XmlElement(name = "Scan")
    protected MediaScanType scan;

    /**
     * Obtiene el valor de la propiedad caseScan.
     * 
     * @return
     *     possible object is
     *     {@link CaseScanType }
     *     
     */
    public CaseScanType getCaseScan() {
        return caseScan;
    }

    /**
     * Define el valor de la propiedad caseScan.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseScanType }
     *     
     */
    public void setCaseScan(CaseScanType value) {
        this.caseScan = value;
    }

    /**
     * Obtiene el valor de la propiedad scan.
     * 
     * @return
     *     possible object is
     *     {@link MediaScanType }
     *     
     */
    public MediaScanType getScan() {
        return scan;
    }

    /**
     * Define el valor de la propiedad scan.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaScanType }
     *     
     */
    public void setScan(MediaScanType value) {
        this.scan = value;
    }

}
