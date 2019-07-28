
public class Teacher extends Person {
	private String designation;

	public Teacher(String name, String phone, Address a, String designation) {
		super(name, phone, a);
		this.designation = designation;
	}

	public void display() {
		super.display();
		System.out.println(designation);
	}
}


