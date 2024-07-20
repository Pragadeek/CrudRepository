package com.app.main.Domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="locations")
public class LocationDomain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer location_id;
	
	@Column(name="street_Address",nullable = true)
	@JsonProperty(value="StreetAdress")
	private String streetAdress;
	@Column(name="postal_code",nullable = true)
	@JsonProperty(value="PostalCode")
	private String postalCode;
	@Column(name="city",nullable = true)
	@JsonProperty(value="City")
	private String city;
	@Column(name="state_province",nullable = true)
	@JsonProperty(value="StateProvince")
	private String stateProvince;
	
	
	
	public LocationDomain() {
		
	}
	
	public Integer getLocationId() {
		return location_id;
	}
	public void setLocationId(Integer locationId) {
		this.location_id = locationId;
	}
	public String getStreetAdress() {
		return streetAdress;
	}
	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateProvince() {
		return stateProvince;
	}
	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}
	/**
	 * @param location_id
	 * @param streetAdress
	 * @param postalCode
	 * @param city
	 * @param stateProvince
	 */
	public LocationDomain(Integer location_id, String streetAdress, String postalCode, String city,
			String stateProvince) {
		super();
		this.location_id = location_id;
		this.streetAdress = streetAdress;
		this.postalCode = postalCode;
		this.city = city;
		this.stateProvince = stateProvince;
	}

	@Override
	public String toString() {
		return "LocationDomain [location_id=" + location_id + ", streetAdress=" + streetAdress + ", postalCode="
				+ postalCode + ", city=" + city + ", stateProvince=" + stateProvince + "]";
	}
	
	
}
