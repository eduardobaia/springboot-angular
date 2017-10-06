package com.springboot.angular.apiwebspringboot.ws.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.awt.PageAttributes.MediaType;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.angular.apiwebspringboot.ws.model.Client;

@RestController
public class ClientController {

  private Map<Integer, Client> clients;
	
  Integer proxId=1;
  
  	public Client addClient(Client client){
  		
  		
  		if(clients ==null){
  			clients = new HashMap<>();
  		}
  		clients.put(client.getId(), client);
  		
  		
  		return client;
  	}
	
	@RequestMapping(method=RequestMethod.GET, value="/clients", consumes = MediaType.APPLICATION_JASON_VALUE)
	public void search(){
		System.out.println("HII!");
	}
	
}
