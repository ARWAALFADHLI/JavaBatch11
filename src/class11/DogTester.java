package class11;

public class DogTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog alonasDog= new Dog(); //its like the scanner 
		                         //"Dog" is the class
								 //"zemasDog" is the object
		
		alonasDog.name="Lexy";
		alonasDog.breed="American Hound";
		alonasDog.colors="Black";
		alonasDog.height= 2.5;
		alonasDog.age=10;
		alonasDog.gender='M';
		
		System.out.println("My Dog name is "+ alonasDog.name);
		System.out.println("His breed is "+alonasDog.breed);
		System.out.println("His color is "+alonasDog.colors);
		System.out.println("His height is "+alonasDog.height);
		
		Dog jimmaysDog= new Dog();
		jimmaysDog.name="Teddy";
		jimmaysDog.breed="Labrador Retriever";
		jimmaysDog.colors="Golden";
		jimmaysDog.height=5;
		jimmaysDog.age=12;
		jimmaysDog.gender='M';
		
		System.out.println("My dog name is "+jimmaysDog.name);
		System.out.println("His breed is "+jimmaysDog.breed);
		System.out.println("His color is "+ jimmaysDog.colors);
		System.out.println("His hight is "+jimmaysDog.height);
		
		Dog arwasDog=new Dog();
		
		arwasDog.name="Manroe";
		System.out.println("My cutie cat name is "+ arwasDog.name);
		
		
			}

}
