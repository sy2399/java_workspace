package step4;

public class TestString {
	//문자열 비교 관련 예제 
	public static void main(String[] args) {
		String name1="아이유,설현,장기하";
		//String class의 메서드를 이용해 
		//특정 구분자를 중심으로 문자열 정보를 배열 요소로 
		//나누어 출력해본다 
		String na[]=name1.split(",");
		for(int i=0;i<na.length;i++)
			System.out.println(na[i]);
		
		System.out.println("***********");
		// java 에서 문자열을 생성하는 방법은 다양하게 있다 
		String str1="설현";
		String str2=new String("설현");
		System.out.println(str1);
		System.out.println(str2);
		StringBuilder sb=new StringBuilder("설현");
		System.out.println(sb);
		System.out.println(str1==str2);//같은 설현이지만 비교가 안됨
		System.out.println(str1==sb.toString());//위와 동일 
		//문자열 비교는 == 연산으로 하는 것이 아니라 
		// String class의 equals 메서드를 이용해야 한다 
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(sb.toString()));
	}
}








