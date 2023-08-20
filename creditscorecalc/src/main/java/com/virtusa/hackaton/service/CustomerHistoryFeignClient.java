package com.virtusa.hackaton.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.virtusa.hackathon.chistory.model.CRDRHistory;

@FeignClient("cusHistory")
public interface CustomerHistoryFeignClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "crdrHistory", consumes = "application/json")
	List<CRDRHistory> getCustomerDetails(@RequestHeader("customerId") String customerId);
}
