package interfaceLearn;

public class Client implements Callback{
	// method that implement an interface must be declare with PUBLIC
	public void callback(int p)
	{
		System.out.println("callback called with " + p);
	}
	
	//non-interface
	void nonIfaceMeth()
	{
		System.out.println("Hàm mà implement từ một interfacư cũng có thể khởi tạo thành viên khác");
	}
}
