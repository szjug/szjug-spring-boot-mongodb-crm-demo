package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

/**
 * client contact - person
 * @author Paul
 */
public @lombok.Data class ClientContact {
	@Id private String id;
	private Organization organization; // shard key
	private Client client;
	private String name;
	private String englishName;
	private String mobile;
	private String officePhone;
	private String email;
	private String comments;

}
