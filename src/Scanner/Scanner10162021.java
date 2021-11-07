package Scanner;

import java.util.Scanner;

// shortcut to import existing class to the current class
//windows : ctrl+shift+o
public class Scanner10162021 {

	public static void main(String[] args) {
		
		String str="ABC";
		str="XYZ";
		//SCANNER is a nonprimitive type
		Scanner scan=new Scanner(System.in);
		// System. in allows me to capture any input i put in the keybored
		String name=scan.next(); //it will capture string value from console
		
		System.out.println("Hello" + name);
		System.out.println("please enter your age");
		int age=scan.nextInt();
		System.out.println(name+" you are "+ age+ " years old ");
		
		
		

	}

}
