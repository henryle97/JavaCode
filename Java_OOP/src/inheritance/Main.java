package inheritance;

public class Main {
	public static void main(String[] args) {
		// Constructor a Manager object
		Manager boss = new Manager("Hisiter", 80000, 2020,1,1);
		boss.setBonus(5000);
		
		// Array of staff
		Employee[] staff = new Employee[3];
		// Fill the staff array with Manager and Employee
		staff[0] = boss;
		staff[1] = new Employee("NVA", 50000, 2018, 2, 3);
		staff[2] = new Employee("NVB", 50000, 2017, 4, 5);
		
		// Print out information of all Employee object
		for (Employee e : staff)
			System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + ", hire day = " + e.getHireDay().toString());
				
	}
	
}
