package com.bank.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.application.dto.TransactionsDetailsDto;
import com.bank.application.service.TransactionsService;

@RestController
@RequestMapping("/transaction")
public class TransactionsController {

	@Autowired
	TransactionsService transactionsService;

	@PostMapping("/transfer")
	public ResponseEntity<String> transferAmount(@RequestBody TransactionsDetailsDto transactionsDetailsDto) {
		String response = transactionsService.transferAmount(transactionsDetailsDto);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
