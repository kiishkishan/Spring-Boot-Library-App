package com.sgic.library.entities;

import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@Table(schema = "library_spring", name = "mainclassification")
public class MainClassification implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long mclID;
	String mclName;
	
	@OneToMany(mappedBy = "mainClassification", cascade = {CascadeType.ALL})
	private List<SubClassification> subClassification;

	public Long getMclID() {
		return mclID;
	}

	public void setMclID(Long mclID) {
		this.mclID = mclID;
	}

	public String getMclName() {
		return mclName;
	}

	public void setMclName(String mclName) {
		this.mclName = mclName;
	}

	public List<SubClassification> getSubClassification() {
		return subClassification;
	}

	public void setSubClassification(List<SubClassification> subClassification) {
		this.subClassification = subClassification;
	}

	


	

	
	
}