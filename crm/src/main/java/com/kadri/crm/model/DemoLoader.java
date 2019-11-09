package com.kadri.crm.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
/ Contains test data to act as DB.
/ Input: connection between model and DB.
*/

@Component
public class DemoLoader implements CommandLineRunner{
    private final ContactRepository repository;

    @Autowired
    public DemoLoader(ContactRepository repository){
        this.repository = repository;
    }

    @Override 
    public void run (String ...strings) throws Exception {
        this.repository.save(new Contact("Joe", "Wags", "Joe@Wags.com"));
    }

}