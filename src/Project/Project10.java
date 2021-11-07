package Project;

public class Project10 {

	public static void main(String[] args) {
		//Write a java program to find the second largest number in the array?

int[] numbers={40,30,20,20,30};
int largest =Integer.MAX_VALUE;
int secondLargest=Integer.MAX_VALUE;

for(int number:numbers){  //USING ENHANCE FOR LOOPS


if(number>largest){
secondLargest=largest;
largest=number;

}else if (number>secondLargest && largest = number) {
secondLargest=number;
}
}
System.out.println(largest);
System.out.println(secondLargest);


	}
	

}
