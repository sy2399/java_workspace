package step6;

import java.io.IOException;
import java.util.ArrayList;

public class TestSerialService3 {
	public static void main(String[] args) {
		String path="C:\\java-kosta\\test\\serial\\FoodList.obj";
		SerialListService service=new SerialListService(path);
		ArrayList<FoodVO> list=new ArrayList<FoodVO>();
		list.add(new FoodVO("����",20000));
		list.add(new FoodVO("Ŀ��",3000));
		list.add(new FoodVO("����",5000));		
		try {
			service.outputList(list);
			System.out.println("����Ʈ ����ȭ �Ϸ�");
		} catch (IOException e) {			
			e.printStackTrace();
		}		
	}
}










