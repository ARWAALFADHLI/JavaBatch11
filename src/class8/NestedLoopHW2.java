package class8;

import java.util.Scanner;

public class NestedLoopHW2 {

	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point), provided by a user and then from that range prints the sum of the even and odd integers.

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the start and end point resoectively");
		
		int start=scan.nextInt();
		int end= scan.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		
		for(int i= start; i<=end; i++) {
			if(i%2==0) {
				sumEven +=i;
			}else { 
				sumOdd +=i;
			}
			System.out.println("Sum of thr even number in rage from" +start+"to"+end+"is"+ sumEven); //continue later
			
		}
		
	}

}
