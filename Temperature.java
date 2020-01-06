//T(°F) = T(°C) × 9/5 + 32

import java.util.Scanner;

public class Temperature {

	public static void main (String[] args) {
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println ("please enter current temperature in celsius");
	double celsius = sc.nextDouble();
	
	double fahrenheit = (double) ( celsius * (9/5) + 32 );
	
	System.out.println ("current temperature in fahrenheit is " + fahrenheit);
	
	}

}