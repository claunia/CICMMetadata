//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.1-b171012.0423 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.04.22 a las 11:40:52 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para PartitionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PartitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sequence"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartSector" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="EndSector" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileSystems" type="{}FileSystemsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartitionType", propOrder = {
    "sequence",
    "name",
    "type",
    "startSector",
    "endSector",
    "description",
    "fileSystems"
})
public class PartitionType {

    @XmlElement(name = "Sequence")
    protected int sequence;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "StartSector")
    protected int startSector;
    @XmlElement(name = "EndSector")
    protected int endSector;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "FileSystems", required = true)
    protected FileSystemsType fileSystems;

    /**
     * Obtiene el valor de la propiedad sequence.
     * 
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * Define el valor de la propiedad sequence.
     * 
     */
    public void setSequence(int value) {
        this.sequence = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Obtiene el valor de la propiedad startSector.
     * 
     */
    public int getStartSector() {
        return startSector;
    }

    /**
     * Define el valor de la propiedad startSector.
     * 
     */
    public void setStartSector(int value) {
        this.startSector = value;
    }

    /**
     * Obtiene el valor de la propiedad endSector.
     * 
     */
    public int getEndSector() {
        return endSector;
    }

    /**
     * Define el valor de la propiedad endSector.
     * 
     */
    public void setEndSector(int value) {
        this.endSector = value;
    }

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad fileSystems.
     * 
     * @return
     *     possible object is
     *     {@link FileSystemsType }
     *     
     */
    public FileSystemsType getFileSystems() {
        return fileSystems;
    }

    /**
     * Define el valor de la propiedad fileSystems.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSystemsType }
     *     
     */
    public void setFileSystems(FileSystemsType value) {
        this.fileSystems = value;
    }

}
