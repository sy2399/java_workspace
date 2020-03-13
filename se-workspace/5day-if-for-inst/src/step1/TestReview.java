package step1;

import step1.vo.Person;

public class TestReview {
	public static void main(String[] args) {
		Person p=new Person("아이유",24);
		System.out.println(p.getName()+" "+p.getAge());
		// 아이유 24
		p.setName("장기하");
		p.setAge(30);
		System.out.println(p.getName()+" "+p.getAge());
		//장기하 30
	} 
}









