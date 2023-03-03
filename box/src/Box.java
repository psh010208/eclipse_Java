
public class Box {

	int width;
	int length;
	int height;
	int volume;

	Box(int a, int b, int c){
		width = a;
		length = b;
		height = c;
		volume = width * length * height;
	}

	Box whosLargest(Box box1, Box box2) { // ��ü�� ���Ǹ� ���ؼ� ū ��ü�� ���Ǹ� ��ȯ
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
	
	boolean isSameBox(Box obj) { // ��ü�� �ʵ带 ���ؼ� boolean���� ��ȯ
		if((obj.width == width) && (obj.length == length) && (obj.height == height))
			return true;
		else
			return false;
	}


}
