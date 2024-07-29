package com.app.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.main.Domain.DepartmentDomain;
import com.app.main.Domain.EmployeeDomain;
import com.app.main.model.EmployeeModel;
import com.app.main.service.EmployeeService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@RestController
@RequestMapping(path = "/api")
public class MainController {

	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("/message")
	public String getMessage() {
		return "Never Giveup";
	}

	// http://localhost:8080/api/getallEmployee
	@GetMapping(value = "/getallEmployee")
	public List<Object[]> getAllEmployees() {

		List<Object[]> obj = employeeService.getAllEmployee();
		return obj;
	}

	// http://localhost:8080/api/getallEmp //create json
	@GetMapping(value = "/getallEmp")
	public String getAllEmp() {

		JsonArray arr = new JsonArray();
		List<Object[]> obj = employeeService.getAllEmployee();

		for (Object[] object : obj) {
			JsonObject Jobject = new JsonObject();

			Jobject.addProperty("EmpId", object[0] != null ? object[0].toString() : "");
			Jobject.addProperty("FirstName", object[1] != null ? object[1].toString() : "");
			Jobject.addProperty("LastName", object[2] != null ? object[2].toString() : "");
			Jobject.addProperty("Email", object[3] != null ? object[3].toString() : "");
			Jobject.addProperty("PhoneNumber", object[4] != null ? object[4].toString() : "");
			Jobject.addProperty("Hiredate", object[5] != null ? object[5].toString() : "");
			Jobject.addProperty("JobId", object[6] != null ? object[6].toString() : "");
			Jobject.addProperty("salary", object[7] != null ? object[7].toString() : "");
			Jobject.addProperty("ManagerId", object[8] != null ? object[8].toString() : "");
			Jobject.addProperty("DepartmentId", object[9] != null ? object[9].toString() : "");
			arr.add(Jobject);

		}

		return arr.toString();
	}

	// http://localhost:8080/api/getallEmpUsingModel
	@GetMapping(value = "/getallEmpUsingModel")
	public List<EmployeeModel> getAllEmpUsingModel() {

		// JsonArray arr = new JsonArray();
		List<EmployeeModel> obj = employeeService.getAllEmployeeByModel();

		return obj;
	}

	// http://localhost:8080/api/getEmpDetailsBasedOnId/100
	@GetMapping(value = "/getEmpDetailsBasedOnId/{empid}")
	public ResponseEntity<List<EmployeeModel>> getEmpDetailsBasedOnId(@PathVariable int empid) {

		List<EmployeeModel> emp = employeeService.getEmpDetailsBasedOnId(empid);
		return ResponseEntity.ok(emp);

	}

	// http://localhost:8080/api/saveEmployeeRecords
	@PostMapping(value = "/saveEmployeeRecords")
	public String saveEmployeeRecords(@RequestBody EmployeeModel emp) {

		employeeService.saveEmployeeRecords(emp);

		return null;

	}

	// http://localhost:8080/api/getallEmployee using EmployeeDomain and return
	// domain class
	@GetMapping(value = "/getAllEmployeesList")
	public List<EmployeeDomain> getAllEmployeesList() {

		List<EmployeeDomain> obj = employeeService.getAllEmployeeList();

		return obj;

	}

	// http://localhost:8080/api/getAllEmployeesDetails
	@GetMapping(value = "/getAllEmployeesDetails")
	public String getAllEmployeesDetails() {

		JsonArray mainarr = new JsonArray();

		JsonObject mainobj = new JsonObject();

		List<EmployeeDomain> obj = employeeService.getAllEmployeeList();

		for (EmployeeDomain emp : obj) {

			JsonObject empobj = new JsonObject();

			empobj.addProperty("EmpID", String.valueOf(emp.getEmpId()));
			empobj.addProperty("empFirstName", emp.getFirstName() == null ? "" : emp.getFirstName());
			empobj.addProperty("empLastName", emp.getLastName() == null ? "" : emp.getLastName());
			empobj.addProperty("email", emp.getEmail() == null ? "" : emp.getEmail());
			empobj.addProperty("PhoneNum", emp.getPhoneNum() == null ? "" : emp.getPhoneNum());
			// empobj.addProperty("hireDate", emp.getHireDate() == null ? "" : String.va
			// emp.getHireDate());
			empobj.addProperty("salary", emp.getSalary() == null ? "" : emp.getSalary());
			empobj.addProperty("ManagerId", emp.getManagerId() == null ? "" : String.valueOf(emp.getManagerId()));
			empobj.addProperty("JobDetails:", emp.getJobs().toString());
			empobj.addProperty("departmentDetails", emp.getDeptDomain().toString());

			mainarr.add(empobj);

		}
		mainobj.add("EmployeeDetails: ", mainarr);

		return mainobj.toString();

	}

	// http://localhost:8080/api/saveEmployee
	@PostMapping(value = "/saveEmployee")
	public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDomain model) {

		employeeService.saveEmployee(model);

		return ResponseEntity.status(HttpStatus.CREATED).body("Saved Successfully");

	}

	@DeleteMapping(value = "/deleteEmployeeBasedOnId")
	public ResponseEntity<String> deleteDepartmentBasedOnId(@RequestBody Integer id) {
		employeeService.deleteDepartment(id);

		return ResponseEntity.status(HttpStatus.OK).body("deleted Successfully");

	}

	@PutMapping(value = "/updateEmployeeBasedOnId")
	public ResponseEntity<String> updateEmployeeBasedonId(@RequestBody EmployeeDomain model) {

		employeeService.updateEmployeeBasedOnId(model);

		return ResponseEntity.status(HttpStatus.OK).body("Updated Successfully");

	}
	
	//Shivasaravanan_sk
	
	
	
	

}