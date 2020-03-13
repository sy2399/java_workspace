package step2;
// 부모 클래스 Bird가 implements 한 Flyer의 
// 계층 구조에 편입된다 
public class Eagle extends Bird{
	@Override
	public void fly() {
		System.out.println("독수리가 날다");
	}	
}
