package exception_Throw;

public class ThrowDemo {
	static void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Caught inside demoproc");
			throw e;		//rethrow the eSystem.out.println("Throwed");
			// Nem ra 1 Throwable object e cho try phia ngoai
			// Code phia duoi se khong duoc xu ly
			//System.out.println("This code will not be executed");
		}
	}
	
	public static void main(String args[])
	{
		try {
			demoproc();
		} catch (NullPointerException e) {
			System.out.println("Recaught: " + e);
			//System.out.println(e.getMessage());
		}
	}
}
