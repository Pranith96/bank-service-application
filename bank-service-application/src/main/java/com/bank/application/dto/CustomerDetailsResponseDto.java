package com.bank.application.dto;

import java.util.List;

import com.bank.application.entity.Accounts;
import com.bank.application.entity.Customer;

public class CustomerDetailsResponseDto {
	private Customer customer;
	private List<Accounts> account;
	private String responseMessage;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Accounts> getAccount() {
		return account;
	}

	public void setAccount(List<Accounts> account) {
		this.account = account;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

}
