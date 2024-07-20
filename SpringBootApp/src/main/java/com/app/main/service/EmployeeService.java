package com.app.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.main.Domain.DepartmentDomain;
import com.app.main.Domain.EmployeeDomain;
import com.app.main.model.EmployeeModel;

@Service
public interface EmployeeService {

	List<Object[]> getAllEmployee();

	List<EmployeeModel> getAllEmployeeByModel();

	List<EmployeeModel> getEmpDetailsBasedOnId(int empid);

	void saveEmployeeRecords(EmployeeModel emp);

	List<EmployeeDomain> getAllEmployeeList();

	
	//void saveDepartment(EmployeeDomain model);

	void saveEmployee(EmployeeDomain model);

	void deleteDepartment(Integer id);

	void updateEmployeeBasedOnId(EmployeeDomain model);

}
