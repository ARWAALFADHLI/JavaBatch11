package SscannerReviewOfYT;

import java.util.Scanner; //THIS IS NEEDED WHEN DOING A SCANNER

public class Scanner101 {

	public static void main(String[] args) {

		//SCANNER IS A USER INPUT, FOR EXAMPLE A USER KEY IN THEIR USERNAME OR PASSWORD ON FACEBOOK
		
		Scanner scan= new Scanner(System.in); //DECLAREING AN OBJECT
		
		System.out.println("What is your first name?");
		String name = scan.next(); // THIS WILL ABLE THE USER TO ENTER THEIR NAME IN THE "SYSTEM"
		                           // THE "String name" VARABLE WILL SAVE OR STORE THE NAME INTO THE SYSTEM
	
		
		System.out.println("What is you age?");
		int age = scan.nextInt(); //SCANNER CAN ALSO MAKE THE USER ENTER NUMBER
		
		
		System.out.println("What is your senior quote?");
		String quote = scan.next();
		quote += scan.nextLine(); //THIS WELL HELP SHOW THE WHOLE QUOTE 
		
		
		System.out.println("Thank you "+ name + "," +" You are "+ age +" years old");
		System.out.println("and your senior quote is "+ quote);
		
		
		
		

	}

}
