
public class Student extends Person {
	private String studID;
	private double cgpa;

	public Student(String name, String phone, Address a, String studID, double cgpa) {
		super(name, phone, a);
		this.studID = studID;
		this.cgpa = cgpa;
	}

	public void display() {
		super.display();
		System.out.println(studID + " " + cgpa);
	}
}


