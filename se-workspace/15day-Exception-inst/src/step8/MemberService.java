package step8;

public class MemberService {

	public void register(String nickName) throws NickNameException {
		// database �� ��� ......
		if(nickName.length()<2||nickName.length()>5)
			throw new NickNameException(nickName
					+" �г����� ��ϵ� �� �����ϴ� ( 2�� ���� 5�� ���ϸ� ���� )");
		System.out.println(nickName+" �г��� ī�� ��� �Ϸ�");
	}
}
