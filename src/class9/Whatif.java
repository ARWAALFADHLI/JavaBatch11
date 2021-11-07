package class9;

public class Whatif {

	public static void main(String[] args) {
	
		for (int i=1; i<3; i++) {
			for (int j=0; j<=2; j++) {
				System.out.println("Hello");
				break; // the BREAK goes with the "hello" block of code only
				
			}
			System.out.println("Good Morning");
			
			}

		System.out.println("******************************");
		
		boolean morning=true;
		for (int i=1; i<=3; i++);
		System.out.println(" I am inside the loop");
		
		while (morning) {
			System.out.println("Good Morning");
			break; // without this BREAK, it will print "Good Morning" infinit times
			}
		
		System.out.println("********************************");
		
		for (int i=1; i<3; i++) {
			for(int j=1; j<=2; j++) {
				if (j==1) {
					continue; // "CONTINUE" will skip in the inner loop
				}
				System.out.println("Hello");
			}
			System.out.println("Good Morning");
			
				}
			}
		

	}


