package step3;
class Animal{
	public void eat(){
		System.out.println("�Դ�");
	}
	public void sleep(){
		System.out.println("�ڴ�");
	}
}
class Person extends Animal{
	public void eat(){//�޼��� �������̵�
		System.out.println("����� ������ �Դ�");
	}
	public void study(){
		System.out.println("����� �����ϴ�");
	}
}
class Dog extends Animal{
	public void eat(){
		System.out.println("���� ��Ḧ �Դ�");
	}
}
class AnimalService{
	public void execute(Animal a){
		a.eat();
		a.sleep();
		if(a instanceof Person) // a �� Person ��ü�̸� 
			((Person) a).study(); // object down casting 
	}
}
public class TestPolymorphism5 {
	public static void main(String[] args) {
		AnimalService service=new AnimalService();
		service.execute(new Dog());
		service.execute(new Person());
		/*	���� ��Ḧ �Դ�
		 *  �ڴ� 
		 *  ����� ������ �Դ� 
		 *  �ڴ� 
		 *  ����� �����ϴ� 
		 */
	}
}












