package step3;
// instanceof �����ڴ� ��ü�� Ÿ���� ���ϴ� ������
// is a �����϶� true ��ȯ 
public class TestInstanceof {
	public static void main(String[] args) {
		Animal a1=new Person();
		Animal a2=new Dog();
		System.out.println(a1 instanceof Person);
		System.out.println(a1 instanceof Animal);
		System.out.println(a2 instanceof Person);
		System.out.println(a2 instanceof Dog);
		System.out.println(a2 instanceof Animal);
		System.out.println(a2 instanceof Object);
	}
}







