import java.util.*;

public class GameCharacter {
	
	private class GameItem {
		String name;
		int type;
		int price;		

		int getPrice() {
			return price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
	}	
	private ArrayList <GameItem> list = new ArrayList<>();

	public void add(String name, int type, int price) {
		GameItem item = new GameItem();
		item.name = name;
		item.type = type;
		item.price = price;
		list.add(item);
	}

	public void print() {
		int total = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			total += list.get(i).getPrice();
		}
		System.out.println(total);	
	}		

}

