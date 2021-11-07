package class9;

import java.util.Scanner;

public class ArrayAndScanner {

	public static void main(String[] args) {
		
		// I WANT TO CREATE AN ARRAY AND STORE ELEMENTS USING SCANNER
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter how many elements you want to store inside arrays of cars");
		
		int size=scan.nextInt();
		
		String[] cars=new String[size];
		
		for(int i=0; i< cars.length; i++) {  //it can also be for(int i=0; i<size; i++)
		
		System.out.println("Please enter your cars");
		
		cars[i]=scan.next();
		}
		
		//retrieve all stored elements
		for(String car:cars) {
			System.out.print(car+" ");
			
		
		}
		

	}

}
