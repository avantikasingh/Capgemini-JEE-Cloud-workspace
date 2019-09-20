package com.cg.demotwo.dto;

public class Employee {

	private int empId;
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public void divide() throws ArithmeticException
	{
		
		int a=10/0;
		System.out.println(a);
	}
	
	public void method()
	{
		throw new ArithmeticException("Arithmatic Exception....");
		
	}
}
