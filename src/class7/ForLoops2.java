package class7;

public class ForLoops2 {

	public static void main(String[] args) {
		/*
		 * what is the out out?
		 * 
		 */
		
		int sum=0;
		for(int a=1; a<=6; a++) {	
			
			sum+=a;
			 System.out.println(sum);
		}
       int result=1;
       for(int b=0; b<=4; b+=2) {
    	   result*=b;
       }
       System.out.println(result);
}
}
