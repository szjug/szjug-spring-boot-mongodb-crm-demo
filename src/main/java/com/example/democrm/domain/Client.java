package com.example.democrm.domain;

import org.springframework.data.annotation.Id;

public @lombok.Data 
class Client {
	@Id private String id;
	private Organization organization; // shard key
	private String name;
	private String fullName;
	private ClientContact ceo;
	private ClientContact cto;
	private ClientContact preferredContact;
	private String city;
	private String address;
	private String website;
	private String comments;
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", organization=" + organization + ", name=" + name + ", fullName=" + fullName
				+ ", ceo=" + ceo + ", cto=" + cto + ", preferredContact=" + preferredContact + ", city=" + city
				+ ", address=" + address + ", website=" + website + ", comments=" + comments + "]";
	}

	
	
}
