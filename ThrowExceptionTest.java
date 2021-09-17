import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		
		if(age <= 0) {
			
			throw new NumberFormatException();
			
		}else if (age >= 120) {
			
			throw new NumberFormatException();
			
		}
		
		System.out.println("Max Heart Rate is " + (220 - age));
		
	}
	
}
