package step5;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account a=new Account();
		//money는 private 으로 선언되어 접근불가!
		//System.out.println(a.money);
		// setter 에 접근하여 정보를 할당한다 
		a.setMoney(100);
		System.out.println(a.getMoney());
		a.setName("아이유");
		System.out.println(a.getName());//아이유
	}
}







