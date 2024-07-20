package com.app.main.Domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="jobs")
public class JobsDomain {
	
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty(value="JobId")
	private Integer job_id;
	
	@Column(name="job_title",nullable= true)
	@JsonProperty(value="JobTitle")
	private String jobTitle;
	
	@Column(name="min_salary",nullable= true)
	@JsonProperty(value="MinSalary")
	private String minSalary;
	
	@Column(name="max_salary",nullable=true)
	@JsonProperty(value="MaxSalary")
	private String maxSalary;
	
	/*
	@OneToMany(mappedBy = "jobs")
    private List<EmployeeDomain> emp;
	*/
	public JobsDomain() {
		
	}

	/**
	 * @param jobId
	 * @param jobTitle
	 * @param minSalary
	 * @param maxSalary
	 */
	public JobsDomain(int jobId, String jobTitle, String minSalary, String maxSalary) {
		super();
		this.job_id = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public Integer getJobId() {
		return job_id;
	}

	public void setJobId(int jobId) {
		this.job_id = jobId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}

	public String getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "JobsDomain [job_id=" + job_id + ", jobTitle=" + jobTitle + ", minSalary=" + minSalary + ", maxSalary="
				+ maxSalary + "]";
	}

	
	
	}
