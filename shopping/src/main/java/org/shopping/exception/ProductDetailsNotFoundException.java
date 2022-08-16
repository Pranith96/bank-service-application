package org.shopping.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Data is not present", value = HttpStatus.NOT_FOUND)
public class ProductDetailsNotFoundException extends RuntimeException {

	public ProductDetailsNotFoundException(String message) {
		super(message);
	}
}
