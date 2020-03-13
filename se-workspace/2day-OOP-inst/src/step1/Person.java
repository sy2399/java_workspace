// package는 클래스를 효과적으로 분류하기 위해 사용
// step1 디렉토리 아래에 Person.class가 생성된다 
package step1;
// class : 객체 생성을 위한 틀 
// 객체 즉 Object 는 속성과 기능으로 구성 
public class Person {
	/* 속성 or 변수 or variable or attribute or field
	 * String : 데이터 타입 중 문자열 데이터를 저장할 때 사용 
	 * name : 변수이름 
	 */
	String name;  
	/* 기능 or method or operation 
	 * public : 접근제어자의 종류 
	 * void : 리턴값이 없을 때 명시하는 자바키워드 
	 * study : 메서드이름 
	 * () : 매개변수 명시하는 영역 (선택적) 
	 */
	public void study(){
		//콘솔에 출력
		System.out.println(name+" 공부하다");
	}
}










