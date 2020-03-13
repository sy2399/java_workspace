package step8;

public class TestReferenceDataType {
	public static void main(String[] args) {
		/*
		 * SmartPhone : reference data type 참조형 
		 * sp1 : reference variable 참조변수 
		 * = : assign  할당 , 대입 
		 * new : java keyword 
		 * SmartPhone() : 생성자 constructor 
		 */
		SmartPhone sp1=new SmartPhone("아이폰7");
		//System.out.println(sp1);//객체 주소값 출력 
		SmartPhone sp2=new SmartPhone("갤럭시7");
		//System.out.println(sp2);//객체 주소값 출력 
		//sp1 주소값을 sp2에 할당 
		sp2=sp1;
		System.out.println(sp1.getModel());
		System.out.println(sp2.getModel());
	}
}











