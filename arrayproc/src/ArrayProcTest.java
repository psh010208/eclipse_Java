
public class ArrayProcTest {

	public static void main(String[] args) {
		
		final int STUDENTS = 5; // �л� ���� 5��
		int[] list = new int[STUDENTS]; // list �迭�� ũ��� STUDENT
		
		ArrayProc obj = new ArrayProc(); // ��ü ����
		obj.getValue(list); // �迭�� �޼ҵ忡 ����
		double averrage = obj.getAverage(list); // �迭�� �޼ҵ忡 �����ϰ� ��ȯ���� ����
		System.out.println("����� = " + averrage); // ��ȯ���� ���

	}

}
