package com.sgic.library.services;

import javax.validation.Valid;

import com.sgic.library.entities.MainClassification;

public interface MainClassificationService {

	void saveMCL(@Valid MainClassification mcl); // save mcl

}