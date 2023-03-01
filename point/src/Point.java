
public class Point {
	private int x = 0;
	private int y = 0;
	
	//생성자
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	/*
	this는 현재 객체의 멤버를 참조하므로 이렇게도 사용이 가능함 위와 동일한 생성자임
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	*/
}
