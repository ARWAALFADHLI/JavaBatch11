package class12;

public class Methods4Tester {

	public static void main(String[] args) {
		
		Methods4 canBeAnyName=new Methods4();
		String name=canBeAnyName.method1();
		System.out.println(name);
		System.out.println(canBeAnyName.method2("Jessi"));
		System.out.println(canBeAnyName.method1());
		//String name.canBeAnyName.method3();  not possible
		canBeAnyName.method3();
		canBeAnyName.method4("Pharoh");
		System.out.println(canBeAnyName.methods5("Manroe"));
		
				

	}

}
