package review;

import java.io.IOException;
import java.util.ArrayList;

public class TestIOReview6 {
	public static void main(String[] args) {
		ReaderService service=new ReaderService();
		try{
		ArrayList<String> list=service.getMenuList(CommonInfo.FILE_PATH2);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
}







