package step8;

public class TestReferenceDataType {
	public static void main(String[] args) {
		/*
		 * SmartPhone : reference data type ������ 
		 * sp1 : reference variable �������� 
		 * = : assign  �Ҵ� , ���� 
		 * new : java keyword 
		 * SmartPhone() : ������ constructor 
		 */
		SmartPhone sp1=new SmartPhone("������7");
		//System.out.println(sp1);//��ü �ּҰ� ��� 
		SmartPhone sp2=new SmartPhone("������7");
		//System.out.println(sp2);//��ü �ּҰ� ��� 
		//sp1 �ּҰ��� sp2�� �Ҵ� 
		sp2=sp1;
		System.out.println(sp1.getModel());
		System.out.println(sp2.getModel());
	}
}











