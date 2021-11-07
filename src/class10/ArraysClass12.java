package class10;

public class ArraysClass12 {

	public static void main(String[] args) {
	 
		// if we have to store single values we use variables
		
		String name="Marvin";
		String name1="Ahmet";
		String [] names;
		names=new String[5];
		names[0]="Farhad";
		System.out.println(names[0]);
		names[1]="Yogita";
		System.out.println(names[1]);
		names[2]="Henok";
		names[3]="Priyasri";
		names[4]="Ecaterina";
		
		System.out.println(names.length);
		
		for(int i=0; i<names.length; i++) {
			System.out.println(i);
			
		}
		

	}

}
