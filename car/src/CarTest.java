
public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setColor("빨강");//왜 안 고쳐지냐 얘는!!!
		car.changeGear(2);
		car.speedUp();
		System.out.println(car);
			
	}

}
