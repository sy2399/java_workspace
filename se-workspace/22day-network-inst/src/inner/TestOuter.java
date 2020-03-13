package inner;
/*  Inner class(Nested class)�� ����ϴ� ������ 
 *  Outer class�� private member�� ���� ������ ����ϱ� ���ؼ��� 
 *  ( private member�� �ٸ� Ŭ���������� ���� �Ұ������� 
 *  	Inner class�� ���ܷ� �Ѵ� )
 *  ���� ) Inner class ������ �� class ���� : Outer$Inner.class
 */
class Outer{
	//private���� ���������Ƿ� �ٸ� Ŭ���������� ���� �Ұ�
	private String password;  
	Outer(String password){
		this.password=password;
	}
	class Inner{
		public void test(){
			//Outer class�� private member�� ���� ������ ��밡�� 
			System.out.println(password);
		}
	}
}
public class TestOuter {
	public static void main(String[] args) {
		Outer outer=new Outer("javaking");
		//Inner class(or Nested Class) ��ü ������ ���ؼ��� 
		//Outer class ��ü ������ �����Ǿ�� �Ѵ� 
		Outer.Inner inner=outer.new Inner();
		inner.test();
	}
}











