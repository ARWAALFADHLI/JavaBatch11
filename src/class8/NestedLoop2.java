package class8;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		for (int i=1; i<=9; i++) {
			
			for(int j=1;j<=9;j++) {
				System.out.println(i+" "+j);
			}
		}

		System.out.println("-------- Car Odometer--------");
		
		for (int a=0; a<+9; a++) {
			for (int b=0; b<+9; b++) {
				for (int c=0; c<+9; c++) {
					for (int d=0; d<+9; d++) {
						System.out.println(a+""+b+""+c+""+d);
					}
				}
			}
		}


		System.out.println("----------Multiplacation Table----------");
		
		for (int a=1; a<=10; a++) {
			for(int b=1; b<=10; b++) {
				System.out.println(a+" x "+b +" = " + a*b);
				
			}
			System.out.println("------------ Clock---------------"); // HOMEWORK!
			
			
			
		}
		
	}
}
