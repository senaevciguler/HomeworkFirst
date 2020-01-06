
import java.util.Scanner;


public class CreditCard {

public static void main (String [] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("please enter your credit card number");
	String creditnumber = input.nextLine();

	String replc = creditnumber.replace(creditnumber.substring(6, (creditnumber.length()-4)) , "******");
	System.out.println (replc);
	
	

}

}