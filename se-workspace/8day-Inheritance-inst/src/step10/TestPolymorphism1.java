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
		//�ڽ� ��ü�� �θ� Ÿ���� ������ ������ �� �ִ� 
		Animal ap=new Person();
		Person sp=new Student();
		Animal as=new Student();
		//compile error : ��Ӱ��谡 �ƴϹǷ� ���� �Ұ� 
		//Animal ca=new Car();
	}
}







