package exception_NestedTry;

// An example of nested try statements
public class NestTry {
	public static void main(String args[])
	{
		try {
			//int a = args.length;
			int a =1;
			/* If no command-line args are present, the
			 * following statemenet will generate 
			 * a divide-by-zero exception.
			 */
			int b = 42 / a;
			
			System.out.println("a = " + a);
			
			try {	// nested try block
				
				if (a==1)
					a = a / (a-a);	// division by zero
				
				if (a==2) {
					int c[] = {1};
					c[42] = 99;		//out-of-bounds array
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out-of-bound " + e);
			}
			
		} catch (ArithmeticException e)
		{
			System.out.println("Divide by 0 : " + e);
		}
	}
}
