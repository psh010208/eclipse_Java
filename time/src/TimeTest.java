
public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("기본 생성자 호출 후 시간 : " + time1);
		
		Time time2 = new Time(14, 27, 6);
		System.out.println("두번째 생성자 호출 후 시간 : " + time2);

		Time time3 = new Time(50, 27, 6);
		System.out.println("올바르지 않은 시간 설정 후 시간 : " + time3);
	}

}
