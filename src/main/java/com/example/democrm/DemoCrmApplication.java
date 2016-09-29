package com.example.democrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.democrm.domain.Client;
import com.example.democrm.domain.Lead;
import com.example.democrm.domain.LeadStatus;
import com.example.democrm.domain.Manager;
import com.example.democrm.domain.Organization;
import com.example.democrm.repositories.ClientRepository;
import com.example.democrm.repositories.LeadRepository;
import com.example.democrm.repositories.ManagerRepository;
import com.example.democrm.repositories.OrganizationRepository;

@SpringBootApplication
public class DemoCrmApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(DemoCrmApplication.class, args);
	}

	// data for quick testing 
	// FIXME created on every start {
	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private LeadRepository leadRepository;
	@Autowired
	private ManagerRepository managerRepository;
	@Autowired
	private OrganizationRepository organizationRepository;

	@Override
	public void run(String... args) throws Exception {
		Organization organization = new Organization();
		organization.setName("Our company");
		organizationRepository.save(organization);
		System.out.println(organization);
		
		Manager manager = new Manager();
		manager.setOrganization(organization);
		manager.setUsername("user");
		manager.setFullname("Test User");
		managerRepository.save(manager);
		System.out.println(manager);
		
		Client client = new Client();
		client.setOrganization(organization);
		client.setName("Potentional client");
		clientRepository.save(client);
		System.out.println(client);
		
		Lead lead = new Lead();
		lead.setOrganization(organization);
		lead.setClient(client);
		lead.setStatus(LeadStatus.INTRODUCTION);
		lead.setComments("test");
		leadRepository.save(lead);
		System.out.println(lead);
	}
	//}
}
