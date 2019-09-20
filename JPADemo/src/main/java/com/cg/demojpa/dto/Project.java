package com.cg.demojpa.dto;

import javax.persistence.*;

@Entity
@Table(name = "jpa_proj")
public class Project {

	@Id
	@Column(name = "proj_id")
	private Integer projId;
	@Column(name = "proj_name")
	private String projName;
	@Column(name = "proj_cost")
	private Double projCost;

	public Project() {

	}

	public Project(Integer projId, String projNmae, Double projCost) {
		super();
		this.projId = projId;
		this.projName = projNmae;
		this.projCost = projCost;
	}

	public Integer getProjId() {
		return projId;
	}

	public void setProjId(Integer projId) {
		this.projId = projId;
	}

	public String getProjNmae() {
		return projName;
	}

	public void setProjNmae(String projName) {
		this.projName = projName;
	}

	public Double getProjCost() {
		return projCost;
	}

	public void setProjCost(Double projCost) {
		this.projCost = projCost;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", projCost=" + projCost + "]";
	}
	
	

}
