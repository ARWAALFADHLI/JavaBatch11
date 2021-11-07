package Project;

public class Project7 {

	public static void main(String[] args) {
		// 7)Write a java program to check whether a given number is prime or not?
		
		
		/*all negative number are not prime
		 * number 0 and 1 are also not prime
		 * if a positive number is not divisible by  any other than it is prime
		 */
		int number=11;
		boolean isPrime=true;
		if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
				 isPrime=false;
				
					break;
				
					
				}
			}
		}else {
			isPrime= false;
			
		}
		if(isPrime) {
			System.out.println(number+ " is prime");
		}else {
			System.out.println(number+ " is not prime");
		}

	}

}
