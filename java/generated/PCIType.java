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
 * Contains PCI/PCI-X/PCIe card information
 * 
 * <p>Clase Java para PCIType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PCIType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="65534"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DeviceID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="65534"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Configuration" type="{}DumpType" minOccurs="0"/&gt;
 *         &lt;element name="ExpansionROM" type="{}LinearMediaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PCIType", propOrder = {
    "vendorID",
    "deviceID",
    "configuration",
    "expansionROM"
})
public class PCIType {

    @XmlElement(name = "VendorID")
    protected int vendorID;
    @XmlElement(name = "DeviceID")
    protected int deviceID;
    @XmlElement(name = "Configuration")
    protected DumpType configuration;
    @XmlElement(name = "ExpansionROM")
    protected LinearMediaType expansionROM;

    /**
     * Obtiene el valor de la propiedad vendorID.
     * 
     */
    public int getVendorID() {
        return vendorID;
    }

    /**
     * Define el valor de la propiedad vendorID.
     * 
     */
    public void setVendorID(int value) {
        this.vendorID = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceID.
     * 
     */
    public int getDeviceID() {
        return deviceID;
    }

    /**
     * Define el valor de la propiedad deviceID.
     * 
     */
    public void setDeviceID(int value) {
        this.deviceID = value;
    }

    /**
     * Obtiene el valor de la propiedad configuration.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getConfiguration() {
        return configuration;
    }

    /**
     * Define el valor de la propiedad configuration.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setConfiguration(DumpType value) {
        this.configuration = value;
    }

    /**
     * Obtiene el valor de la propiedad expansionROM.
     * 
     * @return
     *     possible object is
     *     {@link LinearMediaType }
     *     
     */
    public LinearMediaType getExpansionROM() {
        return expansionROM;
    }

    /**
     * Define el valor de la propiedad expansionROM.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearMediaType }
     *     
     */
    public void setExpansionROM(LinearMediaType value) {
        this.expansionROM = value;
    }

}
