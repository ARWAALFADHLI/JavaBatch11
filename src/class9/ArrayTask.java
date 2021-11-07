package class9;

public class ArrayTask {

	public static void main(String[] args) {
		// create an array of chars and store grade into: A B C D E F.
		// THEN PRINT A GRADE B
		
		
		System.out.println("----------- 1st WAY OF CREATING AN ARRAY----------");
		char [] grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		System.out.println("---------- 2nd WAY OF CREATING AN ARRAY----------");
		System.out.println("--------------MOST COMMON USED---------------");
		
		char[] gradeArray= {'A','B','C','D'};
		System.out.println(gradeArray.length); //4 element
		System.out.println("Element with index 2 is "+ gradeArray[2]);
		
		
		System.out.println("---------------Names----------------");
		
		String [] names= {"ARWA","TAIMA","MOHAMMAD","MOHANNAD"};
		names[0]="LAURENT";
		
		System.out.println(" After change vaule is "+ names[0]);
		
	//	names[4]="MARMAR";
		//System.out.println(names[4]); doesnt work cause you only stated 4 elements 
		
		
		System.out.println("------------Task-------------");
		//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
	
		String[] word= {"Java ","Saturdays ","Day ","coding ","is "};
		System.out.println(word[1]+word[4]+word[0]+word[3]+word[2]);
		
		for (int i=0; i <word.length; i++) {
		System.out.println(word[i]);
		
		
		}
		
		
	}

}
