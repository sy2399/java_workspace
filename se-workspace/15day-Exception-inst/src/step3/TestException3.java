package step3;

import java.util.ArrayList;

public class TestException3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		try{
			System.out.println(list.get(0));
		}catch(IndexOutOfBoundsException ie){
			System.out.println("����Ʈ ���� �ʰ��Ͽ� ��� ��ȯx");
		}
		System.out.println("���� ���� �� ����");
	}
}









