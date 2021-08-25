import java.util.Scanner;
public class taks2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		
		Scanner get;
		get = new Scanner(System.in);
		
		System.out.print("Please Enter an Alphabet: ");
		input = get.next();
		
		
		while(input.equals("r") || input.equals("a") || input.equals("n") || input.equals("d") || input.equals("o") || input.equals("m")) {
			
			System.out.print("FOUND");
			input = get.next();	
			
		}
		System.out.print( "NOT FOUND");
		
	}

}
