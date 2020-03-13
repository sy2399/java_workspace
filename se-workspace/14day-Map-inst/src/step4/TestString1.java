package step4;

public class TestString1 {
	public static void main(String[] args) {
		String name1="아이유";
		String name2=new String("아이유");
		String name3="아이유";
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		//문자열 비교는 equals() 로 해야 한다 
		System.out.println(name1.equals(name2));
		//indexOf(문자열) -> index를 반환, 없으면 -1을 반환 
		System.out.println(name1.indexOf("아"));
		System.out.println(name1.indexOf("별"));
		String name4=" 아이유";
		//name4 앞의 여백때문에 false 
		System.out.println(name1.equals(name4));
		//trim() 을 이용해 양여백 삭제하면 된다 
		System.out.println(name1.equals(name4.trim()));
		String name5="버락오바마";
		System.out.println(name5.substring(2));//오바마 2인덱스부터~
		// substring(beginIndex,endIndex); 을 이용해 오바만 출력 
		System.out.println(name5.substring(2, 4));
		//name5가 버로 시작하면 true 
		System.out.println(name5.startsWith("버락"));
		//name5가 마로 끝나는 지 true or false 
		System.out.println(name5.endsWith("마"));
		String name6="javaking";
		String name7="JAVAking";
		System.out.println(name6.equals(name7));
		//대소문자 구분없이 비교
		System.out.println(name7.equalsIgnoreCase(name6));
		String name8="도널드트럼프";
		System.out.println(name8.replace("트럼프", "덕"));
		String name9
		="org.eclipse.wst.ws.explorer_1.0.900.v201603171951.jar";
		System.out.println(name9.lastIndexOf("."));//마지막 . 인덱스 49반환
		System.out.println(name9.indexOf("."));//첫번째 .  인덱스3반환
		String menu="족발,순대,소주,맥주,노가리";
		String ma[]=menu.split(",");
		for(int i=0;i<ma.length;i++){
			System.out.println(ma[i]);
		}
	}
}















