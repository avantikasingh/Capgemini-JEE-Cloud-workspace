package com.cg.employeemanagement.dto;

public class Project {
	private Integer projectId;
	private String projectName;
	private Double projectCost;
	private Employee[] employees;
	
	public Project()
	{
		
	}
	
	public Project(Integer projectId, String projectName, Double projectCost,
			Employee[] employees) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectCost = projectCost;
		this.employees = employees;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Double getProjectCost() {
		return projectCost;
	}

	public void setProjectCost(Double projectCost) {
		this.projectCost = projectCost;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmpList(Employee[] employees) {
		this.employees = employees;
	}
	
	
	

}
