class A {
	private int a;
	int b;
	public int c;
}
public class AccessControl {

	public static void main(String[] args) {
		
		A obj = new A();
		
		//obj.a = 10; private ���� ���� �����ڴ� Ŭ���� �ȿ����� ���� ����
		obj.b = 20;
		obj.c = 30;
		//System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
