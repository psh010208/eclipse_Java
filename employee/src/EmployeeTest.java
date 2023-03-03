
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("±èÃ¶¼ö", 35000);
		e2 = new Employee("ÃÖ¼öÃ¶", 50000);
		e3 = new Employee("±èÃ¶È£", 20000);
		
		int n = Employee.getCount();
		System.out.println("ÇöÀçÀÇ Á÷¿ø¼ö = " + n);

	}

}
