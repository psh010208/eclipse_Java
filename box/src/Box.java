
public class Box {

	private int width;
	private int length;
	private int height;
	private int volume;
	
	Box(int a, int b, int c){
		width = a;
		length = b;
		height = c;
		volume = width * length * height;
	}
	
	public int getVolume() {
		return volume;
	}
	
	
}
