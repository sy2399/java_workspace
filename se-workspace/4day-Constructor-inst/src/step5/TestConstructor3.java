package step5;

public class TestConstructor3 {
	public static void main(String[] args) {
		MemberVO mvo=new MemberVO("javaking","������");
		System.out.println(mvo.getId());//javaking
		System.out.println(mvo.getName());//������
		mvo.setId("javastar");
		mvo.setName("�����");
		System.out.println(mvo.getId()+" "+mvo.getName());
		//javastar ����� 
	}
}




