package com.app.main.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.main.Domain.DepartmentDomain;
import com.app.main.Domain.EmployeeDomain;
import com.app.main.model.EmployeeModel;

@Repository
public interface EmployeeRepo {
	
	public List<Object[]> getAllEmployee();

	public List<EmployeeModel> getAllEmployeeByModel();

	public List<EmployeeModel> getEmpDetailsBasedOnId(int empid);

 void saveEmployeeRecords(EmployeeModel emp);

public List<EmployeeDomain> getAllEmployeeList();



public void saveEmployee(EmployeeDomain model);

public void deleteDepartment(Integer id);

public void updateEmployeeBasedOnId(EmployeeDomain model);

}
