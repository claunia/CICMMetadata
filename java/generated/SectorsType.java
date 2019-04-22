//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:59:16 PM BST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para SectorsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SectorsType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;unsignedLong"&gt;
 *       &lt;attribute name="layer" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectorsType", propOrder = {
    "value"
})
public class SectorsType {

    @XmlValue
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger value;
    @XmlAttribute(name = "layer")
    @XmlSchemaType(name = "unsignedInt")
    protected Long layer;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad layer.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLayer() {
        return layer;
    }

    /**
     * Define el valor de la propiedad layer.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLayer(Long value) {
        this.layer = value;
    }

}
