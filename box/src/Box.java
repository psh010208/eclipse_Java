
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

	Box whosLargest(Box box1, Box box2) { // 객체의 부피를 비교해서 큰 객체의 부피를 반환
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
	
	boolean isSameBox(Box obj) { // 객체의 필드를 비교해서 boolean값을 반환
		if((obj.width == width) && (obj.length == length) && (obj.height == height))
			return true;
		else
			return false;
	}


}
