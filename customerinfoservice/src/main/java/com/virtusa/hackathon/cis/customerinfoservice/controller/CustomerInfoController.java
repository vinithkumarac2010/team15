package com.virtusa.hackathon.cis.customerinfoservice.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.hackathon.cis.customerinfoservice.model.Customer;
import com.virtusa.hackathon.cis.customerinfoservice.repository.CustomerInfoRepository;


@RestController
public class CustomerInfoController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerInfoController.class);

	@Autowired
	private CustomerInfoRepository customerInfoRepository;
	

	@PostMapping("/myCustomer")
	public List<Customer> getCustomerDetails(@RequestHeader("customerId") String customerId,@RequestBody Customer customer) {
		logger.info("getCustomerDetails() method started");
		List<Customer> customerDetails = customerInfoRepository.findByCustomerId(customer.getCustomerId());
		logger.info("getCustomerDetails() method ended");
		if (customerDetails != null) {
			return customerDetails;
		} else {
			return null;
		}

	}
}
