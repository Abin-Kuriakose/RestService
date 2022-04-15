package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public class EmployeeController {

	@RequestMapping("/get")
	public ResponseEntity<EmployeeVO> getEmployee() {
		EmployeeVO employee = new EmployeeVO(1,"Dolu the programmer");
        return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}
}

class EmployeeVO{
	EmployeeVO(int id , String name){
		this.id=id;
		this.name=name;
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
