
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.setChannel(11);
		int ch = tv.getChannel();
		System.out.println("현재 채널은 "+ ch + "입니다");

	}

}
