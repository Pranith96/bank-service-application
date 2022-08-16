package org.shopping.serviceImpl;

import java.util.List;

import org.shopping.dto.CustomerDto;
import org.shopping.entity.EngineDetails;
import org.shopping.repository.ShoppingRepository;
import org.shopping.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingServiceImpl implements ShoppingService {

	private static final String US_REGION = "US";
	private static final String CANADA_REGION = "CANADA";

	@Autowired
	ShoppingRepository shoppingRepository;

	@Override
	public String createCustomer(CustomerDto customerDto) {
		EngineDetails details = new EngineDetails();
		details.setCustomerName(customerDto.getCustomerName());
		details.setPrice(customerDto.getPrice());
		details.setRegion(ValidateRegion(customerDto.getRegion()));
		EngineDetails alldetails = shoppingRepository.save(details);
		if (alldetails == null) {
			return "Data is not Saved";
		}
		return "Data saved Successfully";
	}

	private String ValidateRegion(String region) {
		if (region == null || region.isEmpty()) {
			throw new RuntimeException("Region Cannot be Null or empty");
		}
		if (!US_REGION.equals(region) || !CANADA_REGION.equals(region)) {
			throw new RuntimeException("Region must be US or CANADA");
		}
		return region;
	}

	@Override
	public List<EngineDetails> findByRegion(String region) {
		List<EngineDetails> details = shoppingRepository.findByRegion(region);
		if (details == null || details.isEmpty()) {
			throw new RuntimeException("Data is Empty");
		}
		return details;
	}

	@Override
	public float findCustomer(Integer customerId) {
		EngineDetails custDetails = shoppingRepository.findById(customerId).get();
		float price = custDetails.getPrice();
		float finalPrice = 0.0f;
		if (custDetails.getRegion().equals(US_REGION)) {
			finalPrice = price * 1;
		} else if (custDetails.getRegion().equals(CANADA_REGION)) {
			finalPrice = price * 1.5f;
		}
		return finalPrice;
	}
}
