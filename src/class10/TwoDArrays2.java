package class10;

public class TwoDArrays2 {

	public static void main(String[] args) {
		// lets create an 2d arrays of groceries
		
		String[][] groceries= {
		{"banna","apple","mango"},//stored in index 0
		{"potato","tomato"},// stored in index 1
		{"milk","cheese","ayran","yogurt"},//stored in index 2
		};
		
		//number of arrays
		System.out.println(groceries.length);
		// print yogurt 
		System.out.println(groceries[2][3]);
		
		//i want to find how many elements my arrays has
		System.out.println("number of elements inside 1st arrays = " +groceries[0].length);
		System.out.println("number of elements inside 2nd arrays = " +groceries[1].length);
		System.out.println("number of elements inside 3rd arrays = " +groceries[2].length);
		
		
		//how do we get all elements in 2D Arrays?
		int total=0; //will print the total number everything in the arrays
		
		for(int i=0; i<groceries.length; i++) { //iterates over arrays or rows
			for(int j=0; j<groceries[i].length; j++) { //iterates over elements of each single inside the arrays or row
				System.out.print(groceries[i][j]+" ");// if i just did this without the System.out.println at the bottom, it will print all in one line
				
				String element=groceries[i][j];
				System.out.println(element);
				if (element.equals("ayran")) { // it will print the place of where ayran is, in this case it 2 2
					System.out.println(i+" "+j);
					
				}
				total++;
				
			}
			System.out.println(); // this will make it print exactly how it shows when we print it
		}
		System.out.println("number of elements inside 2D arrays= "+ total);
		System.out.println("------------------------------------------");
		
	}

}
