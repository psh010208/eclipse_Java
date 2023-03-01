
public class BoxTest {

	public static void main(String[] args) {
		Box b = new Box(20, 20, 30);
		/*
		b.width = 20;
		b.length = 20;
		b.height = 30;
		System.out.println("상자의 가로 세로 높이는 : " + b.width + " " + b.length + " " + b.height + "입니다");
		*/
		System.out.println("상자의 부피는 " + b.getVolume());
	}

}
