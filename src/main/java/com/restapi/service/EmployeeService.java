package com.restapi.service;

import java.util.List;

import com.restapi.model.Employee;

public interface EmployeeService {
public Employee saveEmployee(Employee employee);
public Employee updateEmployee(Employee employee,int eid);
public void deleteEmployee(int eid);
public Employee getEmployee(int eid);
public List<Employee> getAllEmployee();
}
