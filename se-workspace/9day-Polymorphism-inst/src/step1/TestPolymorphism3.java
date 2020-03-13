package step1;
class Animal{
	public void eat(){
		System.out.println("먹다");
	}
	public void sleep(){
		System.out.println("자다");
	}
}
class Person extends Animal{
	public void eat(){//메서드 오버라이딩 		
		System.out.println("사람이 수저로 먹다");
	}
	public void study(){//자식의 독자적인 멤버(메서드) 
		System.out.println("사람이 공부하다");
	}
}
public class TestPolymorphism3 {
	public static void main(String[] args) {
		//부모타입의 변수에 자식 객체를 참조 
		Animal a=new Person();
		a.sleep();//상속받은 메서드이므로 호출가능 
		a.eat();//오버라이딩한 메서드이므로 호출가능 
		//a.study(); // Person 객체지만 참조변수 a 가 Animal 타입
		//이므로 호출불가 compile error 
		//아래와 같이 Object down casting이 필요하다 
		((Person)a).study();
	}
}










