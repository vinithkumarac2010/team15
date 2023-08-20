package com.virtusa.hackathon.chistory.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.hackathon.chistory.model.CRDRHistory;
import com.virtusa.hackathon.chistory.repository.CustomerHistoryRepository;

@RestController
public class CustomerHistoryController {
	private static final Logger logger = LoggerFactory.getLogger(CustomerHistoryController.class);

	//@Autowired
	//private CustomerHistoryRepository customerHistoryRepository;
	

	@PostMapping("/crdrHistory")
	public List<CRDRHistory> getCustomerDetails(@RequestHeader("customerId") String customerId) {
		logger.info("getCustomerDetails() method started");
		//List<CRDRHistory> customerDetails = customerHistoryRepository.findByCustomerId(Integer.parseInt(customerId));
		logger.info("getCustomerDetails() method ended");
		List<CRDRHistory> customerDetails =new ArrayList<>();
		CRDRHistory history= new CRDRHistory();
		history.setCustomerId(1);
		history.setAmount(1500);
		history.setCrdrInd("CRD");
		customerDetails.add(history);
		history= new CRDRHistory();
		history.setCustomerId(1);
		history.setAmount(500);
		history.setCrdrInd("CRD");
		customerDetails.add(history);
		history= new CRDRHistory();
		history.setCustomerId(1);
		history.setAmount(2000);
		history.setCrdrInd("DBT");
		customerDetails.add(history);
		return customerDetails;
	

	}
}
