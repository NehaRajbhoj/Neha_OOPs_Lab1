package com.greatlearning.app;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Name");
		String fname=sc.next();
		
		System.out.println("Enter Last Name");
		String lname=sc.next();
		
		Employee e1=new Employee(fname,lname);
		
		Employee e2=new Employee();
		
		e2.setFirstname(fname);
		e2.setLastname(lname);
		
		CredentialServiceImpliment serviceimplement=new CredentialServiceImpliment();
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int choice=sc.nextInt();
		String generatEmial="";
		String generatPassword="";
		
		switch(choice)
		{
		case 1:
			generatEmial=serviceimplement.generateEmailAddress(e1, "tech");
			break;
		case 2:
			generatEmial=serviceimplement.generateEmailAddress(e1, "admin");
			break;
		case 3:
			generatEmial=serviceimplement.generateEmailAddress(e1, "hr");
			break;
		case 4:
			generatEmial=serviceimplement.generateEmailAddress(e1, "legal");
			break;
		default:
			 System.out.println("Please enter valid choice");
			
		}
		generatPassword=serviceimplement.generatePassword();
		e1.setEmail(generatEmial);
		e1.setPassword(generatPassword);
		
		serviceimplement.showCredentials(e1);
		
		sc.close();
	}
	
	

}
