
import java.util.*;

public class ArrayProc {

	Scanner scan = new Scanner(System.in);

	public void getValue(int[] array) {               //�迭�� �Ѱ� �޾Ƽ� �迭�� ���� ���� �ʱ�ȭ
		for(int i = 0; i < array.length; i++) {
			System.out.print("������ �Է��Ͻÿ� : ");
			array[i] = scan.nextInt();
		}
	}

	public double getAverage(int[] array) {       // �迭�� �Ѱ� �޾Ƽ� �迭�� ���� ����� ���ϰ� ��ȯ
		double total = 0;
		for(int i = 0; i < array.length; i++) 
			total += array[i];
		return total / array.length;
	}

}
