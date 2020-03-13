package step3;

public class TestException4 {
	public static void main(String[] args) {
		String names[]={"설현","윤다혜","김규익"};
		try{
			System.out.println(names[2]);
			//System.out.println(names[3]);
			System.out.println("1.소개팅");
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("2.catch문으로 대안을 실행한다");
		}
		System.out.println("3.프로그램 정상 수행 후 종료");
	}
}





