                                                                   // 20205091 �ڻ��� 
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		int n1, n2, n3, n4;                                        // ���� 4���� �Է� ���� ���� n1~4 ����
		int max , min;                                             // �ִ밪�� �ּҰ��� ������ ���� ����

		Scanner sc = new Scanner(System.in);


		System.out.print("�װ��� ������ �Է��ϼ��� : ");                    // ���� �Է¹ޱ�
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();

		max = n1;                                                  // �ִ밪�� ���ϴ� ����
		if(n2 > max)
			max = n2;
		if(n3 > max)
			max = n3;
		if(n4 > max)
			max = n4;

		min = n1;                                                  // �ּҰ��� ���ϴ� ����
		if(n2 < min)
			min = n2;
		if(n3 < min)
			min = n3;
		if(n4 < min)
			min = n4;

		System.out.println("�ּҰ��� " + min + "�̰� �ִ밪�� " + max);    // �ִ밪�� �ּҰ� ���

	}

}
