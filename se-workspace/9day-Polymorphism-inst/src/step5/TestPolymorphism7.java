package step5;

import step4.Animal;
import step4.Monkey;
import step4.Person;
import step4.Tiger;

/*
 * ������ ���� �迭 �׽�Ʈ ���� 
 */
class MyDate{}
public class TestPolymorphism7 {
	public static void main(String[] args) {
		//�Ϲ������� �迭�� ����� Ÿ���� �����͸� ��ҷ�
		//�߰������ϴ� 
		//�� MyDate Ÿ���� �迭�� MyDate ��ü�� ��ҷ� ����
		//MyDate[] date={new MyDate(),new Monkey()};
		//�� �θ� Ÿ���� �迭�� �ڽ� ��ü�� ��ҷ� �߰� ���� 
		Animal[] a={new Monkey(),new Tiger(),new Person()};
		/*  �����̰� ����Ÿ�� ���
		 *  ȣ���̰� ����ϸ� ��� 
		 *  ����� ����Ʈ�ϸ� ��� 
		 */
		//���� ���� ��µǵ��� for���� �̿��ؼ� �ڵ� 
		for(int i=0;i<a.length;i++)
			a[i].play();
	}
}










