
public class Rectangle extends Shape{

	private int width; // �簢���� ����
	private int height; // �簢���� ����
	
	
	
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
		System.out.println("(" + this.getX() + "," + this.getY() + ") ��ġ�� ���� : " + this.getWidth() + " ���� : " + this.getHeight());
	}
}
