package step1;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet2 {
	public static void main(String[] args) {
		// Set �迭 TreeSet class�� generic �����ϴ� ���� 
		// �Ʒ� set���� String Ÿ���� ��Ҹ� �߰� �� �� �ֵ��� 
		// generic�� ���� 
		TreeSet<String> set=new TreeSet<String>();
		set.add("�跡��");
		set.add("�ſ���");
	//	set.add(1);  //compile error , String Ÿ�Ը� �����ϰ� generic�� ����
		set.add("������");
		set.add("�ſ���");//�ߺ���� x 
		System.out.println(set);
		System.out.println("**************");
		LinkedHashSet<String> hs=new LinkedHashSet<String>();
		hs.add("A");
		hs.add("D");
		hs.add("B");
		hs.add("A");//�ߺ��Ǿ� �߰����� �ʴ´� 
		System.out.println(hs);//�߰��� ������ ����Ͽ� A D B �� ��� 
	}
}










