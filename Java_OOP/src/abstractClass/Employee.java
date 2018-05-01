package abstractClass;

import java.time.LocalDate;

public class Employee extends Person{
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name, double salary, int year, int month, int day)
	{
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}


	public double getSalary() {
		return salary;
	}

	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	// Define a concrete subclass 
	public String getDescription()
	{
		return "an employee with a salary of " + salary;
	}
}
