//팩키지 선언하여 step1 디렉토리 아래에
//TestPerson class 저장하게 한다
package step1;
/* TestPerson class는 Person class를 이용해 
 * 객체 생성하고 속성에 데이터를 할당해보고 
 * Person 객체의 기능을 실행해보는 역할을 한다 
 * Person class : Person 객체를 생성하기 위한 틀 
 * TestPerson class : main method를 명시하여 
 * 프로그램의 시작을 가능하게 하고 
 * 다른 클래스를 이용해 객체 생성 및 제어를 테스트한다 
 */
public class TestPerson {
	/*
	 * 메인 메서드는 자바 프로그램의 시작점 
	 */
	public static void main(String[] args) {
		/* Person class를 이용해 객체 생성한다 
		 * Person : 데이터 타입 ( 참조형 데이터 타입 )
		 * p : 변수명 (참조변수)
		 * = : 할당 or 대입 
		 * new : 객체 생성시 명시하는 자바 키워드 
		 * Person() : 생성자 ( constructor ) 
		 */
		Person p=new Person();
		p.name="아이유";//변수(속성)에 이름저장한다 
		System.out.println(p.name);//저장한 이름 출력 
		//객체 생성을 한번 더 해본다 
		Person p2=new Person();
		//p2 객체의 name에 장기하를 할당한다 
		p2.name="장기하";
		//p2 객체의 name을 출력해본다 
		System.out.println(p2.name);
		// p 와 p2 객체의 study 메서드를 호출해본다 
		p.study();
		p2.study();		
	}
}








