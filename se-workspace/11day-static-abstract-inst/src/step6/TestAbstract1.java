package step6;
abstract class Parent{
	public void eat(){
		System.out.println("먹다");
	}
	//abstract method : 구현부 없이 선언만 한다 
	//자식 클래스에게 구현을 강제한다 
	//abstract method가 하나 이상 존재하면 그 클래스는
	//abstract class로 선언되어야 한다 	
	//abstract class는 직접 객체화 될 수 없다 
	public abstract void study();
}
class Child extends Parent{
	//부모 클래스의 abstract method를 반드시 구현해야 
	//객체 생성 가능한 자식 클래스가 될 수 있다 
	public void study() {	
		System.out.println("공부하다");
	}	
}
public class TestAbstract1 {
	public static void main(String[] args) {
		//error : abstract class이므로 직접 객체화 할 수 없다 
		//new Parent();
		Child c=new Child();
		c.eat();
		c.study();
	}
}









