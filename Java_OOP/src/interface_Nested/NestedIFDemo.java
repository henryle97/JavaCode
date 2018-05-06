package interface_Nested;

public class NestedIFDemo {
	public static void main(String[] args) {
	// use nested interface reference 
	// mot tham chieu A.NestedIF duoc tao va no duoc gan den mot doi tuong B
	A.NestedIF ob = new B();
	
	if (ob.isNotNegative(10))
		System.out.println("10 is negative");
	if(ob.isNotNegative(-12))
		System.out.println("this won't be displayed");
	}
}
