
public class task2_5 {

	public static void main(String[] args) {
		// TODO:Write a program in Java which will find all such numbers which are divisible by 7 but are not a multiple of 5, between 2000 and 3200.
		
		
		for (int i = 2000; i <= 3200; ++i) {
			
			if (i %7==0 && i%5!=0) {
				System.out.println(i);
			}
		}
			
	}

}
