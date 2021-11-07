package Project;

public class Project3 {

	public static void main(String[] args) {
		// 3)Create a 2D array of integers. Develop a program which will calculate the sum of  even and odd numbers for that array.

		int [][] numbers= {
				{3,2,5,7},
				{8,11,13,20},
				{15,8,12,15},
		};
		
		int oddSum=0;
		int evenSum=0;
		
		

		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {
				
				if (numbers[i][j] % 2==0) {
					evenSum+=numbers[i][j];
					
				}else {
					oddSum+=numbers[i][j];
					
				}
					
				}
		}
			System.out.println("Sum of the EVEN numbers "+evenSum);
			System.out.println("sum of the ODD numbers "+oddSum);
			
			
	}
	}


