package class10;

public class TwoDArrays {

	public static void main(String[] args) {
	
		int[][] bigArray=new int [3][3];
		
		//adding elements inside 1st array or 1st row
		bigArray[0][0]=10;
		bigArray[0][1]=20;
		bigArray[0][2]=30;
		
		// adding elements inside 2nd array or 2nd row                        its like a chart
		bigArray[1][0]=1;
		bigArray[1][1]=2;
		bigArray[1][2]=3;
		
		//adding elements inside 3rd array or 3rd row
		bigArray[2][0]=100;
		bigArray[2][1]=200;
		bigArray[2][2]=300;
		
		//how to access?
		//i want to print 200
		
		System.out.println(bigArray[2][1]);
		
		//what it shows
		System.out.println("2d array size " + bigArray.length); // it returns how many 1d arrays it has or number of rows
		
		
		

		
	}

}
