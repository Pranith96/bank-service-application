package com.bank.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.entity.Customer;
import com.bank.application.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		Customer customerResponse = customerRepository.save(customer);
		if (customerResponse == null) {
			return null;
		}
		return customerResponse;
	}

}