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
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("Akash");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenFirstName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("lenovo");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenContainSpecialCharacter_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("len@ovo");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenFirstName_WhenContainSpecialNumber_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("len1ovo");
		Assert.assertFalse(result);
	}
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("a");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("Singh");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenLastName_WhenUpperCaseMissing_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("dell");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();	
		boolean result = validator.validatetName("sa");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("91 9067878967");
		Assert.assertTrue(result);	
	}
	
	@Test
	public void givenPhoneNumber_WhenInValid_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("1245678588");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenContainSpecialCharacter_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("12456@78588");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPhoneNumber_WhenShort_ShouldReturnFalse() {
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validatePhoneNumber("91 123456789");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("chris@yahoo.com");
		Assert.assertTrue(result);	
	}
	
	@Test
	public void givenEmail_WhenInValid_ShouldReturnFalse() {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("chris..@yahoo.com");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenEmail_WhenStartWithSpecialCharacter_ShouldReturnFalse() {	
		UserRegistration validator = new UserRegistration();
		boolean result=validator.validateEmail("@chris@yahoo.com");
		Assert.assertFalse(result);
	}
	
	
	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {	
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Abcd@123");
		Assert.assertTrue(result);
	}
	
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Abcd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("abcd");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoLowerCase_ShouldReturnFalse(){
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("AAAAAAAA");
		Assert.assertFalse(result);
	}
	
	@Test
	public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Ababa123");
		Assert.assertFalse(result);
	}
	
	
}
