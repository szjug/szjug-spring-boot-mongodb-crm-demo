package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

public @lombok.Data class Organization {
	@Id private String id;	
	private String name;
	private String domain; //e.g. for address like organization.onlinecrm.com

}
