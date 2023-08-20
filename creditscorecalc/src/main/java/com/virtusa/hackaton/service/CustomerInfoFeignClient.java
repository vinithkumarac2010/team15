package com.virtusa.hackaton.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtusa.hackathon.cis.customerinfoservice.model.Customer;

@FeignClient("customerInfo")
public interface CustomerInfoFeignClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "myCustomer", consumes = "application/json")
	List<Customer> getCustomerDetails(@RequestHeader("customerId") String customerId);
}
