package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

/**
 * Our products (products, solutions, services)
 * @author Paul
 */
public @lombok.Data class Product {
	@Id private String id;	
	private Organization organization; // shard key
	private String name;
	private String description;

}
