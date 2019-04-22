//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para ChecksumType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ChecksumType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="fletcher16"/&gt;
 *             &lt;enumeration value="fletcher32"/&gt;
 *             &lt;enumeration value="adler32"/&gt;
 *             &lt;enumeration value="crc16"/&gt;
 *             &lt;enumeration value="crc16ccitt"/&gt;
 *             &lt;enumeration value="crc32"/&gt;
 *             &lt;enumeration value="crc64"/&gt;
 *             &lt;enumeration value="md4"/&gt;
 *             &lt;enumeration value="md5"/&gt;
 *             &lt;enumeration value="dm6"/&gt;
 *             &lt;enumeration value="ripemd128"/&gt;
 *             &lt;enumeration value="ripemd160"/&gt;
 *             &lt;enumeration value="ripemed320"/&gt;
 *             &lt;enumeration value="sha1"/&gt;
 *             &lt;enumeration value="sha224"/&gt;
 *             &lt;enumeration value="sha256"/&gt;
 *             &lt;enumeration value="sha384"/&gt;
 *             &lt;enumeration value="sha512"/&gt;
 *             &lt;enumeration value="sha3"/&gt;
 *             &lt;enumeration value="skein"/&gt;
 *             &lt;enumeration value="snefru"/&gt;
 *             &lt;enumeration value="blake256"/&gt;
 *             &lt;enumeration value="blake512"/&gt;
 *             &lt;enumeration value="tiger"/&gt;
 *             &lt;enumeration value="whirlpool"/&gt;
 *             &lt;enumeration value="spamsum"/&gt;
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
@XmlType(name = "ChecksumType", propOrder = {
    "value"
})
public class ChecksumType {

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
