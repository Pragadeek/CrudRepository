package com.app.main.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.app.main.Domain.DepartmentDomain;
import com.app.main.Domain.EmployeeDomain;
import com.app.main.model.EmployeeModel;

@Repository
@Transactional
public class EmployeeRepoImpl implements EmployeeRepo {

	@PersistenceContext
	EntityManager em;

	@Override
	public List<Object[]> getAllEmployee() {

		// NativeSQl queries
		Query q = em.createNativeQuery("select * from employees");
		List<Object[]> obj = q.getResultList();
		return obj;
	}

	@Override
	public List<EmployeeModel> getAllEmployeeByModel() {
		Query q = em.createNativeQuery("select * from employees");
		List<Object[]> obj = q.getResultList();
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		for (Object[] objarr : obj) {
			EmployeeModel emp = new EmployeeModel();

			emp.setEmpId(objarr[0] != null ? Integer.parseInt(objarr[0].toString()) : 0);
			emp.setFirstName(objarr[1] != null ? objarr[1].toString() : "");
			emp.setLastName(objarr[2] != null ? objarr[2].toString() : "");
			emp.setEmail(objarr[3] != null ? objarr[3].toString() : "");
			emp.setPhoneNum(objarr[4] != null ? objarr[4].toString() : "");
			emp.setHireDate(objarr[5] != null ? objarr[5].toString() : "");
			emp.setJobId(Integer.parseInt(objarr[6] != null ? objarr[6].toString() : ""));
			emp.setSalary(objarr[7] != null ? objarr[7].toString() : "");
			emp.setManagerId(objarr[8] != null ? Integer.parseInt(objarr[8].toString()) : 0);
			emp.setDeptId(objarr[9] != null ? Integer.parseInt(objarr[9].toString()) : 0);

			list.add(emp);

		}
		// System.out.println(list);

		return list;

	}

	@Override
	public List<EmployeeModel> getEmpDetailsBasedOnId(int empid) {

		List<Object[]> obj = em.createNativeQuery("select * from Employees where employee_id = " + empid)
				.getResultList();
		List<EmployeeModel> list = new ArrayList<EmployeeModel>();
		for (Object[] objarr : obj) {
			EmployeeModel emp = new EmployeeModel();

			emp.setEmpId(objarr[0] != null ? Integer.parseInt(objarr[0].toString()) : 0);
			emp.setFirstName(objarr[1] != null ? objarr[1].toString() : "");
			emp.setLastName(objarr[2] != null ? objarr[2].toString() : "");
			emp.setEmail(objarr[3] != null ? objarr[3].toString() : "");
			emp.setPhoneNum(objarr[4] != null ? objarr[4].toString() : "");
			emp.setHireDate(objarr[5] != null ? objarr[5].toString() : "");
			emp.setJobId(Integer.parseInt(objarr[6] != null ? objarr[6].toString() : ""));
			emp.setSalary(objarr[7] != null ? objarr[7].toString() : "");
			emp.setManagerId(objarr[8] != null ? Integer.parseInt(objarr[8].toString()) : 0);
			emp.setDeptId(objarr[9] != null ? Integer.parseInt(objarr[9].toString()) : 0);
			list.add(emp);

		}

		return list;
	}

	@Override
	public void saveEmployeeRecords(EmployeeModel emp) {
		

	}

	@Override
	public List<EmployeeDomain> getAllEmployeeList() {
		List<EmployeeDomain> empDomain = em.createQuery("from EmployeeDomain").getResultList();

		return empDomain; 
		
	}

	@Override
	public void saveEmployee(EmployeeDomain model) {
		em.persist(model);
	
	}

	@Override
	public void deleteDepartment(Integer id) {
	DepartmentDomain domain=em.find(DepartmentDomain.class, id);
		
		em.remove(domain);
		
	}

	@Override
	public void updateEmployeeBasedOnId(EmployeeDomain model) {
		
		em.merge(model);
	}

}
