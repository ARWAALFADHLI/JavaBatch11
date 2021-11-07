package Class10172021;

import java.util.Scanner;

public class Class110172021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//boolean understandJava= true; 
		//boolean enjoyJava=false;
		//if (understandJava && enjoyJava) {
			//System.out.println("that is awesome");
		//}else {
		//	System.out.println("you should study more");
			
		//}
		
// ask a user ti enter a number based on the entered #
		//we will define if number is small med or large
		
		//if # is between 1 and 10 = samll
		//if # is between 11 and 100 = medium
		//if # is between 101 and 1000= large
		//if # is more than 1001 = xlarge
		
		
		
		Scanner in=new Scanner(System.in);
		System.out.println("please enter any number");
		
		int num=in.nextInt();
		if (num>=1 && num<=10) {
		System.out.println(num+ "is small");
	}else if(num>=11 && num<=100) {
		System.out.println(num+ "is medium");
	}else if (num>=101 && num<=1000) {
		System.out.println(num + " is large");
	}else { 
		System.out.println(num+ "is xlarge");
	}

}
}
