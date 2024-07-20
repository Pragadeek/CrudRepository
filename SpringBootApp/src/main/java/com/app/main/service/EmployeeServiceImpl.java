package com.app.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.main.Domain.DepartmentDomain;
import com.app.main.Domain.EmployeeDomain;
import com.app.main.model.EmployeeModel;
import com.app.main.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
		EmployeeRepo employeeRepo;

	@Override
	public List<Object[]> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.getAllEmployee();
	}

	@Override
	public List<EmployeeModel> getAllEmployeeByModel() {
		// TODO Auto-generated method stub
		return employeeRepo.getAllEmployeeByModel();
	}

	@Override
	public List<EmployeeModel> getEmpDetailsBasedOnId(int empid) {
		// TODO Auto-generated method stub
		return employeeRepo.getEmpDetailsBasedOnId(empid);
	}

	@Override
	public void saveEmployeeRecords(EmployeeModel emp) {
		employeeRepo.saveEmployeeRecords(emp);
		
	}

	@Override
	public List<EmployeeDomain> getAllEmployeeList() {
	return	employeeRepo.getAllEmployeeList();
	
	}

	@Override
	public void saveEmployee(EmployeeDomain model) {
		employeeRepo.saveEmployee(model);
		
	}

	@Override
	public void deleteDepartment(Integer id) {
		employeeRepo.deleteDepartment(id);
		
	}

	@Override
	public void updateEmployeeBasedOnId(EmployeeDomain model) {
	employeeRepo.updateEmployeeBasedOnId(model);
		
	}

	

}
