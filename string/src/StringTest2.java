import java.util.*;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ��� :");
			str = sc.next();
			if(str.equals("quit") == true)
				break;
			if(str.matches("^www\\.(.+)"))
				System.out.println(str + "�� 'www'�� �����մϴ�.");
			else
				System.out.println(str + "�� 'www'�� �������� �ʽ��ϴ�.");
			
		}

	}

}
