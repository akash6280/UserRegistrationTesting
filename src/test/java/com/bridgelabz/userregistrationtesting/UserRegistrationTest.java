package com.bridgelabz.userregistrationtesting;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("Akash");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenUpperCaseMissing_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("lenovo");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenContainSpecialCharacter_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("len@ovo");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenContainSpecialNumber_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("len1ovo");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("a");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("Singh");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenUpperCaseMissing_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("dell");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("sa");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("91 9067878967");
		Assert.assertTrue(result);	
	}
	
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("1245678588");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenContainSpecialCharacter_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("12456@78588");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("91 123456789");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("chris@yahoo.com");
		Assert.assertTrue(result);	
	}
	
	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("chris..@yahoo.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenStartWithSpecialCharacter_ShouldReturnFalse() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("@chris@yahoo.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenStartWithNumber_ShouldReturnFalse() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("1chris@yahoo.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() throws UserRegistrationException {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePassword("Abcd@123");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() throws UserRegistrationException {
			
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePassword("Abcd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() throws UserRegistrationException {
			
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePassword("abcd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoLowerCase_ShouldReturnFalse() throws UserRegistrationException{
			
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePassword("AAAAAAAA");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() throws UserRegistrationException {
			
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePassword("Ababa123");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenNull_ShouldThrowException() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		try {
			validator.validatetName(null);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowException() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		try {
			validator.validatetName("");
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_EMPTY, e.type);
		}
	}
	
	@Test
	public void givenLasttName_WhenNull_ShouldThrowException() throws UserRegistrationException {
		UserRegistration validator = new UserRegistration();	
		try {
			validator.validatetName(null);
		}
		catch(UserRegistrationException e) {
			Assert.assertEquals(UserRegistrationException.ExceptionType.ENTERED_NULL, e.type);
		}
	}
	
	
}
