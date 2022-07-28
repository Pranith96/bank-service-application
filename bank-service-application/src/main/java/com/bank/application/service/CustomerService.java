package com.bank.application.service;

import com.bank.application.dto.CustomerDetailsResponseDto;
import com.bank.application.entity.Customer;

public interface CustomerService {

	Customer saveCustomerDetails(Customer customer);

	CustomerDetailsResponseDto getCustomerDetails(Integer cifNumber);

}
