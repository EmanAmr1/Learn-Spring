package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {
	
	
	//controller method to show the intial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorldForm";
	}
	
	//controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//controller method to read form data and add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request , Model model) {
		
		//read the request param from the html form
		String theName=request.getParamter("studentNameField");
		
		//convert Data to upper case
		theName=theName.toUpperCase();
		
		//create the message
		String result = "hi" + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentNameField") String theName , Model model) {
		
		
		
		//convert Data to upper case
		theName=theName.toUpperCase();
		
		//create the message
		String result = "hi" + theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}
	
	
	
	
	
	
	
	
	
}
