package com.bank.application.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.bank.application.dto.CustomerDetailsResponseDto;
import com.bank.application.entity.Accounts;
import com.bank.application.entity.Customer;
import com.bank.application.exceptions.BusinessException;
import com.bank.application.repository.AccountRepository;
import com.bank.application.repository.CustomerRepository;

@Service
@Profile(value = {"dev","local","qa","prod"})
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		Customer customerResponse = customerRepository.save(customer);
		if (customerResponse == null) {
			return null;
		}
		return customerResponse;
	}

	@Override
	public CustomerDetailsResponseDto getCustomerDetails(Integer cifNumber) {
		Optional<Customer> customerResponse = customerRepository.findById(cifNumber);
		if (!customerResponse.isPresent()) {
			throw new BusinessException("cif number Invalid");
		}
		List<Accounts> accountResponse = accountRepository.findByCifNumber(cifNumber);
		CustomerDetailsResponseDto customerDetailsResponseDto = new CustomerDetailsResponseDto();
		customerDetailsResponseDto.setCustomer(customerResponse.get());
		customerDetailsResponseDto.setAccount(accountResponse);
		customerDetailsResponseDto.setResponseMessage("SUCCESS");
		return customerDetailsResponseDto;
	}

}
