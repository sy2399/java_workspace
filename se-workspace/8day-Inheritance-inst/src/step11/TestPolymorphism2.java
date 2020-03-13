package step11;
class Animal{
	public void eat(){
		System.out.println("�Դ�");
	}
}
class Person extends Animal{
	public void eat(){//�޼��� �������̵� 
		System.out.println("������ �Դ�");
	}
}
class Dog extends Animal{}
class Cat extends Animal{}
class Truck{}

class Service{
	/* Animal Ÿ���� a ��������(�Ű�����)�� 
	 * Animal �� �پ��� Animal ����(�ڽ�) ��ü�� 
	 * ������ �� �ִ�
	 */
	public void receive(Animal a){
		//eat() �޼��� ��� �ϳ��� �����ϸ� 
		//�پ��� ��ü�� eat �� ������ �� �ִ� 
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
		//�Ʒ��� ��Ӱ��������� ���� �����Ƿ� 
		// �� �ڽ��� �ƴϹǷ� ������ ���� 
		//service.receive(new Truck());
	}
}









