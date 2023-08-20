package com.virtusa.hackathon.cis.customerinfoservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.hackathon.cis.customerinfoservice.model.Customer;

@Repository
public interface CustomerInfoRepository extends CrudRepository<Customer, Long> {
	
	List<Customer> findByCustomerId(int customerId);

}
