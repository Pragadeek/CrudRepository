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

//@Entity
@Table(name = "countries")
public class CountriesDomain {


	private char country_id;

	@Column(name = "country_name")
	private String countryName;

	@JoinColumn(name = "region_id")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = RegionsDomain.class)
	private List<RegionsDomain> regionsDomain;

	/**
	 * @param countryId
	 * @param countryName
	 * @param regionsDomain
	 */
	public CountriesDomain(char countryId, String countryName, List<RegionsDomain> regionsDomain) {
		super();
		this.country_id = countryId;
		this.countryName = countryName;
		this.regionsDomain = regionsDomain;
	}

	public int getCountryId() {
		return country_id;
	}

	public void setCountryId(char countryId) {
		this.country_id = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	
}
