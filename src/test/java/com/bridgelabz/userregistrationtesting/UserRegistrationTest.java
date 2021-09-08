package com.bridgelabz.userregistrationtesting;
import org.junit.Test;

import com.bridgelabz.userregistrationtesting.UserRegistration;

import org.junit.Assert;


public class UserRegistrationTest {
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();	
		boolean result = UserRegistration.validatetName("Akash");
		Assert.assertTrue(result);
	}
		
}
