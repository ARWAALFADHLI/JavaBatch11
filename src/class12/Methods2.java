package class12;

public class Methods2 {
	
	void repeatWords(String word, int times) {
		for(int i=0; i<times;i++) {
			System.out.println(word);
			}
	}

	void isItRaining (boolean isRain) {
		if(isRain) {
			System.out.println("Please take an Umberlla");
		}else {
			System.out.println("Lets go for a walk");
		}
	}
	
	void advanceMethods(Phone phone) { //from the phone class
		phone.makePhoneCalls();
	}
}

