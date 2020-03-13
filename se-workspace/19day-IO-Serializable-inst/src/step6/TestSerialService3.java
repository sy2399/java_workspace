package step6;

import java.io.IOException;
import java.util.ArrayList;

public class TestSerialService3 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\FoodList.obj";
		SerialListService service=new SerialListService(path);
		ArrayList<FoodVO> list=new ArrayList<FoodVO>();
		list.add(new FoodVO("족발",20000));
		list.add(new FoodVO("커피",3000));
		list.add(new FoodVO("맥주",5000));		
		try {
			service.outputList(list);
			System.out.println("리스트 직렬화 완료");
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
}










