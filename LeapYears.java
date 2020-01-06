import java.util.Scanner;


public class LeapYears {

public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("please enter one year");
	int year = sc.nextInt();
	
	if((year % 4 == 0 && year % 100 != 0) || ( year % 400 == 0)) {
		
		System.out.println ("yes this year is leap");
		
		}	else {
			
			System.out.println ("no this year is not leap");
			
			}


	}

}