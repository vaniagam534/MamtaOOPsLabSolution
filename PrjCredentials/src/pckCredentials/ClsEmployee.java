package pckCredentials;

import java.util.Scanner;
import java.util.*;

public class ClsEmployee {

	String firstName,lastName,emailID,passWord ,companyName,departmentName;

	ClsEmployee()
	{
	}

	//Parameterized Constructor
	
	ClsEmployee(String firstName,String lastName,String companyName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.companyName=companyName;
		this.departmentName=departmentName();

	}

	//Generate Email ID
	public String generateEmail(String firstName,String lastName,String companyName,String departmentName) {

		String	emailID;

		emailID=firstName+lastName+"@" +companyName+departmentName+".com" ;

		return emailID;

	}

	//Get  departmentName
	public String departmentName() {

		int departmentNo;
		String deptName=" ";
		System.out.println("Please enter department from the following: -");

		System.out.println("1.   Technical");
		System.out.println("2.   Admin");
		System.out.println("3.   Human Resource");
		System.out.println("4.   Legal");
		Scanner sc=new Scanner(System.in);
		departmentNo=sc.nextInt();
		switch (departmentNo) {
		case 1: 

			//			System.out.println("your department is Technical");
			deptName="Technical";
			break;

		case 2: 

			//			System.out.println("your department is Admin");
			deptName="Admin";
			break;

		case 3: 

			//			System.out.println("your department is Human Resource");
			deptName="Human Resource";
			break;


		case 4: 

			//			System.out.println("your department is Legal");
			deptName="Legal";
			break;

		}

		return deptName;


	}


	//generate random password 

	public static char[] generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for(int i = 4; i< length ; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}




	//Display generated Credentials 

	public void showCredentials() {

char[] password=generatePassword(6);
		System.out.println("Dear " +firstName+" your Credentials are as follows " );
		System.out.println("Email     ----->"  +generateEmail(firstName, lastName, companyName, departmentName));
		System.out.println("Password  ----->" +password);


	}
}











