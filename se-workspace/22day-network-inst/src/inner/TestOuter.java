package inner;
/*  Inner class(Nested class)를 사용하는 이유는 
 *  Outer class의 private member에 직접 접근해 사용하기 위해서다 
 *  ( private member는 다른 클래스에서는 접근 불가하지만 
 *  	Inner class는 예외로 한다 )
 *  참고 ) Inner class 컴파일 후 class 형태 : Outer$Inner.class
 */
class Outer{
	//private으로 선언했으므로 다른 클래스에서는 접근 불가
	private String password;  
	Outer(String password){
		this.password=password;
	}
	class Inner{
		public void test(){
			//Outer class의 private member에 직접 접근해 사용가능 
			System.out.println(password);
		}
	}
}
public class TestOuter {
	public static void main(String[] args) {
		Outer outer=new Outer("javaking");
		//Inner class(or Nested Class) 객체 생성을 위해서는 
		//Outer class 객체 생성이 전제되어야 한다 
		Outer.Inner inner=outer.new Inner();
		inner.test();
	}
}











