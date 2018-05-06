package interfaceLearn;

public class InterfaceTest {
	public static void main(String[] args)
	{
		Callback c = new Client();
		c.callback(42);
		
		// c không thể truy cập đến bất kỳ hàm khác của Client
		//c.nonIfaceMeth() CAN'
		
		AnotherClient ob = new AnotherClient();
		c = ob;		// c now refer to AnotherClient object
		c.callback(50);
		
		// c vẫn k thể gọi c.nonIfaceMeth() vì c thuộc kiểu Callback object
		
		IncompleteInherit ob2 = new IncompleteInherit();
		ob2.callback(55);
		ob2.callme();
		
	}
	
}
