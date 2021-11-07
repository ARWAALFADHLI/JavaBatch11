package class12;

public class Methods2Tester {

	public static void main(String[] args) {
	
		
		Methods2 methods=new Methods2();
		methods.repeatWords("Hi", 5);
		methods.repeatWords("I love programing", 2);
		
		System.out.println("**********");
		methods.isItRaining(true); //if it false it will say "lets go for a walk"
		
		System.out.println("****************");
		
		methods.advanceMethods(new Phone());
	}

}
