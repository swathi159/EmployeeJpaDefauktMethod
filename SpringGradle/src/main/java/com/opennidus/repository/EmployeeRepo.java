package com.opennidus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.opennidus.model.Employee;

public  interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
