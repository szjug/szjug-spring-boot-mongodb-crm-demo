package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

/**
 * Company employees, involved in actual sales, i.e. CRM users 
 * @author Paul
 *
 */
public @lombok.Data class Manager {
	@Id private String id;	
	private Organization organization; // shard key
	private String username;
	private String fullname;

}
