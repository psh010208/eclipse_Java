
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		tv.print();
		
		int ch = tv.getChannel();
		System.out.println("현재 채널은 " + ch + "입니다");
		

	}

}
