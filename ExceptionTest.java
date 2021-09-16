import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Basic Mathematical Calculations
		// Maximum Heart Beat of a User
		// 220 - Age of the person = MaximumHeartRate
		
		try {
		System.out.println("Welcome to Max Heart Rate Calculator");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();
		
		int maxheartrate = 220 - age;
		
		System.out.println("Max Heart Rate is: " + maxheartrate);
		} catch(InputMismatchException e) {
			System.out.println("Please enter integer only");
		}
		
	}

}
