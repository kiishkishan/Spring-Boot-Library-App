package com.sgic.library.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.sgic.library.entities.SubClassification;
import com.sgic.library.repositories.SubClassificationRepositories;

@Service
public class SubClassificationImpl implements SubClassificationService {
	@Autowired
	SubClassificationRepositories sbclRepositories;
	public void saveSbcl(SubClassification sbcl) {
		sbclRepositories.save(sbcl);
	}

}
