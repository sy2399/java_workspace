package step1;
abstract class Animal{
	Animal(){ // �ڽ��� ���� ������ �ȴ� 
		System.out.println("Animal �θ� ����");
	}
}
class Person extends Animal{
	/*Person(){super();}*/
}
public class TestAbstractReview {
	public static void main(String[] args) {
		//new Animal(); // ���� ��ü ���� �Ұ� 
		new Person();
	}
}
