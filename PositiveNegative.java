import java.util.Scanner;

public class PositiveNegative{

public static void main(String[] args) {

    /*Scanner input = new Scanner(System.in);

	System.out.println("enter one number");
	String number = input.nextLine();

	char ch = number.charAt(0);


	if(ch == '-'){

		System.out.println(" number is negative");
		
       } else {

		System.out.println("number is positive");

		}*/

		Scanner sc = new Scanner(System.in);

			System.out.println("enter one number");
			double number = sc.nextDouble();

			if(number < 0) {

            System.out.println ("number is negative");			

			} else if (number > 0) {

			System.out.println ("number is positive");	
				
				} else if (number == 0 ) {

			System.out.println ("number is zero");

				} else {

			System.out.println ("you have entered incorrectly");

				}

	}


}