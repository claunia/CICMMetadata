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
 * Dimensions of media
 * 
 * <p>Clase Java para DimensionsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DimensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Diameter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Height" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="Thickness" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionsType", propOrder = {
    "diameter",
    "height",
    "width",
    "thickness"
})
public class DimensionsType {

    @XmlElement(name = "Diameter")
    protected Double diameter;
    @XmlElement(name = "Height")
    protected Double height;
    @XmlElement(name = "Width")
    protected Double width;
    @XmlElement(name = "Thickness")
    protected double thickness;

    /**
     * Obtiene el valor de la propiedad diameter.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiameter() {
        return diameter;
    }

    /**
     * Define el valor de la propiedad diameter.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiameter(Double value) {
        this.diameter = value;
    }

    /**
     * Obtiene el valor de la propiedad height.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Define el valor de la propiedad height.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHeight(Double value) {
        this.height = value;
    }

    /**
     * Obtiene el valor de la propiedad width.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Define el valor de la propiedad width.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Obtiene el valor de la propiedad thickness.
     * 
     */
    public double getThickness() {
        return thickness;
    }

    /**
     * Define el valor de la propiedad thickness.
     * 
     */
    public void setThickness(double value) {
        this.thickness = value;
    }

}
