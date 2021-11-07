package class7;
import java.util.Scanner;
public class Doloop2 {

	public static void main(String[] args) {
		/*lets create a secret number (1 to 100)
		 *lets ask user to guess my secret number
		 *keep asking for a number till user guess the secret number
		 */

		int secretNumber=78;
		Scanner scan=new Scanner(System.in);  //the first 3 lines are
		int userNumber;
		
		
		do {
			System.out.println("PLEASE GUESS MY SECRET NUMBER FROM 1 TO 100");
			userNumber=scan.nextInt();
			
		}while(userNumber!=secretNumber);
		System.out.println("YOU GOT THE SECRET NUMBER!!!");
		
		
		 
	}

}
