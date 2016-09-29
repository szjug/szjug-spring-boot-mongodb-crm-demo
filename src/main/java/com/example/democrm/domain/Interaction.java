package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

public @lombok.Data class Interaction {
	@Id private String id;	
	private Organization organization; // shard key
	private Client client;
	private ClientContact clientContact;
	private Lead lead;
	private Manager person;
	private Channel channel;
	private LeadStatus leadStatus;
	private String result;
	private String comments;

	
	
}
