package Project;

import java.util.Scanner;

public class Task4Project {

	public static void main(String[] args) {
		//Create an array on double values using scanner and calculate the sum of all stored elements in that array.
		Scanner scan=new Scanner (System.in);
		System.out.println("How many Double Value you have?");
		 
		double nums=scan.nextDouble();
	
		double[] numbers=new double[(int) nums];
		
		for(double i=0; i<numbers.length;i++) {
		
			System.out.println("Please give me the double vaule numbers");
			
			numbers[(int) i]=scan.nextDouble();
			
		}
		double sum=0;
		
			sum+=nums;
			System.out.println("sum "+sum);
			
			
			
				
			}
		
		
			
	
		
		}

