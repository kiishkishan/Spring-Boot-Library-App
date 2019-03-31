package com.sgic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.library.entities.Book;
import com.sgic.library.entities.MainClassification;
import com.sgic.library.repositories.MainClassificationRepositories;
import com.sgic.library.services.MainClassificationService;

@RestController
public class MainClassificationController {

	@Autowired
	MainClassificationService mclService;
	
	
	@PostMapping("/savemcl")
	public HttpStatus createMCL(@Valid @RequestBody MainClassification mcl) {
		mclService.saveMCL(mcl);
		return HttpStatus.CREATED;

	}
	
}
