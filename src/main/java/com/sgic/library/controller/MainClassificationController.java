package com.sgic.library.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sgic.library.entities.Book;
import com.sgic.library.entities.MainClassification;
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
	
	
	@GetMapping("/findallmcl")
	public List<MainClassification> findAll() {
		return mclService.getAllMcl();
	}
	
	@GetMapping("/getmclbyid/{id}")
	public ResponseEntity<MainClassification> findById(@PathVariable("id")long id){
		return new ResponseEntity<MainClassification>(mclService.findMclById(id), HttpStatus.OK);
	}
}
