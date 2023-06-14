package com.arthur.msemail.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.msemail.entities.Email;
import com.arthur.msemail.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailrepository;
	
	
	public void sendEmail(Email emailModel) {
		
	} 
}
