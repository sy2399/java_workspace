package step1;

public class TestWrapper {
	public static void main(String[] args) {
		int i=1;
		Object obj=i;// autoboxing ( �ڵ����� Wrapper class Integer ��ü�� ��ȯ�Ǿ� ����)
		System.out.println(obj.getClass());//class java.lang.Integer
		// auto unboxing (�ڵ����� Wrapper class ���������� �⺻������ ��ȯ )
		int j=(Integer)obj; 
		System.out.println(j);
	}
}
