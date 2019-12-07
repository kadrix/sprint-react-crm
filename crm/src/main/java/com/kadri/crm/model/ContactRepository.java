package com.kadri.crm.model;

import org.springframework.data.repository.CrudRepository;

/*
/ This interface acts as the connection between the model and the DB.
/ Input: Contact and Id 
*/
public interface ContactRepository extends CrudRepository<Contact, Long>{

}