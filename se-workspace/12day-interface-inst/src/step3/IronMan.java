package step3;

import step2.Fighter;
import step2.Flyer;

public class IronMan implements Flyer,Fighter{
	@Override
	public void fight() {
		System.out.println("���̾���� �Ǵ�� �ο��");
	}
	@Override
	public void fly() {
		System.out.println("���̾���� ����");
	}
}



