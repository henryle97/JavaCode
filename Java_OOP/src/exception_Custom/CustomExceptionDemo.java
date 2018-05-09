package exception_Custom;

public class CustomExceptionDemo {
	static void validage(int age) throws InvalidAgeException			// Khai bao 1 ngoai le co the xay ra
	{
		if (age < 18)
			throw new InvalidAgeException("not valid because less 18 age");		//Nem ra 1 ngoai le
		else 
			System.out.println("welcome to vote");
	}
	
	public static void main(String args[])
	{
		try {
			validage(18);
		} catch (Exception m) {
			System.out.println("Exception occured: " + m);			//or m.getMessage();
		} finally {
			System.out.println("This code luon duoc executed: Rat vui khi ban da tham gia. ");
		}
		
		System.out.println("The rest of code ....");
	}
}
