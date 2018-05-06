package overriding_method;

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		A r;
		r = a;
		r.callme();
		
		r = b;
		r.callme();
		
		r = c;
		r.callme();
		
		r = d;
		r.callme();
	}

	
}
