package step1;

import step1.vo.Person;

public class TestReview {
	public static void main(String[] args) {
		Person p=new Person("������",24);
		System.out.println(p.getName()+" "+p.getAge());
		// ������ 24
		p.setName("�����");
		p.setAge(30);
		System.out.println(p.getName()+" "+p.getAge());
		//����� 30
	} 
}









