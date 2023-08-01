package com.spring.neworm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name = "employees")
public class Employee {
	
	@Id
	@Column
	private String employee_id;
	@Column
	private String employee_name;
	@Column
	private String address;
	
	
	
	
	
	public Employee() {
		super();
	}
	
	public Employee(String employee_id, String employee_name, String address) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.address = address;
	}
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
