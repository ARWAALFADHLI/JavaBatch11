package class7;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// i want to ask a user their name and age 5 times
		//increment 
		
		Scanner scan=new Scanner(System.in);
		
		int i=10;
		while (i<=15) {
		
		
		System.out.println("Please enter your name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		System.out.println("Your name is " + name + " and your age " + age+ " years old");
		i++;
		
	}
	}
}
