package class12;

public class Phone {
	//creat a class "Phone". create 3 object of it: Iphone, google, pixel, nokia
	// with specific  attributes and behaviors
	
	String make;
	String model;
	int RAM;
	int ROM;
	double screen;
	int camera;
	
	void makePhoneCalls() { // void is the behaviors
		System.out.println(make+" "+ model+" is calling someone");
		
	}
	void takePictures() {
		System.out.println(make+" "+ model+" is taking pictures");
		
	}

}
