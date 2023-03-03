
public class Employee {

	private String name;
	private double salary;
	
	private static int count = 0; // 정적 변수
	
	// 생성자
	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++; // 정적 변수인 count를 증가
	}
	
	// 객체가 소멸될 때 호출
	public void finalize() {
		count--; // 직원이 하나 줄어드므로 count를 하나 감소
	}
	
	//정적 메소드
	public static int getCount() {
		return count;
	}
}
