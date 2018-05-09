package static_Learn;

/* 1. Khi một thành viên của class được khởi tạo với keyword static thì nó có thể được truy cập
 * trước khi bất ky Object nào của class được tạo.
 * 2. Member (method or variable) static : chỉ được gọi bởi hàm static hoặc truy cập vào biến static.
 * 3. Static: không thể tham chiếu bằng this or super.
 */
public class UseStatic {
	static int a = 3;
	static int b;
	
	static void meth(int x)
	{
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("x = " + x);
	}
	
	static {
		System.out.println("Static block initialized");
		b = a * 2;
	}
	
	public static void main(String[] args)
	{
		meth(5);
		/* B1: Khoi tao a = 3
		 * B2: xử lý block static
		 * B3: chạy meth(5)
		 */
		
		/*static method  */
		StaticDemo.callme();
	}
}
