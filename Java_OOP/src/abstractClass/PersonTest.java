package abstractClass;

public class PersonTest {
	public static void main(String[] args) {
		Person[] people = new Person[2];
				
		people[0] = new Employee("hisiter", 80000, 2020, 6, 7);
		people[1] = new Student("Hisiter", "Computer Science");
		
		for (Person p : people)
			System.out.println(p.getName() + " " + p.getDescription());
	}
}
