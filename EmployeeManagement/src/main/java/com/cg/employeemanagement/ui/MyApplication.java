package com.cg.employeemanagement.ui;

import java.util.Scanner;

import com.cg.employeemanagement.dto.Department;
import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.EmployeeService;
import com.cg.employeemanagement.service.EmployeeServiceImpl;

public class MyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Employees to be added");
		int n=sc.nextInt();
		int flag;
		do
		{
			System.out.println("Enter Employee Id");
			int id=sc.nextInt();
			
			System.out.println("Enter Employee Name");
			String name=sc.next();
			
			System.out.println("Enter Employee Salary");
			Double sal=sc.nextDouble();
			
			System.out.println("Enter Employee Department Id");
			int did=sc.nextInt();
			
			System.out.println("Enter Employee Department Name");
			String dname=sc.next();
			
			Department dept=new Department();
			dept.setDeptId(did);
			dept.setDeptName(dname);
			
			Employee emp=new Employee();
			emp.setEmpId(id);
			emp.setEmpName(name);
			emp.setEmpSalary(sal);
			emp.setDepartment(dept);
			
			service.addEmployee(emp);
			
			System.out.println("Enter 1 to enter more Employees or 0 to end!");
			flag=sc.nextInt();
	}while(flag!=0);
		
		System.out.println("\nEnter 1 to Show Employee List.\nEnter 2 to Search Employee.\nEnter 3 to Update Employee.\nEnter 4 to Remove Employee.\nEnter 5 to add Project.");
		int input=sc.nextInt();
		
		switch(input)
		{
		case 1:
			Employee empArray[]=service.showEmployee();
			
			for(int j=0;j<n;j++)
			{
				if(empArray[j]!=null)
					System.out.println(empArray[j].getEmpName());
			}
			break;
		case 2:
			System.out.println("Enter Employee Id to be searched..");
			Integer id=sc.nextInt();
			System.out.println(service.searchEmployee(id).getEmpName());
			break;
		case 3:
			break;
		case 4:
			System.out.println("Enter Employee Id to be deleted..");
			Integer iid=sc.nextInt();
			System.out.println(service.removeEmployee(iid));
			break;
		case 5:
			System.out.println("Enter Project id");
			int pId=sc.nextInt();
			System.out.println("Enter Project Name");
			String pName=sc.next();
			System.out.println("Enter Project Cost ");
			double pCost=sc.nextDouble();
			
			System.out.println("Employee ID List :");
			Employee empArr[]=service.showEmployee();
			
			for(int j=0;j<n;j++)
			{
				if(empArr[j]!=null)
					System.out.println(empArr[j].getEmpId());
			}
			
			
			
			
			
		}
		
		/*Employee empArray[]=service.showEmployee();
		
		for(int j=0;j<n;j++)
		{
			if(empArray[j]!=null)
				System.out.println(empArray[j].getEmpName());
		}
		System.out.println(service.searchEmployee(1).getEmpName());
		System.out.println(service.updateEmployee(empArray[0]).getEmpSalary());
		System.out.println(service.removeEmployee(1));*/
		
		
		
		
		
		sc.close();
	}

}
