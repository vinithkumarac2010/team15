package com.virtusa.hackathon.chistory.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.hackathon.chistory.model.CRDRHistory;



//@Repository
public interface CustomerHistoryRepository extends CrudRepository<CRDRHistory, Long> {
	
	List<CRDRHistory> findByCustomerId(int customerId);

}
