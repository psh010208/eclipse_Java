
public class Child extends Parent{

	@Override
	public void print() {
		super.print();
		System.out.println("�ڽ� Ŭ������ print() �޼ҵ�");
	}
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.print();

	}

}
