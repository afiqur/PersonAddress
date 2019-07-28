
public class PersonMain {

	public static void main(String[] args) {
		Address a = new Address("Dhaka", "BD");
		Teacher t = new Teacher("Teacher", "017777777", a, "Professor");
		t.display();

		Student s = new Student("Student", "01666666", new Address("Dhanmondi", "BD"), "181-15-115555", 3.50);
		s.display();
	}

}


     