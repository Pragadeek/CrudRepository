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

@Entity
@Table(name="dependents")
public class DependentsDomain {

	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dependent_id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="relationship")
	private String relationship;
	
	@JoinColumn(name="employee_id")
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = EmployeeDomain.class)
	private List<EmployeeDomain> empDomain;

	/**
	 * @param dependent_id
	 * @param firstName
	 * @param lastName
	 * @param relationship
	 * @param empDomain
	 */
	public DependentsDomain(int dependent_id, String firstName, String lastName, String relationship,
			List<EmployeeDomain> empDomain) {
		super();
		this.dependent_id = dependent_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.relationship = relationship;
		this.empDomain = empDomain;
	}

	public int getDependent_id() {
		return dependent_id;
	}

	public void setDependent_id(int dependent_id) {
		this.dependent_id = dependent_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public List<EmployeeDomain> getEmpDomain() {
		return empDomain;
	}

	public void setEmpDomain(List<EmployeeDomain> empDomain) {
		this.empDomain = empDomain;
	}
	
	
	

}
