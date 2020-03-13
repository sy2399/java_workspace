package step5;

public class TestStatic4 {
	public static void main(String[] args) {
		// java se API 에서 제공하는 static 메서드 활용해본다 
		// API (Application Programming Interface) 
		String s1="1";
		String s2="8";
		System.out.println(s1+s2);
		//String 형을 int 형으로 변환하는 static 메서드를 활용한다 
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		System.out.println(i+j);
		//test(i+j); // main method는 static 메서드이므로 
		//아래의 non-static 메서드에 바로 접근할 수 없다 
		//호출하기 위해서는 같은 클래스라도 객체 생성이 필요하다
		new TestStatic4().test(i+j);
	}
	public void test(int k){
		System.out.println(k);
	}
	static{
		System.out.println("static 초기화 영역");
	}
}




















