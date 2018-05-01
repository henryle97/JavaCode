package inheritance;

public class Manager extends Employee{
	// have a new field to store the bonus
	private double bonus;
	
	// Subclass Constructor
	public Manager(String name, double salary, int year, int month, int day)
	{
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	
	// override method getSalary = salary + bonus
	public double getSalary()
	{
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
}
