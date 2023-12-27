package com.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restapi.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
