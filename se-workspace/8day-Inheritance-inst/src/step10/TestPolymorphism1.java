package step10;
class Animal{}
class Person extends Animal{}
class Student extends Person{}
class Car{}
public class TestPolymorphism1 {
	public static void main(String[] args) {
		Animal a=new Animal();
		Person p=new Person();
		Car c=new Car();
		//자식 객체를 부모 타입의 변수에 참조할 수 있다 
		Animal ap=new Person();
		Person sp=new Student();
		Animal as=new Student();
		//compile error : 상속관계가 아니므로 참조 불가 
		//Animal ca=new Car();
	}
}







