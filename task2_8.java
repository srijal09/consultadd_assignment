import java.util.Scanner;
public class task2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double input;
		Scanner get = new Scanner(System.in);
		System.out.println("Enter a Number:");
		input = get.nextInt();
		if (input > 0)
        {
            if (input < 1)
            {
                System.out.println("Positive small");
            }
            else if (input > 1000000)
            {
                System.out.println("Positive large");
            }
            else
            {
                System.out.println("Positive");
            }
        }
		else if (input < 0)
        {
            if (Math.abs(input) < 1)
            {
                System.out.println("Negative small");
            }
            else if (Math.abs(input) > 1000000)
            {
                System.out.println("Negative large");
            }
            else
            {
                System.out.println("Negative");
            }
        }
        else
        {
            System.out.println("Zero");
        }	
		
	}

}
