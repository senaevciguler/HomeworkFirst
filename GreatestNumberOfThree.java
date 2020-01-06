import java.util.Scanner;

public class GreatestNumberOfThree {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println ("enter first number");
		int firstnumber = sc.nextInt();

		System.out.println ("enter second number");
		int secondnumber = sc.nextInt();

		System.out.println (" enter third number") ;
		int thirdnumber = sc.nextInt();

		if (firstnumber >= secondnumber && firstnumber >= thirdnumber) {
			System.out.println (firstnumber + " greatest ");
		} else if (secondnumber >= firstnumber && secondnumber >= thirdnumber) {	
			System.out.println (secondnumber + " greatest " );
		} else {
			System.out.println(thirdnumber + "greatest");
		}	
	}
}
