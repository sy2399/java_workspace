package step6;

public class TestSuper3 {
	public static void main(String[] args) {
		Person p=new Person("����");
		System.out.println(p.getName());//����
		Teacher t=new Teacher("�۰�ȣ","��ȭ");
		System.out.println(t.getName());//�۰�ȣ
		System.out.println(t.getSubject());//��ȭ 
		// Teacher�� Person�� ��ӹ޴´� ������ Ŭ������ �����غ���
	}	
}







