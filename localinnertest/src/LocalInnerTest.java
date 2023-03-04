
class LocalInner {

	private int data = 30; // �ν��Ͻ� ����

	void display() {
		final String msg = "������ ������ ���� ";

		class Local{
			void printMsg() {
				System.out.println(msg + data);
			}
		}
		Local obj = new Local();
		obj.printMsg();
	}

}

public class LocalInnerTest{
	public static void main(String arg[]) {
		LocalInner obj = new LocalInner();
		obj.display();
	}
}
