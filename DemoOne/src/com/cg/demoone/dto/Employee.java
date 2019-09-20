package com.cg.demoone.dto;

import com.cg.demoone.customexception.InvalidNameException;


public class Employee {
	
	
	public static int pf;
	public int data;
	private int empId;
	private String empName;
	private double empSalary;
	private String empDept;
	
	
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) throws InvalidNameException{
		if(Character.isLowerCase(empName.charAt(0)))
			throw new InvalidNameException("First character of name should be in Upper case...");
		this.empName = empName;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", empSalary=" + empSalary + ", empDept=" + empDept + "]";
	}
	
	
	
	
	
		

}
