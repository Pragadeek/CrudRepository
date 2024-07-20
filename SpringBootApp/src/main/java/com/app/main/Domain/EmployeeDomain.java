package com.app.main.Domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "employees")
public class EmployeeDomain {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value = "EmpId")
	private Integer employee_id;

	@Column(name = "first_name")
	@JsonProperty(value = "FirstName")
	private String FirstName;

	@Column(name = "last_name")
	@JsonProperty(value = "LastName")
	private String LastName;

	@Column(name = "email")
	@JsonProperty(value = "Email")
	private String Email;

	@Column(name = "phone_number")
	@JsonProperty(value = "PhoneNum")
	private String PhoneNum;

	@Column(name = "hire_date")
	@JsonProperty(value = "HireDate")
	@DateTimeFormat
	private Date HireDate;

	@Column(name = "salary")
	@JsonProperty(value = "Salary")
	private String Salary;

	@Column(name = "manager_id")
	@JsonProperty(value = "ManagerId")
	private Integer ManagerId;

	@ManyToOne(cascade = CascadeType.PERSIST, targetEntity = JobsDomain.class)
	@JoinColumn(name = "job_id", nullable = true)
	// @JsonManagedReference
	private JobsDomain jobs;

	@ManyToOne(cascade = CascadeType.PERSIST, targetEntity = DepartmentDomain.class)
	@JoinColumn(name = "department_id")

	// @JsonManagedReference
	private DepartmentDomain deptDomain;

	/**
	 * @param employee_id
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param phoneNum
	 * @param hireDate
	 * @param salary
	 * @param managerId
	 * @param jobs
	 * @param deptDomain
	 */
	public EmployeeDomain(Integer employee_id, String firstName, String lastName, String email, String phoneNum,
			Date hireDate, String salary, Integer managerId, JobsDomain jobs, DepartmentDomain deptDomain) {
		super();
		this.employee_id = employee_id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		PhoneNum = phoneNum;
		HireDate = hireDate;
		Salary = salary;
		ManagerId = managerId;
		this.jobs = jobs;
		this.deptDomain = deptDomain;
	}

	public EmployeeDomain() {

	}

	public int getEmpId() {
		return employee_id;
	}

	public void setEmpId(int empId) {
		employee_id = empId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public Date getHireDate() {
		return HireDate;
	}

	public void setHireDate(Date hireDate) {
		HireDate = hireDate;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String salary) {
		Salary = salary;
	}

	public JobsDomain getJobs() {
		return jobs;
	}

	public void setJobs(JobsDomain jobs) {
		this.jobs = jobs;
	}

	public Integer getManagerId() {
		return ManagerId;
	}

	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}

	public DepartmentDomain getDeptDomain() {
		return deptDomain;
	}

	public void setDeptDomain(DepartmentDomain deptDomain) {
		this.deptDomain = deptDomain;
	}

	@Override
	public String toString() {
		return "EmployeeDomain [employee_id=" + employee_id + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", PhoneNum=" + PhoneNum + ", HireDate=" + HireDate + ", Salary=" + Salary
				+ ", ManagerId=" + ManagerId + ", jobs=" + jobs + ", deptDomain=" + deptDomain + "]";
	}

}
