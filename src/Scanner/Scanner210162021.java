package Scanner;

public class Scanner210162021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter an item you want to buy");
		String item=input.next();
		System.out.println("Please enter the price of the item "+ item);
		double price=input.nectDouble();
		System.out.println("You selected "+ item + "with price ="+ price);
		
		
			
	}
	
	

}
