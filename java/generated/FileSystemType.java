//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.16 at 07:48:01 AM WET 
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
 * <p>Java class for FileSystemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the type property.
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
     * Sets the value of the type property.
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
     * Gets the value of the creationDate property.
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
     * Sets the value of the creationDate property.
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
     * Gets the value of the modificationDate property.
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
     * Sets the value of the modificationDate property.
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
     * Gets the value of the backupDate property.
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
     * Sets the value of the backupDate property.
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
     * Gets the value of the clusterSize property.
     * 
     */
    public int getClusterSize() {
        return clusterSize;
    }

    /**
     * Sets the value of the clusterSize property.
     * 
     */
    public void setClusterSize(int value) {
        this.clusterSize = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     */
    public long getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     */
    public void setClusters(long value) {
        this.clusters = value;
    }

    /**
     * Gets the value of the files property.
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
     * Sets the value of the files property.
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
     * Gets the value of the bootable property.
     * 
     */
    public boolean isBootable() {
        return bootable;
    }

    /**
     * Sets the value of the bootable property.
     * 
     */
    public void setBootable(boolean value) {
        this.bootable = value;
    }

    /**
     * Gets the value of the volumeSerial property.
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
     * Sets the value of the volumeSerial property.
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
     * Gets the value of the volumeName property.
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
     * Sets the value of the volumeName property.
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
     * Gets the value of the freeClusters property.
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
     * Sets the value of the freeClusters property.
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
     * Gets the value of the dirty property.
     * 
     */
    public boolean isDirty() {
        return dirty;
    }

    /**
     * Sets the value of the dirty property.
     * 
     */
    public void setDirty(boolean value) {
        this.dirty = value;
    }

    /**
     * Gets the value of the expirationDate property.
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
     * Sets the value of the expirationDate property.
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
     * Gets the value of the effectiveDate property.
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
     * Sets the value of the effectiveDate property.
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
     * Gets the value of the systemIdentifier property.
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
     * Sets the value of the systemIdentifier property.
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
     * Gets the value of the volumeSetIdentifier property.
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
     * Sets the value of the volumeSetIdentifier property.
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
     * Gets the value of the publisherIdentifier property.
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
     * Sets the value of the publisherIdentifier property.
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
     * Gets the value of the dataPreparerIdentifier property.
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
     * Sets the value of the dataPreparerIdentifier property.
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
     * Gets the value of the applicationIdentifier property.
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
     * Sets the value of the applicationIdentifier property.
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
