package emailapp;

import java.util.Scanner;

public class Email 
{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 24;
	private String alternateEmail;
	private String companySuffix = "tutorial.com";
	/*
	 * constructor to recieve the first and last name
	 * 
	 * ask for the department
	 * 
	 * generate a random password
	 * 
	 * set the mailbox capacity 
	 * 
	 * set the alternate email
	 * 
	 * change the password
	 */
	
	
	public Email(String firstName, String lastName) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = setdepartment();
		this.password = randomPassword(defaultPasswordLength);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
		System.out.println("Your password is: " + this.password);
	}
	
	private String setdepartment() 
	{
		System.out.println("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code: ");
		
		Scanner in = new Scanner(System.in);
		
		int depChoice = in.nextInt();
		
		if(depChoice == 1) 
		{
			return "sales";
		}else if(depChoice == 2) 
		{
			return "dev";
		} else if(depChoice == 3) 
		{
			return "acct";
		}else 
		{
			return "";
		}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	private void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password; 
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
