package com.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.restapi.model.Employee;
import com.restapi.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {

@Autowired
private EmployeeService service;

@PostMapping("/save")
public String save(@RequestBody Employee employee) {
	Employee e1=service.saveEmployee(employee);
	String message=null;
	if(e1!=null)
		message="Data inserted successfully";
	else
		message="data failed";
	return message;
}
@GetMapping("/get/{eid}")
public Employee getEmp(@PathVariable int eid) {
	Employee getOneEmployee=service.getEmployee(eid);
	return getOneEmployee;
}
@GetMapping("/getAll")
public List<Employee> getAllEmps(){
	List<Employee>employeelist=service.getAllEmployee();
	return employeelist;
}
@DeleteMapping("/delete/{eid}")
public void delete(@PathVariable int eid) {
service.deleteEmployee(eid);
}

@PutMapping("/update/{eid}")
public Employee update(@RequestBody Employee employee,@PathVariable int eid) {
	Employee update=service.updateEmployee(employee, eid);
	return update;
}

}
