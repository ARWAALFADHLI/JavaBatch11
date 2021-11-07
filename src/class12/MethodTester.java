package class12;

public class MethodTester {

	public static void main(String[] args) {
	
		System.out.println("Line before method call");
		Methods methods=new Methods();
		methods.times=3;
		methods.sayHello();
		methods.sayHelloManyTimes();
		methods.sayHelloManyTimesWithStates();
		methods.sayHelloManyTimesWithParameter(2);
		System.out.println("Line after method call");

	}

}
