package step1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TestIterator {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		Collection<String> list=new ArrayList<String>();
		list.add("����");
		list.add("¥���");
		list.add("«��");
		Iterator<String> it=list.iterator();
		while(it.hasNext()){// ���� ��Ұ� �����ϸ� true �������� ������ false
			System.out.println(it.next());//���� ��Ҹ� ��ȯ 
		}
		System.out.println("************************");
		Collection<String> set=new TreeSet<String>();
		set.add("��������");
		set.add("��������");
		set.add("��������");
		set.add("ȫ������");
		Iterator<String> it2=set.iterator();
		while(it2.hasNext())
			System.out.println(it2.next());
		/*	  ArrayList , TreeSet �� ���� Collection �������̽��� ���� ����ü��
		 *   Collection �������̽��� iterator() �߻� �޼��带 �����߱� ������
		 *   iterator() �޼��� ȣ�� �� ��ȯ�Ǵ� Iterator �� 
		 *   Set �̵� List �� ������� 
		 *   ǥ��ȭ�� ������� ��ҵ��� �ݺ� ���� �� �� �ִ� 
		 * 
		 */
	}
}

















