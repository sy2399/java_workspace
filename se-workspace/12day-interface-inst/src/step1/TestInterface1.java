package step1;
//interface�� �����Ͽ� ���������� �����ϰ� �Ѵ� 
interface Flyer{
	String ID="javaking";//public static final �� �ڵ� ���� 
	public static void test(){// jdk 1.8 ���� ���� 
		System.out.println("interface�� static method ������ �� �ִ�");
	}
	//public void fly(){} --> compile error ��ü�� ������ �޼��带 ������ �� ����
	public void fly();//abstract�� �ڵ����� 
}
class Animal{}
class Bird extends Animal implements Flyer{
	@Override
	public void fly() {
		System.out.println("���� ����");
	}	
}
class Airplane implements Flyer{
	@Override
	public void fly() {
		System.out.println("����Ⱑ ����");
	}
}
public class TestInterface1 {
	public static void main(String[] args) {
		//���� �������̽� Ÿ���� ������ ���� ��ü ���� ���� 
		//������ �����ȴ� 
		Flyer f1=new Bird();
		f1.fly();
		Flyer f2=new Airplane();
		f2.fly();
		 // Animal�� Flyer�� implements ���� �ʾұ� ������ error 
		//Flyer f3=new Animal();
		//f2.ID="STAR"; // final ����̹Ƿ� ���Ҵ� �Ұ� 
		System.out.println(Flyer.ID);
		Flyer.test();
		//�� �ζ���ó�� interface�� �߻�޼���(�߿�) ���� �ܿ� 
		// static final ��� �� static method(1.8��������)�� 
		//������ �� �ִ�
	}
}










