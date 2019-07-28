
public class Person {
	protected String name, phone;
	Address a;

	public Person(String name, String phone, Address a) {

		this.name = name;
		this.phone = phone;
		this.a = a;
	}

	public void display() {
		System.out.println(name + " " + phone);
		a.display();
	}
}

