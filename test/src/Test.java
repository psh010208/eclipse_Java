class Base{
	public Base() {
		System.out.println("Base() 생성자");
	}
}

class Derived extends Base{
	public Derived() {
		super(); // 명시적인 호출, 굳이 쓰지 않아도 묵시적인 호출로 System.out.println("Base() 생성자");가 먼저 출력됨
		System.out.println("Deriver() 생성자");
	}
}

public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();

	}

}
