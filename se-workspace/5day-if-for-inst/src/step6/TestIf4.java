package step6;

public class TestIf4 {
	public static void main(String[] args) {
		Account a=new Account();
		a.setBalance(100);
		System.out.println(a.getBalance());//100
		//�ݾ��� 0���� �ʰ��ؾ� �Ѵ� 
		a.setBalance(0);// �߸��� �ݾ��Դϴ� 
		a.deposit(200);
		System.out.println(a.getBalance());//300
		a.deposit(-200);//�߸��� �ݾ��Դϴ� 
		System.out.println(a.getBalance());//300
		System.out.println("*******************");
		a.withdraw(150);
		System.out.println(a.getBalance());//150
		a.withdraw(50);
		System.out.println(a.getBalance());//100
		a.withdraw(0);
		System.out.println(a.getBalance());//�߸��� �ݾ��Դϴ� 
		a.withdraw(150);
		System.out.println(a.getBalance());//�ܾ��� �����մϴ� 
	}
}







