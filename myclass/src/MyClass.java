
public class MyClass {

	static int x; // 정적 변수
	int y;
	
	static {
		x = 10;
		System.out.println("정적 블록이 호출되었음!");
	}
	
}
