package step2;
class Animal{
	private int age=1;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
class Person extends Animal{//��Ӱ��踦 ǥ�� 
	public void study(){
		System.out.println("�����ϴ�");
	}
}
public class TestInheritance2 {
	public static void main(String[] args) {
		Person p=new Person();
		//System.out.println(p.age);
		//�� �ڵ�� age�� private �̹Ƿ� ��ӹ޴��� 
		//���� ������ �Ұ����ؼ� error�� ���� 
		//�Ʒ�ó�� getter/setter�� ���� �����ϸ� �ȴ� 
		System.out.println(p.getAge());
	}
}





