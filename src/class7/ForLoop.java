package class7;

public class ForLoop {

	public static void main(String[] args) {
		// we use FOR LOOP:
		/*we use it how many time we want to use the block of code
		 * 
		 * 
		 * example:
		 * say hi 5 times 
		 * for (int a=1 ; a<=5; a++) {
		 * System.out.println("hi");
		 * }
		 * 
		 * 
		 * we use while when we dont know how many times we have to repeat a block of code
		 * 
		 */

		
		for (int a=1; a<=5; a++) {
			System.out.println("Hello");
		}
		System.out.println("----------- PRINT NUMBER FROM 1 TO 20 ----------");
		
		for (int b=1; b<=20; b++) {
			System.out.print(b + "  ");
		}
		System.out.println();
		
		System.out.println("------------ PRINT NUMBER FROM 100 TO 20 --------------");
		
		for (int c=100; c>=20; c--) {
			System.out.print(c + "  ");
			
		}
		System.out.println();
		System.out.println("------- PRINT EVEN NUMBER FROM 1 TO 50----------");
		
		for(int d=1; d<=50 ; d++) {
			if (d%2==0) {
				System.out.print(d+"  ");
			}
		}
			System.out.println();
			System.out.println("------PRINT EVEN NUMBER FROM 1 TO 50--------");
			
			for(int e=2; e<=50; e+=2) {
				System.out.print(e+"  ");

				
			}
			}
		
	}


