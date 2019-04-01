package com.sgic.library.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sgic.library.entities.MainClassification;

import com.sgic.library.repositories.MainClassificationRepositories;

@Service
public class MainClassificationImpl implements MainClassificationService {

	@Autowired
	MainClassificationRepositories mclRepositories;
	
	public void saveMCL(MainClassification mcl) {
		mclRepositories.save(mcl);
	}

	@Override
	public MainClassification findMclById(long id) {
		return mclRepositories.findById(id);
	}

	@Override
	public List<MainClassification> getAllMcl() {
		// TODO Auto-generated method stub
		return mclRepositories.findAll();
	}

	

	
	
}
