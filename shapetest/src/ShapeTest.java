
class Shape{
	protected int x, y;
	
	public void draw() {
		System.out.println("Shape Draw");
	}
}

class Rectangle extends Shape{
	protected int width, heigth;
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle extends Shape{
	private int base, height;
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

class Circle extends Shape{
	private int radius;
	
	public void draw() {
		System.out.println("Circle Draw");
	}
}

class Cylinder extends Shape{
	private int radius, height;
	
	public void draw() {
		System.out.println("Cylinder Draw");
	}
}

public class ShapeTest {
	private static Shape arrayOfShapes[];
	
	public static void main(String[] args) {
		init();
		drawAll();
		Rectangle s1 = new Rectangle();
		Triangle s2 = new Triangle();
		printLocation(s1);
		printLocation(s2);
	}
	
	public static void printLocation(Shape s) {
		System.out.println("x = " + s.x + " y = " + s.y);
	}
	
	public static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle(); 
		arrayOfShapes[3] = new Cylinder();
	}
	
	public static void drawAll() {
		for(int i = 0; i < arrayOfShapes.length; i++)
			arrayOfShapes[i].draw();
	}

}
