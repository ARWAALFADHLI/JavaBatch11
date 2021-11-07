package class9;

public class PrintingPatterns {

	public static void main(String[] args) {
		// Print a square that has stars
		
		for(int i=1; i<=5; i++) {
			System.out.print("* ");
			
		}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("* ");
	}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("* ");

}
		System.out.println();
		for(int i=1; i<=5; i++) {
			System.out.print("* ");
		
		}		
		System.out.println();
		
		System.out.println("----------- easy way of doing instead doing multiple codes--------------");
		System.out.println("-----------by using nested loops--------------");
		
		// the row "r" will be out outer loop
		// the column "c" will be the inner loop
		
		for( int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		System.out.println("----------how to print a square 10x10---------");
	
		for( int r=1; r<=10; r++) {
			for(int c=1; c<=10; c++) {
				System.out.print("* ");
			}
			System.out.println();
			
				
		}
		System.out.println("----------Print a square of numbers----------");
		for (int r=1; r<=4; r++) {
			for(int c=1; c<=5; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
			
			}
		
		System.out.println("----Print a square of the same number in a row--------------");
		for (int r=5; r>=1; r--) {
			for(int c=5; c>=1; c--) {
				System.out.print(r+" ");
		}
			System.out.println();
		}
}

}