package Project;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		// 4)Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		
		double[] numbers=new double[5];
		Scanner scan=new Scanner (System.in);
		
		for(int i=0;i<numbers.length;i++) {
			
			System.out.println("Please enter the number");
			
			numbers[i]=scan.nextDouble();
		}
		double sum=0;
		for(double number:numbers) {
			sum+=number;
			
		}
		System.out.println(sum);
		
		

	}

}
