package interface_Applying_Stack;

public class IFTest {
	public static void main(String[] args) {
		
	IntStack mystack;
	FixedStack fs1 = new FixedStack(5);
	FixedStack fs2 = new FixedStack(8);
	DynStack  ds = new DynStack(10);
	
	// push some number onto the stack
	mystack = fs1;
	for (int i = 0; i < 5; i++)
		mystack.push(i);

	// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for (int i = 0; i < 5; i++)
			System.out.println(mystack.pop());
	
	
	mystack = fs2;
	for (int i = 0; i < 9; i++)
		mystack.push(i);
	
	
	mystack = ds;
	for (int i = 0; i < 12; i++)
		mystack.push(i);
	
	// pop those numbers off the stack
	System.out.println("Stack in mystack1:");
	for (int i = 0; i < 5; i++)
		System.out.println(mystack.pop());
	}

}
