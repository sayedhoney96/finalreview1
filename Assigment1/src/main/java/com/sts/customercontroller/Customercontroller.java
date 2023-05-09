package com.sts.customercontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Customercontroller {
	
	
	@RequestMapping("/create")
	public String createcustomer() {
		return "customer created succesfully";
	}

	
	@RequestMapping("/getcustomer")
	public String getcustomer() {
		return "get all customer";
	}
	@RequestMapping("/delete")
	public String deletecustomer() {
		return " customer deleted";
	}
	
	@RequestMapping("/update")
	public String updatecustomer() {
		return "customer updated successfully";
	}
}
