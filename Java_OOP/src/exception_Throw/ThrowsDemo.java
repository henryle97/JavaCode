package exception_Throw;

public class ThrowsDemo {
	static void throwOne() throws IllegalAccessError {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessError("Demo");
	}
	
	public static void main(String args[])
	{
		try {
			throwOne();
		} catch (IllegalAccessError e) {
			System.out.println("Caught " + e);
		}
	}
}
