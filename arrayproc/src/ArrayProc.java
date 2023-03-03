
import java.util.*;

public class ArrayProc {

	Scanner scan = new Scanner(System.in);

	public void getValue(int[] array) {               //배열을 넘겨 받아서 배열의 값을 직접 초기화
		for(int i = 0; i < array.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			array[i] = scan.nextInt();
		}
	}

	public double getAverage(int[] array) {       // 배열을 넘겨 받아서 배열의 값의 평균을 구하고 반환
		double total = 0;
		for(int i = 0; i < array.length; i++) 
			total += array[i];
		return total / array.length;
	}

}
