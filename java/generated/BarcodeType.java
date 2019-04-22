//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:40:52 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para BarcodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BarcodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="aztec"/&gt;
 *             &lt;enumeration value="codabar"/&gt;
 *             &lt;enumeration value="code11"/&gt;
 *             &lt;enumeration value="code128"/&gt;
 *             &lt;enumeration value="code39"/&gt;
 *             &lt;enumeration value="code93"/&gt;
 *             &lt;enumeration value="cpcbinary"/&gt;
 *             &lt;enumeration value="ezcode"/&gt;
 *             &lt;enumeration value="fim"/&gt;
 *             &lt;enumeration value="itf"/&gt;
 *             &lt;enumeration value="itf14"/&gt;
 *             &lt;enumeration value="ean13"/&gt;
 *             &lt;enumeration value="ean8"/&gt;
 *             &lt;enumeration value="maxicode"/&gt;
 *             &lt;enumeration value="isbn"/&gt;
 *             &lt;enumeration value="isrc"/&gt;
 *             &lt;enumeration value="msi"/&gt;
 *             &lt;enumeration value="tof"/&gt;
 *             &lt;enumeration value="shotcode"/&gt;
 *             &lt;enumeration value="rm4scc"/&gt;
 *             &lt;enumeration value="qr"/&gt;
 *             &lt;enumeration value="ean5"/&gt;
 *             &lt;enumeration value="ean2"/&gt;
 *             &lt;enumeration value="qr"/&gt;
 *             &lt;enumeration value="postnet"/&gt;
 *             &lt;enumeration value="postbar"/&gt;
 *             &lt;enumeration value="plessey"/&gt;
 *             &lt;enumeration value="pharmacode"/&gt;
 *             &lt;enumeration value="pdf417"/&gt;
 *             &lt;enumeration value="patchcode"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarcodeType", propOrder = {
    "value"
})
public class BarcodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
