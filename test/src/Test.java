class Base{
	public Base() {
		System.out.println("Base() ������");
	}
}

class Derived extends Base{
	public Derived() {
		super(); // ������� ȣ��, ���� ���� �ʾƵ� �������� ȣ��� System.out.println("Base() ������");�� ���� ��µ�
		System.out.println("Deriver() ������");
	}
}

public class Test {

	public static void main(String[] args) {
		Derived r = new Derived();

	}

}
