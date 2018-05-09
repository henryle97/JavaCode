package exception_HowItWork;

/* how the runTime system searches th call stack
 * to find appropriate exception handler.
 */
public class ExceptionThrow {
	// Một ngoại lệ bị ném ra ở đây (ArithmeticException)
	// Appropriate Exception handler không tìm thấy trong hàm này
	static int divideByZero(int a, int b) {
		
		int i = a / b;		// this statement will cause EX
		
		return i;
	}
	// The runTime System searches the appropriate Exception handler
    // in this method also but couldn't have found. So looking forward
    // on the call stack.
	static int computeDivision(int a, int b) {
		int res = 0;
		
		try {
			res = divideByZero(a, b);
		}
		// Không phù hợp với ArithmeticException
		catch(NumberFormatException ex)
		{
			System.out.println("NumberFormatEception is occured.");
		}
		return res;
	}
	// In this method found appropriate Exception handler.
    // i.e. matching catch block.
	public static void main(String args[])
	{
		int a = 1;
		int b = 0;
		
		try {
			int i = computeDivision(a, b);
			
		} 
		// phù hợp với ArithmeticException
		catch(ArithmeticException ex)
		{
			ex.printStackTrace();
			
			System.out.println(ex);
		}
	}
}
// Call Stack
/*
 * divideByZero() --- Top of Stack
 * computeDivison()
 * main()
 */
