package Project;

public class Project1 {

	public static void main(String[] args) {
		//1) Create a 2D array of integer values. Print the sum of all numbers.
		
		int [][] numbers= {
				{10,10,10,10},
				{20,20,20,20},
				{30,30,30,30},
		};
		
		int sum=0;
		
		for(int i=0; i<numbers.length;i++) {
			for(int j=0; j<numbers[i].length;j++) {
				sum+=numbers[i][j];
				//or sum=sum+number[i][j];
			}
			}
			System.out.println(sum);
			
		}

	

}
