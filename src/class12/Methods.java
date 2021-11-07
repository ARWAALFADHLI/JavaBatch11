package class12;

public class Methods {
	
	int times; //states
	
	void sayHello() {
		System.out.println("Hello Batch 11");
		
	}
	void sayHelloManyTimes() {
		for(int i=0; i<5;i++) {
			System.out.println("Hi Batch 11");
		}
		}
	void sayHelloManyTimesWithStates() {
		for(int i=0; i<times;i++) {
			System.out.println("Hey Batch 11");
		}
	}
	void sayHelloManyTimesWithParameter(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Howdy Batch 11");
		}
	}
	}


