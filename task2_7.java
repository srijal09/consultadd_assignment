import java.util.Scanner;



public class task2_7 {

	public static void main(String[] args) {
		// TODO 
		
		int num;
		Scanner get = new Scanner(System.in);
		
		System.out.println("Please Enter the number:");
		num = get.nextInt();
		
		if(num % 2 == 0) {
			
			if(num>2 && num<=5) {
			 System.out.println("OLD");
		 }
			 else if (num>6 && num<=30) {
				 System.out.println("NEW");
			 }
			 else if(num>30) {
				 System.out.println("OLD");
			 }
		 
		 }
		else {
			System.out.println("NEW");
		}
	}
}


