
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultSite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultSite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addrNomen" type="{http://ver01.eps.speedy.sirma.com/}addrNomen" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="municipality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="servingOfficeId" type="{http://www.w3.org/2001/XMLSchema}long"/>        
 *         &lt;element name="coordX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of sites speedy web service requests
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSite", propOrder = {
    "addrNomen",
    "id",
    "municipality",
    "name",
    "postCode",
    "region",
    "type",
    "countryId",
    "servingOfficeId",
    "coordX",
	"coordY",
	"coordType"
})
public class ResultSite {

    /**
     * Site address nomenclature.
     * Specifies if speedy have (or have not) address nomenclature (streets, quarters etc.) for this site
     */
    protected AddrNomen addrNomen;
    
    /**
     * Site ID
     */
    protected long id;
    
    /**
     * Site municipality name
     */
    protected String municipality;
    
    /**
     * Site name
     */
    protected String name;
    
    /**
     * Site post code
     */
    protected String postCode;
    
    /**
     * Site region name
     */
    protected String region;
    
    /**
     * Site type
     */
    protected String type;
    
    /**
     * Country id
     * @since 2.5.0
     */
    protected long countryId;
    
    /**
     * Serving office id
     * @since 2.6.0
     */
    protected long servingOfficeId;
    
    /**
     * GIS coordinate - X
     * @since 2.6.0
     */
    private Double coordX;
    
    /**
     * GIS coordinate - Y
     * @since 2.6.0
     */
	private Double coordY;
	
	/**
	 * GIS coordinate type
	 * @since 2.6.0
	 */
	private Integer coordType;

    /**
     * Gets the address nomenclature type.
     * Specifies if speedy have (or have not) address nomenclature (streets, quarters etc.) for this site
     * @return Address nomenclature type
     */
    public AddrNomen getAddrNomen() {
        return addrNomen;
    }

    /**
     * Sets the address nomenclature type
     * @param addrNomen Address nomenclature type
     */
    public void setAddrNomen(AddrNomen addrNomen) {
        this.addrNomen = addrNomen;
    }

    /**
     * Gets the site id
     * @return Site id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the site id
     * @param id Site id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the municipality name
     * @return Municipality name
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Sets the municipality name
     * @param municipality Municipality name
     */
    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * Gets the site name
     * @return Site name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the site name
     * @param name Site name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the site post code
     * @return Site post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the site post code
     * @param postCode Site post code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Gets the site region name
     * @return Site region name
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the site region name
     * @param region Site region name
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the site type
     * @return Site type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the site type
     * @param type Site type
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Gets the country id
     * @return Country id
     * @since 2.5.0
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the country id
     * @param countryId Country id
     * @since 2.5.0
     */
    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets serving office id for this site
     * @since 2.6.0
     */
    public long getServingOfficeId() {
        return servingOfficeId;
    }

    /**
     * Sets serving office id
     * @param servingOfficeId Serving office id
     * @since 2.6.0
     */
    public void setServingOfficeId(long servingOfficeId) {
        this.servingOfficeId = servingOfficeId;
    }
    
    /**
     * Gets the GPS X coordinate
     * @return GPS X coordinate
     * @since 2.6.0
     */
    public Double getCoordX() {
        return coordX;
    }

    /**
     * Sets the GPS X coordinate
     * @param coordX GPS X coordinate
     * @since 2.6.0
     */
    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    /**
     * Gets the GPS Y coordinate
     * @return GPS Y coordinate
     * @since 2.6.0
     */
    public Double getCoordY() {
        return coordY;
    }

    /**
     * Sets the GPS Y coordinate
     * @param coordY GPS Y coordinate
     * @since 2.6.0
     */
    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }
    
    /**
     * Gets the GPS coordinate type
     * @return GPS coordinate type
     * @since 2.6.0
     */
    public Integer getCoordType() {
        return coordType;
    }

    /**
     * Sets the GPS coordinate type
     * @param coordType GPS coordinate type
     * @since 2.6.0
     */
    public void setCoordTypeId(Integer coordType) {
        this.coordType = coordType;
    }
}
