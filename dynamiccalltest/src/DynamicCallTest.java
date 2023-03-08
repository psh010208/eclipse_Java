
class Animal{
	public void sound() {
		System.out.println("Animal Ŭ������ sound() �޼ҵ�");
	}
}

class Dog extends Animal{
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("�߿�");
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		Animal obj; // ��� ����� ���� �ֵ��� � ������ sound()�� ȣ��Ǵ����� ȣ�� ����� ���������� Ÿ���� �ƴ϶� ���� ������ ����Ű�� ��ü�� Ÿ�Կ� ���� �����ȴ�
		            // �̸� ���� �޼ҵ� ȣ���̶�� �Ѵ�
		obj = animal;
		obj.sound();
		
		obj = dog;
		obj.sound();
		
		obj = cat;
		obj.sound();

	}

}
