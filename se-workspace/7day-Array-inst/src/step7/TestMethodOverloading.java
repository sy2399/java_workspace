package step7;
class Person{
	public void eat(){
		System.out.println("�Դ�");
	}
	//�޼��� �����ε� 
	public void eat(String menu){
		System.out.println(menu+" �Դ�");
	}
	public void eat(int count){
		System.out.println(count+"�κ� �Դ�");
	}
	public void eat(String menu,int count){
		System.out.println(menu+" "+count+"�κ� �Դ�");
	}
}
public class TestMethodOverloading {
	public static void main(String[] args) {
		Person p=new Person();
		p.eat();
		p.eat("ġŲ");
		p.eat(2);
		p.eat("����",2);
	}
}



