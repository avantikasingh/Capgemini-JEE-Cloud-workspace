package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public interface EmployeeDao {
	public Employee addEmployee(Employee emp);
	public Employee[] showEmployee();
	public Employee searchEmployee(Integer empId);
	public Employee updateEmployee(Employee emp);
	public Boolean removeEmployee(Integer empId);
	public Project addProjectEmployee(Employee emp);
	public Project showProjectEmployee();

}
