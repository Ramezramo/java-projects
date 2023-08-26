package error;
import java.util.*;
public class Exception {
	
	public static void main(String[] args) {
		// TODO Auto-generated method 

		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("inter a whole number to devide ");
		int x  = scan.nextInt();
		
		System.out.println("inter a whole number to devide by :");
		int y  = scan.nextInt();
		
		int z = x/y;
		
		System.out.println("result = "+z);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			
			System.out.println("no devide by 0");
		}
//		catch (Exception e) {
//			// TODO: handle exception
//			
//			System.out.println("no devide by 1");
//		}
		finally {
			System.out.println("noooo");
		}
		
		
	}

}
