package com.virtusa.hackaton.cscorecalc.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.hackathon.chistory.model.CRDRHistory;
import com.virtusa.hackathon.cis.customerinfoservice.model.Customer;
import com.virtusa.hackaton.service.CustomerHistoryFeignClient;
import com.virtusa.hackaton.service.CustomerInfoFeignClient;

@RestController
public class CreditScoreCalcController {
	
	private static final Logger logger = LoggerFactory.getLogger(CreditScoreCalcController.class);

	@Autowired
	private CustomerHistoryFeignClient customerHistoryFeignClient;
	
	@Autowired
	private CustomerInfoFeignClient customerInfoFeignClient;
	
	@PostMapping("/creditScore")
	public int processCreditScoreCalculation(@RequestHeader("customerId") String customerId) {
		logger.info("myCustomerDetails() method started");
		
		List<Customer> customerDetail = customerInfoFeignClient.getCustomerDetails(customerId);
		List<CRDRHistory> crdrHistory = customerHistoryFeignClient.getCustomerDetails(customerId);
		
		int crdSum=crdrHistory.stream().filter(p-> p.getCrdrInd().equalsIgnoreCase("CRD")).mapToInt(p->p.getAmount()).sum();
		int dbtSum=crdrHistory.stream().filter(p-> p.getCrdrInd().equalsIgnoreCase("DBT")).mapToInt(p->p.getAmount()).sum();
		int diff = dbtSum-crdSum;
		int score;
		if(diff < 0) {
			score=300;
		}else {
			score=100;
		}
		

		logger.info("myCustomerDetails() method ended");
		return score;
	}
}
