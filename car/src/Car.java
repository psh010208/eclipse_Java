
public class Car {
	
//	private String model;
//	private String color;
//	private int speed;
//	
//	private int id; // 자동차의 시리얼 번호
//	private static int numbers = 0; // 실체화된 Car 객체의 개수를 위한 정적 변수
//	
//	@Override
//	public String toString() {
//		return "Car [model=" + model + ", color=" + color + ", speed=" + speed + ", id=" + id + "]";
//	}
//
//	public Car(String m, String c, int s) {
//		model = m;
//		color = c;
//		speed = s;
//		id = ++numbers; // 자동차의 개수를 증가하고 id에 대입한다.
//	}
//	
//	// 정적 메소드
//	public static int getNumberOdCars() { 
//		return numbers; // 정적 메소드에서는 인스턴스 변수와 메소드에 접근 가능
//	}
	
	int speed; // 속도
	// 상속 설명을 위한 속도 변경 메소드
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}
