package com.greatlearning.app;

public interface CredentialService {
	String generateEmailAddress(String firstname, String lastname,String department);
	String generatePassword();
	void showCredentials(Employee e1);

}
