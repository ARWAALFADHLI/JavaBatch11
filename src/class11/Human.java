package class11;

public class Human {

	String name;
	int age;
	double height;
	double weight;
	char gender;
	String bloodType;
	
	void eat() {
		System.out.println(name+ " eats a lot");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
	void walk() {
		System.out.println(name + " with blood type "+ bloodType+ " is walking");
	
		}
	void sendMeme() {
		if(name.equals("Laurent")) {
			System.out.println("Send memes");
			
		}
	}
}
