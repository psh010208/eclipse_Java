
class Animal{
	public void sound() {
		System.out.println("Animal 클래스의 sound() 메소드");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("야옹");
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj; // 출력 결과가 보여 주듯이 어떤 버전의 sound()가 호출되는지는 호출 당시의 참조변수의 타입이 아니라 참조 변수가 가리키는 객체의 타입에 의해 결정된다
		            // 이를 동적 메소드 호출이라고 한다
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
