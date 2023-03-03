
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

	Box whosLargest(Box box1, Box box2) {
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}


}
