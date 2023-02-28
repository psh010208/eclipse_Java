class A {
	private int a;
	int b;
	public int c;
}
public class AccessControl {

	public static void main(String[] args) {
		
		A obj = new A();
		
		//obj.a = 10; private 접근 제어 지정자는 클래스 안에서만 접근 가능
		obj.b = 20;
		obj.c = 30;
		//System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}

}
