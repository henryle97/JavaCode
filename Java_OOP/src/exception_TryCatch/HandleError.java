package exception_TryCatch;

import java.util.Random;

/* 
 * 
 */
public class HandleError {
	public static void main(String[] args)
	{
		int a = 0, b = 0, c = 0;
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			try {
				b = r.nextInt();
				c = r.nextInt();
				a = 12345 / (b/c);
				System.out.println("This don't display if b/c = 0");
			} catch (ArithmeticException e) {
				System.out.println("Division by zero");
				
				// override toString() : description of the exception
				System.out.println("Exception " + e);
				a = 0;
			}
			System.out.println("a: " + a);
			
		}
		
	}
}
