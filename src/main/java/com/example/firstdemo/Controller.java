package com.example.firstdemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
public class Controller {
	
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	@ApiOperation(value = "Get a patient notes for the given patient.", notes = "")
	public String get(@RequestParam(value = "patient_id", required = false) Integer patient_id) {
		
		
		String age=patient_id.toString()+5;
		String s=patientData();
		if(patient_id==123) {
		return "data found for id Prashanth="+patient_id+ s;
		}else {
			return "data not found for id "+patient_id;//+ s;
		}
	}
	
	public String patientData() {
		
		ArrayList<String> listOfNames= new ArrayList<>();
		
		//logic 
		
		listOfNames.add("arvind");
		listOfNames.add("parash");
		listOfNames.add("madhu");
		
		return "age=123, id=234,name=madhu,adresss= 55 madison, drug=parascematl ";
	}

}
