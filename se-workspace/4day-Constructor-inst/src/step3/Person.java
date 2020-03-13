package step3;
/*
 * 클래스 내에서 생성자를 명시하지 않으면 
 * 컴파일시에 기본 생성자를 자동삽입 
 * Person(){} --> 기본 생성자 
 */
public class Person {
	/*
	 * 생성자를 명시 
	 * 생성자 이름은 클래스 이름과 동일해야 한다 
	 * 아래 생성자는 객체 생성시 호출된다 
	 */
	public Person(){
		System.out.println("Person 생성자 실행");
	}
}









