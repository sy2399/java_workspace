package step6;

public class TestSuper3 {
	public static void main(String[] args) {
		Person p=new Person("공유");
		System.out.println(p.getName());//공유
		Teacher t=new Teacher("송강호","영화");
		System.out.println(t.getName());//송강호
		System.out.println(t.getSubject());//영화 
		// Teacher는 Person을 상속받는다 전제로 클래스를 구현해본다
	}	
}







