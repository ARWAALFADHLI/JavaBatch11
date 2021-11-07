package class11;

public class Car {

	String make;
	String modle;
	String color;
	int year;
	double milage;
	void moveForward() { // this will define the behavior 
		System.out.println("Moving forward");
		
	}
	void applyBreak() {
		System.out.println("Applying break");      // every methods it own curly brackets
		
		
	}
	
	public static void main (String[] arge) {
		Car ayshasCar=new Car();
		ayshasCar.moveForward();
		ayshasCar.make="tesla";
		ayshasCar.modle="S";
		ayshasCar.color="Black";
		ayshasCar.year=2015;
		System.out.println("Ayshas car is "+ayshasCar.make);
		System.out.println("Her car modle is "+ayshasCar.modle);
		System.out.println("Her car color is "+ayshasCar.color);
		ayshasCar.moveForward();
		ayshasCar.applyBreak();
		
		
	
		
	}
}
