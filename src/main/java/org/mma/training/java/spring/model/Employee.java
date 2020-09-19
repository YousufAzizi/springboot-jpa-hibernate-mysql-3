package org.mma.training.java.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPL_TBL")
public class Employee {
	
	@Id
	private long id;
	private String firstName;
	private String lastName;
	private String manager;
	
	

	//no arg constructor
	public Employee() {
	
	}
	
	public Employee(long id, String firstName, String lastName, String manager) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.manager = manager;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", manager=" + manager
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
