package Project;

public class Project6 {

	public static void main(String[] args) {
		//6) Write a program to swap 2 numbers without a temporary variable?

		int a=10;
		int b=20;
	
		a=a+b;// a=10+20=>30
		b=a-b; //b=30-20=>10
		a=a-b;//a=30-10=>20
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
	}

}
