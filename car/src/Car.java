
public class Car {
	
	String color;
	int gear;
	int speed;
	
	
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}

	void setColor(String c) {
		color = c;
	}
	
	void changeGear(int g) {
		gear = g;
	}

	void speedUp() {
		speed = speed + 1;
	}
	
	void speedDown() {
		speed = speed - 1;
		
	}
	
}
