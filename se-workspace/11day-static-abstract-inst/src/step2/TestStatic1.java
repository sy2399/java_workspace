package step2;
class Person{
	int age=1;
	static int sAge=1;
	public static void test(){
		System.out.println("static test ����");
	}
}
public class TestStatic1 {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println(p.age);
		//��ü�������� Ŭ������.static������ ��밡�� 
		System.out.println(Person.sAge);
		//static �޼����̹Ƿ� ��ü�������� Ŭ���������� ȣ��
		Person.test();
	}
}







