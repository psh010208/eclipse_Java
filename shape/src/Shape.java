
// 일반적인 2차원 도형을 나타내는 Shape 클래스 
public class Shape {

	private int x; // 도형의 x좌표
	private int y; // 도형의 y좌표	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	void print() {
		System.out.println("x좌표 : " + x + " y좌표 : " + y);
	}
	
}
