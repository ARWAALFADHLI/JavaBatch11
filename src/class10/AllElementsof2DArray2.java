package class10;

public class AllElementsof2DArray2 {

	public static void main(String[] args) {
		
		int [][] numbers= {
				{100,200,300},
				{9,8,7},
		};
		System.out.println("Size of 2D arrays= "+ numbers.length);
		System.out.println(numbers[1][1]); // will print out 8
		
		// get all elements
		for(int[] nums:numbers) {
			for(int n:nums) {
				System.out.print(n+" ");
			}
			System.out.println();
			
		}

		System.out.println("get all elements using regular for loop");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				int elements= numbers[i][j]; // get the sum
				System.out.print(elements+" ");
				
			}
			System.out.println();
		}
			
	}

}
