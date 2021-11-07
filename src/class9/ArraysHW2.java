package class9;

public class ArraysHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] number= {10,11,22,33,44,55,66,77,88};
	int sum=0;
			for(int i=0; i< number.length; i++) {
				System.out.println(number[i]+ "");
				
			}
	System.out.println("THE SUM OF ALL THE INTEGERS =" + sum);
	sum =0;
	for (int num:number) {
		sum+=num;
		
	}
	System.out.println(" THE SUM OF ALL THE INTEGERS ="+ sum);
	
	
			}

}
