//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.23 a las 12:13:17 AM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DumpHardwareType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DumpHardwareType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Firmware" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Serial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Extents" type="{}ExtentsType"/&gt;
 *         &lt;element name="Software" type="{}SoftwareType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DumpHardwareType", propOrder = {
    "manufacturer",
    "model",
    "revision",
    "firmware",
    "serial",
    "extents",
    "software"
})
public class DumpHardwareType {

    @XmlElement(name = "Manufacturer", required = true)
    protected String manufacturer;
    @XmlElement(name = "Model", required = true)
    protected String model;
    @XmlElement(name = "Revision", required = true)
    protected String revision;
    @XmlElement(name = "Firmware", required = true)
    protected String firmware;
    @XmlElement(name = "Serial", required = true)
    protected String serial;
    @XmlElement(name = "Extents", required = true)
    protected ExtentsType extents;
    @XmlElement(name = "Software", required = true)
    protected SoftwareType software;

    /**
     * Obtiene el valor de la propiedad manufacturer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Define el valor de la propiedad manufacturer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Obtiene el valor de la propiedad model.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Define el valor de la propiedad model.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Obtiene el valor de la propiedad revision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Define el valor de la propiedad revision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Obtiene el valor de la propiedad firmware.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmware() {
        return firmware;
    }

    /**
     * Define el valor de la propiedad firmware.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmware(String value) {
        this.firmware = value;
    }

    /**
     * Obtiene el valor de la propiedad serial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Define el valor de la propiedad serial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
    }

    /**
     * Obtiene el valor de la propiedad extents.
     * 
     * @return
     *     possible object is
     *     {@link ExtentsType }
     *     
     */
    public ExtentsType getExtents() {
        return extents;
    }

    /**
     * Define el valor de la propiedad extents.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtentsType }
     *     
     */
    public void setExtents(ExtentsType value) {
        this.extents = value;
    }

    /**
     * Obtiene el valor de la propiedad software.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Define el valor de la propiedad software.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

}
