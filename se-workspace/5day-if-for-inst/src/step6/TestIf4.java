package step6;

public class TestIf4 {
	public static void main(String[] args) {
		Account a=new Account();
		a.setBalance(100);
		System.out.println(a.getBalance());//100
		//금액은 0원을 초과해야 한다 
		a.setBalance(0);// 잘못된 금액입니다 
		a.deposit(200);
		System.out.println(a.getBalance());//300
		a.deposit(-200);//잘못된 금액입니다 
		System.out.println(a.getBalance());//300
		System.out.println("*******************");
		a.withdraw(150);
		System.out.println(a.getBalance());//150
		a.withdraw(50);
		System.out.println(a.getBalance());//100
		a.withdraw(0);
		System.out.println(a.getBalance());//잘못된 금액입니다 
		a.withdraw(150);
		System.out.println(a.getBalance());//잔액이 부족합니다 
	}
}







