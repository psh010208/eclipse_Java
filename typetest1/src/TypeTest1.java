
class A{
	A(){
		System.out.println("꿀꿀");
	}
	void draw() {
		System.out.println("나는 A");
	}


}

class B extends A{
	B(){
		System.out.println("멍멍");
	}
	void draw() {
		System.out.println("나는 B");
	}
	void speak() {
		System.out.println("안녕");
	}



}

public class TypeTest1 {

	public static void main(String[] args) {
		A obj = new B(); // 부모 클래스의 참조 변수로 자식 클래스의 객체를 참조할 수 있다!
		obj.draw();
//		obj.speak() obj가 A타입의 참조 변수이기 때문에 A에서 상속받지 못한 speak() 메소드는 사용 불가
	}

}
