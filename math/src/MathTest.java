
public class MathTest {
	
	public static void main(String[] args) {
		//한글 깨짐 고치기
		int sum;
		Math obj = new Math();
		sum = obj.add(2, 3);
		System.out.println("2와 3의 합 : " + sum);
		sum = obj.add(7, 8);
		System.out.println("7와 8의 합 : " + sum);

		
	}

}
