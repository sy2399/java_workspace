package review;

import java.io.IOException;

public class TestIOReview5 {
	// TestIOReview4와 기능 동일하다. 클래스를 분리하여 구현해본다 
	public static void main(String[] args) {
		MenuService service=new MenuService();
		try{
			service.order();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}







