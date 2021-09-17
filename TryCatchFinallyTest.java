import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter no 2: ");
		int b = sc.nextInt();
		
		int d = add(a, b);
		System.out.println("The output is: " + d);
		} catch(InputMismatchException e) {
			System.out.println("Please enter integers only");
		} finally {
			System.out.println("Integers not found");
		}
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		
		int c = 0;
		
		try {
		c = a + b;	
		}catch(Exception e) {
			System.out.println("Please enter integers only");
		}finally {
			System.out.println("Finally executed");
			return c;
		}
		
	}

}
