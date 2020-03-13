package step11;
class Animal{
	public void eat(){
		System.out.println("먹다");
	}
}
class Person extends Animal{
	public void eat(){//메서드 오버라이딩 
		System.out.println("수저로 먹다");
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
class Truck{}

class Service{
	/* Animal 타입의 a 참조변수(매개변수)는 
	 * Animal 및 다양한 Animal 하위(자식) 객체를 
	 * 참조할 수 있다
	 */
	public void receive(Animal a){
		//eat() 메세지 방식 하나만 이해하면 
		//다양한 객체의 eat 을 실행할 수 있다 
		a.eat();
	}
}
public class TestPolymorphism2 {
	public static void main(String[] args) {
		Service service=new Service();
		service.receive(new Animal());
		service.receive(new Person());
		service.receive(new Dog());
		service.receive(new Cat());
		//아래는 상속계층구조에 있지 않으므로 
		// 즉 자식이 아니므로 컴파일 에러 
		//service.receive(new Truck());
	}
}









