package step5;

public class TestStatic4 {
	public static void main(String[] args) {
		// java se API ���� �����ϴ� static �޼��� Ȱ���غ��� 
		// API (Application Programming Interface) 
		String s1="1";
		String s2="8";
		System.out.println(s1+s2);
		//String ���� int ������ ��ȯ�ϴ� static �޼��带 Ȱ���Ѵ� 
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		System.out.println(i+j);
		//test(i+j); // main method�� static �޼����̹Ƿ� 
		//�Ʒ��� non-static �޼��忡 �ٷ� ������ �� ���� 
		//ȣ���ϱ� ���ؼ��� ���� Ŭ������ ��ü ������ �ʿ��ϴ�
		new TestStatic4().test(i+j);
	}
	public void test(int k){
		System.out.println(k);
	}
	static{
		System.out.println("static �ʱ�ȭ ����");
	}
}




















