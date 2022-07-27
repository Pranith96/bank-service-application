package com.bank.application.dto;

import com.bank.application.entity.Customer;

public class CustomerResponse {

	private String responseMessage;
	private String statusCode;
	private Customer customerResponse;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Customer getCustomerResponse() {
		return customerResponse;
	}

	public void setCustomerResponse(Customer customerResponse) {
		this.customerResponse = customerResponse;
	}

}
