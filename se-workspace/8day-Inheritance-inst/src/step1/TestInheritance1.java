package step1;
class Animal{
	int age=1;
	public void sleep(){
		System.out.println("자다");
	}
}
//Animal을 상속한다 
class Person extends Animal{
	public void study(){
		System.out.println("공부하다");
	}
}
public class TestInheritance1 {
	public static void main(String[] args) {
		Person p=new Person();
		//상속받았으므로 age 사용가능 
		System.out.println(p.age);
		p.study();
		p.sleep();//상속받았으므로 호출 가능
	}
}







