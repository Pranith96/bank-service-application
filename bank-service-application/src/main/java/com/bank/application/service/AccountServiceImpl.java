package com.bank.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.dto.AccountCreationDto;
import com.bank.application.entity.Accounts;
import com.bank.application.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public String createAccount(AccountCreationDto accountCreationDto) {
		Accounts accounts = new Accounts();
		accounts.setAccountStatus("ACTIVE");
		accounts.setAccountType(accountCreationDto.getAccountType());
		accounts.setBalanceAmount(accountCreationDto.getBalanceAmount());
		accounts.setCifNumber(accountCreationDto.getCifNumber());
		Accounts response = accountRepository.save(accounts);
		if (response == null) {
			return "Data is not saved";
		}
		return "Data is saved succesffully";
	}
}
