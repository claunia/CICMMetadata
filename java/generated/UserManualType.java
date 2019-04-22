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
 * User manual or user guide accompanying this set. Can be more than one.
 *             
 * 
 * <p>Clase Java para UserManualType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UserManualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Language" type="{}LanguagesType" minOccurs="0"/&gt;
 *         &lt;element name="Pages" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PageSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Scan" type="{}ScanType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserManualType", propOrder = {
    "language",
    "pages",
    "pageSize",
    "scan"
})
public class UserManualType {

    @XmlElement(name = "Language")
    protected LanguagesType language;
    @XmlElement(name = "Pages")
    protected int pages;
    @XmlElement(name = "PageSize")
    protected String pageSize;
    @XmlElement(name = "Scan")
    protected ScanType scan;

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link LanguagesType }
     *     
     */
    public LanguagesType getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagesType }
     *     
     */
    public void setLanguage(LanguagesType value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad pages.
     * 
     */
    public int getPages() {
        return pages;
    }

    /**
     * Define el valor de la propiedad pages.
     * 
     */
    public void setPages(int value) {
        this.pages = value;
    }

    /**
     * Obtiene el valor de la propiedad pageSize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageSize() {
        return pageSize;
    }

    /**
     * Define el valor de la propiedad pageSize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageSize(String value) {
        this.pageSize = value;
    }

    /**
     * Obtiene el valor de la propiedad scan.
     * 
     * @return
     *     possible object is
     *     {@link ScanType }
     *     
     */
    public ScanType getScan() {
        return scan;
    }

    /**
     * Define el valor de la propiedad scan.
     * 
     * @param value
     *     allowed object is
     *     {@link ScanType }
     *     
     */
    public void setScan(ScanType value) {
        this.scan = value;
    }

}
