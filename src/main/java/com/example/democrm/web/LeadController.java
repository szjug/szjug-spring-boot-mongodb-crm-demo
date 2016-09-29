package com.example.democrm.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.democrm.domain.Lead;
import com.example.democrm.services.LeadService;

/**
 * 
 * REST controller implementation. 
 * Note that Spring's @RestController does not make Controller really RESTful, it just command to convert into JSON.
 * Conventional RESTful service should have:
 * base URL like /resource for all operation
 * using HTTP verbs POST, GET, PUT, DELETE for CRUD (create, read, update, delete) operations
 * 
 * The same API is to be used for Web and Mobile client side.
 * on client side Response headers should be checked before processing body (unmarshalling from JSON ),
 * that will save time/resources for responces like NOT_FOUND
 * @author Paul
 *
 */
@RestController
@RequestMapping("/leads")
public class LeadController {
	
	@Autowired
	private LeadService service;
	
	@GetMapping
	public ResponseEntity<List<Lead>> list(){ //TODO pagination must be used in real app
		List<Lead> leads = service.findAll();
		if (leads.isEmpty()){
			return new ResponseEntity<List<Lead>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Lead>>(leads, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Lead> post(@RequestBody Lead lead){
		lead.setId(null); // Id must be assigned by db
		service.save(lead);
		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Lead> get(@PathVariable("id") String id){
		Lead lead = service.findOne(id);
		if (lead == null) {
			return new ResponseEntity("No Lead found for Id:" + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Lead> put(@PathVariable("id") String id, @RequestBody Lead lead){
		Lead leadInDb = service.findOne(id);
		if (leadInDb == null){
			return new ResponseEntity<Lead>(HttpStatus.NOT_FOUND);
		}
		lead = service.save(lead);
		return new ResponseEntity<Lead>(lead, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") String id){
		Lead lead = service.findOne(id);
		if (lead == null) {
			return new ResponseEntity<String>("No Lead found for Id:" + id, HttpStatus.NOT_FOUND);
		}
		service.delete(id);
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}

	
}
