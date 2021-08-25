import java.util.Scanner;

public class task1_3 {

	public static void main(String[] args) {
		/*TODO:
		 * 1. Ask the User to enter any 2 numbers from 1 to 10 and add both of them to another variable call z
		 * 2. Use z for adding 30 into it and print the final result by using variable results 
        */
		
		int input1;
		int input2;
		int z;
		
		Scanner get;
		get = new Scanner(System.in);
		
		System.out.print("Please Enter the First Number(1-10): ");
		input1 = get.nextInt();
		
		System.out.print("Please Enter the Second Number(1-10): ");
		input2 = get.nextInt();
		
		if(input1<=10 && input2<=10) {
		z = input1 + input2;
		z= z+30;
		System.out.println(+z);
		}
		else {
			System.out.println("Oops! Invalid Range!");
		}
		
		}
		
	}
