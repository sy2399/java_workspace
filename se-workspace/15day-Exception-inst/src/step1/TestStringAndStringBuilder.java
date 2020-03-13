package step1;

public class TestStringAndStringBuilder {
	public static void main(String[] args) {
		String s1="아이유";
		String s2=s1;
		System.out.println(s1.concat("짱"));//변경이 아니라 새로 생성 
		System.out.println(s1);//아이유
		System.out.println(s2);//아이유 
		/////String 은 문자열 상수영역에 하나의 문자열을 동시 참조시켜
		//// 메모리를 효율적으로 사용한다 --> 불변 
		StringBuilder sb=new StringBuilder("아이유");
		System.out.println(sb.append("짱"));
		System.out.println(sb);
		// StringBuilder 는 가변 즉 문자열 자체가 변경된다  
		
		String str="설날";
		StringBuilder sbr=new StringBuilder("설날");
		//String과 StringBuilder의 문자열을 비교할 때에는 
		//equals() 를 이용하되 StringBuilder의 toString()을 호출해서 
		//비교해야 한다 
		System.out.println(str.equals(sbr.toString()));
		System.out.println("*********");
		StringBuffer sbf=new StringBuffer("뻐이장가가니");
		System.out.println(sbf.reverse());
		System.out.println(sbf);
	}
}








