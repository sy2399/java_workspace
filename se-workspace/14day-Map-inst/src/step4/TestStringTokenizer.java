package step4;

import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String str1="���� �� ���� ��������";
		//������ �������� ���ڿ��� �ڸ��� 
		StringTokenizer stk=new StringTokenizer(str1);
		while(stk.hasMoreTokens())
			System.out.println(stk.nextToken());
		String str2="������ũ,����,ġ��,����,�Ŷ��,����,ġŲ";
		// , Ư�� �����ڸ� �߽����� ���ڿ��� �ڸ��� 
		StringTokenizer stk2=new StringTokenizer(str2, ",");
		while(stk2.hasMoreTokens())
			System.out.println(stk2.nextToken());
	}
}









