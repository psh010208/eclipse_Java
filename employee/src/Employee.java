
public class Employee {

	public String name; // ?̸? : public ????
	String address; // ?ּ? : package ????
	protected int salary; // ???? : protected ????
	private int numbers; // ?ֹε??Ϲ?ȣ : private ????
	
	public Employee(String name, String address, int salary, int numbers) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.numbers = numbers;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", numbers=" + numbers + "]";
	}
	
	
	
}
