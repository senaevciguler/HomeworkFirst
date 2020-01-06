import java.util.Scanner;

public class Website {

public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println ("please enter one web link");
	String weblink = input.nextLine();
	
	
	
	System.out.println("domain name is " + weblink.substring(weblink.indexOf('.') + 1, weblink.lastIndexOf('.')));
	
	
	
	

	
	
	}

}