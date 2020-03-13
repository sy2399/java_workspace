package step3;

public class TestException2 {
	public static void main(String[] args) {
		String name=null;
		try{ // try : 예외 발생 예상 지점 블럭화 할 때 사용하는 키워드 
			System.out.println(name.length());
		}catch(NullPointerException ne){
			System.out.println("대처방안: 이름 정보가 없어서 길이를 구할 수 없음");
		}
		System.out.println("프로그램 정상 수행 후 종료");
	}
}
