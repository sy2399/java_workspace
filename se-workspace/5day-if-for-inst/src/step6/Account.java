package step6;

public class Account {
	private int balance;
	public void setBalance(int balance){
		if(balance>0)
			this.balance=balance;
		else
			System.out.println("잘못된 금액입니다");
	}
	public int getBalance(){
		return balance;
	}
	public void deposit(int money) {
		if(money<0)
			System.out.println("잘못된 금액입니다");
		else
		this.balance+=money;
	}
	public void withdraw(int money) {
		if(money<=0)
			System.out.println("잘못된 금액입니다");
		else if(money>balance)
			System.out.println("잔액이 부족합니다");
		else
			balance-=money;		
	}
}








