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
 * <p>Clase Java para XboxSecuritySectorsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="XboxSecuritySectorsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RequestVersion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RequestNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SecuritySectors" type="{}DumpType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XboxSecuritySectorsType", propOrder = {
    "requestVersion",
    "requestNumber",
    "securitySectors"
})
public class XboxSecuritySectorsType {

    @XmlElement(name = "RequestVersion")
    protected int requestVersion;
    @XmlElement(name = "RequestNumber")
    protected int requestNumber;
    @XmlElement(name = "SecuritySectors", required = true)
    protected DumpType securitySectors;

    /**
     * Obtiene el valor de la propiedad requestVersion.
     * 
     */
    public int getRequestVersion() {
        return requestVersion;
    }

    /**
     * Define el valor de la propiedad requestVersion.
     * 
     */
    public void setRequestVersion(int value) {
        this.requestVersion = value;
    }

    /**
     * Obtiene el valor de la propiedad requestNumber.
     * 
     */
    public int getRequestNumber() {
        return requestNumber;
    }

    /**
     * Define el valor de la propiedad requestNumber.
     * 
     */
    public void setRequestNumber(int value) {
        this.requestNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad securitySectors.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getSecuritySectors() {
        return securitySectors;
    }

    /**
     * Define el valor de la propiedad securitySectors.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setSecuritySectors(DumpType value) {
        this.securitySectors = value;
    }

}
