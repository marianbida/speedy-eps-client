
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for getWeightInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeightInterval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="senderSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiverSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="senderCountryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverCountryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiverPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeightInterval", propOrder = {
    "sessionId",
    "serviceTypeId",
    "senderSiteId",
    "receiverSiteId",
    "date",
    "documents",
    "senderCountryId",
    "senderPostCode",
    "receiverCountryId",
    "receiverPostCode"
})
public class GetWeightInterval {

    protected String sessionId;
    protected long serviceTypeId;
    protected Long senderSiteId;
    protected Long receiverSiteId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected boolean documents;
    protected Long senderCountryId;
    protected String senderPostCode;
    protected Long receiverCountryId;
    protected String receiverPostCode;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the serviceTypeId property.
     * 
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the value of the serviceTypeId property.
     * 
     */
    public void setServiceTypeId(long value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the value of the senderSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderSiteId() {
        return senderSiteId;
    }

    /**
     * Sets the value of the senderSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderSiteId(Long value) {
        this.senderSiteId = value;
    }

    /**
     * Gets the value of the receiverSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiverSiteId() {
        return receiverSiteId;
    }

    /**
     * Sets the value of the receiverSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiverSiteId(Long value) {
        this.receiverSiteId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     */
    public boolean isDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     */
    public void setDocuments(boolean value) {
        this.documents = value;
    }

    /**
     * Gets the value of the senderCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderCountryId() {
        return senderCountryId;
    }

    /**
     * Sets the value of the senderCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderCountryId(Long value) {
        this.senderCountryId = value;
    }

    /**
     * Gets the value of the senderPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPostCode() {
        return senderPostCode;
    }

    /**
     * Sets the value of the senderPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPostCode(String value) {
        this.senderPostCode = value;
    }

    /**
     * Gets the value of the receiverCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiverCountryId() {
        return receiverCountryId;
    }

    /**
     * Sets the value of the receiverCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiverCountryId(Long value) {
        this.receiverCountryId = value;
    }

    /**
     * Gets the value of the receiverPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * Sets the value of the receiverPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPostCode(String value) {
        this.receiverPostCode = value;
    }

}
