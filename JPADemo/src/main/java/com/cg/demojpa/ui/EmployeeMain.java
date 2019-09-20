package com.cg.demojpa.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.cg.demojpa.dto.Address;
import com.cg.demojpa.dto.Department;
import com.cg.demojpa.dto.Employee;
import com.cg.demojpa.dto.Project;
import com.cg.demojpa.service.EmployeeService;
import com.cg.demojpa.service.EmployeeServiceImpl;

public class EmployeeMain {
	
	public static void main(String[] args) throws ParseException
	{
		EmployeeService service=new EmployeeServiceImpl();
		
		//displayChoice();
		
		//int choice=sc.nextInt();
		
		//switch(choice)
		
		
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			System.out.println("Enter Name:");
			String name=sc.next();
			System.out.println("Enter Salary:");
			double sal=sc.nextDouble();
			System.out.println("Enter Joining Date:");
			String date=sc.next();
			SimpleDateFormat st=new SimpleDateFormat("yyyy-mm-dd");
			Date newDate=st.parse(date);
			System.out.println("Enter City:");
			String city=sc.next();
			System.out.println("Enter State:");
			String state=sc.next();
			System.out.println("Enter Pincode:");
			Integer pin=sc.nextInt();
			System.out.println("Enter Project Id:");
			Integer projId=sc.nextInt();
			System.out.println("Enter Project Name:");
			String projName=sc.next();
			System.out.println("Enter Project Cost:");
			Double projCost=sc.nextDouble();
			System.out.println("Enter Department Id:");
			Integer deptId=sc.nextInt();
			System.out.println("Enter Department Name:");
			String deptName=sc.next();
			
			
			Employee emp=new Employee();
			Address addr=new Address();
			Project proj=new Project();
			Department dept=new Department();
			addr.setCity(city);
			addr.setState(state);
			addr.setPincode(pin);
			
			proj.setProjId(projId);
			proj.setProjNmae(projName);
			proj.setProjCost(projCost);
			
			dept.setDeptId(deptId);
			dept.setDeptName(deptName);
			
			emp.setEmpId(id);
			emp.setEmpname(name);
			emp.setEmpSalary(sal);
			emp.setDateOfJoining(newDate);
			emp.setAddr(addr);
			emp.setProj(proj);
			emp.setDept(dept);
			
			service.addEmployee(emp);
			
			
			
		
			
	}

}
