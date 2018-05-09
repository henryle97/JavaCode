package interfaceLearn;

/*
 * Access : default là trong gói, public : all code
 * 	
 */
public interface Callback {
	void callback(int param);
	
	//default method 
	default void getString()
	{
		System.out.println("Default String");
	}
}
