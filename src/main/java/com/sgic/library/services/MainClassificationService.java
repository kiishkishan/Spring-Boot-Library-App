package com.sgic.library.services;

import java.util.List;

import javax.validation.Valid;

import com.sgic.library.entities.Book;
import com.sgic.library.entities.MainClassification;

public interface MainClassificationService {

	void saveMCL(@Valid MainClassification mcl); // save main classification
	List<MainClassification> getAllMcl();		//	Get All main classification
	MainClassification findMclById(long id); //find by id

}
