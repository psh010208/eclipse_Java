//
//class Car {
//	
//}
//
//public class CarTest {
//
//	public static void main(String[] args) {
//		Car obj = new Car();
//		System.out.println("obj is of type " + obj.getClass().getName());
//
//	}
//
//}

class Car{
	private String model;

	public Car(String model) {
		this.model = model;
	}


	public boolean equals(Object obj) {
		if(obj instanceof Car)
			return this.model.equals( ((Car)obj).model);
		else
			return false;
	}
}

public class CarTest{
	public static void main(String args[]) {
		
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if(firstCar.equals(secondCar))
			System.out.println("동일한 종류의 자동차입니다");
		else
			System.out.println("다른 종류의 자동차입니다.");

	}
}