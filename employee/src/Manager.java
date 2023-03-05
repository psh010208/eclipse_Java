
public class Manager extends Employee {

	private int bonus;

	public Manager(String name, String address, int salary, int numbers, int bonus) {

		super(name, address, salary, numbers);
		this.bonus = bonus;
	}

	public void test() {
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		System.out.println("salary : " + salary);
		//System.out.println("numbers : " + numbers);
	}
}
