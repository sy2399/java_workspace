package step1;

public class TestFinal {
	//final 상수는 재할당불가하고 상수명은 대문자로 표기하고 
	//합성어는 _ 로 연결한다 
	//private final String ADMIN_ID="javaking";
	public final void updateId(){
	//	ADMIN_ID="starjava"; // final 상수이므로 재할당불가
	}
}
final class SubTestFinal extends TestFinal{
	//final 메서드는 오버라이딩 할 수 없다 
	//public void updateId(){}
}
// final class는 상속할 수 없다 
//class SubTestFinal2 extends SubTestFinal{}

















