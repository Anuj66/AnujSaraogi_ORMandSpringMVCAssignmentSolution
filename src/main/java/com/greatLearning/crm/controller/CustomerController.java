package com.greatLearning.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatLearning.crm.model.Customer;
import com.greatLearning.crm.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String homePage(Model model) {
		List<Customer> customers = customerService.listCustomers();
		model.addAttribute("customers", customers);
		return "home-page";
	}
	
}
