package step8;
class Animal{
	public void eat(){
		System.out.println("먹다");
	}
}
class Dog extends Animal{}
class Person extends Animal{
	//메서드 오버라이딩 : 부모 메서드를 자신에 맞게 재정의 
	public void eat(){
		System.out.println("수저로 먹다");
	}
}
class Student extends Person{
	//메서드 오버라이딩 
	public void eat(){
		super.eat(); // super keyword를 이용해 부모 메서드 호출 
		System.out.println("디저트를 먹다");
	}
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();//상속받은 부모 eat 실행 
		Person p=new Person();
		p.eat();//오버라이딩한 자신의 eat 실행 
		Student s=new Student();
		s.eat();
	}
}










