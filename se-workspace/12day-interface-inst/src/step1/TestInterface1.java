package step1;
//interface를 정의하여 계층구조를 형성하게 한다 
interface Flyer{
	String ID="javaking";//public static final 이 자동 삽입 
	public static void test(){// jdk 1.8 부터 가능 
		System.out.println("interface는 static method 정의할 수 있다");
	}
	//public void fly(){} --> compile error 객체의 구현된 메서드를 정의할 수 없다
	public void fly();//abstract가 자동삽입 
}
class Animal{}
class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("새가 날다");
	}	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("비행기가 날다");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		//상위 인터페이스 타입의 변수로 하위 객체 참조 가능 
		//다형성 지원된다 
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
		 // Animal은 Flyer를 implements 하지 않았기 때문에 error 
		//Flyer f3=new Animal();
		//f2.ID="STAR"; // final 상수이므로 재할당 불가 
		System.out.println(Flyer.ID);
		Flyer.test();
		//위 두라인처럼 interface는 추상메서드(중요) 선언 외에 
		// static final 상수 및 static method(1.8버전부터)를 
		//정의할 수 있다
	}
}










