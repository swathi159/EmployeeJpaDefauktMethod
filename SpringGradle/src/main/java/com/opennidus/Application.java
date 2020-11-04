package com.opennidus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.opennidus.model.Employee;
import com.opennidus.repository.EmployeeRepo;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

@Component
class AvocetCommandLineRunner implements CommandLineRunner {

	// EployeeRepositry reposity;

	@Autowired
	EmployeeRepo emprepo;

	@Override
	public void run(String... args) throws Exception {
		List<Employee> employee = new ArrayList<Employee>();
		Employee emp1 = new Employee();
	  emp1.setEmp_name("Pinky");
		emp1.setEmp_Sal(37698.00);
		//emprepo.save(emp);
	 
		
		Employee emp2 = new Employee();
		emp2.setEmp_name("Sony");
		emp2.setEmp_Sal(5400.00);
		
		employee.add(emp1);
		employee.add(emp2);
		
		//emprepo.deleteById((long) 2);
		
		//emprepo.saveAll(employee);
		List<Employee> employees = emprepo.findAll();
		
		for(Employee employees1:employees)
		{
			System.out.println(employees1.getEmp_id());
			System.out.println(employees1.getEmp_Sal());
			
		}
	
	}
	//private final Logger logger = LoggerFactory.getLogger(Application.class);
}