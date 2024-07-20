package com.app.main.Domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "departments")
public class DepartmentDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "DepartmentId")
	private Integer department_id;

	@Column(name = "department_name")
    @JsonProperty(value = "DeptName")
	private String deptName;

	@JoinColumn(name = "location_id")
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = LocationDomain.class)
	private LocationDomain loc;

	private DepartmentDomain() {

	}

	/**
	 * @param department_id
	 * @param deptName
	 * @param loc
	 */
	public DepartmentDomain(Integer department_id, String deptName, LocationDomain loc) {
		super();
		this.department_id = department_id;
		this.deptName = deptName;
		this.loc = loc;
	}

	public void setDeptId(Integer deptId) {
		this.department_id = deptId;
	}

	public Integer getDeptId() {
		return department_id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "DepartmentDomain [department_id=" + department_id + ", deptName=" + deptName + ", jobs=" + loc + "]";
	}

	public LocationDomain getJobs() {
		return loc;
	}

	public void setJobs(LocationDomain jobs) {

		this.loc = jobs;
	}

}
