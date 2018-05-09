package exception_MultipleCatch;

public class MultipleCatches {
	public static void main(String[] args)
	{
		// Catch từ trên xuống, nếu bắt đc 1 lỗi thì lỗi phía dưới không bắt nữa
		try {
			int a = args.length + 1;
			System.out.println("a = " + a);
			int b = 42 / a;
			int c[] = {1};
			c[42] = 97;
		} catch (ArithmeticException e) {
			System.out.println("Division by 0: " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index oob: " + e);
		}
		
		//Remember exception subclasses must become before any superclass (vì khi bắt superclass thì nó sẽ bắt hết subclass)
		/*try {
			int a = 0;
			int b = 4 / a;
			
		} catch (Exception e) {
			System.out.println("Generic exception catch.");
		} catch (ArithmeticException e) {	// ERROR vì this catch never reached 
			System.out.println(e);
		}*/
	}
}
