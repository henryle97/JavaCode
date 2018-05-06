package overriding_method;

// Dynamic Method Dispatch 
public class A {
	void callme()
	{
		System.out.println("Inside'A method called");
	}
}

// Khong the de kieu public
class C extends A{
	void callme()
	{
		System.out.println("Inside'C method called");
	}
}
