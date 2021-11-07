package class7;

import java.util.Scanner;

public class Class7hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("What would you like to buy?");
		String name=scan.next();
		
		System.out.println("What is the price?");
		int price=scan.nextInt();
		
		System.out.println("Please pay for the item");
		int pay=scan.nextInt();
	
		System.out.println("Here is your change");
		int change=scan.nextInt();
		
		change=pay-price;
		System.out.println("Thank you");
		
		
		
		
		
	}

}
