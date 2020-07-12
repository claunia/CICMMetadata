//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.07.12 a las 10:02:34 PM WEST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ContentsFileType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ContentsFileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Checksums" type="{}ChecksumsType"/>
 *         &lt;element name="ExtendedAttributes" type="{}ExtendedAttributesType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="accessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="statusChangeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="backupTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="lastWriteTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="attributes" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="posixMode" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="deviceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="posixGroupId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="inode" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="links" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="posixUserId" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *       &lt;attribute name="length" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedLong" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentsFileType", propOrder = {
    "checksums",
    "extendedAttributes"
})
public class ContentsFileType {

    @XmlElement(name = "Checksums", required = true)
    protected ChecksumsType checksums;
    @XmlElement(name = "ExtendedAttributes", required = true)
    protected ExtendedAttributesType extendedAttributes;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "creationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlAttribute(name = "accessTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar accessTime;
    @XmlAttribute(name = "statusChangeTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusChangeTime;
    @XmlAttribute(name = "backupTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar backupTime;
    @XmlAttribute(name = "lastWriteTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastWriteTime;
    @XmlAttribute(name = "attributes", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger attributes;
    @XmlAttribute(name = "posixMode")
    @XmlSchemaType(name = "unsignedInt")
    protected Long posixMode;
    @XmlAttribute(name = "deviceNumber")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger deviceNumber;
    @XmlAttribute(name = "posixGroupId")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger posixGroupId;
    @XmlAttribute(name = "inode", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger inode;
    @XmlAttribute(name = "links", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger links;
    @XmlAttribute(name = "posixUserId")
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger posixUserId;
    @XmlAttribute(name = "length", required = true)
    @XmlSchemaType(name = "unsignedLong")
    protected BigInteger length;

    /**
     * Obtiene el valor de la propiedad checksums.
     * 
     * @return
     *     possible object is
     *     {@link ChecksumsType }
     *     
     */
    public ChecksumsType getChecksums() {
        return checksums;
    }

    /**
     * Define el valor de la propiedad checksums.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecksumsType }
     *     
     */
    public void setChecksums(ChecksumsType value) {
        this.checksums = value;
    }

    /**
     * Obtiene el valor de la propiedad extendedAttributes.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedAttributesType }
     *     
     */
    public ExtendedAttributesType getExtendedAttributes() {
        return extendedAttributes;
    }

    /**
     * Define el valor de la propiedad extendedAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedAttributesType }
     *     
     */
    public void setExtendedAttributes(ExtendedAttributesType value) {
        this.extendedAttributes = value;
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
     * Obtiene el valor de la propiedad creationTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Define el valor de la propiedad creationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Obtiene el valor de la propiedad accessTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessTime() {
        return accessTime;
    }

    /**
     * Define el valor de la propiedad accessTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessTime(XMLGregorianCalendar value) {
        this.accessTime = value;
    }

    /**
     * Obtiene el valor de la propiedad statusChangeTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusChangeTime() {
        return statusChangeTime;
    }

    /**
     * Define el valor de la propiedad statusChangeTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusChangeTime(XMLGregorianCalendar value) {
        this.statusChangeTime = value;
    }

    /**
     * Obtiene el valor de la propiedad backupTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackupTime() {
        return backupTime;
    }

    /**
     * Define el valor de la propiedad backupTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackupTime(XMLGregorianCalendar value) {
        this.backupTime = value;
    }

    /**
     * Obtiene el valor de la propiedad lastWriteTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastWriteTime() {
        return lastWriteTime;
    }

    /**
     * Define el valor de la propiedad lastWriteTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastWriteTime(XMLGregorianCalendar value) {
        this.lastWriteTime = value;
    }

    /**
     * Obtiene el valor de la propiedad attributes.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttributes() {
        return attributes;
    }

    /**
     * Define el valor de la propiedad attributes.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttributes(BigInteger value) {
        this.attributes = value;
    }

    /**
     * Obtiene el valor de la propiedad posixMode.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPosixMode() {
        return posixMode;
    }

    /**
     * Define el valor de la propiedad posixMode.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPosixMode(Long value) {
        this.posixMode = value;
    }

    /**
     * Obtiene el valor de la propiedad deviceNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeviceNumber() {
        return deviceNumber;
    }

    /**
     * Define el valor de la propiedad deviceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeviceNumber(BigInteger value) {
        this.deviceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad posixGroupId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosixGroupId() {
        return posixGroupId;
    }

    /**
     * Define el valor de la propiedad posixGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosixGroupId(BigInteger value) {
        this.posixGroupId = value;
    }

    /**
     * Obtiene el valor de la propiedad inode.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInode() {
        return inode;
    }

    /**
     * Define el valor de la propiedad inode.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInode(BigInteger value) {
        this.inode = value;
    }

    /**
     * Obtiene el valor de la propiedad links.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinks() {
        return links;
    }

    /**
     * Define el valor de la propiedad links.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinks(BigInteger value) {
        this.links = value;
    }

    /**
     * Obtiene el valor de la propiedad posixUserId.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosixUserId() {
        return posixUserId;
    }

    /**
     * Define el valor de la propiedad posixUserId.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosixUserId(BigInteger value) {
        this.posixUserId = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

}
