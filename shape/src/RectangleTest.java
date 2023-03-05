
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		
		a.setX(5);
		a.setY(3);
		a.setWidth(10);
		a.setHeight(20);
		
		b.setX(8);
		b.setY(9);
		b.setWidth(10);
		b.setHeight(20);
		
		a.print();
		a.draw();
		b.print();
		b.draw();

	}

}
