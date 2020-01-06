/*- Write a Java program that asks user to enter a password, and print whether the password is valid or not.
Assume that for a password to be valid, it has to meet the following criteria:
1. The minimum length is 6
2. The maximum length is 25
3. The password must start with $
4. The password must end with @
If you read more about methods in String class, you can improve this password validation by adding more rules. Just imagine one of the websites you have registered, and what their password rules are, and try to write a code to do something similar.
*/

import java.util.Scanner;

public class Password {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("please enter your password" + "\n" +
		"password should be:" + "\n" +  "minimum length is 6" + "\n" + 
		"maximum length is 25" + "\n" + "must start with $" + "\n" + "must end with @");

		String password = input.nextLine();
		
		boolean start = password.startsWith("$");
		boolean end = password.endsWith("@");

		if(password.length() >= 6 && password.length() <= 25 
			&& start && end) 	{
				
				System.out.println("password is valid");
				
		}else { 
		   System.out.println("please check your password!" 
			+ "\n" + "password should be:" + "\n" +  "minimum length is 6" + "\n" + 
		"maximum length is 25" + "\n" + "must start with $" + "\n" + "must end with @");
		}	
	}

}