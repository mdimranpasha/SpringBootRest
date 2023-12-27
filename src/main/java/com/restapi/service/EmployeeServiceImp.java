package com.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.Employee;
import com.restapi.repo.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public Employee saveEmployee(Employee employee) {
		 Employee emp=repo.save(employee);
		 
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee, int eid) {
		 Employee oldRecored=repo.findById(eid).get();
		 oldRecored.setSalary(employee.getSalary());
		 oldRecored.setDesignation(employee.getDesignation());
		return repo.save(oldRecored);
		
	}

	@Override
	public void deleteEmployee(int eid) {
		 repo.deleteById(eid);

	}

	@Override
	public Employee getEmployee(int eid) {
		 Employee get= repo.findById(eid).get();
		return get;
	}

	@Override
	public List<Employee> getAllEmployee() {
		 List<Employee> employeelist=repo.findAll();
		return employeelist;
	}

}
