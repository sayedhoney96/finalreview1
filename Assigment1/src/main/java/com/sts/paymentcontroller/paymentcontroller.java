package com.sts.paymentcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class paymentcontroller {
	
	@RequestMapping("/createpayment")
	public String createpayment() {
		return "payment done succesfully";
	}

	
	@RequestMapping("/getpayment")
	public String getpayment() {
		return "get all payment";
	}
	
	
	@RequestMapping("/deletepayment")
	public String deletepayment() {
		return " deletepayment";
	}
	
	@RequestMapping("/updatepayment")
	public String updatepayment() {
		return "payment updated successfully";
	}

}
