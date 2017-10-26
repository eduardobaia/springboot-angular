package com.springboot.angular.apiwebspringboot.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.angular.apiwebspringboot.ws.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
