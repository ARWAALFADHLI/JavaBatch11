package class8;

public class BreakAndContinueKeywords {

	public static void main(String[] args) {
	 /*Continue Keyword
	  * 
	  * 
	  */

		
		for(int i=1 ; i<=5 ; i++) {
			
			if (i==3) { 
				continue;
				
			}
			System.out.println("Hi "+ i);
			System.out.println("Hello "+ i);
			
		}
		System.out.println("*******************************************************");
		
		 // i want to print from 1 to 10 except 3 and 7 and 9
		for (int i=1;i<=10;i++) {
			if(i==3 || i==7 || i==9) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println("end of code");
		
			
	
	System.out.println("***************************************");
	
	//break: break the loop
	//continue: skips current iteration/cycle and goes back to the beginning of the loop
	// both break and continue can be used inside any loop and usually placed inside the conditional statement
	
	
			
		
	}

}
