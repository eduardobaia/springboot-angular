package com.springboot.angular.apiwebspringboot.ws.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.angular.apiwebspringboot.ws.model.Client;
import com.springboot.angular.apiwebspringboot.ws.service.ClientService;

@RestController
public class ClientController {

	
	@Autowired
	ClientService clientService;
	
  private Map<Integer, Client> clients;
	
  Integer proxId=1;
  
  	public Client addClient(Client client){
  		
  		
  		if(clients ==null){
  			clients = new HashMap<>();
  		}
  		clients.put(client.getId(), client);
  		
  		
  		return client;
  	}
	
	@RequestMapping(method=RequestMethod.GET, value="/clients", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void search(){
		System.out.println("HII!");
	}
	
}
