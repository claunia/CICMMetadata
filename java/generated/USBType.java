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
 * Contains USB device information
 * 
 * <p>Clase Java para USBType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="USBType"&gt;
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
 *         &lt;element name="ProductID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="65534"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Descriptors" type="{}DumpType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USBType", propOrder = {
    "vendorID",
    "productID",
    "descriptors"
})
public class USBType {

    @XmlElement(name = "VendorID")
    protected int vendorID;
    @XmlElement(name = "ProductID")
    protected int productID;
    @XmlElement(name = "Descriptors")
    protected DumpType descriptors;

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
     * Obtiene el valor de la propiedad productID.
     * 
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Define el valor de la propiedad productID.
     * 
     */
    public void setProductID(int value) {
        this.productID = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptors.
     * 
     * @return
     *     possible object is
     *     {@link DumpType }
     *     
     */
    public DumpType getDescriptors() {
        return descriptors;
    }

    /**
     * Define el valor de la propiedad descriptors.
     * 
     * @param value
     *     allowed object is
     *     {@link DumpType }
     *     
     */
    public void setDescriptors(DumpType value) {
        this.descriptors = value;
    }

}
