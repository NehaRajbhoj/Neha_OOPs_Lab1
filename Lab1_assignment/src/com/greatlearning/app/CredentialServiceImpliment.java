package com.greatlearning.app;
import java.util.Random;

public class CredentialServiceImpliment implements CredentialService {
public String generateEmailAddress(String firstname, String lastname, String department) {
		
		return firstname+lastname+"@"+department+".gl.com";
	}

	public String generatePassword() {
		String capital="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String splchar="!@#$%&*";
		
		String combined = capital+small+numbers+splchar;		
		
		String password="";  
		Random random=new Random();
		
		for(int i=0;i<8;i++)
		{
		password=password+String.valueOf(combined.charAt(random.nextInt(combined.length())));	
		}
		
		return password;
	}

	
	public void showCredentials(Employee e1) {
			
			System.out.println("Dear "+e1.getFirstname()+" your generated credentials are as follows");
			System.out.println(" Email    -->  "+ e1.getEmail());
			System.out.println(" Password -->  "+ e1.getPassword());
			
	}

	public String generateEmailAddress(Employee e1, String dept) {
		String mypass=e1.getFirstname().toLowerCase() + e1.getLastname().toLowerCase()+"@"+dept+".abc.com";
		return mypass;
	}

}
