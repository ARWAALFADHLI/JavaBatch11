package class10;

public class AllElementsof2DArrays {

	public static void main(String[] args) {
		
		//2D array is array of arrays
		String[][] groceries= {
				{"banna","apple","mango"},//stored in index 0
				{"potato","tomato"},// stored in index 1
				{"milk","cheese","ayran","yogurt"},//stored in index 2
				};
				
		for(String[] grocery:groceries) { // the array is stored in the word grocery
			for(String g:grocery) {
			
				System.out.println(g);
				
			}
			System.out.println();
		}

	}

}
