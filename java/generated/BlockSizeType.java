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
 * <p>Clase Java para BlockSizeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BlockSizeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;int"&gt;
 *       &lt;attribute name="startingBlock" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockSizeType", propOrder = {
    "value"
})
public class BlockSizeType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "startingBlock", required = true)
    protected int startingBlock;

    /**
     * Obtiene el valor de la propiedad value.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Define el valor de la propiedad value.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Obtiene el valor de la propiedad startingBlock.
     * 
     */
    public int getStartingBlock() {
        return startingBlock;
    }

    /**
     * Define el valor de la propiedad startingBlock.
     * 
     */
    public void setStartingBlock(int value) {
        this.startingBlock = value;
    }

}
