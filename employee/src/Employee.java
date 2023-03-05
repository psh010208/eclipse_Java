
public class Employee {

	public String name; // ÀÌ¸§ : public ¸â¹ö
	String address; // ÁÖ¼Ò : package ¸â¹ö
	protected int salary; // ¿ù±Ş : protected ¸â¹ö
	private int numbers; // ÁÖ¹Îµî·Ï¹øÈ£ : private ¸â¹ö
	
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
