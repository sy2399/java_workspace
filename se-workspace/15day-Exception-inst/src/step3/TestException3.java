package step3;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		try{
			System.out.println(list.get(0));
		}catch(IndexOutOfBoundsException ie){
			System.out.println("리스트 범위 초과하여 요소 반환x");
		}
		System.out.println("정상 수행 후 종료");
	}
}









