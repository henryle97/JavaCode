package interface_Applying_Stack;

public interface IntStack {
	void push(int item);	//store an item
	int pop();	//retrieve an item
	
	// add method mà không làm beak any preexisting code
	default void clear()
	{
		System.out.println("clear() not implemented");
	}
}
