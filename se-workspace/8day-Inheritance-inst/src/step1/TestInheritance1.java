package step1;
class Animal{
	int age=1;
	public void sleep(){
		System.out.println("�ڴ�");
	}
}
//Animal�� ����Ѵ� 
class Person extends Animal{
	public void study(){
		System.out.println("�����ϴ�");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person();
		//��ӹ޾����Ƿ� age ��밡�� 
		System.out.println(p.age);
		p.study();
		p.sleep();//��ӹ޾����Ƿ� ȣ�� ����
	}
}







