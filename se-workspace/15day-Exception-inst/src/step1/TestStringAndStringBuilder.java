package step1;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="������";
		String s2=s1;
		System.out.println(s1.concat("¯"));//������ �ƴ϶� ���� ���� 
		System.out.println(s1);//������
		System.out.println(s2);//������ 
		/////String �� ���ڿ� ��������� �ϳ��� ���ڿ��� ���� ��������
		//// �޸𸮸� ȿ�������� ����Ѵ� --> �Һ� 
		StringBuilder sb=new StringBuilder("������");
		System.out.println(sb.append("¯"));
		System.out.println(sb);
		// StringBuilder �� ���� �� ���ڿ� ��ü�� ����ȴ�  
		
		String str="����";
		StringBuilder sbr=new StringBuilder("����");
		//String�� StringBuilder�� ���ڿ��� ���� ������ 
		//equals() �� �̿��ϵ� StringBuilder�� toString()�� ȣ���ؼ� 
		//���ؾ� �Ѵ� 
		System.out.println(str.equals(sbr.toString()));
		System.out.println("*********");
		StringBuffer sbf=new StringBuffer("�����尡����");
		System.out.println(sbf.reverse());
		System.out.println(sbf);
	}
}








