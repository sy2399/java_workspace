package step6;

public class Account {
	private int balance;
	public void setBalance(int balance){
		if(balance>0)
			this.balance=balance;
		else
			System.out.println("�߸��� �ݾ��Դϴ�");
	}
	public int getBalance(){
		return balance;
	}
	public void deposit(int money) {
		if(money<0)
			System.out.println("�߸��� �ݾ��Դϴ�");
		else
		this.balance+=money;
	}
	public void withdraw(int money) {
		if(money<=0)
			System.out.println("�߸��� �ݾ��Դϴ�");
		else if(money>balance)
			System.out.println("�ܾ��� �����մϴ�");
		else
			balance-=money;		
	}
}








