import java.util.Scanner;

public class ScoresCalculate {

public static void main (String [] args) {
	
	double sum = 0; 
	double number = 0; 
	double avg = 0;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter ten numbers");
	

		for (int i=0; i < 10; i++){

			number = sc.nextDouble();
			sum = sum + number;
			avg = sum / 10;

		}

		System.out.println("your total score is " + sum + " your avarage is " + avg);
	
	
	
	}
}