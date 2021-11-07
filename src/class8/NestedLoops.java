package class8;

public class NestedLoops {

	public static void main(String[] args) {
	
		/*nested loop: its a loop inside another loop
		 * 
		 * 
		 */
		
		for(int i=1; i<=3; i++) { //**outer loop**
			
		
			for(int j=1; j<=4; j++) { //this is a nested loop, its inside the first for loop **inner loop**
				
				System.out.println(i+" "+j);
				
				
				
			}
			
		}
		System.out.println("END OF CODE!");
		
	}
	
	

}
