package com.app.main.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class RegionsDomain {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int region_id;

	@Column(name="region_name")
	
	private String regionName;
	public RegionsDomain(int regionId, String regionName) {
		super();
		this.region_id = regionId;
		this.regionName = regionName;
	}

	
	
	public int getRegionId() {
		return region_id;
	}

	public void setRegionId(int regionId) {
		this.region_id = regionId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	
	
	
}
