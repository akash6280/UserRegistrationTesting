package com.bridgelabz.userregistrationtesting;
import org.junit.Test;
import static  org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	 String email;
	 boolean expectedOutput;

	public UserRegistrationTest(String email, boolean expectedOutput) {
		this.email = email;
		this.expectedOutput = expectedOutput;
	}
	
	
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
	public void givenPassword_WhenValid_ShouldReturnTrue() 
	{
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Abcd@123");
		Assert.assertTrue(result);
	}
	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() 
	{
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Abcd");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() 
	{
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("abcd");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPassword_WhenNoLowerCase_ShouldReturnFalse() 
	{
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("AAAAAAAA");
		Assert.assertFalse(result);
	}
	@Test
	public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() 
	{
			
		UserRegistration Validator = new UserRegistration();
		boolean result=UserRegistration.validatePassword("Ababa123");
		Assert.assertFalse(result);
	}
	@Test
	public void givenEmailAsVariable_ShouldReturnAsPerTheParameteriszedResult() 
	{
		UserRegistration Validator = new UserRegistration();
		boolean result=Validator.validateEmail(email);
		Assert.assertEquals(result,expectedOutput);
	}
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com",true }, { "abc-100@yahoo.com",true }, { "abc.100@yahoo.com",true },
					{ "abc111@abc.com",true }, { "abc-100@abc.net",true }, { "abc.100@abc.com.au",true }, { "abc@1.com",true },
					{ "abc@gmail.com.com",true }, { "abc+100@gmail.com",true }, { "abc",false }, { "abc@.com.my",false }, { "abc123@gmail.a",false },
					{ "abc123@.com",false }, { "abc123@.com.com",false }, { ".abc@abc.com",false }, { "abc()*@gmail.com",false }, { "abc@%*.com",false },
					{ "abc..2002@gmail.com",false }, { "abc.@gmail.com",false }, { "abcabc@gmail.com",true }, { "abc@gmail.com.1a",false },
					{ "abc@gmail.com.aa.au",false } });
		}

}
