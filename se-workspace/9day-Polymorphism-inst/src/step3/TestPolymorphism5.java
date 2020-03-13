package step3;
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
	public void study(){
		System.out.println("사람이 공부하다");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("개가 사료를 먹다");
	}
}
class AnimalService{
	public void execute(Animal a){
		a.eat();
		a.sleep();
		if(a instanceof Person) // a 가 Person 객체이면 
			((Person) a).study(); // object down casting 
	}
}
public class TestPolymorphism5 {
	public static void main(String[] args) {
		AnimalService service=new AnimalService();
		service.execute(new Dog());
		service.execute(new Person());
		/*	개가 사료를 먹다
		 *  자다 
		 *  사람이 수저로 먹다 
		 *  자다 
		 *  사람이 공부하다 
		 */
	}
}












