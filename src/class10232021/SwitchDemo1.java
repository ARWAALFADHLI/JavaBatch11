package class10232021;

public class SwitchDemo1 {

	public static void main(String[] args) {
 
		
		char gender='f';
		String description;
		switch(gender) {
		case 'm':
			description="Male";
			break;
		case 'f':
			description=" Female";
			break;
			default:
				description="Unknown";
		}
		System.out.println(gender+" means "+ description);
		}
		
	
	
	/*limitation for switch
	 * 1. we cannot use logical operators
	 * 2.we cannot use relational operators
	 */

	}


