package com.bridgelabz.userregistrationtesting;

public class UserRegistrationException extends Exception{
	
	enum ExceptionType {
        ENTERED_NULL,
        ENTERED_EMPTY,    
    }
	
    ExceptionType type;
    
    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}