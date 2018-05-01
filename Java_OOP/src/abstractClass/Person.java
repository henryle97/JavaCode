package abstractClass;

// A abstract Class

public abstract class Person {
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	// Abstract method act as placeholders for method that are implemented in the subclass
	public abstract String getDescription();
		// No implementation required
	
	public String getName()
	{
		return name;
	}

}
