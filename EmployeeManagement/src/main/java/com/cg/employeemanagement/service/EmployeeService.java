package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface EmployeeService {
	
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee searchEmployee(Integer empId);
	public Employee updateEmployee(Employee emp);
	public Boolean removeEmployee(Integer empId);
	public Project addProjectEmployee(Employee emp);
	public Project showProjectEmployee();
	

}
