package step5;

public class TestConstructor3 {
	public static void main(String[] args) {
		MemberVO mvo=new MemberVO("javaking","아이유");
		System.out.println(mvo.getId());//javaking
		System.out.println(mvo.getName());//아이유
		mvo.setId("javastar");
		mvo.setName("장기하");
		System.out.println(mvo.getId()+" "+mvo.getName());
		//javastar 장기하 
	}
}




