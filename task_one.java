
import java.util.Scanner;


public class task_one {
	

	public static void main(String[] args) {
		/* TODO: 
		 * 1. swap two numbers using third variables
		 * 2. swap two numbers without using the third variables
		 * 3. Print User input
		 
		 */
		
		int firstNum;
		int secondNum;
		int tempVariable;
		

		Scanner get;
		get = new Scanner(System.in);
		
		System.out.print("Please Enter the First Number: ");
		firstNum = get.nextInt();
		System.out.println("You've Entered: "+ firstNum);
		System.out.print("Please Enter the Second Number: ");
		secondNum = get.nextInt();
		System.out.println("You've Entered: "+ secondNum);
		//First Condition: with temporary variables
		
		//Assigning first value to tempVariable
		tempVariable = firstNum;
		
		//Assigning first value to second value
		firstNum = secondNum;
		
		//Now assigning initial value to first to second value
		secondNum = tempVariable;
		
		System.out.println("First Number swapped to Second:" + firstNum);
		System.out.println("Second Number swapped to First:" + secondNum);
		
		//Second Condition: without using temporary variables
		firstNum = firstNum + secondNum;
		secondNum = firstNum - secondNum;
		firstNum = firstNum - secondNum;
		
		System.out.println("First Number swapped to Second:" + firstNum);
		System.out.println("Second Number swapped to First:" + secondNum);
		
		
		

	}

}
