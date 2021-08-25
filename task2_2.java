
import java.util.Scanner;


public class task2_2 {

	public static void main(String[] args) {
		// TODO:
		int input1;
		int input2;
		int option;
		int result;
		Scanner get = new Scanner(System.in);
		System.out.print("Please Enter the First Number:");
		input1 = get.nextInt();
		
		System.out.print("Please Enter the Second Number:");
		input2 = get.nextInt();
		
		System.out.println("Please select the following Operation\nEnter 1: Addition\nEnter 2: Subtraction\nEnter 3: Division\nEnter 4: Multiplication\nEnter 5: Average");
		option = get.nextInt();
		
		
		if(option==1) {
			
			result = input1 + input2;
			System.out.println(result);
		}
		else if(option==2) {
				
				result = input1 - input2;
				System.out.println(result);
				if(input1<input2) {
					System.out.println("Oops! Option 2 is returning negative values...");
				}
				
			}
			
		else if(option==3) {
			
			result = input1/input2;
			System.out.println(result);
			
		}
			
			else if(option==4) {
				result = input1*input2;
				System.out.println(result);
			}
			else if (option==5) {
				result = (input1+input2)/2;
				System.out.println(result);
			}
		}
	}

	


