package com.cg.demojpa.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_employee")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private Integer empId;
	@Column(name = "emp_name")
	private String empname;
	@Column(name = "emp_salary")
	private Double empSalary;
	private Date dateOfJoining;
	@Embedded
	private Address addr;
	@OneToOne(cascade = CascadeType.ALL)
	private Project proj;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="dept_id")
	private Department dept;

	public Employee() {

	}

	
	

	public Employee(Integer empId, String empname, Double empSalary, Date dateOfJoining, Address addr, Project proj,
			Department dept) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSalary = empSalary;
		this.dateOfJoining = dateOfJoining;
		this.addr = addr;
		this.proj = proj;
		this.dept = dept;
	}




	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Project getProj() {
		return proj;
	}

	public void setProj(Project proj) {
		this.proj = proj;
	}
	
	

	public Department getDept() {
		return dept;
	}




	public void setDept(Department dept) {
		this.dept = dept;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empSalary=" + empSalary + ", dateOfJoining="
				+ dateOfJoining + ", addr=" + addr + ", proj=" + proj + ", dept=" + dept + "]";
	}

	
	
	

}
