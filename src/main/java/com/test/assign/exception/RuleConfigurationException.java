package com.test.assign.exception;

/**
 * Exception thrown when password validation fails.
 */
public class RuleConfigurationException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5617230423622530102L;

	public RuleConfigurationException(String message) {
        super(message);
    }
}