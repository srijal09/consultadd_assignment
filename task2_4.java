import java.util.Scanner;

public class task2_4 {

	public static void main(String[] args) {
		// TODO: break and continue
		
		int input;
		Scanner get = new Scanner(System.in);
		System.out.print("Please Enter the Number:");
		input = get.nextInt();
		
		while(input>0) {
			
			System.out.print("Keep Going");
			input++;
			break;
			
		}
		System.out.print( "Its Over");
		
	}
}

