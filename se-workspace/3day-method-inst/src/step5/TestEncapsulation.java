package step5;

public class TestEncapsulation {
	public static void main(String[] args) {
		Account a=new Account();
		//money�� private ���� ����Ǿ� ���ٺҰ�!
		//System.out.println(a.money);
		// setter �� �����Ͽ� ������ �Ҵ��Ѵ� 
		a.setMoney(100);
		System.out.println(a.getMoney());
		a.setName("������");
		System.out.println(a.getName());//������
	}
}







