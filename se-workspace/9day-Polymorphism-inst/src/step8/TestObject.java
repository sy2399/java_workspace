package step8;

import step4.Animal;
import step4.Person;

/*
 * java.lang.Object 는 
 * 모든 자바 클래스의 super class( 부모 클래스)이다
 */
// import java.lang.*; 
public class TestObject {//extends Object 
	//public TestObject(){super();} 
	public static void main(String[] args) {
		Object a=new Animal();
		Object a2=new Person();
		//위와 같이 모든 자바 객체는 
		//최상위 부모 클래스인 Object 타입으로
		//참조가능
		//그러나 객체 캐스팅이 필요할 수 있다 
		((Animal)a).play();
		//최상위 클래스인 Object 타입으로 배열을 선언하면 
		//모든 객체를 배열의 요소를 담을 수 있다 
		Object []obj={new Animal(),new Person(),new Car()};
		for(int i=0;i<obj.length;i++)
			System.out.println(obj[i].getClass().getName());
	}
}
class Car{}













