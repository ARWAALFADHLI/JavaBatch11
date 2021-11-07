package Project;

public class Task3Project {

	public static void main(String[] args) {

		//Create a 2D array of integers. Develop a program which will calculate the sum of  even for that array.
		
		int[][] evenNumbers= {
				{0,2,4},
				{6,8,10},
		};
		
		int sum=0;
		for(int i=0; i<evenNumbers.length; i++) {
			for(int j=0; j<evenNumbers[i].length; j++)
		sum += evenNumbers[i][j];
			
				
			}
			System.out.println(sum+ " is the sum of Even Numbers");
			
			
	}		
	
		
	
	
		}