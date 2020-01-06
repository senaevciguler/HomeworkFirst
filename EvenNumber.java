import java.util.Scanner;
public class EvenNumber {

	public static void main (String [] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("please enter your number");
		int number = sc.nextInt();
		
		if ( number % 2 == 0) {
			
			System.out.println ("that number is even");
			
			}
		else {
			
			System.out.println ("that number is odd");
			
			}
	
		}
}	