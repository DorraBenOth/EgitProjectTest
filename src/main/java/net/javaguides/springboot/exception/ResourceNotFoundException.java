package net.javaguides.springboot.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{


	/**
	 * 
	 */
	private static final long serialVersionUID = 5310524671813718793L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
