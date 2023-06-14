package com.arthur.msemail.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arthur.msemail.entities.Email;
import com.arthur.msemail.entities.dto.EmailDto;
import com.arthur.msemail.services.EmailService;

import jakarta.validation.Valid;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;
	
	@PostMapping
	public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDto emailDto){
		Email emailModel = new Email();
		BeanUtils.copyProperties(emailDto, emailModel);
		emailService.sendEmail(emailModel);
		return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
	}
	
}
