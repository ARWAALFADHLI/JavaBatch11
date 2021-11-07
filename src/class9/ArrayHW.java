package class9;

public class ArrayHW {

	public static void main(String[] args) {
		//Create an array to store double vaules and the print those in reverse order
		
		double[] number= {10.55,07.99,11.88,22.66};
		System.out.println(number.length);
		
		// from first to last element
		for(int i=0; i <number.length; i++) {
			System.out.println(number[i]);
			
			
		}
		System.out.println("*************************");
		// from last to first element
		for(int i=number.length-1; i >=0; i--) {
			System.out.println(number[i]);
			
			//we can not use enhance for loop to travel back in an array
			//for each loops always 1 direction: start to end
			
		}
		}

}
