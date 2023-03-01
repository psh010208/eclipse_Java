
public class TelevisionTest {

	public static void main(String[] args) {
		//한글 깨짐 고치기
		Television tv1 = new Television(7, 10, true);
		Television tv2 = new Television(11, 20, true);
		tv1.print();
		tv2.print();
		
		/* tv.setChannel(11);
		int ch = tv.getChannel();
		System.out.println("현재 채널은 "+ ch + "입니다");
		*/

	}

}
