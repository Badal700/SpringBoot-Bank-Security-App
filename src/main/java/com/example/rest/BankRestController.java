package com.example.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String home() {
		String msg = "Welcome To State Bank Of India";
		return msg;
	}
	
	@GetMapping("/balance")
	public String balance() {
		String msg = "Your balance is :: 42,055 INR";
		return msg;
	}
	
	@GetMapping("/statment")
	public String getStatment() {
		String msg = "Your Statment is generated, will you send through Email.";
		return msg;
	}
	
	@GetMapping("/myloan")
	public String getMyLoan() {
		String msg = "Your Current Loan Amount is :: 4,56,000 INR";
		return msg;
	}
	
	@GetMapping("/contact")
	public String contact() {
		String msg = "Thank You for contacting to our Customer Support, will you get back soon";
		return msg;
	}
	
	
}
