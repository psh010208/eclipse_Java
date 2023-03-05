
public class Rectangle extends Shape{

	private int width; // 사각형의 가로
	private int height; // 사각형의 세로
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	double area(int width, int height) {
		return (double)width * height;
	}
	
	void draw() {
		System.out.println("(" + this.getX() + "," + this.getY() + ") 위치에 가로 : " + this.getWidth() + " 세로 : " + this.getHeight());
	}
}
