package com.cg.employeemanagement.service;

import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.dao.EmployeeDaoImpl;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;
public class EmployeeServiceImpl implements EmployeeService{
	
	EmployeeDao dao=new EmployeeDaoImpl();

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addEmployee(emp);
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return dao.showEmployee();
	}

	public Employee searchEmployee(Integer empId) {
		// TODO Auto-generated method stub
		
		return dao.searchEmployee(empId);
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	public Boolean removeEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return dao.removeEmployee(empId);
	}

	public Project addProjectEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.addProjectEmployee(emp);
	}

	public Project showProjectEmployee() {
		// TODO Auto-generated method stub
		return dao.showProjectEmployee();
	}
	
	
	
	

}
