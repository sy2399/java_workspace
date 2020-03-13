package step2;
class ErrorEx{
	public void a(){
		System.out.println("a 메서드 실행");
		b();
	}
	public void b(){
		System.out.println("b 메서드 실행");
		a();
	}
}
public class TestError {
	public static void main(String[] args) {
		ErrorEx ex=new ErrorEx();
		ex.a();
		//위 메서드를 호출하면 Error가 발생 
		//이 경우 프로그램을 수정하거나 환경을 변경해야 한다 
	}
}












