package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

/**
 * Potential sale
 * @author Paul
 *
 */
public @lombok.Data class Lead {
	@Id private String id;	
	private Organization organization; // shard key
	private Client client;
	private Product product; //@Nullable
	private Manager manager; //@Nullable
	
	private LeadStatus status;
	private String comments;

}
