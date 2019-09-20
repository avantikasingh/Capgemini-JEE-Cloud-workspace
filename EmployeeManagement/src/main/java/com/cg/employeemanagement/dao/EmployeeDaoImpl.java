package com.cg.employeemanagement.dao;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.dto.Project;

public class EmployeeDaoImpl implements EmployeeDao {

	Employee[] empArray = new Employee[20];

	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.empArray.length; i++) {
			if (empArray[i] == null) {
				this.empArray[i] = emp;
				break;
			}
		}
		return emp;
	}

	public Employee[] showEmployee() {
		// TODO Auto-generated method stub
		return this.empArray;
	}

	public Employee searchEmployee(Integer empId) {
		// TODO Auto-generated method stub
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i].getEmpId() == empId)
				return empArray[i];
		}
		return null;
	}

	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		double sal = emp.getEmpSalary();
		emp.setEmpSalary(1.15 * sal);
		return emp;
	}

	public Boolean removeEmployee(Integer empId) {
		// TODO Auto-generated method stub
		for (int i = 0; i < empArray.length; i++) {
			if (empArray[i].getEmpId() == empId)
				return Boolean.parseBoolean("true");
		}

		return Boolean.parseBoolean("false");
	}

	public Project addProjectEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		return null;
	}

	public Project showProjectEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
