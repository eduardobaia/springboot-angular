package com.springboot.angular.apiwebspringboot.ws.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.angular.apiwebspringboot.ws.model.Client;
import com.springboot.angular.apiwebspringboot.ws.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	
	public Client add(Client client){
		return	clientRepository.save(client);
	}
	
	public Collection<Client> searchAll(){
		return clientRepository.findAll();
		
	}
	
	public Client update(Client client){
		return	clientRepository.save(client);
	}
	
	public void remove(Client client){
		 clientRepository.delete(client);
	}
	
	
	public Client seachById(Integer id){
		return clientRepository.findOne(id);
	}
	
}
