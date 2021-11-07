package class7;

public class Class7HW {

	public static void main(String[] args) {
	
		
		System.out.println("Odd numbers from 0 to 100");
		int odd=0;
		for (int o=1; o<100; o+=2) {
		
		
		System.out.print(o+" ");
		odd=odd+o;
		}
		System.out.println("");
		System.out.println("The sum of Odd Numbers is " + odd);
		
		System.out.println("*****************************************************************************************************************************************************");
		
	    System.out.println("Even numbers from 0 to 100");
	    
	    int even=0;
	    for(int e=0; e<=100; e+=2) {
	    System.out.print(e+" ");	
	    even=even+e;
	    }
	    System.out.println("");
	    System.out.println("The Sum of Even Number is " + even);
	    
	    }						

	}



