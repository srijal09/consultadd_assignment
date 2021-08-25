import java.util.Scanner;
public class task2_1 {

	public static void main(String[] args) {
		/*TODO:
		 * If a number is divisible by 3 it should print “Consultadd” as a string
		 * If a number is divisible by 5 it should print “JAVA Training” as a string
         * If a number is divisible by both 3 and 5 its should print “Consultadd JAVA Training” as a
		   string
		 */
		int num;

		Scanner get;
		get = new Scanner(System.in);
		
		System.out.print("Please Enter the Number: ");
		num = get.nextInt();
		
		if(num %3==0 && num %5==0) {
			System.out.println("Consultadd JAVA Training");
			}
		else if(num%3==0) {
			System.out.println("Consultadd");
		} else if (num % 5==0) {
		System.out.println("Java Training");
		}
	}
}


