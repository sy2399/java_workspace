package step8;
class Animal{
	public void eat(){
		System.out.println("�Դ�");
	}
}
class Dog extends Animal{}
class Person extends Animal{
	//�޼��� �������̵� : �θ� �޼��带 �ڽſ� �°� ������ 
	public void eat(){
		System.out.println("������ �Դ�");
	}
}
class Student extends Person{
	//�޼��� �������̵� 
	public void eat(){
		super.eat(); // super keyword�� �̿��� �θ� �޼��� ȣ�� 
		System.out.println("����Ʈ�� �Դ�");
	}
}
public class TestOverriding1 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();//��ӹ��� �θ� eat ���� 
		Person p=new Person();
		p.eat();//�������̵��� �ڽ��� eat ���� 
		Student s=new Student();
		s.eat();
	}
}










