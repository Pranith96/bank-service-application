package com.bank.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.application.dto.AccountCreationDto;
import com.bank.application.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	//@Qualifier("service1")
	@Autowired
	AccountService accountService;

	@PostMapping("/create")
	public ResponseEntity<String> createAccount(@RequestBody AccountCreationDto accountCreationDto) {
		String response = accountService.createAccount(accountCreationDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
