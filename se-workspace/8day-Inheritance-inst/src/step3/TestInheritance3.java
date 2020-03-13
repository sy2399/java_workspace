package step3;

import step3.vo.Bank;

class KostaBank{
	public void accessTest(){
		Bank b=new Bank();
		//다른 팩키지에서 접근할 수 있는 것은 
		// public 외에는 없다.. KostaBank2 에서 다시 확인
		b.publicTest();	
	}
}
class KostaBank2 extends Bank{
	public void accessTest(){
		// KostaBank 와는 다르게 Bank와 상속관계에 있다 
		// 이 경우 protected도 접근 가능하다 
		publicTest();		
		protectedTest();		
	}
}
public class TestInheritance3 {
	//접근제어자 테스트 예제 
}





