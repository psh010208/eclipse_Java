
public class CounterTest1 {

	public static void main(String[] args) {
		Counter obj = new Counter();
		
		System.out.println("obj.value = " + obj.value);
		obj.inc(obj);
		System.out.println("obj.value = " + obj.value);
	}

}