package interfaceLearn;

/*
 * Nếu một class bao gồm 1 interface mà không hoàn toàn thi hành hàm
 * được yêu cầu bởi interface đó thì nó phải khởi tạo abstract
 */
public abstract class Incomplete implements Callback{
	void show(int a, int b)
	{
		System.out.println(a + "  " + b);
	}
	
	//...
	/*
	 * Bất cứ class nào kết thừa Incomolete thì hoặc là khởi tạo callback()
	 * hoặc là khởi tạo abstract
	 */
	abstract void callme();
}
