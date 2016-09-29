package com.example.democrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.democrm.domain.Lead;
import com.example.democrm.repositories.LeadRepository;

/**
 * 
 * TODO [multi tenancy] filtering and security checks based on current session
 * @author Paul
 *
 */
@Service
public class LeadService {
	
	@Autowired
	private LeadRepository repository;

	public Lead save(Lead lead) {
		return repository.save(lead);
	}

	public List<Lead> findAll() {
		return repository.findAll();
	}

	public Lead findOne(String id) {
		return repository.findOne(id);
	}

	public void delete(String id) {
		repository.delete(id);		
	}


}
