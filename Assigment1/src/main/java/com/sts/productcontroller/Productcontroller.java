package com.sts.productcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Productcontroller {
	
	
	
	@RequestMapping("/createproduct")
	public String createproduct() {
		return "product created succesfully";
	}

	
	@RequestMapping("/getproduct")
	public String getproduct() {
		return "get all product";
	}
	@RequestMapping("/deleteproduct")
	public String deleteproduct() {
		return " product deleted";
	}
	
	@RequestMapping("/updateproduct")
	public String updateproduct() {
		return "product updated successfully";
	}

}
