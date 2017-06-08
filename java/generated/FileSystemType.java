//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.08 a las 09:56:12 PM WEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about a filesystem
 * 
 * <p>Clase Java para FileSystemType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FileSystemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="BackupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ClusterSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Clusters" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Files" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Bootable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="VolumeSerial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FreeClusters" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Dirty" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SystemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VolumeSetIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PublisherIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataPreparerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileSystemType", propOrder = {
    "type",
    "creationDate",
    "modificationDate",
    "backupDate",
    "clusterSize",
    "clusters",
    "files",
    "bootable",
    "volumeSerial",
    "volumeName",
    "freeClusters",
    "dirty",
    "expirationDate",
    "effectiveDate",
    "systemIdentifier",
    "volumeSetIdentifier",
    "publisherIdentifier",
    "dataPreparerIdentifier",
    "applicationIdentifier"
})
public class FileSystemType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "ModificationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(name = "BackupDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar backupDate;
    @XmlElement(name = "ClusterSize")
    protected int clusterSize;
    @XmlElement(name = "Clusters")
    protected long clusters;
    @XmlElement(name = "Files")
    protected Long files;
    @XmlElement(name = "Bootable")
    protected boolean bootable;
    @XmlElement(name = "VolumeSerial")
    protected String volumeSerial;
    @XmlElement(name = "VolumeName")
    protected String volumeName;
    @XmlElement(name = "FreeClusters")
    protected Long freeClusters;
    @XmlElement(name = "Dirty")
    protected boolean dirty;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "SystemIdentifier")
    protected String systemIdentifier;
    @XmlElement(name = "VolumeSetIdentifier")
    protected String volumeSetIdentifier;
    @XmlElement(name = "PublisherIdentifier")
    protected String publisherIdentifier;
    @XmlElement(name = "DataPreparerIdentifier")
    protected String dataPreparerIdentifier;
    @XmlElement(name = "ApplicationIdentifier")
    protected String applicationIdentifier;

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
     * Obtiene el valor de la propiedad creationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Define el valor de la propiedad creationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad modificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Define el valor de la propiedad modificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad backupDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackupDate() {
        return backupDate;
    }

    /**
     * Define el valor de la propiedad backupDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackupDate(XMLGregorianCalendar value) {
        this.backupDate = value;
    }

    /**
     * Obtiene el valor de la propiedad clusterSize.
     * 
     */
    public int getClusterSize() {
        return clusterSize;
    }

    /**
     * Define el valor de la propiedad clusterSize.
     * 
     */
    public void setClusterSize(int value) {
        this.clusterSize = value;
    }

    /**
     * Obtiene el valor de la propiedad clusters.
     * 
     */
    public long getClusters() {
        return clusters;
    }

    /**
     * Define el valor de la propiedad clusters.
     * 
     */
    public void setClusters(long value) {
        this.clusters = value;
    }

    /**
     * Obtiene el valor de la propiedad files.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFiles() {
        return files;
    }

    /**
     * Define el valor de la propiedad files.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFiles(Long value) {
        this.files = value;
    }

    /**
     * Obtiene el valor de la propiedad bootable.
     * 
     */
    public boolean isBootable() {
        return bootable;
    }

    /**
     * Define el valor de la propiedad bootable.
     * 
     */
    public void setBootable(boolean value) {
        this.bootable = value;
    }

    /**
     * Obtiene el valor de la propiedad volumeSerial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeSerial() {
        return volumeSerial;
    }

    /**
     * Define el valor de la propiedad volumeSerial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeSerial(String value) {
        this.volumeSerial = value;
    }

    /**
     * Obtiene el valor de la propiedad volumeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * Define el valor de la propiedad volumeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeName(String value) {
        this.volumeName = value;
    }

    /**
     * Obtiene el valor de la propiedad freeClusters.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFreeClusters() {
        return freeClusters;
    }

    /**
     * Define el valor de la propiedad freeClusters.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFreeClusters(Long value) {
        this.freeClusters = value;
    }

    /**
     * Obtiene el valor de la propiedad dirty.
     * 
     */
    public boolean isDirty() {
        return dirty;
    }

    /**
     * Define el valor de la propiedad dirty.
     * 
     */
    public void setDirty(boolean value) {
        this.dirty = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad effectiveDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Define el valor de la propiedad effectiveDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Obtiene el valor de la propiedad systemIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemIdentifier() {
        return systemIdentifier;
    }

    /**
     * Define el valor de la propiedad systemIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemIdentifier(String value) {
        this.systemIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad volumeSetIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeSetIdentifier() {
        return volumeSetIdentifier;
    }

    /**
     * Define el valor de la propiedad volumeSetIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeSetIdentifier(String value) {
        this.volumeSetIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad publisherIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherIdentifier() {
        return publisherIdentifier;
    }

    /**
     * Define el valor de la propiedad publisherIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherIdentifier(String value) {
        this.publisherIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad dataPreparerIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataPreparerIdentifier() {
        return dataPreparerIdentifier;
    }

    /**
     * Define el valor de la propiedad dataPreparerIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataPreparerIdentifier(String value) {
        this.dataPreparerIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad applicationIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationIdentifier() {
        return applicationIdentifier;
    }

    /**
     * Define el valor de la propiedad applicationIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationIdentifier(String value) {
        this.applicationIdentifier = value;
    }

}
