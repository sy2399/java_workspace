package step1;
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
	public void study(){//�ڽ��� �������� ���(�޼���) 
		System.out.println("����� �����ϴ�");
	}
}
public class TestPolymorphism3 {
	public static void main(String[] args) {
		//�θ�Ÿ���� ������ �ڽ� ��ü�� ���� 
		Animal a=new Person();
		a.sleep();//��ӹ��� �޼����̹Ƿ� ȣ�Ⱑ�� 
		a.eat();//�������̵��� �޼����̹Ƿ� ȣ�Ⱑ�� 
		//a.study(); // Person ��ü���� �������� a �� Animal Ÿ��
		//�̹Ƿ� ȣ��Ұ� compile error 
		//�Ʒ��� ���� Object down casting�� �ʿ��ϴ� 
		((Person)a).study();
	}
}










