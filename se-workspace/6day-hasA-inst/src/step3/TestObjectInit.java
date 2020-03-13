package step3;
class Person{
	int age;
	int money=100;
	boolean flag;
	Person(int age,int money){
		this.age=age;
		this.money=money;
	}
}
public class TestObjectInit {
	public static void main(String[] args) {
		Person p=new Person(22,300);
		System.out.println(p.age+" "+p.money+" "+p.flag);
	}
}




