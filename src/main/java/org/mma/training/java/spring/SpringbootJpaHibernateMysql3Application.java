package org.mma.training.java.spring;

import java.util.ArrayList;
import java.util.List;

import org.mma.training.java.spring.model.Employee;
import org.mma.training.java.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaHibernateMysql3Application implements CommandLineRunner {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaHibernateMysql3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 =new Employee(100, "Nasrat", "Ahmadi", "Tariq");
		
		Employee employee2 =new Employee(200, "Najeeb", "John", "james");
		Employee employee3 =new Employee(300, "Mohammad", "Mustafa", "Ahmad");
		
		List<Employee> employees= new ArrayList<>();
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		employeeRepository.saveAll(employees);
		
		

		
		
	}

}
