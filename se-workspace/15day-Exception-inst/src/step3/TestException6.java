package step3;
class Animal{}
class Person extends Animal{}
class Dog extends Animal{}
public class TestException6 {
	public static void main(String[] args) {
		Animal ani[]={new Person(),new Dog()};
		try{
			System.out.println((Person)ani[0]);
			//System.out.println((Person)ani[1]);
			System.out.println(1);
		}catch(ClassCastException ce){
			System.out.println(2);
		}catch(Exception e){
			System.out.println(3);
		}finally{ // 예외 발생 여부와 관계없이 항상 실행 
			System.out.println(4);
		}
		System.out.println(5);
	}
}









