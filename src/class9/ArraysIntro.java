package class9;

public class ArraysIntro {

	public static void main(String[] args) {
	// arrays stores more than one value 
	//[] this symbolizes array
		
		int[] array=new int[4]; // the "4" is how many values we have in an array, we call it elements

		
		array[0]=12;
		array [1]=10;
		array [2]=13;
		array [3]=(int)14.99;
		
		System.out.println(array[2]+ array[0]);
		System.out.println(array[3]);
		
		System.out.println("---------------------------------------------");
		
		// i need to create an array that will hold 3 elements of double type of vaule
		
		double[] arr=new double[3];
		
		arr[0]=11.99;
		arr[1]=1.09;
		arr[2]=3.08;
		// can i replace vaule from an array?
		//yes
		arr[1]=100.99;
		
		System.out.println("After changing vaule of an element " +arr[1]);
		
		
		
		System.out.println("-------------------------------------------");
		
		//i want to create an arry that will store 4 colors
		
		String[] colors=new String [4];
		
		//colors[0]= "RED";
		colors[1]="BLUE";
		colors[2]="GREEN";
		colors[3]="YELLOW";
		//colors[4]="BLACK";  if i add this code, it will give you an error because you have more that 4 elements
		
		//System.out.println(colors[4]); array index out of bounds exception
		
		// see how many elements inside array
		System.out.println("Size of array is " +colors.length); //color.length will tell you how many elements you have 
		
		System.out.println(colors[0]);// if there is less than what the elements statued. it will show as default "null"
		
		
		System.out.println("---------------------------------------------");
		
		//byte[] smallArray=new byte[-1]; array connot have negative size, we will get an error
		
		
	}

}
