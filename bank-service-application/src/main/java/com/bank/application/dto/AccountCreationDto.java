package com.bank.application.dto;

import com.bank.application.entity.AccountType;

public class AccountCreationDto {

	private float balanceAmount;
	private AccountType accountType;
	private Integer cifNumber;

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Integer getCifNumber() {
		return cifNumber;
	}

	public void setCifNumber(Integer cifNumber) {
		this.cifNumber = cifNumber;
	}

}
