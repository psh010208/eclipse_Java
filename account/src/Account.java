
public class Account {
	private int regNumber;
	private String name;
	private int balance;
	
	//Source -> Generate Getters and Setters를 이용하면 필드를 지정해서 자동으로 설정자와 접근자를 생성해줌.
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	

}
