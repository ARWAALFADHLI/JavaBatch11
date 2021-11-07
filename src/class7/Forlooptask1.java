package class7;

public class Forlooptask1 {

	public static void main(String[] args) {
		
		System.out.println("----- PRINT NUMBER FROM 1 TO 100 LINR WITH SPCAE-------");
		
		for (int a=1; a<=100; a++) {
			System.out.print(a+ " ");
		}
		System.out.println();
		
		
		System.out.println("---------- PRINT NUMBER FROM 100 TO 1 ---------");
		for (int b=100; b>=1 ; b--) {
			System.out.print(b+ " ");
		}
		System.out.println();
	
		
		System.out.println("---- PRINT EVEN NUMBER FROM 20 TO 1 *PART 1* ------------------");
		for (int c=20; c>=1; c--) {
			if (c%2==0) {
			System.out.print(c + " ");
			}
			}
			System.out.println();
			System.out.println("----------PRINT EVEN NUMBER FROM 20 TO 1 *PART 2*-------");
			for(int d=20; d>=1; d-=2) {
				System.out.print(d+" ");
			}
			System.out.println();
		
			
			System.out.println("------PRINT ODD NUMBERS FROM 20 TO 50 *PART 1*------------");
			for( int e=21 ; e<=49; e++) {
				if(e%2==1) {
					System.out.print(e +" ");
				}
			
				System.out.println();
		
				
				System.out.println("--------PRINT ODD NUMBER FROM 20 TO 50 *PART 2*--------");
				for(int f=21; f<=49; f+=2) {
					System.out.print(f+" ");
				}
			}
			
	}
}
		

	


