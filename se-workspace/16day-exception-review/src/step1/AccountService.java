package step1;

public class AccountService {

	public void deposit(int money) throws InvalidMoneyException {
		try{
			if(money<=0)
				throw new InvalidMoneyException(
						money+"���� �߸��� �Աݾ��Դϴ�!");
			System.out.println(money+"�� �ԱݿϷ�");
		}finally{// Exception �߻� ���ο� ������� �׻� ����
			System.out.println("�ŷ� �̷��� �����");
		}
	}
}
