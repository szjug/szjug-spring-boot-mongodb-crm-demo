package com.example.democrm.usersession;

import com.example.democrm.domain.Manager;
import com.example.democrm.domain.Organization;

/**
 * TODO not finished
 * @author Paul
 */
public @lombok.Data class UserSession {
	public static final String ORGANIZATION = "organization";
	public static final String USER = "user";
	
	private Organization organization;
	private Manager user;
}
