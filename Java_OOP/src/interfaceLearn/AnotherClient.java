package interfaceLearn;

public class AnotherClient implements Callback{
	public void callback(int p)
	{
		System.out.println("Another of callback " + p);
	}
	void nonIfaceMeth()
	{
		System.out.println("Hàm mà implement từ một interfacư cũng có thể khởi tạo thành viên khác");
	}
}
