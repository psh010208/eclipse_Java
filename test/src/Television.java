
public class Television {

	private int channel;
	private int volume;
	private boolean onOff;
	
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
