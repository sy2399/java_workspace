package review;

import java.io.IOException;

public class TestIOReview5 {
	// TestIOReview4�� ��� �����ϴ�. Ŭ������ �и��Ͽ� �����غ��� 
	public static void main(String[] args) {
		MenuService service=new MenuService();
		try{
			service.order();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}







