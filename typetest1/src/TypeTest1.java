
class A{
	A(){
		System.out.println("�ܲ�");
	}
	void draw() {
		System.out.println("���� A");
	}


}

class B extends A{
	B(){
		System.out.println("�۸�");
	}
	void draw() {
		System.out.println("���� B");
	}



}

public class TypeTest1 {

	public static void main(String[] args) {
		A obj = new B(); // �θ� Ŭ������ ���� ������ �ڽ� Ŭ������ ��ü�� ������ �� �ִ�!
		obj.draw();
	}

}
