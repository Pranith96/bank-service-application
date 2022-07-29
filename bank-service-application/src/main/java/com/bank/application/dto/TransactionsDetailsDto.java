package com.bank.application.dto;

public class TransactionsDetailsDto {

	private Integer toAccountNumber;
	private Integer fromAccountNumber;
	private float amount;

	public Integer getToAccountNumber() {
		return toAccountNumber;
	}

	public void setToAccountNumber(Integer toAccountNumber) {
		this.toAccountNumber = toAccountNumber;
	}

	public Integer getFromAccountNumber() {
		return fromAccountNumber;
	}

	public void setFromAccountNumber(Integer fromAccountNumber) {
		this.fromAccountNumber = fromAccountNumber;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}
