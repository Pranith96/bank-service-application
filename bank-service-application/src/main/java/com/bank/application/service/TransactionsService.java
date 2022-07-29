package com.bank.application.service;

import com.bank.application.dto.TransactionsDetailsDto;

public interface TransactionsService {

	String transferAmount(TransactionsDetailsDto transactionsDetailsDto);

}
