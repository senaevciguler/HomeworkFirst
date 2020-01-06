import java.util.Scanner;
public class DayOfWeek {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter numbers from 1 to 7");
		int number = sc.nextInt();
		
		switch(number) {
			
			case 1:
			System.out.println ("day is Monday, that is first day of week");
			break; 
			
			case 2:
			System.out.println ("day is Tuesday");
			break;
			
			case 3: 
			System.out.println ("day is Wednesday");
			break;
			
			case 4:
			System.out.println ("day is Thursday");
			break;
			
			case 5:
			System.out.println ("day is Friday");
			break;
			
			case 6:
			System.out.println ("day is Saturday");
			break;
			
			case 7:
			System.out.println ("day is Sunday, that is end of week");
			break;
			
			
		}	
		
		
	}

}