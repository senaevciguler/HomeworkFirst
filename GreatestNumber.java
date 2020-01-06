import java.util.Scanner;

public class GreatestNumber {

public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println ("enter first number");
	int firstnumber = sc.nextInt();
	
	System.out.println ("enter second number");
	int secondnumber = sc.nextInt();
	
	if (firstnumber > secondnumber) {

		System.out.println (firstnumber + " greatest than " + secondnumber);

		}
		
	else {
		
		System.out.println (secondnumber + " greatest than " + firstnumber);
		
		}	
	
	
	}

}