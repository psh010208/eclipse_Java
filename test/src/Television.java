
public class Television {

	private int channel;
	private int volume;
	private boolean onOff;
	static int count; // 정적 변수(클래스 변수) 생성 -> 객체를 생성하지 않고 Television.count로 접근 가능
	
	Television(int c, int v, boolean o){
		channel = c;
		volume = v;
		onOff = o;
	}
	
	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다");
	}
	
	int getChannel() {
		return channel;
	}
	
	void setChannel(int ch) {
		channel = ch;
		
	}
	
}
