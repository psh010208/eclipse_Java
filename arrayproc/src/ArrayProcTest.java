
public class ArrayProcTest {

	public static void main(String[] args) {
		
		final int STUDENTS = 5; // 학생 수는 5명
		int[] list = new int[STUDENTS]; // list 배열의 크기는 STUDENT
		
		ArrayProc obj = new ArrayProc(); // 객체 생성
		obj.getValue(list); // 배열을 메소드에 전달
		double averrage = obj.getAverage(list); // 배열을 메소드에 전달하고 반환값을 저장
		System.out.println("평균은 = " + averrage); // 반환값을 출력

	}

}
