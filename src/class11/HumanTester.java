package class11;

import java.util.Scanner;

import javax.lang.model.type.DeclaredType;

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human arwa=new Human();
		arwa.name="Arwa";
		arwa.age= 25;
		arwa.height=5.3;
		arwa.weight=150;
		arwa.gender='F';
		arwa.bloodType="A+";
		
		arwa.eat();
		arwa.sleep();
		arwa.walk();
		arwa.sendMeme();
		
		System.out.println("*************************");
		Human laurent= new Human();
		laurent.name="Laurent";
		laurent.age=23;
		laurent.height=6.00;
		laurent.weight=180;
		laurent.gender='M';
		laurent.bloodType="A+";
		
		laurent.eat();
		laurent.sleep();
		laurent.walk();
		laurent.sendMeme();
		System.out.println(laurent.age);
		
		Scanner scan=new Scanner(System.in);
		
		
	
	}

}
