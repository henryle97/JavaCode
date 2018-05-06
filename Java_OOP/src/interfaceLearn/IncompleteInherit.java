package interfaceLearn;

public class IncompleteInherit extends Incomplete{
	
	/*
	 * (non-Javadoc)
	 * @see interfaceLearn.Callback#callback(int)
	 * IncompleteInherit kế thừa Incomplete (trình triển khai của Callback) dưới dạng abstract 
	 * nên nó hoặc phải khởi tạo callback() hoặc khởi tạo tiếp dưới dạng abstract
	 */
	public void callback(int p)
	{
		System.out.println("IncompleteInherit called");
	}
	
	void callme()
	{
		System.out.println("IncompleteInherit chào các bạn");
	}
}
